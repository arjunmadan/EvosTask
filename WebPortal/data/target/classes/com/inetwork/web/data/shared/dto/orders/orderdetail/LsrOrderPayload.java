package com.inetwork.web.data.shared.dto.orders.orderdetail;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.orders.orderdetail.portorder.Subscriber;
import com.inetwork.web.data.shared.dto.lsr.LsrOrderError;
import com.inetwork.web.data.shared.searchorders.OrderStatus;

public class LsrOrderPayload
{
   public interface Reader extends XmlReader<LsrOrderPayload>
   {
   }

   public interface Writer extends XmlWriter<LsrOrderPayload>
   {
   }

   public static final Writer WRITER = GWT.create(Writer.class);

   public static final Reader READER = GWT.create(Reader.class);

   @Path("LsrOrderErrors")
   private List<LsrOrderError> errors;
   @Path("AuthorizingPerson")
   private String authorizingPerson;
   @Path("AccountId")
   private Integer accountId;
   @Path("OrderId")
   private String orderId;
   @Path("OrderStatus")
   private OrderStatus orderStatus;
   @Path("RequestedFocDate")
   private String requestedFocDate;
   @Path("ActualFocDate")
   private String actualFocDate;
   @Path("Subscriber")
   private Subscriber subscriber;
   @Path("BillingTelephoneNumber")
   private String billingTelephoneNumber;
   @Path("ListOfTelephoneNumbers/TelephoneNumber")
   private List<String> telephoneNumbers;
   @Path("Pon")
   private String pon;
   @Path("PonVersion")
   private String ponVersion;
   @Path("LastModifiedDate")
   private String lastModifiedDate;
   @Path("OrderCreateDate")
   private String orderCreateDate;
   @Path("CustomerOrderId")
   private String customerOrderId;
   @Path("PartialPort")
   private Boolean partialPort;
   @Path("CreatedByUser")
   private String createdByUser;
   @Path("SPID")
   private String spid;
   @Path("OverrideValidation")
   private Boolean overrideValidation;

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

   public Subscriber getSubscriber()
   {
      return subscriber;
   }

   public void setSubscriber(Subscriber subscriber)
   {
      this.subscriber = subscriber;
   }

   public String getBillingTelephoneNumber()
   {
      return billingTelephoneNumber;
   }

   public void setBillingTelephoneNumber(String billingTelephoneNumber)
   {
      this.billingTelephoneNumber = billingTelephoneNumber;
   }

   public List<String> getTelephoneNumbers()
   {
      return telephoneNumbers;
   }

   public void setTelephoneNumbers(List<String> telephoneNumbers)
   {
      this.telephoneNumbers = telephoneNumbers;
   }

   public String getPon()
   {
      return pon;
   }

   public void setPon(String pon)
   {
      this.pon = pon;
   }

   public String getPonVersion()
   {
      return ponVersion;
   }

   public void setPonVersion(String ponVersion)
   {
      this.ponVersion = ponVersion;
   }

   public String getLastModifiedDate()
   {
      return lastModifiedDate;
   }

   public void setLastModifiedDate(String lastModifiedDate)
   {
      this.lastModifiedDate = lastModifiedDate;
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

   public List<LsrOrderError> getErrors()
   {
      return errors;
   }

   public void setErrors(List<LsrOrderError> errors)
   {
      this.errors = errors;
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

   public String getCreatedByUser()
   {
      return createdByUser;
   }

   public void setCreatedByUser(String createdByUser)
   {
      this.createdByUser = createdByUser;
   }

   public String getSpid()
   {
      return spid;
   }

   public void setSpid(String spid)
   {
      this.spid = spid;
   }

   public String getAuthorizingPerson()
   {
      return authorizingPerson;
   }

   public void setAuthorizingPerson(String authorizingPerson)
   {
      this.authorizingPerson = authorizingPerson;
   }
   
   public Boolean getOverrideValidation()
   {
      return overrideValidation;
   }

   public void setOverrideValidation(Boolean OverrideValidation)
   {
      this.overrideValidation = OverrideValidation;
   }

   @Override
   public String toString()
   {
      return "LsrOrderPayload [orderId=" + orderId + ", orderStatus=" + orderStatus + ", requestedFocDate=" + requestedFocDate + ", actualFocDate="
            + actualFocDate + ", subscriber=" + subscriber + ", billingTelephoneNumber=" + billingTelephoneNumber + ", telephoneNumbers="
            + telephoneNumbers + ", pon=" + pon + ", ponVersion=" + ponVersion + ", lastModifiedDate=" + lastModifiedDate + ", orderCreateDate="
            + orderCreateDate + ", customerOrderId=" + customerOrderId + ", errors=" + errors + ", partialPort=" + partialPort + ", createdByUser="
            + createdByUser + ", spid=" + spid + ", authorizingPerson=" + authorizingPerson + ", overrideValidation=" + overrideValidation + "]";
   }
}
