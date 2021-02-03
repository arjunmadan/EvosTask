package com.inetwork.web.data.shared.dto.lnp.portability;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.gwt.core.client.GWT;

public class TollFreeNumberGroup
{
   public interface Reader extends XmlReader<TollFreeNumberGroup>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);

   @Path("TnList/Tn")
   private List<String> telephoneNumbers;

   public List<String> getTelephoneNumbers()
   {
      return telephoneNumbers;
   }

   public void setTelephoneNumbers(List<String> telephoneNumbers)
   {
      this.telephoneNumbers = telephoneNumbers;
   }
}
