package com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype;

import name.pehl.piriti.commons.client.Path;

public abstract class LcaSearchOrderType extends BaseOrderType
{

   @Path("EnableLCA")
   private boolean enableLCA = true;

   public boolean isEnableLCA()
   {
      return enableLCA;
   }

   public void setEnableLCA(boolean enableLCA)
   {
      this.enableLCA = enableLCA;
   }

   @Override
   public String getSearchFilterValues()
   {
      return enableLCA ? " and Enable LCA" : "";
   }

}
