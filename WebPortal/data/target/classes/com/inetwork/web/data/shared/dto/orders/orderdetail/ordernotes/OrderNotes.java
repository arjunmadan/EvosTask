package com.inetwork.web.data.shared.dto.orders.orderdetail.ordernotes;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.xml.client.XmlWriter;

public class OrderNotes
{

   public interface Reader extends XmlReader<OrderNotes>{}

   public interface  Writer extends XmlWriter<OrderNotes> {}

   public static final Writer WRITER = GWT.create(Writer.class);

   public static final Reader READER = GWT.create(Reader.class);

   @Path("Note")
   private List<OrderNote> orderNotes;

   public List<OrderNote> getOrderNotes()
   {
      return orderNotes;
   }

   public void setOrderNotes(List<OrderNote> orderNotes)
   {
      this.orderNotes = orderNotes;
   }
}
