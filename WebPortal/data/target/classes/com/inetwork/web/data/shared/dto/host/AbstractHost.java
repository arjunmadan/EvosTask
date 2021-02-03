package com.inetwork.web.data.shared.dto.host;

import static com.inetwork.web.data.shared.utils.StringUtils.isNotEmpty;

public abstract class AbstractHost
{
   public abstract String getHostName();

   public abstract void setHostName(String hostname);

   public String getPort()
   {
      return "";
   }

   public void setPort(String port)
   {

   }

   public String asText()
   {
      String s = "";
      if (isNotEmpty(getHostName()))
      {
         s += getHostName();
      }
      if (isNotEmpty(getPort()))
      {
         s += ":" + getPort();
      }
      return s;
   }
}
