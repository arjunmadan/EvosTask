package com.inetwork.web.data.shared.dto.orders.dlda;

import java.util.ArrayList;
import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.Address;

public class DldaTnGroup
{

   public interface Reader extends XmlReader<DldaTnGroup>
   {
   }

   public interface Writer extends XmlWriter<DldaTnGroup>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TelephoneNumbers/TelephoneNumber")
   private List<String> numbers = new ArrayList<String>();
   @Path("ListingType")
   private DldaListingType listingType;
   @Path("ListingName")
   private DldaListingName listingName;
   @Path("SubscriberType")
   private DldaSubscriberType subscriberType;
   @Path("ListAddress")
   private Boolean listAddress;

   @Path("Address")
   private Address address;

   public List<String> getNumbers()
   {
      return numbers;
   }

   public void setNumbers(List<String> numbers)
   {
      this.numbers = numbers;
   }

   public DldaListingType getListingType()
   {
      return listingType;
   }

   public void setListingType(DldaListingType listingType)
   {
      this.listingType = listingType;
   }

   public DldaListingName getListingName()
   {
      return listingName;
   }

   public void setListingName(DldaListingName listingName)
   {
      this.listingName = listingName;
   }

   public DldaSubscriberType getSubscriberType()
   {
      return subscriberType;
   }

   public void setSubscriberType(DldaSubscriberType subscriberType)
   {
      this.subscriberType = subscriberType;
   }

   public Boolean getListAddress()
   {
      return listAddress;
   }

   public void setListAddress(Boolean listAddress)
   {
      this.listAddress = listAddress;
   }

   public Address getAddress()
   {
      return address;
   }

   public void setAddress(Address address)
   {
      this.address = address;
   }
}
