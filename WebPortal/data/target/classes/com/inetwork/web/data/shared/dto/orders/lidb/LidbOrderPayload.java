package com.inetwork.web.data.shared.dto.orders.lidb;

import java.util.List;

import com.google.common.collect.Lists;
import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.OrderType;
import com.inetwork.web.data.shared.dto.AbstractFeatureOrder;
import com.inetwork.web.data.shared.dto.TelephoneNumberError;
import com.inetwork.web.data.shared.utils.CollectionUtils;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class LidbOrderPayload extends AbstractFeatureOrder<TelephoneNumberError>
{

   @Override
   public OrderType getOrderType()
   {
      return OrderType.LIDB;
   }

   public interface Reader extends XmlReader<LidbOrderPayload>
   {
   }

   public interface Writer extends XmlWriter<LidbOrderPayload>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("LidbTnGroups/LidbTnGroup")
   private List<LidbDetailTnGroup> lidbDetailTnGroups;

   public List<LidbDetailTnGroup> getLidbDetailTnGroups()
   {
      return lidbDetailTnGroups;
   }

   public void setLidbDetailTnGroups(List<LidbDetailTnGroup> lidbDetailTnGroups)
   {
      this.lidbDetailTnGroups = lidbDetailTnGroups;
   }

   public List<String> getValidNumbers()
   {
      List<String> validNumbers = Lists.newArrayList();
      if (CollectionUtils.isNotEmpty(lidbDetailTnGroups))
      {
         for (LidbDetailTnGroup lidbDetailTnGroup : getLidbDetailTnGroups())
         {
            validNumbers.addAll(lidbDetailTnGroup.getNumbers());
         }
         validNumbers.removeAll(getErrorNumbers());
      }
      return validNumbers;
   }

   public boolean hasValidNumbers()
   {
      return CollectionUtils.isNotEmpty(getValidNumbers());
   }
}
