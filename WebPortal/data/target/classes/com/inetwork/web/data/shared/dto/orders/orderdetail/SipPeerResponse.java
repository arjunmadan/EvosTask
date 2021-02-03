package com.inetwork.web.data.shared.dto.orders.orderdetail;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.gwt.core.client.GWT;
import com.inetwork.gwt.client.common.client.dto.geocoding.AddressErrorDescription;

public class SipPeerResponse
{
   public interface Reader extends XmlReader<SipPeerResponse>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);

   @Path("SipPeer")
   private SipPeer sipPeer;
   @Path("ResponseStatus/Description")
   private String error;
   @Path("AddressErrorDescription")
   private AddressErrorDescription addressErrorDescription;

   public String getError()
   {
      return error;
   }

   public void setError(String error)
   {
      this.error = error;
   }

   public SipPeer getSipPeer()
   {
      return sipPeer;
   }

   public void setSipPeer(SipPeer sipPeer)
   {
      this.sipPeer = sipPeer;
   }

   public AddressErrorDescription getAddressErrorDescription()
   {
      return addressErrorDescription;
   }

   public void setAddressErrorDescription(AddressErrorDescription addressErrorDescription)
   {
      this.addressErrorDescription = addressErrorDescription;
   }
}
