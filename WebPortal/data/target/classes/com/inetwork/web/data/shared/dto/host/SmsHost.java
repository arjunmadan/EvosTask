package com.inetwork.web.data.shared.dto.host;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.orders.orderdetail.SipConnectionType;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import java.util.Objects;

public class SmsHost extends PrioritizedHost
{
   public interface Reader extends XmlReader<SmsHost>
   {
   }

   public interface Writer extends XmlWriter<SmsHost>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("ConnectionType")
   private SipConnectionType connectionType;

   public SipConnectionType getConnectionType()
   {
      return connectionType;
   }

   public void setConnectionType(SipConnectionType connectionType)
   {
      this.connectionType = connectionType;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (!(o instanceof SmsHost))
         return false;
      SmsHost smsHost = (SmsHost) o;
      return Objects.equals(getPriority(), smsHost.getPriority()) &&
              Objects.equals(getHostId(), smsHost.getHostId()) &&
              Objects.equals(getHostName(), smsHost.getHostName()) &&
              Objects.equals(getPort(), smsHost.getPort()) &&
              Objects.equals(getConnectionType(), smsHost.getConnectionType());
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(getHostId(), getPriority(), getConnectionType(), getHostName(), getPort());
   }

   @Override
   public String toString()
   {
      return "SmsHost{" +
              "connectionType=" + connectionType +
              "} " + super.toString();
   }
}
