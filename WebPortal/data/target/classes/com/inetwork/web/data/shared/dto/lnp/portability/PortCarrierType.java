package com.inetwork.web.data.shared.dto.lnp.portability;


public enum PortCarrierType 
{

   WIRELESS("wireless"),
   WIRELINE("wireline");

   private String type;

   PortCarrierType(final String type)
   {
      this.type = type;
   }

   public String getType()
   {
      return type;
   }

   public String getHumanReadableValue()
   {
      return type;
   }
}
