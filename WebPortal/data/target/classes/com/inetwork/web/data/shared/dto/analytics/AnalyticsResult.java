package com.inetwork.web.data.shared.dto.analytics;

import com.google.gwt.core.client.GWT;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class AnalyticsResult
{
   public static final String ROOT_ELEMENT = "AnalyticsResult";

   public interface Reader extends XmlReader<AnalyticsResult>
   {
   }

   public interface Writer extends XmlWriter<AnalyticsResult>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path(TelephoneNumbersAssignmentData.ROOT_ELEMENT)
   private TelephoneNumbersAssignmentData telephoneNumbersAssignmentData;

   public TelephoneNumbersAssignmentData getTelephoneNumbersAssignmentData()
   {
      return telephoneNumbersAssignmentData;
   }

   public void setTelephoneNumbersAssignmentData(TelephoneNumbersAssignmentData telephoneNumbersAssignmentData)
   {
      this.telephoneNumbersAssignmentData = telephoneNumbersAssignmentData;
   }
}
