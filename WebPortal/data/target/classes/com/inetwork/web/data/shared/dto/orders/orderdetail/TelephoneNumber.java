package com.inetwork.web.data.shared.dto.orders.orderdetail;

import java.util.List;

import com.google.gwt.core.client.GWT;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class TelephoneNumber
{

   public interface Reader extends XmlReader<TelephoneNumber>
   {
   }

   public interface Writer extends XmlWriter<TelephoneNumber>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("FullNumber")
   private String telephoneNumber;
   @Path("RateCenter")
   private String rateCenterAbbreviation;
   @Path("LATA | Lata")
   private String lata;
   @Path("City")
   private String city;
   @Path("State")
   private String state;
   @Path("VendorName")
   private String vendorName;
   @Path("VendorId")
   private Integer vendorId;
   @Path("Tier")
   private Integer tier;
   @Path("Status")
   private String status;
   @Path("AccountId")
   private Integer accountId;
   @Path("LastModified")
   private String lastModified;
   @Path("Features")
   private Features features;
   @Path("TnAttributes/TnAttribute")
   private List<String> tnAttributes;
   @Path("TnOptions")
   private TelephoneNumberOptions telephoneNumberOptions;
   @Path("MessagingSettings")
   private TelephoneNumberMessagingSettings messagingSettings;

   public TelephoneNumber()
   {
   }

   public TelephoneNumber(String tn)
   {
      telephoneNumber = tn;
      rateCenterAbbreviation = "";
      lata = "";
      city = "";
      state = "";
   }

   public String getStatus()
   {
      return status;
   }

   public void setStatus(String status)
   {
      this.status = status;
   }

   public Integer getAccountId()
   {
      return accountId;
   }

   public void setAccountId(Integer accountId)
   {
      this.accountId = accountId;
   }

   public String getLastModified()
   {
      return lastModified;
   }

   public void setLastModified(String lastModified)
   {
      this.lastModified = lastModified;
   }

   public String getTelephoneNumber()
   {
      return telephoneNumber;
   }

   public void setTelephoneNumber(String telephoneNumber)
   {
      this.telephoneNumber = telephoneNumber;
   }

   public String getRateCenterAbbreviation()
   {
      return rateCenterAbbreviation;
   }

   public void setRateCenterAbbreviation(String rateCenterAbbreviation)
   {
      this.rateCenterAbbreviation = rateCenterAbbreviation;
   }

   public String getLata()
   {
      return lata;
   }

   public void setLata(String lata)
   {
      this.lata = lata;
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

   public String getVendorName()
   {
      return vendorName;
   }

   public void setVendorName(String vendorName)
   {
      this.vendorName = vendorName;
   }

   public Integer getVendorId()
   {
      return vendorId;
   }

   public void setVendorId(Integer vendorId)
   {
      this.vendorId = vendorId;
   }

   public Integer getTier()
   {
      return tier;
   }

   public void setTier(Integer tier)
   {
      this.tier = tier;
   }

   public Features getFeatures()
   {
      return features;
   }

   public void setFeatures(Features features)
   {
      this.features = features;
   }

   public List<String> getTnAttributes()
   {
      return tnAttributes;
   }

   public void setTnAttributes(List<String> tnAttributes)
   {
      this.tnAttributes = tnAttributes;
   }

   public TelephoneNumberOptions getTelephoneNumberOptions()
   {
      return telephoneNumberOptions;
   }

   public void setTelephoneNumberOptions(TelephoneNumberOptions telephoneNumberOptions)
   {
      this.telephoneNumberOptions = telephoneNumberOptions;
   }

   public TelephoneNumberMessagingSettings getMessagingSettings()
   {
      return messagingSettings;
   }

   public void setMessagingSettings(TelephoneNumberMessagingSettings messagingSettings)
   {
      this.messagingSettings = messagingSettings;
   }
}
