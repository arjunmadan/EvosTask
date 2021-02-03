package com.inetwork.web.data.shared.dto.host;

import com.google.gwt.core.client.GWT;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import java.util.Objects;

public class Host extends AbstractHost
{
   public interface Reader extends XmlReader<Host>
   {
   }

   public interface Writer extends XmlWriter<Host>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);
   @Path("HostName")
   private String hostName = "";
   @Path("Port")
   private String port = "";

   public String getHostName()
   {
      return hostName;
   }

   public void setHostName(String hostName)
   {
      this.hostName = hostName;
   }

   public String getPort()
   {
      return port;
   }

   public void setPort(String port)
   {
      this.port = port;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (!(o instanceof Host))
         return false;
      Host host = (Host) o;
      return Objects.equals(getHostName(), host.getHostName()) &&
              Objects.equals(getPort(), host.getPort());
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(getHostName(), getPort());
   }

   @Override
   public String toString()
   {
      return "Host{" +
            "hostName='" + hostName + '\'' +
            ", port='" + port + '\'' +
            '}';
   }
}
