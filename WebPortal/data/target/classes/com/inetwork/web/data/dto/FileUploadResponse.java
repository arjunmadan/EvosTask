package com.inetwork.web.data.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "fileUploadResponse")
@XmlType(name = "fileUploadResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class FileUploadResponse
{
   @XmlElement(name = "resultCode")
   private int resultCode;
   @XmlElement(name = "resultMessage")
   private String resultMessage;
   @XmlElement(name = "filename")
   private String filename;


   public int getResultCode() {
      return resultCode;
   }

   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   public String getResultMessage() {
      return resultMessage;
   }

   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   public String getFilename() {
      return filename;
   }

   public void setFilename(String filename) {
      this.filename = filename;
   }
}
