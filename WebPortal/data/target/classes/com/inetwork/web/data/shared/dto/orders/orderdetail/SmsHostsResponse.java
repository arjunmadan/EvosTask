package com.inetwork.web.data.shared.dto.orders.orderdetail;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.host.SmsHost;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import java.util.ArrayList;
import java.util.List;

public class SmsHostsResponse
{
   public interface Reader extends XmlReader<SmsHostsResponse>
   {
   }
   public static final Reader READER = GWT.create(Reader.class);

   @Path("SmsHosts/SmsHost")
   private List<SmsHost> smsHosts = new ArrayList<SmsHost>();

   public SmsHostsResponse()
   {
   }

   public List<SmsHost> getSmsHosts()
   {
      return smsHosts;
   }

   public void setSmsHosts(List<SmsHost> smsHosts)
   {
      this.smsHosts = smsHosts;
   }

   public static SmsHostsResponse fromXml(String xml)
   {
      return READER.read(xml);
   }

   @Override
   public String toString()
   {
      return "SmsHostsResponse{" +
              "smsHosts=" + smsHosts +
              '}';
   }
}
