package com.inetwork.web.data.shared.dto.host;

import java.util.Objects;

import com.google.gwt.core.client.GWT;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class PrioritizedHost extends Host
{
   public interface Reader extends XmlReader<PrioritizedHost>
   {
   }

   public interface Writer extends XmlWriter<PrioritizedHost>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("HostId")
   private Integer hostId;
   @Path("Priority")
   private Integer priority;

   public Integer getHostId()
   {
      return hostId;
   }

   public void setHostId(Integer hostId)
   {
      this.hostId = hostId;
   }

   public Integer getPriority()
   {
      return priority;
   }

   public void setPriority(Integer priority)
   {
      this.priority = priority;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (!(o instanceof PrioritizedHost))
         return false;
      PrioritizedHost that = (PrioritizedHost) o;
      return Objects.equals(getHostId(), that.getHostId()) &&
            Objects.equals(getHostName(), that.getHostName()) &&
            Objects.equals(getPort(), that.getPort()) &&
            Objects.equals(getPriority(), that.getPriority());
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(getHostId(), getHostName(), getPort(), getPriority());
   }

   @Override
   public String toString()
   {
      return "PrioritizedHost{" +
            "hostId=" + hostId +
            ", priority=" + priority +
            "} " + super.toString();
   }
}
