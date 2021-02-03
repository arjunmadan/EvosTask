package com.inetwork.web.data.shared.dto.host;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import java.util.Objects;

public class GatewayIp extends Host
{
   public interface Reader extends XmlReader<GatewayIp>
   {
   }

   public interface Writer extends XmlWriter<GatewayIp>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("id")
   private Long gatewayId;

   public Long getGatewayId()
   {
      return gatewayId;
   }

   public void setGatewayId(Long gatewayId)
   {
      this.gatewayId = gatewayId;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (!(o instanceof GatewayIp))
         return false;
      if (!super.equals(o))
         return false;
      GatewayIp gatewayIp = (GatewayIp) o;
      return Objects.equals(getGatewayId(), gatewayIp.getGatewayId());
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(super.hashCode(), getGatewayId());
   }

   @Override
   public String toString()
   {
      return "GatewayIp{" +
              "gatewayId=" + gatewayId +
              "} " + super.toString();
   }
}
