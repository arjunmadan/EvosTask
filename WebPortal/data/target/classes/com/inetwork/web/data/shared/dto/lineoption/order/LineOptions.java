package com.inetwork.web.data.shared.dto.lineoption.order;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.OrderType;
import com.inetwork.web.data.shared.dto.FeatureOrder;

public class LineOptions implements FeatureOrder
{
   public interface Reader extends XmlReader<LineOptions>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);

   @Path("Errors/Error")
   private List<TnLineOptionError> errors;

   @Path("CompletedNumbers/TelephoneNumber")
   private List<String> completedNumbers;

   public List<TnLineOptionError> getErrors()
   {
      return errors;
   }

   @Override
   public Integer getAccountId()
   {
      return null;
   }

   @Override
   public OrderType getOrderType()
   {
      return null;
   }

   public void setErrors(List<TnLineOptionError> errors)
   {
      this.errors = errors;
   }

   public List<String> getCompletedNumbers()
   {
      return completedNumbers;
   }

   public void setCompletedNumbers(List<String> completedNumbers)
   {
      this.completedNumbers = completedNumbers;
   }
}
