package com.inetwork.web.data.shared;

public enum TrafficDistributionMechanism
{
   SEQUENTIAL(1), RANDOM(2), NONE(3);

   private int id;

   TrafficDistributionMechanism(int id)
   {
      this.id = id;
   }

   public int getId()
   {
      return id;
   }

   public static TrafficDistributionMechanism getById(int id)
   {
      for (TrafficDistributionMechanism traffic : TrafficDistributionMechanism.values())
      {
         if (traffic.id == id)
         {
            return traffic;
         }
      }
      return null;
   }
}
