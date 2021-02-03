package com.inetwork.web.data.dto.imports.linefeatures.dlda;

import static com.inetwork.web.data.shared.ServiceConstants.YES;
import static com.inetwork.web.data.shared.utils.StringUtils.isNotEmpty;

import com.google.common.base.Objects;
import com.inetwork.common.dto.Address;
import com.inetwork.common.dto.dlda.DldaListingName;
import com.inetwork.common.dto.dlda.DldaListingType;
import com.inetwork.common.dto.dlda.DldaSubscriberType;
import com.inetwork.common.dto.dlda.DldaTnGroup;
import com.inetwork.web.data.shared.utils.EnumUtils;

public class DldaDetailsKey
{

   private String subscriberType;
   private String listingType;
   private String listAddress;
   private String firstName;
   private String firstName2;
   private String lastName;
   private String designation;
   private String titleOfLineage;
   private String titleOfAddress;
   private String titleOfAddress2;
   private String titleOfLineageName2;
   private String titleOfAddressName2;
   private String titleOfAddress2Name2;
   private String placeListingAs;
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
   private String serviceType;

   public boolean equals(Object obj)
   {
      if (obj instanceof DldaDetailsKey)
      {
         DldaDetailsKey dldaDetailsKey = (DldaDetailsKey) obj;
         return Objects.equal(getSubscriberType(), dldaDetailsKey.getSubscriberType())
               && Objects.equal(getListingType(), dldaDetailsKey.getListingType())
               && Objects.equal(getListAddress(), dldaDetailsKey.getListAddress()) && Objects.equal(getFirstName(), dldaDetailsKey.getFirstName())
               && Objects.equal(getFirstName2(), dldaDetailsKey.getFirstName2()) && Objects.equal(getLastName(), dldaDetailsKey.getLastName())
               && Objects.equal(getDesignation(), dldaDetailsKey.getDesignation())
               && Objects.equal(getTitleOfLineage(), dldaDetailsKey.getTitleOfLineage())
               && Objects.equal(getTitleOfAddress(), dldaDetailsKey.getTitleOfAddress())
               && Objects.equal(getTitleOfAddress2(), dldaDetailsKey.getTitleOfAddress2())
               && Objects.equal(getTitleOfLineageName2(), dldaDetailsKey.getTitleOfLineageName2())
               && Objects.equal(getTitleOfAddressName2(), dldaDetailsKey.getTitleOfAddressName2())
               && Objects.equal(getTitleOfAddress2Name2(), dldaDetailsKey.getTitleOfAddress2Name2())
               && Objects.equal(getPlaceListingAs(), dldaDetailsKey.getPlaceListingAs())
               && Objects.equal(getHousePrefix(), dldaDetailsKey.getHousePrefix())
               && Objects.equal(getHouseNumber(), dldaDetailsKey.getHouseNumber())
               && Objects.equal(getHouseSuffix(), dldaDetailsKey.getHouseSuffix())
               && Objects.equal(getPreDirectional(), dldaDetailsKey.getPreDirectional())
               && Objects.equal(getStreetName(), dldaDetailsKey.getStreetName())
               && Objects.equal(getStreetSuffix(), dldaDetailsKey.getStreetSuffix())
               && Objects.equal(getPostDirectional(), dldaDetailsKey.getPostDirectional())
               && Objects.equal(getAddressLine2(), dldaDetailsKey.getAddressLine2()) && Objects.equal(getCity(), dldaDetailsKey.getCity())
               && Objects.equal(getStateCode(), dldaDetailsKey.getStateCode()) && Objects.equal(getZip(), dldaDetailsKey.getZip())
               && Objects.equal(getZipPlus4(), dldaDetailsKey.getZipPlus4())
               && Objects.equal(getServiceType(), dldaDetailsKey.getServiceType());
      }
      return false;
   }

   public int hashCode()
   {
      return Objects.hashCode(getSubscriberType(), getListingType(), getListAddress(), getFirstName(), getFirstName2(), getLastName(),
            getDesignation(), getTitleOfLineage(), getTitleOfAddress(), getTitleOfAddress2(), getTitleOfLineageName2(), getTitleOfAddressName2(),
            getTitleOfAddress2Name2(), getPlaceListingAs(), getHousePrefix(), getHouseNumber(), getHouseSuffix(), getPreDirectional(),
            getStreetName(), getStreetSuffix(), getPostDirectional(), getAddressLine2(), getCity(), getStateCode(), getZip(), getZipPlus4(), getServiceType());
   }

   public String getSubscriberType()
   {
      return subscriberType;
   }

   public void setSubscriberType(String subscriberType)
   {
      this.subscriberType = subscriberType;
   }

   public String getListingType()
   {
      return listingType;
   }

   public void setListingType(String listingType)
   {
      this.listingType = listingType;
   }

   public String getListAddress()
   {
      return listAddress;
   }

   public void setListAddress(String listAddress)
   {
      this.listAddress = listAddress;
   }

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

   public void setServiceType(String serviceType) {
      this.serviceType = serviceType;
   }

   public String getServiceType() {
      return serviceType;
   }

   public DldaTnGroup asDldaTnGroup()
   {
      DldaTnGroup dldaTnGroup = new DldaTnGroup();
      dldaTnGroup.setSubscriberType(EnumUtils.valueOf(getSubscriberType(), DldaSubscriberType.values()));
      dldaTnGroup.setListingType(EnumUtils.valueOf(getListingType(), DldaListingType.values()));
      dldaTnGroup.setListingName(extractListingName());
      dldaTnGroup.setListAddress(extractListAddress());
      dldaTnGroup.setAddress(extractAddress());
      return dldaTnGroup;
   }

   private boolean extractListAddress()
   {
      return YES.equalsIgnoreCase(listAddress) || Boolean.valueOf(listAddress);
   }

   private DldaListingName extractListingName()
   {
      DldaListingName listingName = new DldaListingName();
      listingName.setFirstName(getFirstName());
      listingName.setFirstName2(getFirstName2());
      listingName.setLastName(getLastName());
      listingName.setDesignation(getDesignation());
      listingName.setTitleOfLineage(getTitleOfLineage());
      listingName.setTitleOfAddress(getTitleOfAddress());
      listingName.setTitleOfAddress2(getTitleOfAddress2());
      listingName.setTitleOfLineageName2(getTitleOfLineageName2());
      listingName.setTitleOfAddressName2(getTitleOfAddressName2());
      listingName.setTitleOfAddress2Name2(getTitleOfAddress2Name2());
      listingName.setPlaceListingAs(getPlaceListingAs());
      return listingName;
   }

   private Address extractAddress()
   {
      Address address = new Address();
      address.setHousePrefix(getHousePrefix());
      address.setHouseNo(getHouseNumber());
      address.setHouseSuffix(getHouseSuffix());
      address.setPreDirectional(getPreDirectional());
      address.setStreetName(getStreetName());
      address.setStreetSuffix(getStreetSuffix());
      address.setPostDirectional(getPostDirectional());
      address.setAddressLine2(getAddressLine2());
      address.setCity(getCity());
      address.setStateCode(getStateCode());
      address.setZip(getZip());
      address.setZip4(getZipPlus4());
      return address;
   }

   public boolean isServiceTypeValid()
   {
      return isNotEmpty(serviceType) &&
              org.apache.commons.lang3.EnumUtils.isValidEnum(DldaServiceType.class, serviceType.toUpperCase());
   }
}
