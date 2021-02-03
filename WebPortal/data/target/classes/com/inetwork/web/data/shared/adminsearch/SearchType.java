package com.inetwork.web.data.shared.adminsearch;

public enum SearchType
{
   SEARCH_BY_TELEPHONE_NUMBER("Telephone Number"),
   SEARCH_BY_ACCOUNT("Accounts"),
   SEARCH_BY_NEW_NUMBER_ORDER("New Number Order"),
   SEARCH_BY_PORT_IN("Port In Orders"),
   SEARCH_BY_PORT_OUT("Port Out Orders"),
   SEARCH_BY_LSR("LSR Orders"),
   SEARCH_BY_E911("E911 Orders"),
   SEARCH_BY_LIDB("Calling Name Update"),
   SEARCH_BY_DLDA("Directory Listing / Directory Assistance"),
   SEARCH_BY_TN_OPTION("TN Option Orders"),
   SEARCH_BY_EXTERNAL_TN("External TN Orders"),
   SEARCH_BY_IMPORT_TN("Import Number Orders"),
   SEARCH_BY_REMOVE_TN("Remove Imported Number Orders");

   private String searchType;

   SearchType(String searchType)
   {
      this.searchType = searchType;
   }

   public String getSearchType()
   {
      return searchType;
   }

   public static SearchType fromString(String value)
   {
      for (SearchType st : values())
      {
         if (st.getSearchType()
               .equals(value))
            return st;
      }
      return null;
   }

}
