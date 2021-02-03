package com.inetwork.web.data.shared.dto.orders.orderdetail.orderdocuments;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

public class FileData
{

   public interface Reader extends XmlReader<FileData>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);

   @Path("FileName")
   private String fileName;
   @Path("FileMetaData")
   private FileMetaData fileMetaData;

   public String getFileName()
   {
      return fileName;
   }

   public void setFileName(String fileName)
   {
      this.fileName = fileName;
   }

   public FileMetaData getFileMetaData()
   {
      return fileMetaData;
   }

   public void setFileMetaData(FileMetaData fileMetaData)
   {
      this.fileMetaData = fileMetaData;
   }
}
