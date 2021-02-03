package com.inetwork.web.data.shared.dto.orders.orderdetail.orderdocuments;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

public class FileMetaData
{

   public interface Reader extends XmlReader<FileMetaData>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);

   @Path("DocumentName")
   private String documentName;
   @Path("DocumentType")
   private String documentType;

   public String getDocumentName()
   {
      return documentName;
   }

   public void setDocumentName(String documentName)
   {
      this.documentName = documentName;
   }

   public String getDocumentType()
   {
      return documentType;
   }

   public void setDocumentType(String documentType)
   {
      this.documentType = documentType;
   }
}
