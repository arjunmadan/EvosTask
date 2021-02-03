package com.inetwork.web.data.shared.dto.orders.dlda;

import static com.inetwork.web.data.shared.utils.StringUtils.checkEmpty;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;

public class DldaListingName
{

   public interface Reader extends XmlReader<DldaListingName>
   {
   }

   public interface Writer extends XmlWriter<DldaListingName>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("FirstName")
   private String firstName;
   @Path("FirstName2")
   private String firstName2;
   @Path("LastName")
   private String lastName;
   @Path("Designation")
   private String designation;
   @Path("TitleOfLineage")
   private String titleOfLineage;
   @Path("TitleOfAddress")
   private String titleOfAddress;
   @Path("TitleOfAddress2")
   private String titleOfAddress2;
   @Path("TitleOfLineageName2")
   private String titleOfLineageName2;
   @Path("TitleOfAddressName2")
   private String titleOfAddressName2;
   @Path("TitleOfAddress2Name2")
   private String titleOfAddress2Name2;
   @Path("PlaceListingAs")
   private String placeListingAs;

   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public String getFirstName2()
   {
      return firstName2;
   }

   public void setFirstName2(String firstName2)
   {
      this.firstName2 = firstName2;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public String getDesignation()
   {
      return designation;
   }

   public void setDesignation(String designation)
   {
      this.designation = designation;
   }

   public String getTitleOfLineage()
   {
      return titleOfLineage;
   }

   public void setTitleOfLineage(String titleOfLineage)
   {
      this.titleOfLineage = titleOfLineage;
   }

   public String getTitleOfAddress()
   {
      return titleOfAddress;
   }

   public void setTitleOfAddress(String titleOfAddress)
   {
      this.titleOfAddress = titleOfAddress;
   }

   public String getTitleOfAddress2()
   {
      return titleOfAddress2;
   }

   public void setTitleOfAddress2(String titleOfAddress2)
   {
      this.titleOfAddress2 = titleOfAddress2;
   }

   public String getTitleOfLineageName2()
   {
      return titleOfLineageName2;
   }

   public void setTitleOfLineageName2(String titleOfLineageName2)
   {
      this.titleOfLineageName2 = titleOfLineageName2;
   }

   public String getTitleOfAddressName2()
   {
      return titleOfAddressName2;
   }

   public void setTitleOfAddressName2(String titleOfAddressName2)
   {
      this.titleOfAddressName2 = titleOfAddressName2;
   }

   public String getTitleOfAddress2Name2()
   {
      return titleOfAddress2Name2;
   }

   public void setTitleOfAddress2Name2(String titleOfAddress2Name2)
   {
      this.titleOfAddress2Name2 = titleOfAddress2Name2;
   }

   public String getPlaceListingAs()
   {
      return placeListingAs;
   }

   public void setPlaceListingAs(String placeListingAs)
   {
      this.placeListingAs = placeListingAs;
   }

   public String toSubscriberName(DldaSubscriberType subscriberType)
   {
      if (subscriberType == DldaSubscriberType.BUSINESS)
      {
         return checkEmpty(getLastName()) +
               " " + checkEmpty(getFirstName()) +
               " " + checkEmpty(getFirstName2());
      }
      return checkEmpty(getFirstName()) +
            " " + checkEmpty(getFirstName2()) +
            " " + checkEmpty(getLastName());
   }
}
