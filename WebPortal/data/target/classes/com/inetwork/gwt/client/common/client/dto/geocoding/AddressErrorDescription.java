package com.inetwork.gwt.client.common.client.dto.geocoding;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class AddressErrorDescription
{
   public interface AddressErrorDescriptionReader extends XmlReader<AddressErrorDescription>
   {
   }

   public interface AddressErrorDescriptionWriter extends XmlWriter<AddressErrorDescription>
   {
   }

   public static final AddressErrorDescriptionReader READER = GWT.create(AddressErrorDescriptionReader.class);
   public static final AddressErrorDescriptionWriter WRITER = GWT.create(AddressErrorDescriptionWriter.class);

   @Path("AddressInconsistencies")
   private String addressInconsistencies;
   @Path("RecommendedAddress")
   private E911GeocodeAddress recommendedAddress;

   public AddressErrorDescription()
   {
   }

   public String getAddressInconsistencies()
   {
      return addressInconsistencies;
   }

   public void setAddressInconsistencies(String addressInconsistencies)
   {
      this.addressInconsistencies = addressInconsistencies;
   }

   public E911GeocodeAddress getRecommendedAddress()
   {
      return recommendedAddress;
   }

   public void setRecommendedAddress(E911GeocodeAddress recommendedAddress)
   {
      this.recommendedAddress = recommendedAddress;
   }
}
