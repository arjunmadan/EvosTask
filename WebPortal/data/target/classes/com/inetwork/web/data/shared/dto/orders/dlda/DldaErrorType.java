package com.inetwork.web.data.shared.dto.orders.dlda;

public enum DldaErrorType
{
   TOLL_FREE_NOT_SUPPORTED(16100, "The DL/DA API does not support adding toll free numbers."),
   NUMBER_DOES_NOT_BELONG_TO_ACCOUNT(16101, "Number does not belong to this account"),
   VENDOR_NOT_SUPPORTED(16102, "The vendor of this telephone number is currently not supported."),
   ALREADY_BEING_PROCESSED(16103, "DL/DA information cannot be changed because the number is already being processed by order "),
   NO_NUMBERS_FOR_PROCESSING(16104, "No numbers for processing"),
   ORDER_ALREADY_BEING_PROCESSED(16105, "Order cannot be changed or cancelled because it is already being processed"),
   ORDER_ALREADY_FAILED(16106, "Order cannot be changed or cancelled because it is already failed");

   private int code;
   private String description;

   private DldaErrorType(int code, String description)
   {
      this.code = code;
      this.description = description;
   }

   public int getCode()
   {
      return code;
   }

   public String getDescription()
   {
      return description;
   }
}
