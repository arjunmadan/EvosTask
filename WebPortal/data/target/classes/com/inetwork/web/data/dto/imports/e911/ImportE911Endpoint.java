package com.inetwork.web.data.dto.imports.e911;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.inetwork.common.util.csv.model.CsvHeaderName;

@XmlRootElement(name = "ImportE911Endpoint")
@XmlType(name = "ImportE911Endpoint")
@XmlAccessorType(XmlAccessType.NONE)
public class ImportE911Endpoint
{
   @XmlElement(name = "Identifier")
   @CsvHeaderName("Identifier")
   private String identifier;
   @XmlElement(name = "CallbackNumber")
   @CsvHeaderName("CallbackNumber")
   private String callbackNumber;
   @XmlElement(name = "CallerName")
   @CsvHeaderName("CallerName")
   private String callerName;
   @XmlElement(name = "PreferredLanguage")
   @CsvHeaderName("PreferredLanguage")
   private String preferredLanguage;
   @XmlElement(name = "LocationId")
   @CsvHeaderName("LocationId")
   private String locationId;
   @XmlElement(name = "HousePrefix")
   @CsvHeaderName("HousePrefix")
   private String housePrefix;
   @XmlElement(name = "HouseNumber")
   @CsvHeaderName("HouseNumber")
   private String houseNo;
   @XmlElement(name = "HouseSuffix")
   @CsvHeaderName("HouseSuffix")
   private String houseSuffix;
   @XmlElement(name = "PreDirectional")
   @CsvHeaderName("PreDirectional")
   private String preDirectional;
   @XmlElement(name = "StreetName")
   @CsvHeaderName("StreetName")
   private String streetName;
   @XmlElement(name = "StreetSuffix")
   @CsvHeaderName("StreetSuffix")
   private String streetSuffix;
   @XmlElement(name = "PostDirectional")
   @CsvHeaderName("PostDirectional")
   private String postDirectional;
   @XmlElement(name = "AddressLine2")
   @CsvHeaderName("AddressLine2")
   private String addressLine2;
   @XmlElement(name = "City")
   @CsvHeaderName("City")
   private String city;
   @XmlElement(name = "StateCode")
   @CsvHeaderName("StateCode")
   private String stateCode;
   @XmlElement(name = "Zip")
   @CsvHeaderName("Zip")
   private String zip;
   @XmlElement(name = "PlusFour")
   @CsvHeaderName("PlusFour")
   private String zip4;

   public String getIdentifier()
   {
      return identifier;
   }

   public void setIdentifier(String identifier)
   {
      this.identifier = identifier;
   }

   public String getCallbackNumber()
   {
      return callbackNumber;
   }

   public void setCallbackNumber(String callbackNumber)
   {
      this.callbackNumber = callbackNumber;
   }

   public String getCallerName()
   {
      return callerName;
   }

   public void setCallerName(String callerName)
   {
      this.callerName = callerName;
   }

   public String getPreferredLanguage()
   {
      return preferredLanguage;
   }

   public void setPreferredLanguage(String preferredLanguage)
   {
      this.preferredLanguage = preferredLanguage;
   }

   public String getLocationId()
   {
      return locationId;
   }

   public void setLocationId(String locationId)
   {
      this.locationId = locationId;
   }

   public String getHousePrefix()
   {
      return housePrefix;
   }

   public void setHousePrefix(String housePrefix)
   {
      this.housePrefix = housePrefix;
   }

   public String getHouseNo()
   {
      return houseNo;
   }

   public void setHouseNo(String houseNo)
   {
      this.houseNo = houseNo;
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

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (o == null || getClass() != o.getClass())
         return false;
      ImportE911Endpoint that = (ImportE911Endpoint) o;
      return Objects.equal(identifier, that.identifier) && Objects.equal(callbackNumber, that.callbackNumber)
            && Objects.equal(callerName, that.callerName) && Objects.equal(preferredLanguage, that.preferredLanguage)
            && Objects.equal(locationId, that.locationId) && Objects.equal(housePrefix, that.housePrefix) && Objects.equal(houseNo, that.houseNo)
            && Objects.equal(houseSuffix, that.houseSuffix) && Objects.equal(preDirectional, that.preDirectional)
            && Objects.equal(streetName, that.streetName) && Objects.equal(streetSuffix, that.streetSuffix)
            && Objects.equal(postDirectional, that.postDirectional) && Objects.equal(addressLine2, that.addressLine2)
            && Objects.equal(city, that.city) && Objects.equal(stateCode, that.stateCode) && Objects.equal(zip, that.zip)
            && Objects.equal(zip4, that.zip4);
   }

   @Override
   public int hashCode()
   {
      return Objects.hashCode(identifier, callbackNumber, callerName, preferredLanguage, locationId, housePrefix, houseNo, houseSuffix,
            preDirectional, streetName, streetSuffix, postDirectional, addressLine2, city, stateCode, zip, zip4);
   }

   @Override
   public String toString()
   {
      return MoreObjects.toStringHelper(this)
            .add("identifier", identifier)
            .add("callbackNumber", callbackNumber)
            .add("callerName", callerName)
            .add("preferredLanguage", preferredLanguage)
            .add("locationId", locationId)
            .add("housePrefix", housePrefix)
            .add("houseNo", houseNo)
            .add("houseSuffix", houseSuffix)
            .add("preDirectional", preDirectional)
            .add("streetName", streetName)
            .add("streetSuffix", streetSuffix)
            .add("postDirectional", postDirectional)
            .add("addressLine2", addressLine2)
            .add("city", city)
            .add("stateCode", stateCode)
            .add("zip", zip)
            .add("zip4", zip4)
            .toString();
   }

   public ImportE911Endpoint.Builder toBuilder()
   {
      return new ImportE911Endpoint.Builder().setIdentifier(identifier)
            .setCallbackNumber(callbackNumber)
            .setCallerName(callerName)
            .setPreferredLanguage(preferredLanguage)
            .setLocationId(locationId)
            .setHousePrefix(housePrefix)
            .setHouseNo(houseNo)
            .setHouseSuffix(houseSuffix)
            .setPreDirectional(preDirectional)
            .setStreetName(streetName)
            .setStreetSuffix(streetSuffix)
            .setPostDirectional(postDirectional)
            .setAddressLine2(addressLine2)
            .setCity(city)
            .setStateCode(stateCode)
            .setZip(zip)
            .setZip4(zip4);
   }

   public static ImportE911Endpoint.Builder newBuilder()
   {
      return new Builder();
   }

   public static class Builder
   {
      private Builder()
      {

      }

      private String identifier;
      private String callbackNumber;
      private String callerName;
      private String preferredLanguage;
      private String locationId;
      private String housePrefix;
      private String houseNo;
      private String houseSuffix;
      private String preDirectional;
      private String streetName;
      private String streetSuffix;
      private String postDirectional;
      private String addressLine2;
      private String city;
      private String stateCode;
      private String zip;
      private String zip4;

      public Builder setIdentifier(String identifier)
      {
         this.identifier = identifier;
         return this;
      }

      public Builder setCallbackNumber(String callbackNumber)
      {
         this.callbackNumber = callbackNumber;
         return this;
      }

      public Builder setCallerName(String callerName)
      {
         this.callerName = callerName;
         return this;
      }

      public Builder setPreferredLanguage(String preferredLanguage)
      {
         this.preferredLanguage = preferredLanguage;
         return this;
      }

      public Builder setLocationId(String locationId)
      {
         this.locationId = locationId;
         return this;
      }

      public Builder setHousePrefix(String housePrefix)
      {
         this.housePrefix = housePrefix;
         return this;
      }

      public Builder setHouseNo(String houseNo)
      {
         this.houseNo = houseNo;
         return this;
      }

      public Builder setHouseSuffix(String houseSuffix)
      {
         this.houseSuffix = houseSuffix;
         return this;
      }

      public Builder setPreDirectional(String preDirectional)
      {
         this.preDirectional = preDirectional;
         return this;
      }

      public Builder setStreetName(String streetName)
      {
         this.streetName = streetName;
         return this;
      }

      public Builder setStreetSuffix(String streetSuffix)
      {
         this.streetSuffix = streetSuffix;
         return this;
      }

      public Builder setPostDirectional(String postDirectional)
      {
         this.postDirectional = postDirectional;
         return this;
      }

      public Builder setAddressLine2(String addressLine2)
      {
         this.addressLine2 = addressLine2;
         return this;
      }

      public Builder setCity(String city)
      {
         this.city = city;
         return this;
      }

      public Builder setStateCode(String stateCode)
      {
         this.stateCode = stateCode;
         return this;
      }

      public Builder setZip(String zip)
      {
         this.zip = zip;
         return this;
      }

      public Builder setZip4(String zip4)
      {
         this.zip4 = zip4;
         return this;
      }

      public ImportE911Endpoint build()
      {
         final ImportE911Endpoint importE911Endpoint = new ImportE911Endpoint();
         importE911Endpoint.setIdentifier(identifier);
         importE911Endpoint.setCallbackNumber(callbackNumber);
         importE911Endpoint.setCallerName(callerName);
         importE911Endpoint.setPreferredLanguage(preferredLanguage);
         importE911Endpoint.setLocationId(locationId);
         importE911Endpoint.setHousePrefix(housePrefix);
         importE911Endpoint.setHouseNo(houseNo);
         importE911Endpoint.setHouseSuffix(houseSuffix);
         importE911Endpoint.setPreDirectional(preDirectional);
         importE911Endpoint.setStreetName(streetName);
         importE911Endpoint.setStreetSuffix(streetSuffix);
         importE911Endpoint.setPostDirectional(postDirectional);
         importE911Endpoint.setAddressLine2(addressLine2);
         importE911Endpoint.setCity(city);
         importE911Endpoint.setStateCode(stateCode);
         importE911Endpoint.setZip(zip);
         importE911Endpoint.setZip4(zip4);

         return importE911Endpoint;
      }
   }
}
