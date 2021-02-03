package com.inetwork.web.data.shared.dto.orders.e911;

import static com.inetwork.web.data.shared.utils.StringUtils.EMPTY_STRING;

import java.io.Serializable;
import java.util.Objects;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.IsSerializable;
import com.inetwork.web.data.shared.dto.Address;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class E911Address extends Address implements Serializable, IsSerializable
{
   public interface Writer extends XmlWriter<E911Address>, Serializable
   {
   }

   public interface Reader extends XmlReader<E911Address>, Serializable
   {
   }

   public static final Writer WRITER = GWT.create(Writer.class);
   public static final Reader READER = GWT.create(Reader.class);

   @Path("LocationId")
   private String locationId;
   @Path("ValidationStatus")
   private String valid;
   @Path("EndpointCount")
   private Integer endpointCount;
   @Path("Adjusted")
   private Boolean adjusted;

   public E911Address(Address address, String locationId, String valid, Boolean adjusted)
   {
      this(address);
      this.locationId = locationId;
      this.valid = valid;
      this.adjusted = adjusted;
   }

   public E911Address()
   {
   }

   public E911Address(Address address)
   {
      setHousePrefix(address.getHousePrefix());
      setHouseNumber(address.getHouseNumber());
      setHouseSuffix(address.getHouseSuffix());
      setPreDirectional(address.getPreDirectional());
      setStreetName(address.getStreetName());
      setStreetSuffix(address.getStreetSuffix());
      setPostDirectional(address.getPostDirectional());
      setAddressLine2(address.getAddressLine2());
      setCity(address.getCity());
      setStateCode(address.getStateCode());
      setZip(address.getZip());
      setZip4(address.getZip4());
      setCounty(address.getCounty());
      setCountry(address.getCountry());
      setAddressType(address.getAddressType());
      setResetAddressFields(address.getResetAddressFields());
   }

   public E911Address(Address address, String locationId)
   {
      this(address);
      this.locationId = locationId;
   }

   public E911Address(Address address, String locationId, String valid)
   {
      this(address, locationId, valid, null);
   }

   public String getLocationId()
   {
      return locationId;
   }

   public void setLocationId(String locationId)
   {
      this.locationId = locationId;
   }

   public Integer getEndpointCount()
   {
      return endpointCount;
   }

   public void setEndpointCount(Integer endpointCount)
   {
      this.endpointCount = endpointCount;
   }

   public void setValid(String valid)
   {
      this.valid = valid;
   }

   public String getValid()
   {
      return valid;
   }

   public Boolean isAdjusted()
   {
      return adjusted;
   }

   public void setAdjusted(Boolean adjusted)
   {
      this.adjusted = adjusted;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (!(o instanceof E911Address))
         return false;
      if (!super.equals(o))
         return false;
      E911Address that = (E911Address) o;
      return Objects.equals(getLocationId(), that.getLocationId()) && Objects.equals(getValid(), that.getValid())
            && Objects.equals(isAdjusted(), that.isAdjusted());
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(super.hashCode(), getLocationId(), getValid(), isAdjusted());
   }

   @Override
   public E911Address copy()
   {
      return new E911Address(super.copy(), this.locationId, this.valid, this.adjusted);
   }

   @Override
   public String toString()
   {
      return (getHousePrefix() != null ? (getHousePrefix() + " ") : EMPTY_STRING)
            + (getHouseNumber() != null ? getHouseNumber() : EMPTY_STRING) + (getHouseSuffix() != null ? (" " + getHouseSuffix()) : EMPTY_STRING)
            + (getPreDirectional() != null ? (" " + getPreDirectional()) : EMPTY_STRING)
            + (getStreetName() != null ? (" " + getStreetName()) : EMPTY_STRING)
            + (getStreetSuffix() != null ? (" " + getStreetSuffix()) : EMPTY_STRING)
            + (getPostDirectional() != null ? (" " + getPostDirectional()) : EMPTY_STRING)
            + (getAddressLine2() != null ? (" " + getAddressLine2()) : EMPTY_STRING) + (getCity() != null ? (" " + getCity()) : EMPTY_STRING)
            + (getStateCode() != null ? ("," + getStateCode()) : EMPTY_STRING) + (getZip() != null ? (" " + getZip()) : EMPTY_STRING)
            + (getZip4() != null ? ("-" + getZip4()) : EMPTY_STRING) + (getCounty() != null ? (", " + getCounty()) : EMPTY_STRING)
            + (getCountry() != null ? ("," + getCountry()) : EMPTY_STRING);
   }
}
