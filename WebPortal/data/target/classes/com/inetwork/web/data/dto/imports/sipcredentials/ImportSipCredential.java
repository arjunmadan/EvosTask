package com.inetwork.web.data.dto.imports.sipcredentials;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.inetwork.common.dto.admin.sipcredential.ImportSipCredentialsRowHeader;
import com.inetwork.common.dto.admin.sipcredential.SipCredential;
import com.inetwork.common.util.csv.model.CsvHeaderName;

@XmlRootElement(name = "ImportSipCredential")
@XmlType(name = "ImportSipCredential")
@XmlAccessorType(XmlAccessType.NONE)
public class ImportSipCredential extends SipCredential
{
   private static final long serialVersionUID = -1105989452153861691L;

   @XmlElement(name = "Action")
   @CsvHeaderName(ImportSipCredentialsRowHeader.ACTION)
   private String action;

   public ImportSipCredential()
   {
   }

   public ImportSipCredential(SipCredential sipCredential, ImportSipCredentialsAction action)
   {
      setUserName(sipCredential.getUserName());
      setDomain(sipCredential.getDomain());
      setHash1(sipCredential.getHash1());
      setHash1b(sipCredential.getHash1b());
      setAccountId(sipCredential.getAccountId());
      setRealm(sipCredential.getRealm());
      setAction(action.getTemplateValue());
   }

   public String getAction()
   {
      return action;
   }

   public ImportSipCredentialsAction getActionType()
   {
      return ImportSipCredentialsAction.fromTemplateValue(action);
   }

   public void setAction(String action)
   {
      this.action = action;
   }
}