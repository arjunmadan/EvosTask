package com.inetwork.web.data.shared.adminsearch;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class SearchFilter<T>
{
   private T response;
   private Multimap<String, Object> parameters = HashMultimap.create();
   private String orderType;
   private SearchType searchType;
   private String nextUrl;

   public T getResponse()
   {
      return response;
   }

   public void setResponse(T response)
   {
      this.response = response;
   }

   public Multimap<String, Object> getParameters()
   {
      return parameters;
   }

   public void setParameters(Multimap<String, Object> parameter)
   {
      this.parameters = parameter;
   }

   public String getOrderType()
   {
      return orderType;
   }

   public void setOrderType(String orderType)
   {
      this.orderType = orderType;
   }

   public SearchType getSearchType()
   {
      return searchType;
   }

   public void setSearchType(SearchType searchType)
   {
      this.searchType = searchType;
   }

   public String getNextUrl()
   {
      return nextUrl;
   }

   public void setNextUrl(String nextUrl)
   {
      this.nextUrl = nextUrl;
   }

   public SearchFilter<T> putParameter(String name, String value)
   {
      parameters.put(name, value);
      return this;
   }

   public SearchFilter<T> removeParameter(String name)
   {
      parameters.removeAll(name);
      return this;
   }

   public SearchFilter<T> replaceParameter(String name, String value)
   {
      removeParameter(name);
      putParameter(name, value);
      return this;
   }
}
