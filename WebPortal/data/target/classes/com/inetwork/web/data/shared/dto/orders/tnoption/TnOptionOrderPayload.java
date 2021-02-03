package com.inetwork.web.data.shared.dto.orders.tnoption;

import java.util.ArrayList;
import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.OrderType;
import com.inetwork.web.data.shared.dto.AbstractFeatureOrder;
import com.inetwork.web.data.shared.dto.TelephoneNumberError;

public class TnOptionOrderPayload extends AbstractFeatureOrder<TelephoneNumberError>
{
   public static final String ROOT_ELEMENT = "TnOptionOrder";

   @Override
   public OrderType getOrderType()
   {
      return OrderType.TN_OPTION;
   }

   public interface Reader extends XmlReader<TnOptionOrderPayload>
   {
   }

   public interface Writer extends XmlWriter<TnOptionOrderPayload>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   public TnOptionOrderPayload()
   {
   }

   public TnOptionOrderPayload(List<TnOptionGroup> tnOptionsGroups)
   {
      this.tnOptionsGroups = tnOptionsGroups;
   }

   @Path("TnOptionGroups/TnOptionGroup")
   private List<TnOptionGroup> tnOptionsGroups;

   public List<TnOptionGroup> getTnOptionsGroups()
   {
      return tnOptionsGroups;
   }

   public void setTnOptionsGroups(List<TnOptionGroup> tnOptionsGroups)
   {
      this.tnOptionsGroups = tnOptionsGroups;
   }

   public List<String> getAllGroupNumbers()
   {
      if (tnOptionsGroups == null)
      {
         return null;
      }
      List<String> numbers = new ArrayList<>();
      for (TnOptionGroup tnOptionsGroup : tnOptionsGroups)
      {
         numbers.addAll(tnOptionsGroup.getGroupNumbers());
      }
      return numbers;
   }
}
