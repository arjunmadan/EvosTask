package com.inetwork.web.data.shared.dto.lnp.portability;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.gwt.core.client.GWT;

public class LosingCarrierGroup
{
   public interface Reader extends XmlReader<LosingCarrierGroup>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   private static final String UNKNOWN_LOSING_CARRIER_SPID = "unknown";
   @Path("LosingCarrierSPID")
   private String losingCarrierSpid;
   @Path("LosingCarrierName")
   private String losingCarrierName;
   @Path("LosingCarrierIsWireless")
   private Boolean losingCarrierIsWireless;
   @Path("LosingCarrierAccountNumberRequired")
   private Boolean losingCarrierAccountNumberRequired;
   @Path("LosingCarrierMinimumPortingInterval")
   private Integer losingCarrierMinimumPortingInterval;
   @Path("TnList/Tn")
   private List<String> telephoneNumbers;

   public String getLosingCarrierSpid()
   {
      return losingCarrierSpid;
   }

   public void setLosingCarrierSpid(String losingCarrierSpid)
   {
      this.losingCarrierSpid = losingCarrierSpid;
   }

   public String getLosingCarrierName()
   {
      return losingCarrierName;
   }

   public void setLosingCarrierName(String losingCarrierName)
   {
      this.losingCarrierName = losingCarrierName;
   }

   public List<String> getTelephoneNumbers()
   {
      return telephoneNumbers;
   }

   public void setTelephoneNumbers(List<String> telephoneNumbers)
   {
      this.telephoneNumbers = telephoneNumbers;
   }

   public Boolean getLosingCarrierIsWireless()
   {
      return losingCarrierIsWireless;
   }

   public void setLosingCarrierIsWireless(Boolean losingCarrierIsWireless)
   {
      this.losingCarrierIsWireless = losingCarrierIsWireless;
   }

   public Boolean getLosingCarrierAccountNumberRequired()
   {
      return losingCarrierAccountNumberRequired;
   }

   public void setLosingCarrierAccountNumberRequired(Boolean losingCarrierAccountNumberRequired)
   {
      this.losingCarrierAccountNumberRequired = losingCarrierAccountNumberRequired;
   }

   public Integer getLosingCarrierMinimumPortingInterval()
   {
      return losingCarrierMinimumPortingInterval;
   }

   public void setLosingCarrierMinimumPortingInterval(Integer losingCarrierMinimumPortingInterval)
   {
      this.losingCarrierMinimumPortingInterval = losingCarrierMinimumPortingInterval;
   }

   public boolean isUnknownLosingCarrier()
   {
      return UNKNOWN_LOSING_CARRIER_SPID.equals(getLosingCarrierSpid());
   }
}
