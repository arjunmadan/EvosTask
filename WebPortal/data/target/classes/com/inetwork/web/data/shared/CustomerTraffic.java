package com.inetwork.web.data.shared;


public enum CustomerTraffic
{
   NONE(1, "NONE"),
   DOMESTIC(2, "DOMESTIC"),
   LITE(3, "LITE"),
   ALL(4, "ALL");
   
   private int id;
   private String webValue;
   
   CustomerTraffic(int id, String webValue)
   {
      this.id = id;
      this.webValue = webValue;
   }
   
   public String getWebValue()
   {
      return webValue;
   }
   
   public int getId() 
   {
      return id;
   }
   
   public static CustomerTraffic getById(int id)
   {
      for(CustomerTraffic traffic : CustomerTraffic.values()) 
      {
         if(traffic.id == id)
         {
            return traffic;
         }
      }
      return DOMESTIC;
   }
   
   public static int getIdByStringValue(String trafficAllowed)
   {
       for(CustomerTraffic traffic : CustomerTraffic.values()) 
       {
          if(traffic.getWebValue().equals(trafficAllowed))
          {
             return traffic.getId();
          }
       }
       return 0;
   }
   
}
