package com.inetwork.web.data.shared.dto.orders.orderdetail;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.PortInAutoActivationType;
import com.inetwork.web.data.shared.dto.lnp.LnpError;
import com.inetwork.web.data.shared.dto.lnp.PortType;
import com.inetwork.web.data.shared.dto.orders.TotalCounts;
import com.inetwork.web.data.shared.dto.orders.orderdetail.portorder.Subscriber;
import com.inetwork.web.data.shared.dto.orders.orderdetail.portorder.WirelessInfo;
import com.inetwork.web.data.shared.searchorders.OrderStatus;

public class LnpOrderResponse implements TotalCounts
{
   public interface Reader extends XmlReader<LnpOrderResponse>
   {
   }

   public interface Writer extends XmlWriter<LnpOrderResponse>
   {
   }

   public static final String ROOT_ELEMENT = "LnpOrder";

   public static final Writer WRITER = GWT.create(Writer.class);

   public static final Reader READER = GWT.create(Reader.class);

   @Path("AccountId")
   private Integer accountId;
   @Path("OrderId")
   private String orderId;
   @Path("Status")
   private Status status;
   @Path("ProcessingStatus")
   private OrderStatus processingStatus;
   @Path("ExternalId")
   private String externalId;
   @Path("AlternateSpid")
   private String alternateSpid;
   @Path("RequestedFocDate")
   private String requestedFocDate;
   @Path("ActualFocDate")
   private String actualFocDate;
   @Path("LoaAuthorizingPerson")
   private String loaAuthorizingPerson;
   @Path("Subscriber")
   private Subscriber subscriber;
   @Path("WirelessInfo")
   private WirelessInfo wirelessInfo;
   @Path("BillingTelephoneNumber")
   private String billingTelephoneNumber;
   @Path("NewBillingTelephoneNumber")
   private String newBillingTelephoneNumber;
   @Path("ListOfPhoneNumbers/PhoneNumber")
   private List<String> listOfPhoneNumbers;
   @Path("VendorName")
   private String vendorName;
   @Path("PON")
   private String vendorOrder;
   @Path("LosingCarrierName")
   private String losingCarrierName;
   @Path("LastModifiedDate")
   private String lastModifiedDate;
   @Path("OrderCreateDate")
   private String orderCreateDate;
   @Path("userId")
   private String userId;
   @Path("CustomerOrderId")
   private String customerOrderId;
   @Path("SiteId")
   private Integer siteId;
   @Path("PeerId")
   private Integer peerId;
   @Path("Errors")
   private List<LnpError> errors;
   @Path("SPID")
   private String nnspid;
   @Path("PortOutStatus")
   private OrderStatus orderStatus;
   @Path("PartialPort")
   private Boolean partialPort;
   @Path("PortType")
   private PortType portType;
   @Path("BillingType")
   private String billingType;
   @Path("Immediately")
   private Boolean immediately;
   @Path("Triggered")
   private Boolean triggered;
   @Path("AutoActivation")
   private String autoActivationType;
   @Path("TnAttributes/TnAttribute")
   private List<String> tnAttributes;
   @Path("OverrideValidation")
   private Boolean overrideValidation;

   @Override
   public int getTotalCount()
   {
      return 1;
   }

   public Integer getAccountId()
   {
      return accountId;
   }

   public void setAccountId(Integer accountId)
   {
      this.accountId = accountId;
   }

   public String getOrderId()
   {
      return orderId;
   }

   public void setOrderId(String orderId)
   {
      this.orderId = orderId;
   }

   public Status getStatus()
   {
      return status;
   }

   public void setStatus(Status status)
   {
      this.status = status;
   }

   public OrderStatus getProcessingStatus()
   {
      return processingStatus;
   }

   public void setProcessingStatus(OrderStatus processingStatus)
   {
      this.processingStatus = processingStatus;
   }

   public String getExternalId()
   {
      return externalId;
   }

   public void setExternalId(String externalId)
   {
      this.externalId = externalId;
   }

   public String getAlternateSpid()
   {
      return alternateSpid;
   }

   public void setAlternateSpid(String alternateSpid)
   {
      this.alternateSpid = alternateSpid;
   }

   public String getRequestedFocDate()
   {
      return requestedFocDate;
   }

   public void setRequestedFocDate(String requestedFocDate)
   {
      this.requestedFocDate = requestedFocDate;
   }

   public String getActualFocDate()
   {
      return actualFocDate;
   }

   public void setActualFocDate(String actualFocDate)
   {
      this.actualFocDate = actualFocDate;
   }

   public String getLoaAuthorizingPerson()
   {
      return loaAuthorizingPerson;
   }

   public void setLoaAuthorizingPerson(String loaAuthorizingPerson)
   {
      this.loaAuthorizingPerson = loaAuthorizingPerson;
   }

   public Subscriber getSubscriber()
   {
      return subscriber;
   }

   public void setSubscriber(Subscriber subscriber)
   {
      this.subscriber = subscriber;
   }

   public WirelessInfo getWirelessInfo()
   {
      return wirelessInfo;
   }

   public void setWirelessInfo(WirelessInfo wirelessInfo)
   {
      this.wirelessInfo = wirelessInfo;
   }

   public String getBillingTelephoneNumber()
   {
      return billingTelephoneNumber;
   }

   public void setBillingTelephoneNumber(String billingTelephoneNumber)
   {
      this.billingTelephoneNumber = billingTelephoneNumber;
   }

   public List<String> getListOfPhoneNumbers()
   {
      return listOfPhoneNumbers;
   }

   public void setListOfPhoneNumbers(List<String> listOfPhoneNumbers)
   {
      this.listOfPhoneNumbers = listOfPhoneNumbers;
   }

   public String getVendorName()
   {
      return vendorName;
   }

   public void setVendorName(String vendorName)
   {
      this.vendorName = vendorName;
   }

   public String getVendorOrder()
   {
      return vendorOrder;
   }

   public void setVendorOrder(String vendorOrder)
   {
      this.vendorOrder = vendorOrder;
   }

   public String getLosingCarrierName()
   {
      return losingCarrierName;
   }

   public void setLosingCarrierName(String losingCarrierName)
   {
      this.losingCarrierName = losingCarrierName;
   }

   public String getLastModifiedDate()
   {
      return lastModifiedDate;
   }

   public void setLastModifiedDate(String lastModifiedDate)
   {
      this.lastModifiedDate = lastModifiedDate;
   }

   public String getUserId()
   {
      return userId;
   }

   public void setUserId(String userId)
   {
      this.userId = userId;
   }

   public String getOrderCreateDate()
   {
      return orderCreateDate;
   }

   public void setOrderCreateDate(String orderCreateDate)
   {
      this.orderCreateDate = orderCreateDate;
   }

   public String getCustomerOrderId()
   {
      return customerOrderId;
   }

   public void setCustomerOrderId(String customerOrderId)
   {
      this.customerOrderId = customerOrderId;
   }

   public Integer getSiteId()
   {
      return siteId;
   }

   public void setSiteId(Integer siteId)
   {
      this.siteId = siteId;
   }

   public Integer getPeerId()
   {
      return peerId;
   }

   public void setPeerId(Integer peerId)
   {
      this.peerId = peerId;
   }

   public List<LnpError> getErrors()
   {
      return errors;
   }

   public void setErrors(List<LnpError> errors)
   {
      this.errors = errors;
   }

   public String getNnspid()
   {
      return nnspid;
   }

   public void setNnspid(String nnspid)
   {
      this.nnspid = nnspid;
   }

   public OrderStatus getOrderStatus()
   {
      return orderStatus;
   }

   public void setOrderStatus(OrderStatus orderStatus)
   {
      this.orderStatus = orderStatus;
   }

   public Boolean getPartialPort()
   {
      return partialPort;
   }

   public void setPartialPort(Boolean partialPort)
   {
      this.partialPort = partialPort;
   }

   public PortType getPortType()
   {
      return portType;
   }

   public void setPortType(PortType portType)
   {
      this.portType = portType;
   }

   public boolean isPortTypeAutomated()
   {
      return PortType.AUTOMATED.equals(portType);
   }

   public boolean isPortTypeInternal()
   {
      return PortType.INTERNAL.equals(portType);
   }

   public String getBillingType()
   {
      return billingType;
   }

   public void setBillingType(String billingType)
   {
      this.billingType = billingType;
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

   public PortInAutoActivationType getAutoActivationTypeEnum()
   {
      return PortInAutoActivationType.fromString(autoActivationType);
   }

   public void setAutoActivationType(String autoActivationType)
   {
      this.autoActivationType = autoActivationType;
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

   public boolean isManualPort()
   {
      return portType == PortType.MANUAL_ON_NET || portType == PortType.MANUALOFFNET || portType == PortType.MANUAL_TOLLFREE;
   }

   public String getNewBillingTelephoneNumber()
   {
      return newBillingTelephoneNumber;
   }

   public void setNewBillingTelephoneNumber(String newBillingTelephoneNumber)
   {
      this.newBillingTelephoneNumber = newBillingTelephoneNumber;
   }

   @Override
   public String toString()
   {
      return "LnpOrderResponse [orderId=" + orderId + ", status=" + status + ", processingStatus=" + processingStatus + ", alternateSpid="
            + alternateSpid + ", requestedFocDate=" + requestedFocDate + ", actualFocDate=" + actualFocDate + ", loaAuthorizingPerson="
            + loaAuthorizingPerson + ", subscriber=" + subscriber + ", wirelessInfo=" + wirelessInfo + ", billingTelephoneNumber="
            + billingTelephoneNumber + ", newBillingTelephoneNumber=" + newBillingTelephoneNumber + ", listOfPhoneNumbers=" + listOfPhoneNumbers
            + ", vendorOrder=" + vendorOrder + ", vendorName=" + vendorName + ", losingCarrierName=" + losingCarrierName + ", lastModifiedDate="
            + lastModifiedDate + ", orderCreateDate=" + orderCreateDate + ", userId=" + userId + ", customerOrderId=" + customerOrderId + ", siteId="
            + siteId + ", peerId=" + peerId + ", errors=" + errors + ", partialPort=" + partialPort + ", portType = "
            + portType.getHumanReadableValue() + ", billingType = " + billingType + ", immediately= " + immediately + ", triggered=" + triggered
            + ", autoActivationType=" + autoActivationType + ", tnAttributes=" + tnAttributes + ", overrideValidation=" + overrideValidation + "]";
   }
}
