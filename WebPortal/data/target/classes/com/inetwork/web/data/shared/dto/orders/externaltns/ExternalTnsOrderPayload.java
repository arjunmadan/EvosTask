package com.inetwork.web.data.shared.dto.orders.externaltns;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.BaseOrder;
import com.inetwork.web.data.shared.dto.TelephoneNumberGroupError;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class ExternalTnsOrderPayload extends BaseOrder
{
   public static final String XML_ROOT_ELEMENT = "ExternalTnsOrder";

   public interface Reader extends XmlReader<ExternalTnsOrderPayload>
   {
   }

   public interface Writer extends XmlWriter<ExternalTnsOrderPayload>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TelephoneNumbers/TelephoneNumber")
   private List<String> telephoneNumbers;
   @Path("Action")
   private String action;
   @Path("SipPeerId")
   private Integer sipPeerId;
   @Path("LoaType")
   private String loaType;
   @Path("Errors/Error")
   private List<TelephoneNumberGroupError> errors;

   public List<String> getTelephoneNumbers()
   {
      return telephoneNumbers;
   }

   public void setTelephoneNumbers(List<String> telephoneNumbers)
   {
      this.telephoneNumbers = telephoneNumbers;
   }

   public String getAction()
   {
      return action;
   }

   public void setAction(String action)
   {
      this.action = action;
   }

   public Integer getSipPeerId()
   {
      return sipPeerId;
   }

   public void setSipPeerId(Integer sipPeerId)
   {
      this.sipPeerId = sipPeerId;
   }

   public List<TelephoneNumberGroupError> getErrors()
   {
      return errors;
   }

   public void setErrors(List<TelephoneNumberGroupError> errors)
   {
      this.errors = errors;
   }

   public String getLoaType()
   {
      return loaType;
   }

   public void setLoaType(String loaType)
   {
      this.loaType = loaType;
   }
}
