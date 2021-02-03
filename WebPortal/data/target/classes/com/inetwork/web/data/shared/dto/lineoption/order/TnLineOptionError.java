package com.inetwork.web.data.shared.dto.lineoption.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.common.collect.Lists;
import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.TnError;
import com.inetwork.web.data.shared.utils.CollectionUtils;

public class TnLineOptionError implements TnError, Serializable
{
   public interface Reader extends XmlReader<TnLineOptionError>, Serializable
   {
   }

   public static final Reader READER = GWT.create(Reader.class);

   @Path("TelephoneNumber")
   private String telephoneNumber;
   @Path("ErrorCode")
   private int errorCode;
   @Path("Description")
   private String description;

   public String getTelephoneNumber()
   {
      return telephoneNumber;
   }

   public void setTelephoneNumber(String telephoneNumber)
   {
      this.telephoneNumber = telephoneNumber;
   }

   public Integer getCode()
   {
      return errorCode;
   }

   public void setCode(Integer errorCode)
   {
      this.errorCode = errorCode;
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
   public List<String> getTelephoneNumbers()
   {
      ArrayList<String> collection = Lists.newArrayList();
      CollectionUtils.addIgnoreNull(collection, telephoneNumber);
      return collection;
   }
}
