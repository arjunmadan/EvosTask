package com.inetwork.web.data.shared.dto.orders.orderdetail;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;

public class Features
{
   @Path("Lidb")
   private LidbFeature lidbFeature;
   @Path("E911")
   private E911Feature e911Feature;
   @Path("Dlda")
   private DldaFeature dldaFeature;

   public interface Reader extends XmlReader<Features>
   {
   }

   public interface Writer extends XmlWriter<Features>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   public LidbFeature getLidbFeature()
   {
      return lidbFeature;
   }

   public void setLidbFeature(LidbFeature lidbFeature)
   {
      this.lidbFeature = lidbFeature;
   }

   public E911Feature getE911Feature()
   {
      return e911Feature;
   }

   public void setE911Feature(E911Feature e911Feature)
   {
      this.e911Feature = e911Feature;
   }

   public DldaFeature getDldaFeature()
   {
      return dldaFeature;
   }

   public void setDldaFeature(DldaFeature dldaFeature)
   {
      this.dldaFeature = dldaFeature;
   }
}
