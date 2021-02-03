package com.inetwork.web.data.dto.imports.linefeatures.lidb;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.inetwork.common.dto.lidb.LidbDetailTnGroup;
import com.inetwork.common.dto.lidb.order.LidbOrderPayload;

import java.util.List;

public class LidbOrderConstructor
{

   public LidbOrderPayload constructOrder(Multimap<LidbDetailsKey, String> detailGroups)
   {
      LidbOrderPayload lidbOrderPayload = null;
      if (detailGroups != null && !detailGroups.isEmpty())
      {
         lidbOrderPayload = new LidbOrderPayload();
         List<LidbDetailTnGroup> lidbDetailTnGroups = Lists.newArrayList();
         for (LidbDetailsKey lidbDetailsKey : detailGroups.keySet())
         {
            LidbDetailTnGroup lidbDetailTnGroup = lidbDetailsKey.asLidbDetailTnGroup();
            lidbDetailTnGroup.setFullNumbers(Lists.newArrayList(detailGroups.get(lidbDetailsKey)));
            lidbDetailTnGroups.add(lidbDetailTnGroup);
         }
         lidbOrderPayload.setLidbDetailTnGroups(lidbDetailTnGroups);
      }
      return lidbOrderPayload;
   }

}
