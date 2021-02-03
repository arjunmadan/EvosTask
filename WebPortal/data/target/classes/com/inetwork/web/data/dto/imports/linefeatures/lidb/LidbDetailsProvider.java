package com.inetwork.web.data.dto.imports.linefeatures.lidb;

import static com.inetwork.web.data.shared.utils.StringUtils.isNotBlank;

import com.inetwork.common.dto.lidb.LidbVisibility;
import com.inetwork.web.data.dto.imports.linefeatures.LineFeaturesRow;
import com.inetwork.web.data.shared.ServiceConstants;

public class LidbDetailsProvider
{

   public LidbDetailsKey provideDetails(LineFeaturesRow row)
   {
      LidbDetailsKey lidbDetailsKey = null;
      if (dataIsValid(row))
      {
         lidbDetailsKey = new LidbDetailsKey(row.getServiceType(), convertToVisibility(row.getPresentation()), row.getName());
      }
      return lidbDetailsKey;
   }

   private String convertToVisibility(String presentation)
   {
      if (ServiceConstants.BLOCKED.equalsIgnoreCase(presentation))
      {
         return LidbVisibility.PRIVATE.toString();
      }
      if (ServiceConstants.ALLOWED.equalsIgnoreCase(presentation))
      {
         return LidbVisibility.PUBLIC.toString();
      }
      return presentation;
   }

   private boolean dataIsValid(LineFeaturesRow row)
   {
      return isNotBlank(row.getName()) || isNotBlank(row.getServiceType()) || isNotBlank(row.getPresentation());
   }

}
