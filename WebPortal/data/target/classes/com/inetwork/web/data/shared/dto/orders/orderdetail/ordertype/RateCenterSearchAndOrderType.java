package com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;

public class RateCenterSearchAndOrderType extends LcaSearchOrderType
{

   public interface Reader extends XmlReader<RateCenterSearchAndOrderType>
   {
   }

   public interface Writer extends XmlWriter<RateCenterSearchAndOrderType>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("RateCenter")
   private String rateCenterAbbreviation;
   @Path("State")
   private String state;

   public String getRateCenterAbbreviation()
   {
      return rateCenterAbbreviation;
   }

   public void setRateCenterAbbreviation(String rateCenterAbbreviation)
   {
      this.rateCenterAbbreviation = rateCenterAbbreviation;
   }

   public String getState()
   {
      return state;
   }

   public void setState(String state)
   {
      this.state = state;
   }

   @Override
   public String getOrderType()
   {
      return "State and Rate Center";
   }

   @Override
   public String getSearchFilterValues()
   {
      return "State = " + state + " and Rate Center = " + rateCenterAbbreviation
            + super.getSearchFilterValues();
   }

}
