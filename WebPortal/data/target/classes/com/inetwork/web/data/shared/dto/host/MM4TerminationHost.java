package com.inetwork.web.data.shared.dto.host;

import java.util.Objects;

import com.google.gwt.core.client.GWT;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class MM4TerminationHost extends AbstractHost
{
   public interface Reader extends XmlReader<MM4TerminationHost>
   {
   }

   public interface Writer extends XmlWriter<MM4TerminationHost>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("HostId")
   private Integer hostId;
   @Path("HostName")
   private String hostName;

   public Integer getHostId()
   {
      return hostId;
   }

   public void setHostId(Integer hostId)
   {
      this.hostId = hostId;
   }

   public String getHostName()
   {
      return hostName;
   }

   public void setHostName(String hostName)
   {
      this.hostName = hostName;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (!(o instanceof MM4TerminationHost))
         return false;
      MM4TerminationHost that = (MM4TerminationHost) o;
      return Objects.equals(getHostId(), that.getHostId()) &&
            Objects.equals(getHostName(), that.getHostName());
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(getHostId(), getHostName());
   }

   @Override
   public String toString()
   {
      return "MM4TerminationHost{" +
            "hostId=" + hostId +
            ", hostName='" + hostName + '\'' +
            '}';
   }
}
