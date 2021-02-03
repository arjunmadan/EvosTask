package com.inetwork.web.data.shared.dto.orders.orderdetail;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.ResponseStatus;

public class TelephoneNumberDetailsResponse
{
   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TelephoneNumberDetails")
   private TelephoneNumber telephoneNumberDetails;
   @Path("ResponseStatus")
   private ResponseStatus responseStatus;

   public TelephoneNumber getTelephoneNumberDetails()
   {
      return telephoneNumberDetails;
   }

   public void setTelephoneNumberDetails(TelephoneNumber telephoneNumberDetails)
   {
      this.telephoneNumberDetails = telephoneNumberDetails;
   }

   public ResponseStatus getResponseStatus()
   {
      return responseStatus;
   }

   public void setResponseStatus(ResponseStatus responseStatus)
   {
      this.responseStatus = responseStatus;
   }

   public interface Reader extends XmlReader<TelephoneNumberDetailsResponse>
   {
   }

   public interface Writer extends XmlWriter<TelephoneNumberDetailsResponse>
   {
   }
}
