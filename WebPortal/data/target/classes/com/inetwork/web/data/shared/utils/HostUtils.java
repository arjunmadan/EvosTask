package com.inetwork.web.data.shared.utils;

import static com.inetwork.web.data.shared.utils.StringUtils.isNotBlank;

import com.inetwork.web.data.shared.dto.host.AbstractHost;
import com.inetwork.web.data.shared.dto.host.GatewayIp;
import com.inetwork.web.data.shared.dto.host.Host;
import com.inetwork.web.data.shared.dto.host.TerminationHost;

public final class HostUtils
{
   private HostUtils()
   {
   }

   public static Host parseHost(String value)
   {
      Host host = new Host();
      parse(value, host);
      return host;
   }

   public static TerminationHost parseTerminationHost(String value)
   {
      TerminationHost host = new TerminationHost();
      parse(value, host);
      return host;
   }

   public static GatewayIp parseGatewayIp(String value)
   {
      GatewayIp host = new GatewayIp();
      parse(value, host);
      return host;
   }

   public static void parse(String value, AbstractHost destination)
   {
      if (isNotBlank(value))
      {
         String[] parts = value.trim().split(":");
         if (parts.length == 1)
         {
            destination.setHostName(parts[0]);
         }
         else if (parts.length == 2)
         {
            destination.setHostName(parts[0]);
            destination.setPort(parts[1]);
         }
      }
   }
}
