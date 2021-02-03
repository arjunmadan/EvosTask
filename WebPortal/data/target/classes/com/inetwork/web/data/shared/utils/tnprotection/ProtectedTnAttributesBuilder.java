package com.inetwork.web.data.shared.utils.tnprotection;

import java.util.List;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.inetwork.web.data.shared.TnAttribute;

public abstract class ProtectedTnAttributesBuilder
{
   public abstract boolean isProtectTnAttributeChosen();

   public List<String> build()
   {
      List<String> tnAttributes = Lists.newArrayList();
      addProtectedTnAttribute(tnAttributes);
      return Iterables.isEmpty(tnAttributes) ? null : tnAttributes;
   }

   private void addProtectedTnAttribute(List<String> tnAttributes)
   {
      if (isProtectTnAttributeChosen())
      {
         tnAttributes.add(TnAttribute.PROTECTED.getDatabaseValue());
      }
   }
}
