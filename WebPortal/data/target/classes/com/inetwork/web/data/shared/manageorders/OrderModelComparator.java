package com.inetwork.web.data.shared.manageorders;

import com.inetwork.web.data.shared.utils.StringUtils;

import java.util.Comparator;

public class OrderModelComparator
{

   public static final Comparator<OrderModel> BY_LAST_MODIFY_DATE = new Comparator<OrderModel>()
   {
      @Override
      public int compare(OrderModel o1, OrderModel o2)
      {
         return StringUtils.compare(o2.getLastModifyDate(), o1.getLastModifyDate());
      }
   };
}
