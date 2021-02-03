package com.inetwork.web.data.shared.dto.orders.orderdetail;

public enum NnidProvisioningStatus
{
   PROCESSING("Processing"),
   SUCCESS("Success"),
   FAILED("Failed");

   private final String apiValue;

   NnidProvisioningStatus(String apiValue)
   {
      this.apiValue = apiValue;
   }

   public String getApiValue()
   {
      return apiValue;
   }
}
