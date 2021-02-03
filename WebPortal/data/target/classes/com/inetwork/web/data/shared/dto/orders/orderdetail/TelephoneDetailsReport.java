package com.inetwork.web.data.shared.dto.orders.orderdetail;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.gwt.core.client.GWT;

public class TelephoneDetailsReport
{
   public interface TelephoneDetailsReportReader extends XmlReader<TelephoneDetailsReport>
   {
   }

   public static final TelephoneDetailsReportReader READER = GWT.create(TelephoneDetailsReportReader.class);

   @Path("AreaCode")
   private String areaCode;
   @Path("Count")
   private int count;

   public String getAreaCode()
   {
      return areaCode;
   }

   public void setAreaCode(String areaCode)
   {
      this.areaCode = areaCode;
   }

   public int getCount()
   {
      return count;
   }

   public void setCount(int count)
   {
      this.count = count;
   }
}
