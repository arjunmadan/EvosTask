package com.inetwork.web.data.dto.imports.linefeatures.tnoption;

import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.inetwork.common.dto.tnoption.TnOptionGroup;
import com.inetwork.common.dto.tnoption.TnOptionOrderPayload;

public class TnOptionOrderConstructor
{
   public TnOptionOrderPayload construct(Multimap<TnOptionDetailsKey, String> detailGroups)
   {
      TnOptionOrderPayload payload = null;
      if (detailGroups != null && !detailGroups.isEmpty())
      {
         payload = new TnOptionOrderPayload();
         List<TnOptionGroup> tnOptionGroups = Lists.newArrayList();
         for (TnOptionDetailsKey tnOptionDetailsKey : detailGroups.keySet())
         {
            TnOptionGroup tnOptionGroup = tnOptionDetailsKey.asTnOptionGroup();
            tnOptionGroup.setGroupNumbers(Lists.newArrayList(detailGroups.get(tnOptionDetailsKey)));
            tnOptionGroups.add(tnOptionGroup);
         }
         payload.setTnOptionGroups(tnOptionGroups);
      }
      return payload;
   }
}
