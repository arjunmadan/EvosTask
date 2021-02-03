package com.inetwork.web.data.dto.imports.sipcredentials;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.inetwork.web.data.shared.dto.Error;

@XmlRootElement(name = "ImportErrorSipCredential")
@XmlType(name = "ImportErrorSipCredential")
@XmlAccessorType(XmlAccessType.NONE)
public class ImportErrorSipCredential implements Error, Serializable
{
   @XmlElement(name = "Code")
   private Integer code;
   @XmlElement(name = "Description")
   private String description;
   @XmlElement(name = "ImportSipCredential")
   private ImportSipCredential importSipCredential;

   public ImportErrorSipCredential()
   {
   }

   public ImportErrorSipCredential(ImportSipCredential importSipCredential, Integer code, String description)
   {
      this.code = code;
      this.description = description;
      this.importSipCredential = importSipCredential;
   }

   @Override
   public Integer getCode()
   {
      return code;
   }

   @Override
   public void setCode(Integer code)
   {
      this.code = code;
   }

   @Override
   public String getDescription()
   {
      return description;
   }

   @Override
   public void setDescription(String description)
   {
      this.description = description;
   }
}