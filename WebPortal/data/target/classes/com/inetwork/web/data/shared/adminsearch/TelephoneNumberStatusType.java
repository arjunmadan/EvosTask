package com.inetwork.web.data.shared.adminsearch;

public enum TelephoneNumberStatusType
{
   ALL("All"),
   AVAILABLE("Available"),
   IN_SERVICE("InService"),
   AGING("Aging"),
   PORT_IN_PENDING_FOC("PortInPendingFoc"),
   RESERVED("Reserved");

   public final String tnStatus;

   TelephoneNumberStatusType(String tnStatus)
   {
      this.tnStatus = tnStatus;
   }

   public String getTnStatus()
   {
      return tnStatus;
   }

}
