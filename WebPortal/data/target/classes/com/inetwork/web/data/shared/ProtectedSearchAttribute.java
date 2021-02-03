package com.inetwork.web.data.shared;

public enum ProtectedSearchAttribute
{
   NONE("NONE"), ONLY("ONLY"), MIXED("MIXED");

   private String webServiceValue;

   ProtectedSearchAttribute(String webServiceValue)
   {
      this.webServiceValue = webServiceValue;
   }

   public String getWebServiceValue()
   {
      return webServiceValue;
   }
}
