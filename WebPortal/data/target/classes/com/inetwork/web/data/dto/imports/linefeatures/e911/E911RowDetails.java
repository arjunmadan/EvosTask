package com.inetwork.web.data.dto.imports.linefeatures.e911;

import static com.inetwork.web.data.shared.utils.StringUtils.isBlank;
import static com.inetwork.web.data.shared.utils.StringUtils.isNotBlank;

import com.google.common.base.Objects;
import com.inetwork.common.util.EnumUtil;

public class E911RowDetails
{
   private String callerName;
   private String serviceType;
   private E911ServiceType e911ServiceType;
   private String housePrefix;
   private String houseNumber;
   private String houseSuffix;
   private String preDirectional;
   private String streetName;
   private String streetSuffix;
   private String postDirectional;
   private String addressLine2;
   private String city;
   private String stateCode;
   private String zip;
   private String zipPlus4;
   private String latitude;
   private String longitude;

   public String getCallerName()
   {
      return callerName;
   }

   public void setCallerName(String callerName)
   {
      this.callerName = callerName;
   }

   public String getHousePrefix()
   {
      return housePrefix;
   }

   public void setHousePrefix(String housePrefix)
   {
      this.housePrefix = housePrefix;
   }

   public String getHouseNumber()
   {
      return houseNumber;
   }

   public void setHouseNumber(String houseNumber)
   {
      this.houseNumber = houseNumber;
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

   public String getZipPlus4()
   {
      return zipPlus4;
   }

   public void setZipPlus4(String zipPlus4)
   {
      this.zipPlus4 = zipPlus4;
   }

   public String getServiceType()
   {
      return serviceType;
   }

   public void setServiceType(String serviceType)
   {
      this.serviceType = serviceType;
   }

   public E911ServiceType getE911ServiceType()
   {
      return e911ServiceType;
   }

   public void setE911ServiceType(E911ServiceType e911ServiceType)
   {
      this.e911ServiceType = e911ServiceType;
   }

   public void setE911ServiceType(String e911ServiceType)
   {
      this.e911ServiceType = getE911ServiceType(e911ServiceType);
   }

   public String getLatitude() {
      return latitude;
   }

   public void setLatitude(String latitude) {
      this.latitude = latitude;
   }

   public String getLongitude() {
      return longitude;
   }

   public void setLongitude(String longitude) {
      this.longitude = longitude;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
      {
         return true;
      }
      if (!(o instanceof E911RowDetails))
      {
         return false;
      }
      E911RowDetails that = (E911RowDetails) o;
      return Objects.equal(callerName, that.getCallerName()) && Objects.equal(serviceType, that.getServiceType())
            && Objects.equal(housePrefix, that.getHousePrefix()) && Objects.equal(houseNumber, that.getHouseNumber())
            && Objects.equal(houseSuffix, that.getHouseSuffix()) && Objects.equal(preDirectional, that.getPreDirectional())
            && Objects.equal(streetName, that.getStreetName()) && Objects.equal(streetSuffix, that.getStreetSuffix())
            && Objects.equal(postDirectional, that.getPostDirectional()) && Objects.equal(addressLine2, that.getAddressLine2())
            && Objects.equal(city, that.getCity()) && Objects.equal(stateCode, that.getStateCode()) && Objects.equal(zip, that.getZip())
            && Objects.equal(zipPlus4, that.getZipPlus4()) && Objects.equal(latitude, that.getLatitude()) && Objects.equal(longitude, that.getLongitude());
   }

   @Override
   public int hashCode()
   {
      return Objects.hashCode(callerName, serviceType, housePrefix, houseNumber, houseSuffix, preDirectional, streetName, streetSuffix,
            postDirectional, addressLine2, city, stateCode, zip, zipPlus4, latitude, longitude);
   }

   public boolean hasAtLeastOneNonBlankAddressField()
   {
      return isNotBlank(housePrefix) || isNotBlank(houseNumber) || isNotBlank(houseSuffix) || isNotBlank(preDirectional) || isNotBlank(streetName)
            || isNotBlank(streetSuffix) || isNotBlank(postDirectional) || isNotBlank(addressLine2) || isNotBlank(city) || isNotBlank(stateCode)
            || isNotBlank(zip) || isNotBlank(zipPlus4) || isNotBlank(latitude) || isNotBlank(longitude);
   }

   public Boolean isDeleteTnSpecificAddress()
   {
      return e911ServiceType != null ? e911ServiceType.isDeleteTnSpecificAddress() : null;
   }

   public boolean isServiceTypeValid()
   {
      return isBlank(serviceType) || e911ServiceType != null;
   }

   private E911ServiceType getE911ServiceType(String serviceType)
   {
      return EnumUtil.convertToEnum(E911ServiceType.values(), serviceType);
   }
}
