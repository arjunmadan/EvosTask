package com.inetwork.web.data.shared.dto;

import java.util.Arrays;
import java.util.List;

import com.google.common.base.Functions;
import com.google.common.collect.Lists;

public enum TollFreeNpa
{
   _800("800"), _833("833"), _844("844"), _855("855"), _866("866"), _877("877"), _888("888");

   private final String npa;
   public static final List<String> TOLL_FREE_NPAS = Lists.transform(Arrays.asList(values()), Functions.toStringFunction());

   private TollFreeNpa(String npa)
   {
      this.npa = npa;
   }
   @Override
   public String toString()
   {
      return npa;
   }
}
