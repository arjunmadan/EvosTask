package com.inetwork.web.data.shared.dto.orders.orderdetail.orderhistory;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.gwt.core.client.GWT;

public class OrderHistory
{

   public interface Reader extends XmlReader<OrderHistory>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);

   @Path("OrderDate")
   private String orderDate;
   @Path("Note")
   private String note;
   @Path("Author")
   private String author;
   @Path("Status")
   private String status;
   @Path("Difference")
   private String difference;

   public String getOrderDate()
   {
      return orderDate;
   }

   public void setOrderDate(String orderDate)
   {
      this.orderDate = orderDate;
   }

   public String getNote()
   {
      return note;
   }

   public void setNote(String note)
   {
      this.note = note;
   }

   public String getAuthor()
   {
      return author;
   }

   public void setAuthor(String author)
   {
      this.author = author;
   }

   public String getStatus()
   {
      return status;
   }

   public void setStatus(String status)
   {
      this.status = status;
   }

   public String getDifference()
   {
      return difference;
   }

   public void setDifference(String difference)
   {
      this.difference = difference;
   }
}
