package com.inetwork.web.data.shared.dto.lnp.portability;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;

public class NumberPortabilityRequest
{

   public static final String XML_ROOT_ELEMENT = "NumberPortabilityRequest";

   public interface Writer extends XmlWriter<NumberPortabilityRequest>
   {
   }

   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TnList/Tn")
   private List<String> phoneNumbers;

   public List<String> getPhoneNumbers()
   {
      return phoneNumbers;
   }

   public void setPhoneNumbers(List<String> phoneNumbers)
   {
      this.phoneNumbers = phoneNumbers;
   }
}
