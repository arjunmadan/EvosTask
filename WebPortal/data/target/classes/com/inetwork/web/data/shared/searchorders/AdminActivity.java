package com.inetwork.web.data.shared.searchorders;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.inetwork.web.data.shared.utils.HumanReadableValue;
import com.inetwork.web.data.shared.utils.SearchValue;
import com.inetwork.web.data.shared.utils.StringUtils;

public enum AdminActivity implements HumanReadableValue, SearchValue, IsSerializable
{
   CHANGED("#C30045"),
   SEEN("#EBB700"),
   RESPONDED("#007A34"),
   QUIET("#ACACAF");

   private String colorHex;
   private String databaseValue = name().toLowerCase();
   private String formattedName = StringUtils.capitalize(databaseValue);

   AdminActivity(String colorHex)
   {
      this.colorHex = colorHex;
   }

   public String getDatabaseValue()
   {
      return databaseValue;
   }

   public static AdminActivity parseToEnum(String value)
   {
      for (AdminActivity activity : values())
      {
         if (activity.name()
               .equalsIgnoreCase(value))
         {
            return activity;
         }
      }
      return AdminActivity.QUIET;
   }

   public static final List<String> NAMES = getNames();

   public static final List<String> FORMATTED_NAMES = getFormattedNames();

   private static List<String> getNames()
   {
      List<String> names = new ArrayList<String>(values().length);
      for (AdminActivity adminActivity : values())
      {
         names.add(adminActivity.getDatabaseValue());
      }
      return names;
   }

   private static List<String> getFormattedNames()
   {
      List<String> names = new ArrayList<String>(values().length);
      for (AdminActivity adminActivity : values())
      {
         names.add(adminActivity.formattedName);
      }
      return names;
   }

   @Override
   public String getHumanReadableValue()
   {
      return databaseValue;
   }

   @Override
   public String getSearchValue()
   {
      return databaseValue;
   }

   public String getColorHex()
   {
      return colorHex;
   }
}
