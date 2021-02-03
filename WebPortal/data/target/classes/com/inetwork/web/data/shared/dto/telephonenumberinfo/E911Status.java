package com.inetwork.web.data.shared.dto.telephonenumberinfo;

public enum E911Status
{
   NOT_APPLICABLE("Not Applicable"),
   PENDING("Pending"),
   FAILED("Failed"),
   SUCCESS("Success"),
   API_ERROR("API Error"),
   UC_CHECK_ERROR("UC Check Error");

   private final String value;

   E911Status(String value)
   {
      this.value = value;
   }

   public String getValue()
   {
      return value;
   }

   public static E911Status getValueFromString(String s)
   {
      for (E911Status e911Status : values())
      {
         if (e911Status.getValue().equalsIgnoreCase(s))
         {
            return e911Status;
         }
      }
      return null;
   }
}
