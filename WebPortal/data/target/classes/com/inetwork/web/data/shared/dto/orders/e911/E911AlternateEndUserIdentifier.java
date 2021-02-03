package com.inetwork.web.data.shared.dto.orders.e911;

import java.io.Serializable;
import java.util.Objects;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.IsSerializable;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class E911AlternateEndUserIdentifier implements Serializable, IsSerializable
{
   public interface Writer extends XmlWriter<E911AlternateEndUserIdentifier>, Serializable
   {
   }

   public interface Reader extends XmlReader<E911AlternateEndUserIdentifier>, Serializable
   {
   }

   public static final Writer WRITER = GWT.create(Writer.class);
   public static final Reader READER = GWT.create(Reader.class);

   @Path("Identifier")
   private String identifier;
   @Path("CallbackNumber")
   private String callbackNumber;
   @Path("CallerName")
   private String callerName;
   @Path("LocationId")
   private String locationId;
   @Path("PreferredLanguage")
   private String language;
   @Path("PIDFLOEnabled")
   private Boolean pidfloEnabled;

   public String getIdentifier()
   {
      return identifier;
   }

   public void setIdentifier(String identifier)
   {
      this.identifier = identifier;
   }

   public String getCallbackNumber()
   {
      return callbackNumber;
   }

   public void setCallbackNumber(String callbackNumber)
   {
      this.callbackNumber = callbackNumber;
   }

   public String getCallerName()
   {
      return callerName;
   }

   public void setCallerName(String callerName)
   {
      this.callerName = callerName;
   }

   public String getLocationId()
   {
      return locationId;
   }

   public void setLocationId(String locationId)
   {
      this.locationId = locationId;
   }

   public String getLanguage()
   {
      return language;
   }

   public void setLanguage(String language)
   {
      this.language = language;
   }

   public Boolean getPidfloEnabled()
   {
      return pidfloEnabled;
   }

   public void setPidfloEnabled(Boolean pidfloEnabled)
   {
      this.pidfloEnabled = pidfloEnabled;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (!(o instanceof E911AlternateEndUserIdentifier))
         return false;
      E911AlternateEndUserIdentifier that = (E911AlternateEndUserIdentifier) o;
      return Objects.equals(getIdentifier(), that.getIdentifier()) && Objects.equals(getCallbackNumber(), that.getCallbackNumber())
            && Objects.equals(getCallerName(), that.getCallerName()) && Objects.equals(getLocationId(), that.getLocationId())
            && Objects.equals(getLanguage(), that.getLanguage()) && Objects.equals(getPidfloEnabled(), that.getPidfloEnabled());
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(getIdentifier(), getCallbackNumber(), getCallerName(), getLocationId(), getLanguage(), getPidfloEnabled());
   }
}
