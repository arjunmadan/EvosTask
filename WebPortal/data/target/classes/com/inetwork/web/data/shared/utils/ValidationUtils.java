package com.inetwork.web.data.shared.utils;

import com.google.gwt.regexp.shared.RegExp;
import com.inetwork.web.data.shared.ServiceConstants;

public abstract class ValidationUtils
{

   private static final RegExp COOKIE_INETWORK_REG_EXP = RegExp.compile(ServiceConstants.COOKIE_INETWORK_PATTERN);
   private static final RegExp ORDER_ID_REG_EXP = RegExp.compile("[0-9a-f]{8}-([0-9a-f]{4}-){3}[0-9a-f]{12}");

   public static boolean isValidSessionId(String sessionId)
   {
      return COOKIE_INETWORK_REG_EXP.test(sessionId);
   }

   public static boolean isValidOrderId(String orderId)
   {
      return ORDER_ID_REG_EXP.test(orderId);
   }

}
