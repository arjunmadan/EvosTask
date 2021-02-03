package com.inetwork.web.data.shared.dto.tnassignment;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import java.util.List;

public class NumbersAssignmentOrder
{

   public interface Reader extends XmlReader<NumbersAssignmentOrder>
   {
   }

   public interface Writer extends XmlWriter<NumbersAssignmentOrder>
   {
   }

   public static final Writer WRITER = GWT.create(Writer.class);

   public static final Reader READER = GWT.create(Reader.class);

   @Path("CustomerOrderId")
   private String customerOrderId;
   @Path("Action")
   String action;
   @Path("TelephoneNumbers/TelephoneNumber")
   List<String> telephoneNumbers;

   public String getCustomerOrderId()
   {
      return customerOrderId;
   }

   public void setCustomerOrderId(String customerOrderId)
   {
      this.customerOrderId = customerOrderId;
   }

   public String getAction()
   {
      return action;
   }

   public void setAction(String action)
   {
      this.action = action;
   }

   public List<String> getTelephoneNumbers()
   {
      return telephoneNumbers;
   }

   public void setTelephoneNumbers(List<String> telephoneNumbers)
   {
      this.telephoneNumbers = telephoneNumbers;
   }
}
