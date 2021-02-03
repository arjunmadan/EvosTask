package com.inetwork.web.data.shared;

public enum TelephoneNumberStatus
{
   AVAILABLE("Available"),
   INSERVICE("Inservice"),
   DISCONNECTED("Disconnected"),
   AGING("Aging"),
   PORT_IN_PENDING_FOC("PortInPendingFoc"),
   PORT_OUT("PortOut"),
   RESERVED("Reserved"),
   REMOVED("Removed"),
   ELIMINATED("Eliminated");

   private final String value;

   private TelephoneNumberStatus(final String value)
   {
      this.value = value;
   }

   @Override
   public String toString()
   {
      return value;
   }

   public static TelephoneNumberStatus convertToEnum(String value)
   {
      for (TelephoneNumberStatus status : values())
      {
         if (status.value.equalsIgnoreCase(value))
         {
            return status;
         }
      }
      return null;
   }

}
