package com.inetwork.web.data.shared.dto.orders.orderdetail;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.orders.orderdetail.portorder.Subscriber;
import com.inetwork.web.data.shared.dto.orders.orderdetail.portorder.WirelessInfo;

public class GWTLnpOrderSupp
{
   public interface Writer extends XmlWriter<GWTLnpOrderSupp>
   {
   }

   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("ProcessingStatus")
   private String processingStatus;
   @Path("ActualFocDate")
   private String actualFocDate;
   @Path("CustomerOrderId")
   private String customerOrderId;
   @Path("RequestedFocDate")
   private String requestedFocDate;
   @Path("BillingTelephoneNumber")
   private String billingTelephoneNumber;
   @Path("NewBillingTelephoneNumber")
   private String newBillingTelephoneNumber;
   @Path("WirelessInfo")
   private WirelessInfo wirelessInfo;
   @Path("Subscriber")
   private Subscriber subscriber;
   @Path("SiteId")
   private Integer siteId;
   @Path("PeerId")
   private String peerId;
   @Path("PartialPort")
   private String partialPort;
   @Path("LoaAuthorizingPerson")
   private String loaAuthorizingPerson;
   @Path("Immediately")
   private Boolean immediately;
   @Path("Triggered")
   private Boolean triggered;
   @Path("AutoActivation")
   private String autoActivationType;
   @Path("ActivateTelephoneNumbers")
   private Boolean activateTelephoneNumbers;
   @Path("TnAttributes/TnAttribute")
   private List<String> tnAttributes;
   @Path("OverrideValidation")
   private Boolean overrideValidation;

   public String getProcessingStatus()
   {
      return processingStatus;
   }

   public void setProcessingStatus(String processingStatus)
   {
      this.processingStatus = processingStatus;
   }

   public String getActualFocDate()
   {
      return actualFocDate;
   }

   public void setActualFocDate(String actualFocDate)
   {
      this.actualFocDate = actualFocDate;
   }

   public String getCustomerOrderId()
   {
      return customerOrderId;
   }

   public void setCustomerOrderId(String customerOrderId)
   {
      this.customerOrderId = customerOrderId;
   }

   public String getRequestedFocDate()
   {
      return requestedFocDate;
   }

   public void setRequestedFocDate(String requestedFocDate)
   {
      this.requestedFocDate = requestedFocDate;
   }

   public String getBillingTelephoneNumber()
   {
      return billingTelephoneNumber;
   }

   public void setBillingTelephoneNumber(String billingTelephoneNumber)
   {
      this.billingTelephoneNumber = billingTelephoneNumber;
   }

   public String getNewBillingTelephoneNumber()
   {
      return newBillingTelephoneNumber;
   }

   public void setNewBillingTelephoneNumber(String newBillingTelephoneNumber)
   {
      this.newBillingTelephoneNumber = newBillingTelephoneNumber;
   }

   public WirelessInfo getWirelessInfo()
   {
      return wirelessInfo;
   }

   public void setWirelessInfo(WirelessInfo wirelessInfo)
   {
      this.wirelessInfo = wirelessInfo;
   }

   public Subscriber getSubscriber()
   {
      return subscriber;
   }

   public void setSubscriber(Subscriber subscriber)
   {
      this.subscriber = subscriber;
   }

   public Integer getSiteId()
   {
      return siteId;
   }

   public void setSiteId(Integer siteId)
   {
      this.siteId = siteId;
   }

   public String getPeerId()
   {
      return peerId;
   }

   public void setPeerId(String peerId)
   {
      this.peerId = peerId;
   }

   public String getPartialPort()
   {
      return partialPort;
   }

   public void setPartialPort(String partialPort)
   {
      this.partialPort = partialPort;
   }

   public String getLoaAuthorizingPerson()
   {
      return loaAuthorizingPerson;
   }

   public void setLoaAuthorizingPerson(String loaAuthorizingPerson)
   {
      this.loaAuthorizingPerson = loaAuthorizingPerson;
   }

   public Boolean getImmediately()
   {
      return immediately;
   }

   public void setImmediately(Boolean immediately)
   {
      this.immediately = immediately;
   }

   public Boolean getTriggered()
   {
      return triggered;
   }

   public void setTriggered(Boolean triggered)
   {
      this.triggered = triggered;
   }

   public String getAutoActivationType()
   {
      return autoActivationType;
   }

   public void setAutoActivationType(String autoActivationType)
   {
      this.autoActivationType = autoActivationType;
   }

   public Boolean getActivateTelephoneNumbers()
   {
      return activateTelephoneNumbers;
   }

   public void setActivateTelephoneNumbers(Boolean activateTelephoneNumbers)
   {
      this.activateTelephoneNumbers = activateTelephoneNumbers;
   }

   public List<String> getTnAttributes()
   {
      return tnAttributes;
   }

   public void setTnAttributes(List<String> tnAttributes)
   {
      this.tnAttributes = tnAttributes;
   }

   public Boolean getOverrideValidation()
   {
      return overrideValidation;
   }

   public void setOverrideValidation(Boolean overrideValidation)
   {
      this.overrideValidation = overrideValidation;
   }
}
