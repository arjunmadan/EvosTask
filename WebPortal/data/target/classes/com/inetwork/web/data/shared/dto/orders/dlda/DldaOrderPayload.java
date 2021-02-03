package com.inetwork.web.data.shared.dto.orders.dlda;

import com.google.common.collect.Lists;
import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.OrderType;
import com.inetwork.web.data.shared.dto.AbstractFeatureOrder;
import com.inetwork.web.data.shared.dto.TelephoneNumberError;
import com.inetwork.web.data.shared.utils.CollectionUtils;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class DldaOrderPayload extends AbstractFeatureOrder<TelephoneNumberError>
{

   public static final String ROOT_ELEMENT = "DldaOrder";

   @Override
   public OrderType getOrderType()
   {
      return OrderType.DLDA;
   }

   public interface Reader extends XmlReader<DldaOrderPayload>
   {
   }

   public interface Writer extends XmlWriter<DldaOrderPayload>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("DldaTnGroups/DldaTnGroup")
   private List<DldaTnGroup> dldaTnGroups;

   @Path("DeleteDldaTnGroups")
   private Boolean deleteDldaTnGroups;

   public List<DldaTnGroup> getDldaTnGroups()
   {
      return dldaTnGroups;
   }

   public void setDldaTnGroups(List<DldaTnGroup> dldaTnGroups)
   {
      this.dldaTnGroups = dldaTnGroups;
   }

   public List<String> getValidNumbers()
   {
      List<String> validNumbers = Lists.newArrayList();
      if (CollectionUtils.isNotEmpty(dldaTnGroups))
      {
         for (DldaTnGroup dldaTnGroup : dldaTnGroups)
         {
            validNumbers.addAll(dldaTnGroup.getNumbers());
         }
         validNumbers.removeAll(getErrorNumbers());
      }
      return validNumbers;
   }

   public boolean hasValidNumbers()
   {
      return CollectionUtils.isNotEmpty(getValidNumbers());
   }

   public void addDldaTnGroup(DldaTnGroup tnGroup)
   {
      if (CollectionUtils.isEmpty(dldaTnGroups))
      {
         dldaTnGroups = Lists.newArrayList();
      }
      dldaTnGroups.add(tnGroup);
   }

   public Boolean getDeleteDldaTnGroups() {
      return deleteDldaTnGroups;
   }

   public void setDeleteDldaTnGroups(Boolean deleteDldaTnGroups) {
      this.deleteDldaTnGroups = deleteDldaTnGroups;
   }
}
