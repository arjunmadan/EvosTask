package com.inetwork.web.data.dto.imports.sipcredentials;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ImportSipCredentialsResponse")
@XmlType(name = "ImportSipCredentialsResponse")
@XmlAccessorType(XmlAccessType.NONE)
public class ImportSipCredentialsResponse implements Serializable
{
   private static final long serialVersionUID = -2291359759983439897L;

   @XmlElementWrapper(name = "Imported")
   @XmlElement(name = "ImportSipCredential")
   private List<ImportSipCredential> importedSipCredentials;

   @XmlElementWrapper(name = "Errors")
   @XmlElement(name = "Error")
   private List<ImportErrorSipCredential> importErrorSipCredentials;

   @XmlElement(name = "FileError")
   private String fileErrorMessage;

   public String getFileErrorMessage()
   {
      return fileErrorMessage;
   }

   public void setFileErrorMessage(String fileErrorMessage)
   {
      this.fileErrorMessage = fileErrorMessage;
   }

   public List<ImportSipCredential> getImportedSipCredentials()
   {
      return importedSipCredentials;
   }

   public void setImportedSipCredentials(List<ImportSipCredential> importedSipCredentials)
   {
      this.importedSipCredentials = importedSipCredentials;
   }

   public List<ImportErrorSipCredential> getImportErrorSipCredentials()
   {
      return importErrorSipCredentials;
   }

   public void setImportErrorSipCredentials(List<ImportErrorSipCredential> importErrorSipCredentials)
   {
      this.importErrorSipCredentials = importErrorSipCredentials;
   }

   public void addError(ImportSipCredential importSipCredential, Integer code, String description)
   {
      if (importErrorSipCredentials == null)
      {
         importErrorSipCredentials = new ArrayList<>();
      }
      importErrorSipCredentials.add(new ImportErrorSipCredential(importSipCredential, code, description));
   }

   public void addImportedSipCredential(ImportSipCredential importSipCredential)
   {
      if (importedSipCredentials == null)
      {
         importedSipCredentials = new ArrayList<>();
      }
      importedSipCredentials.add(importSipCredential);
   }
}