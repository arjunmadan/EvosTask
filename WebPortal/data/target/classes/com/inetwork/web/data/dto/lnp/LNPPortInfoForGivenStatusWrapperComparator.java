package com.inetwork.web.data.dto.lnp;

import com.inetwork.common.dto.legacyhistory.wrappers.LnpResponseWrapper;

import java.util.Comparator;

public class LNPPortInfoForGivenStatusWrapperComparator
{
   public static class ByLastModifiedDate implements Comparator<LnpResponseWrapper>
   {
      @Override
      public int compare(LnpResponseWrapper o1, LnpResponseWrapper o2)
      {
         if (o1 == o2)
         {
            return 0;
         }
         if (o1 == null || o1.getLastModifiedDate() == null)
         {
            return 1;
         }
         if (o2 == null || o2.getLastModifiedDate() == null)
         {
            return -1;
         }
         return o2.getLastModifiedDate()
               .compareTo(o1.getLastModifiedDate());
      }
   }
}
