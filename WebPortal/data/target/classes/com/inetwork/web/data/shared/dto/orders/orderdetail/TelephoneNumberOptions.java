package com.inetwork.web.data.shared.dto.orders.orderdetail;

import com.google.gwt.core.client.GWT;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class TelephoneNumberOptions
{
   public interface Reader extends XmlReader<TelephoneNumberOptions>
   {
   }

   public interface Writer extends XmlWriter<TelephoneNumberOptions>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("NumberFormat")
   private String numberFormat;
   @Path("RPIDFormat")
   private String rpidFormat;
   @Path("RewriteUser")
   private String rewriteUser;
   @Path("CallForward")
   private String callForward;
   @Path("FinalDestinationURI")
   private String finalDestinationUri;
   @Path("CallingNameDisplay")
   private String cnamLookup;
   @Path("A2pSettings")
   private A2pSettings a2pSettings;
   @Path("ThirdPartyMessageRoute")
   private ThirdPartyMessageRoute thirdPartyMessageRoute;

   public String getNumberFormat()
   {
      return numberFormat;
   }

   public void setNumberFormat(String numberFormat)
   {
      this.numberFormat = numberFormat;
   }

   public String getRpidFormat()
   {
      return rpidFormat;
   }

   public void setRpidFormat(String rpidFormat)
   {
      this.rpidFormat = rpidFormat;
   }

   public String getRewriteUser()
   {
      return rewriteUser;
   }

   public void setRewriteUser(String rewriteUser)
   {
      this.rewriteUser = rewriteUser;
   }

   public String getCallForward()
   {
      return callForward;
   }

   public void setCallForward(String callForward)
   {
      this.callForward = callForward;
   }

   public String getFinalDestinationUri()
   {
      return finalDestinationUri;
   }

   public void setFinalDestinationUri(String finalDestinationUri)
   {
      this.finalDestinationUri = finalDestinationUri;
   }

   public String getCnamLookup()
   {
      return cnamLookup;
   }

   public void setCnamLookup(String cnamLookup)
   {
      this.cnamLookup = cnamLookup;
   }

   public A2pSettings getA2pSettings()
   {
      return a2pSettings;
   }

   public void setA2pSettings(A2pSettings a2pSettings)
   {
      this.a2pSettings = a2pSettings;
   }

   public ThirdPartyMessageRoute getThirdPartyMessageRoute()
   {
      return thirdPartyMessageRoute;
   }

   public void setThirdPartyMessageRoute(ThirdPartyMessageRoute thirdPartyMessageRoute)
   {
      this.thirdPartyMessageRoute = thirdPartyMessageRoute;
   }
}
