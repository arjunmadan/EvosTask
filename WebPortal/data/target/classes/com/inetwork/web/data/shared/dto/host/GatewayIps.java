package com.inetwork.web.data.shared.dto.host;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gwt.core.client.GWT;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class GatewayIps
{
   public interface Reader extends XmlReader<GatewayIps>
   {
   }

   public interface Writer extends XmlWriter<GatewayIps>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TerminationHost")
   private List<GatewayIp> gatewayIps = new ArrayList<GatewayIp>();

   public List<GatewayIp> getGatewayIps()
   {
      return gatewayIps;
   }

   public void setGatewayIps(List<GatewayIp> gatewayIps)
   {
      this.gatewayIps = gatewayIps;
   }

   public static GatewayIps fromXml(String xml)
   {
      return READER.read(xml);
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (!(o instanceof GatewayIps))
         return false;
      GatewayIps that = (GatewayIps) o;
      return Objects.equals(getGatewayIps(), that.getGatewayIps());
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(getGatewayIps());
   }

   @Override
   public String toString()
   {
      return "GatewayIps{" +
            "gatewayIps=" + gatewayIps +
            '}';
   }
}
