package com.inetwork.gwt.client.common.client.dto.geocoding;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.Address;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import static com.inetwork.common.dto.Address.ADDRESS_LINE2;
import static com.inetwork.common.dto.Address.CITY_TAG;
import static com.inetwork.common.dto.Address.COUNTRY_TAG;
import static com.inetwork.common.dto.Address.HOUSE_NUMBER;
import static com.inetwork.common.dto.Address.HOUSE_SUFFIX;
import static com.inetwork.common.dto.Address.PLUS_FOUR;
import static com.inetwork.common.dto.Address.POST_DIRECTIONAL;
import static com.inetwork.common.dto.Address.PRE_DIRECTIONAL;
import static com.inetwork.common.dto.Address.STATE_CODE;
import static com.inetwork.common.dto.Address.STREET_NAME;
import static com.inetwork.common.dto.Address.STREET_SUFFIX;
import static com.inetwork.common.dto.Address.ZIP_TAG;
import static com.inetwork.common.util.rest.e911.geocoding.E911GeocodingUtil.ADDRESS_LINE_1;
import static com.inetwork.web.data.shared.utils.StringUtils.isNotBlank;

public class E911GeocodeAddress
{
   public interface E911GeocodeAddressReader extends XmlReader<E911GeocodeAddress>
   {
   }

   public interface E911GeocodeAddressWriter extends XmlWriter<E911GeocodeAddress>
   {
   }

   public static final E911GeocodeAddressReader READER = GWT.create(E911GeocodeAddressReader.class);
   public static final E911GeocodeAddressWriter WRITER = GWT.create(E911GeocodeAddressWriter.class);

   @Path(ADDRESS_LINE_1)
   private String addressLine1;
   @Path(HOUSE_NUMBER)
   private String houseNum;
   @Path(HOUSE_SUFFIX)
   private String houseNumSuffix;
   @Path(PRE_DIRECTIONAL)
   private String prefixDirectional;
   @Path(STREET_NAME)
   private String streetName;
   @Path(STREET_SUFFIX)
   private String streetSuffix;
   @Path(POST_DIRECTIONAL)
   private String postDirectional;
   @Path(CITY_TAG)
   private String city;
   @Path(STATE_CODE)
   private String state;
   @Path(ZIP_TAG)
   private String zip;
   @Path(PLUS_FOUR)
   private String zipPlusFour;
   @Path(COUNTRY_TAG)
   private String country;
   @Path(ADDRESS_LINE2)
   private String location;

   public E911GeocodeAddress()
   {
   }

   public String getAddressLine1()
   {
      return addressLine1;
   }

   public void setAddressLine1(String addressLine1)
   {
      this.addressLine1 = addressLine1;
   }

   public String getHouseNum()
   {
      return houseNum;
   }

   public void setHouseNum(String houseNum)
   {
      this.houseNum = houseNum;
   }

   public String getHouseNumSuffix()
   {
      return houseNumSuffix;
   }

   public void setHouseNumSuffix(String houseNumSuffix)
   {
      this.houseNumSuffix = houseNumSuffix;
   }

   public String getPrefixDirectional()
   {
      return prefixDirectional;
   }

   public void setPrefixDirectional(String prefixDirectional)
   {
      this.prefixDirectional = prefixDirectional;
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

   public String getCity()
   {
      return city;
   }

   public void setCity(String city)
   {
      this.city = city;
   }

   public String getState()
   {
      return state;
   }

   public void setState(String state)
   {
      this.state = state;
   }

   public String getZip()
   {
      return zip;
   }

   public void setZip(String zip)
   {
      this.zip = zip;
   }

   public String getZipPlusFour()
   {
      return zipPlusFour;
   }

   public void setZipPlusFour(String zipPlusFour)
   {
      this.zipPlusFour = zipPlusFour;
   }

   public String getCountry()
   {
      return country;
   }

   public void setCountry(String country)
   {
      this.country = country;
   }

   public String getLocation()
   {
      return location;
   }

   public void setLocation(String location)
   {
      this.location = location;
   }

   public Address toAddress()
   {
      Address address = new Address();
      setHousePrefixAndNumber(address);
      address.setHouseSuffix(getHouseNumSuffix());
      address.setPreDirectional(getPrefixDirectional());
      address.setStreetName(getStreetName());
      address.setStreetSuffix(getStreetSuffix());
      address.setPostDirectional(getPostDirectional());
      address.setCity(getCity());
      address.setStateCode(getState());
      address.setZip(getZip());
      address.setZip4(getZipPlusFour());
      address.setCountry(getCountry());
      address.setAddressLine2(getLocation());
      return address;
   }

   private void setHousePrefixAndNumber(Address address)
   {
      if (isNotBlank(getHouseNum()))
      {
         String whiteSpaces = "\\s+";
         String[] split = getHouseNum().split(whiteSpaces);

         String housePrefix = split.length > 1 ? split[0] : null;
         String houseNumber = split.length > 1 ? split[1] : split[0];

         address.setHousePrefix(housePrefix);
         address.setHouseNumber(houseNumber);
      }
   }
}
