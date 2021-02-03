package com.inetwork.web.data.shared.dto.orders.orderdetail;

import com.google.gwt.core.client.GWT;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class TelephoneNumberMessagingSettings
{
   public interface Reader extends XmlReader<TelephoneNumberMessagingSettings>
   {
   }

   public interface Writer extends XmlWriter<TelephoneNumberMessagingSettings>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("SmsEnabled")
   private String smsEnabled;
   @Path("CampaignId")
   private String a2pCampaignId;
   @Path("MessageClass")
   private String a2pMessageClass;
   @Path("A2pState")
   private String a2pState;
   @Path("AssignedNnRoute")
   private TnDetailsNnRoute assignedNNRoute;

   public String getSmsEnabled()
   {
      return smsEnabled;
   }

   public void setSmsEnabled(String smsEnabled)
   {
      this.smsEnabled = smsEnabled;
   }

   public String getA2pCampaignId()
   {
      return a2pCampaignId;
   }

   public void setA2pCampaignId(String a2pCampaignId)
   {
      this.a2pCampaignId = a2pCampaignId;
   }

   public String getA2pMessageClass()
   {
      return a2pMessageClass;
   }

   public void setA2pMessageClass(String a2pMessageClass)
   {
      this.a2pMessageClass = a2pMessageClass;
   }

   public String getA2pState()
   {
      return a2pState;
   }

   public void setA2pState(String a2pState)
   {
      this.a2pState = a2pState;
   }

   public TnDetailsNnRoute getAssignedNNRoute()
   {
      return assignedNNRoute;
   }

   public void setAssignedNNRoute(TnDetailsNnRoute assignedNNRoute)
   {
      this.assignedNNRoute = assignedNNRoute;
   }
}
