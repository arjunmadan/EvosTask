package com.inetwork.web.data.shared.dto.lnp;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum PortType implements HumanReadableValue, IsSerializable
{

   AUTOMATED("Automated On-net"),
   INTERNAL("Internal"),
   MANUAL_ON_NET("Manual On-net"),
   MANUALOFFNET("Manual Off-net"),
   MANUAL_TOLLFREE("Toll free Manual Off-net"),
   MIXED("mixed");

   private String hrValue;

   PortType(String hrValue)
   {
      this.hrValue = hrValue;
   }

   @Override
   public String getHumanReadableValue()
   {
      return hrValue;
   }

   public boolean isManualPort()
   {
      return this == MANUAL_ON_NET || this == MANUALOFFNET || this == MANUAL_TOLLFREE;
   }
}
