package com.inetwork.web.data.shared.dto.orders.orderdetail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.gwt.core.client.GWT;

public class TelephoneDetailsReports implements Iterable<TelephoneDetailsReport>
{
   public interface TelephoneDetailsReportsReader extends XmlReader<TelephoneDetailsReports>
   {
   }

   public static final TelephoneDetailsReportsReader READER = GWT.create(TelephoneDetailsReportsReader.class);

   @Path("TelephoneDetailsReport")
   private List<TelephoneDetailsReport> telephoneDetailsReports;

   public List<TelephoneDetailsReport> getTelephoneDetailsReports()
   {
      return telephoneDetailsReports;
   }

   public void setTelephoneDetailsReports(List<TelephoneDetailsReport> telephoneDetailsReports)
   {
      this.telephoneDetailsReports = telephoneDetailsReports;
   }

   @Override
   public Iterator<TelephoneDetailsReport> iterator()
   {
      return getTelephoneDetailsReports() != null ? getTelephoneDetailsReports().iterator() : new ArrayList<TelephoneDetailsReport>().iterator();
   }

   public boolean isEmpty()
   {
      if (telephoneDetailsReports != null && telephoneDetailsReports.isEmpty())
      {
         return true;
      }
      return false;
   }
}