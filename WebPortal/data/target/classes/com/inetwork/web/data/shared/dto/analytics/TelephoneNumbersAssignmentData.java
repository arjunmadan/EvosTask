package com.inetwork.web.data.shared.dto.analytics;

import com.google.gwt.core.client.GWT;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class TelephoneNumbersAssignmentData
{

   public static final String ROOT_ELEMENT = "TelephoneNumbersAssignmentData";

   public interface Reader extends XmlReader<TelephoneNumbersAssignmentData>
   {
   }

   public interface Writer extends XmlWriter<TelephoneNumbersAssignmentData>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TelephoneNumberCount")
   private Integer telephoneNumberCount;
   @Path("UnUtilizedUnKnownNumberCount")
   private Integer unUtilizedUnKnowCount;
   @Path("UnUtilizedAssignedNumberCount")
   private Integer unUtilizedAssignedCount;
   @Path("UnUtilizedUnAssignedNumberCount")
   private Integer unUtilizedUnassignedCount;
   @Path("UtilizedUnKnownNumberCount")
   private Integer utilizedUnKnowCount;
   @Path("UtilizedAssignedNumberCount")
   private Integer utilizedAssignedCount;
   @Path("UtilizedUnAssignedNumberCount")
   private Integer utilizedUnassignedCount;

   public Integer getTelephoneNumberCount()
   {
      return telephoneNumberCount;
   }

   public void setTelephoneNumberCount(Integer telephoneNumberCount)
   {
      this.telephoneNumberCount = telephoneNumberCount;
   }

   public Integer getUnUtilizedUnKnowCount()
   {
      return unUtilizedUnKnowCount;
   }

   public void setUnUtilizedUnKnowCount(Integer unUtilizedUnKnowCount)
   {
      this.unUtilizedUnKnowCount = unUtilizedUnKnowCount;
   }

   public Integer getUnUtilizedAssignedCount()
   {
      return unUtilizedAssignedCount;
   }

   public void setUnUtilizedAssignedCount(Integer unUtilizedAssignedCount)
   {
      this.unUtilizedAssignedCount = unUtilizedAssignedCount;
   }

   public Integer getUnUtilizedUnassignedCount()
   {
      return unUtilizedUnassignedCount;
   }

   public void setUnUtilizedUnassignedCount(Integer unUtilizedUnassignedCount)
   {
      this.unUtilizedUnassignedCount = unUtilizedUnassignedCount;
   }

   public Integer getUtilizedUnKnowCount()
   {
      return utilizedUnKnowCount;
   }

   public void setUtilizedUnKnowCount(Integer utilizedUnKnowCount)
   {
      this.utilizedUnKnowCount = utilizedUnKnowCount;
   }

   public Integer getUtilizedAssignedCount()
   {
      return utilizedAssignedCount;
   }

   public void setUtilizedAssignedCount(Integer utilizedAssignedCount)
   {
      this.utilizedAssignedCount = utilizedAssignedCount;
   }

   public Integer getUtilizedUnassignedCount()
   {
      return utilizedUnassignedCount;
   }

   public void setUtilizedUnassignedCount(Integer utilizedUnassignedCount)
   {
      this.utilizedUnassignedCount = utilizedUnassignedCount;
   }
}
