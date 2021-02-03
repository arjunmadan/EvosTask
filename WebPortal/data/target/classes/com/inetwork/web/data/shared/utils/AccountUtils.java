package com.inetwork.web.data.shared.utils;

import java.util.HashMap;

import com.google.common.collect.Maps;

public abstract class AccountUtils
{

   private HashMap<Integer, String> companyNameMap = Maps.newHashMap();
   private HashMap<String, Integer> accountIdMap = Maps.newHashMap();

   public void put(Integer accountId, String companyName)
   {
      companyNameMap.put(accountId, companyName);
      accountIdMap.put(companyName, accountId);
   }

   public String getCompanyName(Integer accountId)
   {
      return companyNameMap.get(accountId);
   }

   public Integer getAccountId(String companyName)
   {
      return accountIdMap.get(companyName);
   }

}
