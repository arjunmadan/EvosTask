package com.inetwork.web.data.dto.manageorders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "FilterOrderResults")
@XmlType(name = "FilterOrderResults")
@XmlAccessorType(XmlAccessType.FIELD)
public class FilterOrderResults
{
   @XmlElement(name = "AccountId")
   private int accountId;

   @XmlElement(name = "PrimeContact")
   private String primeContact;

   @XmlElement(name = "OrderType")
   private int orderType;

   @XmlElement(name = "OrderStatus")
   private int orderStatus;

   @XmlElement(name = "OrderNumber")
   private String orderNumber;

   @XmlElement(name = "ActivityStatus")
   private int activityStatus;

   @XmlElement(name = "FirstDate")
   private String firstDate;

   @XmlElement(name = "LastDate")
   private String lastDate;

   @XmlElement(name = "ShowMore")
   private int showMore;

   public int getShowMore()
   {
      return showMore;
   }

   public void setShowMore(int showMore)
   {
      this.showMore = showMore;
   }

   public int getAccountId()
   {
      return accountId;
   }

   public void setAccountId(int accountId)
   {
      this.accountId = accountId;
   }

   public String getPrimeContact()
   {
      return primeContact;
   }

   public void setPrimeContact(String primeContact)
   {
      this.primeContact = primeContact;
   }

   public int getOrderType()
   {
      return orderType;
   }

   public void setOrderType(int orderType)
   {
      this.orderType = orderType;
   }

   public int getOrderStatus()
   {
      return orderStatus;
   }

   public void setOrderStatus(int orderStatus)
   {
      this.orderStatus = orderStatus;
   }

   public String getOrderNumber()
   {
      return orderNumber;
   }

   public void setOrderNumber(String orderNumber)
   {
      this.orderNumber = orderNumber;
   }

   public int getActivityStatus()
   {
      return activityStatus;
   }

   public void setActivityStatus(int activityStatus)
   {
      this.activityStatus = activityStatus;
   }

   public String getFirstDate()
   {
      return firstDate;
   }

   public void setFirstDate(String firstDate)
   {
      this.firstDate = firstDate;
   }

   public String getLastDate()
   {
      return lastDate;
   }

   public void setLastDate(String lastDate)
   {
      this.lastDate = lastDate;
   }

   @Override
   public String toString()
   {
      return "FilterOrderResults{" + "accountId=" + accountId + ", primeContact='" + primeContact + '\'' + ", orderType=" + orderType
            + ", orderStatus=" + orderStatus + ", orderNumber='" + orderNumber + '\'' + ", activityStatus=" + activityStatus + ", firstDate='"
            + firstDate + '\'' + ", lastDate='" + lastDate + '\'' + '}';
   }
}
