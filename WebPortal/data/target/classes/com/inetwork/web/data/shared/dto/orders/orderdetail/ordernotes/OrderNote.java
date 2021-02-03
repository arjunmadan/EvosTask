package com.inetwork.web.data.shared.dto.orders.orderdetail.ordernotes;

import java.util.Date;

import name.pehl.piriti.commons.client.Format;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.ServiceConstants;

public class OrderNote
{

   public static final String ROOT_ELEMENT = "Note";

   public interface Reader extends XmlReader<OrderNote>
   {
   }

   public interface Writer extends XmlWriter<OrderNote>
   {
   }

   public static final Writer WRITER = GWT.create(Writer.class);

   public static final Reader READER = GWT.create(Reader.class);

   @Path("Id")
   private Integer id;

   @Path("UserId")
   private String userId;

   @Path("Description")
   private String description;

   @Path("Internal")
   private Boolean internal;

   @Path("LastDateModifier")
   @Format(ServiceConstants.TIME_ONE_PATTERN)
   private Date date;

   public Integer getId()
   {
      return id;
   }

   public void setId(Integer id)
   {
      this.id = id;
   }

   public String getUserId()
   {
      return userId;
   }

   public void setUserId(String userId)
   {
      this.userId = userId;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public Date getDate()
   {
      return date;
   }

   public void setDate(Date date)
   {
      this.date = date;
   }

   public Boolean getInternal()
   {
      return internal;
   }

   public void setInternal(Boolean isInternal)
   {
      this.internal = isInternal;
   }
}
