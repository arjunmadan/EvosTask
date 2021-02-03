package com.inetwork.web.data.shared.dto;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.common.collect.Lists;
import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.OrderType;
import com.inetwork.web.data.shared.utils.CollectionUtils;

public class AbstractFeatureOrder<ERR extends TnError> extends BaseOrder implements FeatureOrder
{

   public interface Reader extends XmlReader<AbstractFeatureOrder>
   {
   }

   public interface Writer extends XmlWriter<AbstractFeatureOrder>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("ErrorList/Error")
   private List<ERR> errors;

   public List<ERR> getErrors()
   {
      return errors;
   }

   @Override
   public OrderType getOrderType()
   {
      return null;
   }

   public void setErrors(List<ERR> errors)
   {
      this.errors = errors;
   }

   public List<String> getErrorNumbers()
   {
      List<String> errorNumbers = Lists.newArrayList();
      if (CollectionUtils.isNotEmpty(errors))
      {
         for (ERR telephoneNumberError : errors)
         {
            errorNumbers.addAll(telephoneNumberError.getTelephoneNumbers());
         }
      }
      return errorNumbers;
   }

}
