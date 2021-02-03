package com.inetwork.web.data.shared.dto.orders.orderdetail;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class Status
{

   public interface Reader extends XmlReader<Status>
   {
   }

   public interface Writer extends XmlWriter<Status>
   {
   }

   public static final Writer WRITER = GWT.create(Writer.class);
   public static final Reader READER = GWT.create(Reader.class);;

   @Path("Code")
   private Integer code;
   @Path("Description")
   private String description;

   public Integer getCode()
   {
      return code;
   }

   public void setCode(Integer code)
   {
      this.code = code;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }
}
