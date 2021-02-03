package com.inetwork.web.data.shared.dto.disconnect;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;
import com.google.gwt.core.client.GWT;
import java.util.List;

public class DisconnectTelephoneNumberOrderType
{

   public interface Reader extends XmlReader<DisconnectTelephoneNumberOrderType>
   {
   }

   public interface Writer extends XmlWriter<DisconnectTelephoneNumberOrderType>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   public DisconnectTelephoneNumberOrderType()
   {

   }

   public DisconnectTelephoneNumberOrderType(List<String> telephoneNumbers)
   {
      this.telephoneNumbers = telephoneNumbers;
   }

   @Path("TelephoneNumberList/TelephoneNumber")
   private List<String> telephoneNumbers;

   @Path("DisconnectMode")
   private String disconnectMode;

   @Path("Protected")
   String protectedAttribute;

   public List<String> getTelephoneNumbers()
   {
      return telephoneNumbers;
   }

   public void setTelephoneNumbers(List<String> telephoneNumbers)
   {
      this.telephoneNumbers = telephoneNumbers;
   }

   public String getDisconnectMode()
   {
      return disconnectMode;
   }

   public DisconnectMode getDisconnectModeEnum()
   {
      return DisconnectMode.fromValue(getDisconnectMode());
   }

   public void setDisconnectMode(String disconnectMode)
   {
      this.disconnectMode = disconnectMode;
   }

   public void setDisconnectMode(DisconnectMode disconnectMode)
   {
      this.disconnectMode = disconnectMode.getSearchValue();
   }

   public String getProtectedAttribute()
   {
      return protectedAttribute;
   }

   public void setProtectedAttribute(String protectedAttribute)
   {
      this.protectedAttribute = protectedAttribute;
   }
}
