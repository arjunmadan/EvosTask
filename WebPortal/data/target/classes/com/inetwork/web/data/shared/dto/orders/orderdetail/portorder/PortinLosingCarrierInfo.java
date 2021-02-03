package com.inetwork.web.data.shared.dto.orders.orderdetail.portorder;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.gwt.core.client.GWT;

public class PortinLosingCarrierInfo
{
   public interface Reader extends XmlReader<PortinLosingCarrierInfo>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);

   @Path("Spid")
   private String spid;
   @Path("Name")
   private String name;
   @Path("Wireless")
   private boolean wireless;
   @Path("AccountNumberRequired")
   private boolean accountNumberRequired;
   @Path("MinimumPortingInterval")
   private int minPortingInterval;
   @Path("NextAvailableFocDate")
   private String nextAvailableFocDate;

   public String getSpid()
   {
      return spid;
   }

   public void setSpid(String spid)
   {
      this.spid = spid;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public boolean isWireless()
   {
      return wireless;
   }

   public void setWireless(boolean wireless)
   {
      this.wireless = wireless;
   }

   public boolean isAccountNumberRequired()
   {
      return accountNumberRequired;
   }

   public void setAccountNumberRequired(boolean accountNumberRequired)
   {
      this.accountNumberRequired = accountNumberRequired;
   }

   public int getMinPortingInterval()
   {
      return minPortingInterval;
   }

   public void setMinPortingInterval(int minPortingInterval)
   {
      this.minPortingInterval = minPortingInterval;
   }

   public String getNextAvailableFocDate()
   {
      return nextAvailableFocDate;
   }

   public void setNextAvailableFocDate(String nextAvailableFocDate)
   {
      this.nextAvailableFocDate = nextAvailableFocDate;
   }
}
