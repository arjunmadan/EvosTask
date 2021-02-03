package com.inetwork.web.data.dto.lnp;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.inetwork.common.dto.IrisStatus;
import com.inetwork.common.dto.lnp.LnpError;
import com.inetwork.common.dto.lnp.PhoneNumberList;
import com.inetwork.common.dto.lnp.PortOutStatus;
import com.inetwork.common.dto.lnp.ProcessingStatus;
import com.inetwork.common.dto.lnp.Subscriber;
import com.inetwork.common.dto.lnp.WirelessInfo;
import com.inetwork.common.messaging.IrisResponse;

@XmlRootElement(name = "LnpOrderResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder =
{
      "orderId", "status", "errors", "processingStatus", "externalId", "alternateSpid", "requestedFocDate", "actualFocDate", "loaAuthorizingPerson",
      "subscriber", "wirelessInfo", "billingTelephoneNumber", "numbersToPort", "vendorOrder", "siteId", "losingCarrierName", "orderCreateDate",
      "lastModifiedDate", "peerId", "userId", "portOutStatus", "customerOrderId", "partialPort", "immediately"
})
public class LnpOrderResponse implements Serializable, IrisResponse
{
   @XmlElement(name = "OrderId")
   private String orderId;
   @XmlElement(name = "ProcessingStatus")
   private ProcessingStatus processingStatus;
   @XmlElement(name = "ExternalId")
   private String externalId;
   @XmlElement(name = "RequestedFocDate")
   private String requestedFocDate;
   @XmlElement(name = "ActualFocDate")
   private String actualFocDate;
   @XmlElement(name = "AlternateSpid")
   private String alternateSpid;
   @XmlElement(required = true, name = "BillingTelephoneNumber")
   private String billingTelephoneNumber;
   @XmlElement(required = true, name = "Subscriber")
   private Subscriber subscriber;
   @XmlElement(required = true, name = "LoaAuthorizingPerson")
   private String loaAuthorizingPerson;
   @XmlElement(required = true, name = "WirelessInfo")
   private WirelessInfo wirelessInfo;
   @XmlElement(required = true, name = "ListOfPhoneNumbers")
   private PhoneNumberList numbersToPort;
   @XmlElement(name = "PON")
   private String vendorOrder;
   @XmlElement(name = "SiteId")
   private Integer siteId;
   @XmlElement(name = "Errors")
   private List<LnpError> errors;
   @XmlElement(name = "LosingCarrierName")
   private String losingCarrierName;
   @XmlElement(name = "OrderCreateDate")
   private String orderCreateDate;
   @XmlElement(name = "LastModifiedDate")
   private String lastModifiedDate;
   @XmlElement(name = "PeerId")
   private Integer peerId;
   @XmlElement(name = "userId")
   private String userId;
   @XmlElement(name = "Status")
   private IrisStatus status;
   @XmlElement(name = "CustomerOrderId")
   private String customerOrderId;
   @XmlElement(name = "PartialPort")
   private String partialPort;
   @XmlElement(name = "Immediately")
   private Boolean immediately;
   @XmlElement(name = "PortOutStatus")
   private PortOutStatus portOutStatus;

   private static final long serialVersionUID = -7604996069190736203L;

   public String getOrderId()
   {
      return orderId;
   }

   public void setOrderId(final String orderId)
   {
      this.orderId = orderId;
   }

   public String getCustomerOrderId()
   {
      return customerOrderId;
   }

   public void setCustomerOrderId(String customerOrderId)
   {
      this.customerOrderId = customerOrderId;
   }

   public ProcessingStatus getProcessingStatus()
   {
      return processingStatus;
   }

   public void setProcessingStatus(final ProcessingStatus processingStatusIn)
   {
      processingStatus = processingStatusIn;
   }

   public String getExternalId()
   {
      return externalId;
   }

   public void setExternalId(final String externalId)
   {
      this.externalId = externalId;
   }

   public String getRequestedFocDate()
   {
      return requestedFocDate;
   }

   public void setRequestedFocDate(final String requestedFocDate)
   {
      this.requestedFocDate = requestedFocDate;
   }

   public String getActualFocDate()
   {
      return actualFocDate;
   }

   public void setActualFocDate(final String actualFocDate)
   {
      this.actualFocDate = actualFocDate;
   }

   public String getAlternateSpid()
   {
      return alternateSpid;
   }

   public void setAlternateSpid(final String alternateSpid)
   {
      this.alternateSpid = alternateSpid;
   }

   public String getBillingTelephoneNumber()
   {
      return billingTelephoneNumber;
   }

   public void setBillingTelephoneNumber(final String billingTelephoneNumber)
   {
      this.billingTelephoneNumber = billingTelephoneNumber;
   }

   public Subscriber getSubscriber()
   {
      return subscriber;
   }

   public void setSubscriber(final Subscriber subscriber)
   {
      this.subscriber = subscriber;
   }

   public String getLoaAuthorizingPerson()
   {
      return loaAuthorizingPerson;
   }

   public void setLoaAuthorizingPerson(final String loaAuthorizingPerson)
   {
      this.loaAuthorizingPerson = loaAuthorizingPerson;
   }

   public WirelessInfo getWirelessInfo()
   {
      return wirelessInfo;
   }

   public void setWirelessInfo(final WirelessInfo wirelessInfo)
   {
      this.wirelessInfo = wirelessInfo;
   }

   public PhoneNumberList getNumbersToPort()
   {
      return numbersToPort;
   }

   public void setNumbersToPort(final PhoneNumberList numbersToPort)
   {
      this.numbersToPort = numbersToPort;
   }

   public String getVendorOrder()
   {
      return vendorOrder;
   }

   public void setVendorOrder(String vendorOrder)
   {
      this.vendorOrder = vendorOrder;
   }

   public Integer getSiteId()
   {
      return siteId;
   }

   public void setSiteId(Integer siteId)
   {
      this.siteId = siteId;
   }

   public List<LnpError> getErrors()
   {
      return errors;
   }

   public void setErrors(final List<LnpError> errors)
   {
      this.errors = errors;
   }

   @Override
   public IrisStatus getStatus()
   {
      return status;
   }

   @Override
   public void setStatus(final IrisStatus status)
   {
      this.status = status;
   }

   public String getLosingCarrierName()
   {
      return losingCarrierName;
   }

   public void setLosingCarrierName(String losingCarrierName)
   {
      this.losingCarrierName = losingCarrierName;
   }

   public String getOrderCreateDate()
   {
      return orderCreateDate;
   }

   public void setOrderCreateDate(String orderCreateDate)
   {
      this.orderCreateDate = orderCreateDate;
   }

   public String getLastModifiedDate()
   {
      return lastModifiedDate;
   }

   public void setLastModifiedDate(String lastModifiedDate)
   {
      this.lastModifiedDate = lastModifiedDate;
   }

   public Integer getPeerId()
   {
      return peerId;
   }

   public void setPeerId(Integer peerId)
   {
      this.peerId = peerId;
   }

   public String getUserId()
   {
      return userId;
   }

   public void setUserId(String userId)
   {
      this.userId = userId;
   }

   public PortOutStatus getPortOutStatus()
   {
      return portOutStatus;
   }

   public void setPortOutStatus(PortOutStatus portOutStatus)
   {
      this.portOutStatus = portOutStatus;
   }

   public String getPartialPort()
   {
      return partialPort;
   }

   public void setPartialPort(String partialPort)
   {
      this.partialPort = partialPort;
   }

   public Boolean getImmediately()
   {
      return immediately;
   }

   public void setImmediately(Boolean immediately)
   {
      this.immediately = immediately;
   }

   @Override
   public String toString()
   {
      return "LnpOrderResponse{" + "orderId='" + orderId + '\'' + ", processingStatus=" + processingStatus + ", externalId='" + externalId + '\''
            + ", requestedFocDate=" + requestedFocDate + ", actualFocDate=" + actualFocDate + ", alternateSpid='" + alternateSpid + '\''
            + ", billingTelephoneNumber='" + billingTelephoneNumber + '\'' + ", subscriber=" + subscriber + ", loaAuthorizingPerson='"
            + loaAuthorizingPerson + '\'' + ", wirelessInfo=" + wirelessInfo + ", numbersToPort=" + numbersToPort + ", vendorOrder=" + vendorOrder
            + ", siteId=" + siteId + ", errors=" + errors + ", status=" + status + ", partialPort=" + partialPort + ", immediately=" + immediately
            + '}';
   }

}
