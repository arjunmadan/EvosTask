package com.inetwork.web.data.shared.dto.orders.orderdetail.portorder;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;

public class ServiceAddress {

   public interface Reader extends XmlReader<ServiceAddress>{}

   public interface  Writer extends XmlWriter<ServiceAddress> {}

   public static final Writer WRITER = GWT.create(Writer.class);

   public static final Reader READER = GWT.create(Reader.class);

    @Path("HouseNumber")
    private String houseNumber;
    @Path("StreetName")
    private String streetName;
    @Path("City")
    private String city;
    @Path("StateCode")
    private String stateCode;
    @Path("Zip")
    private String zip;
    @Path("County")
    private String county;
    @Path("Country")
    private String country;
    @Path("AddressType")
    private String addressType;
   @Path("AddressLine2")
   private String addressLine2;
   
    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

   public String getAddressLine2()
   {
      return addressLine2;
   }

   public void setAddressLine2(String addressLine2)
   {
      this.addressLine2 = addressLine2;
   }
}
