package com.inetwork.web.data.shared.utils.tnprotection;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;
import com.inetwork.web.data.shared.TnAttribute;
import com.inetwork.web.data.shared.utils.CollectionUtils;

public abstract class TnAttributesConverter
{
   public static Set<TnAttribute> toEnum(List<String> tnAttributes)
   {
      Set<TnAttribute> tnAttributesEnum = Sets.newHashSet();
      if (CollectionUtils.isNotEmpty(tnAttributes))
      {
         for (String attribute : tnAttributes)
         {
            tnAttributesEnum.add(TnAttribute.fromDatabaseValue(attribute));
         }
      }
      return tnAttributesEnum;
   }
}
