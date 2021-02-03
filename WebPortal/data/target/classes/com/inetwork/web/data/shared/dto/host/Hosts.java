package com.inetwork.web.data.shared.dto.host;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import java.util.List;
import java.util.Objects;

public class Hosts
{
   public interface Reader extends XmlReader<Hosts>
   {
   }

   public interface Writer extends XmlWriter<Hosts>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("Host")
   private List<Host> hosts;
   
   public Hosts()
   {
   }

   public Hosts(List<Host> hosts)
   {
      this.hosts = hosts;
   }

   public List<Host> getHosts()
   {
      return hosts;
   }

   public void setHosts(List<Host> hosts)
   {
      this.hosts = hosts;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (!(o instanceof Hosts))
         return false;
      Hosts that = (Hosts) o;
      return Objects.equals(getHosts(), that.getHosts());
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(getHosts());
   }

   @Override
   public String toString()
   {
      return "Hosts{" +
              "hosts=" + hosts +
              '}';
   }
}
