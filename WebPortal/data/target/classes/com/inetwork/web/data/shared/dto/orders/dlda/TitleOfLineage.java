package com.inetwork.web.data.shared.dto.orders.dlda;

public enum TitleOfLineage
{

   II("II", "Second"),
   III("III", "Third"),
   IV("IV", "Fourth"),
   V("V", "Fifth"),
   JR("Jr", "Junior"),
   SR("Sr", "Senior");

   private String abbreviation;
   private String description;

   TitleOfLineage(String abbreviation, String description)
   {
      this.abbreviation = abbreviation;
      this.description = description;
   }

   public String getAbbreviation()
   {
      return abbreviation;
   }

   public String getDescription()
   {
      return description;
   }

   public static TitleOfLineage getTitleByAbbreviation(String abbreviation)
   {
      for (TitleOfLineage titleOfLineage : values())
      {
         if (titleOfLineage.abbreviation.equalsIgnoreCase(abbreviation))
         {
            return titleOfLineage;
         }
      }
      return null;
   }

}
