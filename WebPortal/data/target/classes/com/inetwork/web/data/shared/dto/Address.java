package com.inetwork.web.data.shared.dto;

import java.util.Objects;

import com.google.gwt.core.client.GWT;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class Address
{
   public interface Reader extends XmlReader<Address>
   {
   }

   public interface Writer extends XmlWriter<Address>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("HouseNumber")
   private String houseNumber;
   @Path("HousePrefix")
   private String housePrefix;
   @Path("HouseSuffix")
   private String houseSuffix;
   @Path("PreDirectional")
   private String preDirectional;
   @Path("StreetName")
   private String streetName;
   @Path("StreetSuffix")
   private String streetSuffix;
   @Path("PostDirectional")
   private String postDirectional;
   @Path("AddressLine2")
   private String addressLine2;
   @Path("City")
   private String city;
   @Path("StateCode")
   private String stateCode;
   @Path("Zip")
   private String zip;
   @Path("PlusFour")
   private String zip4;
   @Path("County")
   private String county;
   @Path("Country")
   private String country;
   @Path("AddressType")
   private String addressType;
   @Path("ResetAddressFields")
   private Boolean resetAddressFields;
   @Path("Latitude")
   private Boolean latitude;
   @Path("Longitude")
   private Boolean longitude;

   public String getHouseNumber()
   {
      return houseNumber;
   }

   public void setHouseNumber(String houseNumber)
   {
      this.houseNumber = houseNumber;
   }

   public String getHousePrefix()
   {
      return housePrefix;
   }

   public void setHousePrefix(String housePrefix)
   {
      this.housePrefix = housePrefix;
   }

   public String getHouseSuffix()
   {
      return houseSuffix;
   }

   public void setHouseSuffix(String houseSuffix)
   {
      this.houseSuffix = houseSuffix;
   }

   public String getPreDirectional()
   {
      return preDirectional;
   }

   public void setPreDirectional(String preDirectional)
   {
      this.preDirectional = preDirectional;
   }

   public String getStreetName()
   {
      return streetName;
   }

   public void setStreetName(String streetName)
   {
      this.streetName = streetName;
   }

   public String getStreetSuffix()
   {
      return streetSuffix;
   }

   public void setStreetSuffix(String streetSuffix)
   {
      this.streetSuffix = streetSuffix;
   }

   public String getPostDirectional()
   {
      return postDirectional;
   }

   public void setPostDirectional(String postDirectional)
   {
      this.postDirectional = postDirectional;
   }

   public String getAddressLine2()
   {
      return addressLine2;
   }

   public void setAddressLine2(String addressLine2)
   {
      this.addressLine2 = addressLine2;
   }

   public String getCity()
   {
      return city;
   }

   public void setCity(String city)
   {
      this.city = city;
   }

   public String getStateCode()
   {
      return stateCode;
   }

   public void setStateCode(String stateCode)
   {
      this.stateCode = stateCode;
   }

   public String getZip()
   {
      return zip;
   }

   public void setZip(String zip)
   {
      this.zip = zip;
   }

   public String getZip4()
   {
      return zip4;
   }

   public void setZip4(String zip4)
   {
      this.zip4 = zip4;
   }

   public String getCounty()
   {
      return county;
   }

   public void setCounty(String county)
   {
      this.county = county;
   }

   public String getCountry()
   {
      return country;
   }

   public void setCountry(String country)
   {
      this.country = country;
   }

   public String getAddressType()
   {
      return addressType;
   }

   public void setAddressType(String addressType)
   {
      this.addressType = addressType;
   }

   public Boolean getResetAddressFields()
   {
      return resetAddressFields;
   }

   public void setResetAddressFields(Boolean resetAddressFields)
   {
      this.resetAddressFields = resetAddressFields;
   }

   public Boolean getLatitude() {
      return latitude;
   }

   public void setLatitude(Boolean latitude) {
      this.latitude = latitude;
   }

   public Boolean getLongitude() {
      return longitude;
   }

   public void setLongitude(Boolean longitude) {
      this.longitude = longitude;
   }

   @Override
   public String toString()
   {
      return houseNumber + ' ' + streetName + ", " + city + ", " + stateCode + ", " + zip;
   }

   // Would rather not be doing this, but GWT restrictions re: clone provide no other apparent choice.
   public Address copy()
   {
      Address copy = new Address();
      copy.setHouseNumber(getHouseNumber());
      copy.setHousePrefix(getHousePrefix());
      copy.setHouseSuffix(getHouseSuffix());
      copy.setPreDirectional(getPreDirectional());
      copy.setStreetName(getStreetName());
      copy.setStreetSuffix(getStreetSuffix());
      copy.setPostDirectional(getPostDirectional());
      copy.setAddressLine2(getAddressLine2());
      copy.setCity(getCity());
      copy.setStateCode(getStateCode());
      copy.setZip(getZip());
      copy.setZip4(getZip4());
      copy.setCounty(getCounty());
      copy.setCountry(getCountry());
      copy.setAddressType(getAddressType());
      copy.setResetAddressFields(getResetAddressFields());
      copy.setLatitude(getLatitude());
      copy.setLongitude(getLongitude());
      return copy;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (!(o instanceof Address))
         return false;
      Address address = (Address) o;
      return Objects.equals(getHouseNumber(), address.getHouseNumber()) && Objects.equals(getHousePrefix(), address.getHousePrefix())
            && Objects.equals(getHouseSuffix(), address.getHouseSuffix()) && Objects.equals(getPreDirectional(), address.getPreDirectional())
            && Objects.equals(getStreetName(), address.getStreetName()) && Objects.equals(getStreetSuffix(), address.getStreetSuffix())
            && Objects.equals(getPostDirectional(), address.getPostDirectional()) && Objects.equals(getAddressLine2(), address.getAddressLine2())
            && Objects.equals(getCity(), address.getCity()) && Objects.equals(getStateCode(), address.getStateCode())
            && Objects.equals(getZip(), address.getZip()) && Objects.equals(getZip4(), address.getZip4())
            && Objects.equals(getCounty(), address.getCounty()) && Objects.equals(getCountry(), address.getCountry())
            && Objects.equals(getAddressType(), address.getAddressType()) && Objects.equals(getResetAddressFields(), address.getResetAddressFields())
            && Objects.equals(getLatitude(), address.getLatitude()) && Objects.equals(getLongitude(), address.getLongitude());
   }

   @Override
   public int hashCode()
   {

      return Objects.hash(getHouseNumber(), getHousePrefix(), getHouseSuffix(), getPreDirectional(), getStreetName(), getStreetSuffix(),
            getPostDirectional(), getAddressLine2(), getCity(), getStateCode(), getZip(), getZip4(), getCounty(), getCountry(), getAddressType(),
            getResetAddressFields(), getLatitude(), getLongitude());
   }
}
