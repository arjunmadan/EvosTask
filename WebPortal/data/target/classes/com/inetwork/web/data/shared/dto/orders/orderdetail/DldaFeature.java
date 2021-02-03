package com.inetwork.web.data.shared.dto.orders.orderdetail;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.Address;
import com.inetwork.web.data.shared.dto.orders.dlda.DldaListingName;
import com.inetwork.web.data.shared.dto.orders.dlda.DldaListingType;
import com.inetwork.web.data.shared.dto.orders.dlda.DldaSubscriberType;

public class DldaFeature extends Feature
{
   public interface Reader extends XmlReader<DldaFeature>
   {
   }

   public interface Writer extends XmlWriter<DldaFeature>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("SubscriberType")
   private DldaSubscriberType subscriberType;
   @Path("ListingType")
   private DldaListingType listingType;
   @Path("ListingName")
   private DldaListingName listingName;
   @Path("ListAddress")
   private Boolean listAddress;
   @Path("Address")
   private Address address;
   @Path("PendingOrderId")
   private String pendingOrderId;

   public DldaSubscriberType getSubscriberType()
   {
      return subscriberType;
   }

   public void setSubscriberType(DldaSubscriberType subscriberType)
   {
      this.subscriberType = subscriberType;
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

   public String getPendingOrderId()
   {
      return pendingOrderId;
   }

   public void setPendingOrderId(String pendingOrderId)
   {
      this.pendingOrderId = pendingOrderId;
   }
}
