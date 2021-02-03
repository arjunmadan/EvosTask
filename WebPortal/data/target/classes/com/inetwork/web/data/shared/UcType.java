package com.inetwork.web.data.shared;

public enum UcType
{
   CLOUD("Cloud"), SEATS("Seats"), PREMISE("Premise");

   private String apiValue;

   private UcType(String apiValue)
   {
      this.apiValue = apiValue;
   }

   public String getApiValue()
   {
      return apiValue;
   }

   public static UcType getByApiValue(String apiValue)
   {
      for (UcType type : values())
      {
         if (type.apiValue.equals(apiValue))
         {
            return type;
         }
      }
      throw new IllegalStateException();
   }
}
