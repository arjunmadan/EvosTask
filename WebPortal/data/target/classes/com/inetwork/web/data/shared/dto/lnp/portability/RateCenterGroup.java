package com.inetwork.web.data.shared.dto.lnp.portability;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.gwt.core.client.GWT;

public class RateCenterGroup
{

   public interface Reader extends XmlReader<RateCenterGroup>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);

   @Path("Vendor")
   private String vendor;
   @Path("RateCenter")
   private String rateCenter;
   @Path("City")
   private String city;
   @Path("State")
   private String state;
   @Path("LATA")
   private Integer lata;
   @Path("Tiers/Tier")
   private List<Integer> tiers;
   @Path("TnList/Tn")
   private List<String> telephoneNumbers;

   public String getVendor()
   {
      return vendor;
   }

   public void setVendor(String vendor)
   {
      this.vendor = vendor;
   }

   public String getRateCenter()
   {
      return rateCenter;
   }

   public void setRateCenter(String rateCenter)
   {
      this.rateCenter = rateCenter;
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

   public Integer getLata()
   {
      return lata;
   }

   public void setLata(Integer lata)
   {
      this.lata = lata;
   }

   public List<Integer> getTiers()
   {
      return tiers;
   }

   public void setTiers(List<Integer> tiers)
   {
      this.tiers = tiers;
   }

   public List<String> getTelephoneNumbers()
   {
      return telephoneNumbers;
   }

   public void setTelephoneNumbers(List<String> telephoneNumbers)
   {
      this.telephoneNumbers = telephoneNumbers;
   }
}
