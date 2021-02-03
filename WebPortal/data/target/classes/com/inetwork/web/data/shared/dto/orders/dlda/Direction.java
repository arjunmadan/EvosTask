package com.inetwork.web.data.shared.dto.orders.dlda;

public enum Direction
{
   NORTH("N"),
   SOUTH("S"),
   EAST("E"),
   WEST("W"),
   NORTHEAST("NE"),
   NORTHWEST("NW"),
   SOUTHEAST("SE"),
   SOUTHWEST("SW");

   private String abbreviation;

   Direction(String abbreviation)
   {
      this.abbreviation = abbreviation;
   }

   public String getAbbreviation()
   {
      return abbreviation;
   }

   public static Direction normalize(String abbreviation)
   {
      for (Direction direction : values())
      {
         if (direction.abbreviation.equalsIgnoreCase(abbreviation))
         {
            return direction;
         }
      }
      return null;
   }
}
