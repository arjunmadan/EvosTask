package com.inetwork.web.data.dto.managequeues;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "SummaryResponse")
@XmlType(name = "SummaryResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class SummaryResponse
{

   @XmlElement(name = "Admin")
   private String adminName;

   @XmlElement(name = "Exception")
   private StatusSummary exception;

   @XmlElement(name = "PendingDocuments")
   private StatusSummary pendingDocuments;

   @XmlElement(name = "Submitted")
   private StatusSummary submitted;

   @XmlElement(name = "RequestedSupp")
   private StatusSummary requestedSupp;

   @XmlElement(name = "RequestedCancel")
   private StatusSummary requestedCancel;

   public String getAdminName()
   {
      return adminName;
   }

   public void setAdminName(String adminName)
   {
      this.adminName = adminName;
   }

   public StatusSummary getException()
   {
      return exception;
   }

   public void setException(StatusSummary exception)
   {
      this.exception = exception;
   }

   public StatusSummary getPendingDocuments()
   {
      return pendingDocuments;
   }

   public void setPendingDocuments(StatusSummary pendingDocuments)
   {
      this.pendingDocuments = pendingDocuments;
   }

   public StatusSummary getSubmitted()
   {
      return submitted;
   }

   public void setSubmitted(StatusSummary submitted)
   {
      this.submitted = submitted;
   }

   public StatusSummary getRequestedSupp()
   {
      return requestedSupp;
   }

   public void setRequestedSupp(StatusSummary requestedSupp)
   {
      this.requestedSupp = requestedSupp;
   }

   public StatusSummary getRequestedCancel()
   {
      return requestedCancel;
   }

   public void setRequestedCancel(StatusSummary requestedCancel)
   {
      this.requestedCancel = requestedCancel;
   }
}
