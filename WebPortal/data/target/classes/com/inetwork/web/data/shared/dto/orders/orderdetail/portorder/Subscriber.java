package com.inetwork.web.data.shared.dto.orders.orderdetail.portorder;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.Address;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class Subscriber
{

   public interface Reader extends XmlReader<Subscriber>
   {
   }

   public interface Writer extends XmlWriter<Subscriber>
   {
   }

   public static final Writer WRITER = GWT.create(Writer.class);

   public static final Reader READER = GWT.create(Reader.class);

   @Path("SubscriberType")
   private String subscriberType;
   @Path("FirstName")
   private String firstName;
   @Path("MiddleInitial")
   private String middleInitial;
   @Path("LastName")
   private String lastName;
   @Path("BusinessName")
   private String businessName;
   @Path("ServiceAddress")
   private Address serviceAddress;
   @Path("AccountNumber")
   private String accountNumber;
   @Path("PinNumber")
   private String accountPin;

   public String getSubscriberType()
   {
      return subscriberType;
   }

   public void setSubscriberType(String subscriberType)
   {
      this.subscriberType = subscriberType;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public String getMiddleInitial()
   {
      return middleInitial;
   }

   public void setMiddleInitial(String middleInitial)
   {
      this.middleInitial = middleInitial;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public Address getServiceAddress()
   {
      return serviceAddress;
   }

   public void setServiceAddress(Address serviceAddress)
   {
      this.serviceAddress = serviceAddress;
   }

   public String getBusinessName()
   {
      return businessName;
   }

   public void setBusinessName(String businessName)
   {
      this.businessName = businessName;
   }

   public String getAccountNumber()
   {
      return accountNumber;
   }

   public void setAccountNumber(String accountNumber)
   {
      this.accountNumber = accountNumber;
   }

   public String getAccountPin()
   {
      return accountPin;
   }

   public void setAccountPin(String accountPin)
   {
      this.accountPin = accountPin;
   }
}
