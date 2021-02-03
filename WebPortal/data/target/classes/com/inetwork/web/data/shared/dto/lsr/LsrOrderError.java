package com.inetwork.web.data.shared.dto.lsr;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;

public class LsrOrderError
{
   public interface Reader extends XmlReader<LsrOrderError>
   {
   }

   public interface Writer extends XmlWriter<LsrOrderError>
   {
   }

   public static final Writer WRITER = GWT.create(Writer.class);

   public static final Reader READER = GWT.create(Reader.class);

   @Path("Code")
   private Integer code;
   @Path("Description")
   private String description;

   public LsrOrderError()
   {
   }

   public LsrOrderError(Integer code, String description)
   {
      this.code = code;
      this.description = description;
   }

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

    @Override
    public String toString() {
        return "LsrOrderError{" +
                "code=" + code +
                ", description=" + description +
                '}';
    }
}
