package com.inetwork.web.data.shared.dto.orders.orderdetail;

import com.inetwork.web.data.shared.dto.telephonenumberinfo.LastE911OrderOutcome;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.Address;

public class E911Feature extends Feature
{

   public interface Reader extends XmlReader<E911Feature>
   {
   }

   public interface Writer extends XmlWriter<E911Feature>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("SipPeerAddress")
   private Boolean sipPeerAddress;
   @Path("CallerName")
   private String callerName;
   @Path("Address")
   private Address address;
   @Path("LastE911OrderOutcome")
   private String lastE911OrderOutcome;

   public Boolean isSipPeerAddress()
   {
      return sipPeerAddress;
   }

   public void setSipPeerAddress(Boolean sipPeerAddress)
   {
      this.sipPeerAddress = sipPeerAddress;
   }

   public String getCallerName()
   {
      return callerName;
   }

   public void setCallerName(String callerName)
   {
      this.callerName = callerName;
   }

   public Address getAddress()
   {
      return address;
   }

   public void setAddress(Address address)
   {
      this.address = address;
   }

   public String getLastE911OrderOutcome()
   {
      return lastE911OrderOutcome;
   }

   public LastE911OrderOutcome getLastE911OrderOutcomeEnum()
   {
      return LastE911OrderOutcome.fromValue(lastE911OrderOutcome);
   }

   public void setLastE911OrderOutcome(String lastE911OrderOutcome)
   {
      this.lastE911OrderOutcome = lastE911OrderOutcome;
   }
}
