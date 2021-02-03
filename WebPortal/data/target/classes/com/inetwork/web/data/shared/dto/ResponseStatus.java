package com.inetwork.web.data.shared.dto;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class ResponseStatus
{

   public interface Reader extends XmlReader<ResponseStatus>
   {
   }

   public interface Writer extends XmlWriter<ResponseStatus>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("code | ErrorCode")
   private Integer code;

   @Path("description | Description")
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
