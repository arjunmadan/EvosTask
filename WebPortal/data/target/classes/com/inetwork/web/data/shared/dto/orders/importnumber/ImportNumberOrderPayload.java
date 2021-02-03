package com.inetwork.web.data.shared.dto.orders.importnumber;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.BaseOrder;
import com.inetwork.web.data.shared.dto.TelephoneNumberGroupError;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class ImportNumberOrderPayload extends BaseOrder
{
   public static final String XML_ROOT_ELEMENT = "ImportTnOrder";

   public interface Reader extends XmlReader<ImportNumberOrderPayload>
   {
   }

   public interface Writer extends XmlWriter<ImportNumberOrderPayload>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TelephoneNumbers/TelephoneNumber")
   private List<String> telephoneNumbers;
   @Path("SipPeerId")
   private Integer sipPeerId;
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

}
