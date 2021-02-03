package com.inetwork.web.data.shared.dto.orders.orderdetail.orderdocuments;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import java.util.List;

public class OrderDocuments
{

   public interface Reader extends XmlReader<OrderDocuments>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);

   @Path("fileCount")
   private Integer fileCount;

   @Path("fileNames")
   private List<String> fileNames;

   @Path("fileData")
   private List<FileData> files;

   @Path("resultCode")
   private Integer resultCode;

   @Path("resultMessage")
   private String resultMessage;

   public Integer getFileCount()
   {
      return fileCount;
   }

   public void setFileCount(Integer fileCount)
   {
      this.fileCount = fileCount;
   }

   public Integer getResultCode()
   {
      return resultCode;
   }

   public void setResultCode(Integer resultCode)
   {
      this.resultCode = resultCode;
   }

   public String getResultMessage()
   {
      return resultMessage;
   }

   public void setResultMessage(String resultMessage)
   {
      this.resultMessage = resultMessage;
   }

   public List<String> getFileNames()
   {
      return fileNames;
   }

   public void setFileNames(List<String> fileNames)
   {
      this.fileNames = fileNames;
   }

   public List<FileData> getFiles()
   {
      return files;
   }

   public void setFiles(List<FileData> files)
   {
      this.files = files;
   }
}
