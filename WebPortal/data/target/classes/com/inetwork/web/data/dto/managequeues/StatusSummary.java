package com.inetwork.web.data.dto.managequeues;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class StatusSummary
{

   @XmlElement(name = "AccountId")
   private Integer accountId;
   @XmlElement(name = "CompanyName")
   private String companyName;
   @XmlElement(name = "Count")
   private Long count;

   public String getCompanyName()
   {
      return companyName;
   }

   public void setCompanyName(String companyName)
   {
      this.companyName = companyName;
   }

   public Integer getAccountId()
   {
      return accountId;
   }

   public void setAccountId(Integer accountId)
   {
      this.accountId = accountId;
   }

   public Long getCount()
   {
      return count;
   }

   public void setCount(Long count)
   {
      this.count = count;
   }
}
