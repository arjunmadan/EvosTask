package com.inetwork.web.data.shared;

public enum ErrorCode
{
   DUPLICATE_TERMINATION_HOST(18006),
   TO_MUCH_HOSTS_PER_ACCOUNT(18012),
   UNKNOWN_LOSING_CARRIER(7486),
   SITE_LOCKED_ORDER_ERROR(7336),
   TERMINATION_HOST_ALREADY_EXIST(18013),
   SUBSCRIBER_NAME_TRUNCATED_ORDER_ERROR(7397);


   private final int code;

   ErrorCode(int code)
   {
      this.code = code;
   }

   public int getCode()
   {
      return code;
   }
}
