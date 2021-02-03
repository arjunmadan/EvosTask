package com.inetwork.web.data.shared.dto.lnp;

import java.util.Collection;
import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.ErrorCode;
import com.inetwork.web.data.shared.utils.CollectionUtils;
import com.inetwork.web.data.shared.utils.StringUtils;

public class LnpError
{
   public interface Reader extends XmlReader<LnpError>
   {
   }

   public interface Writer extends XmlWriter<LnpError>
   {
   }

   public static final Writer WRITER = GWT.create(Writer.class);

   public static final Reader READER = GWT.create(Reader.class);

   @Path("Code")
   private Integer code;
   @Path("Description")
   private String description;
   @Path("TelephoneNumbers/Tn")
   private List<String> telephoneNumbers;

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

   public List<String> getTelephoneNumbers()
   {
      return telephoneNumbers;
   }

   public void setTelephoneNumbers(List<String> telephoneNumbers)
   {
      this.telephoneNumbers = telephoneNumbers;
   }

   public static StringBuilder appendByErrorMessages(StringBuilder stringBuilder, Collection<LnpError> errors)
   {
      if (CollectionUtils.isNotEmpty(errors) && stringBuilder != null)
      {
         for (LnpError error : errors)
         {
            appendByErrorMessage(stringBuilder, error.getDescription(), error.getTelephoneNumbers());
         }
      }
      return stringBuilder;
   }

   private static StringBuilder appendByErrorMessage(StringBuilder stringBuilder, String errorDescription, Collection<String> errorTelephoneNumbers)
   {
      if (CollectionUtils.isNotEmpty(errorTelephoneNumbers))
      {
         stringBuilder.append(StringUtils.formatWithSemicolonInTheEnd(errorDescription))
               .append("\n")
               .append(CollectionUtils.getListAsString(errorTelephoneNumbers))
               .append("\n\n");
      }
      return stringBuilder;
   }

   public boolean isUnknownLosingCarrierError()
   {
      return getCode() != null && ErrorCode.UNKNOWN_LOSING_CARRIER.getCode() == getCode();
   }

   @Override
   public String toString()
   {
      return "LnpError{" + "code=" + code + ", description='" + description + '\'' + ", telephoneNumbers=" + telephoneNumbers + '}';
   }
}
