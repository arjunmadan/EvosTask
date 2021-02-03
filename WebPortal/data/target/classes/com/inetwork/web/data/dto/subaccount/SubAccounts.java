package com.inetwork.web.data.dto.subaccount;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "SubAccountsResponse")
@XmlType(name = "SubAccountsResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class SubAccounts
{

   @XmlElement(name = "TotalCountSeats")
   private Integer totalCountSeats;

   @XmlElement(name = "SubAccountsCount")
   private Integer subAccountsCount;

   @XmlElementWrapper(name = "SubAccounts")
   @XmlElement(name = "SubAccount")
   private List<SubAccount> subAccounts;

   public Integer getTotalCountSeats()
   {
      return totalCountSeats;
   }

   public void setTotalCountSeats(Integer totalCountSeats)
   {
      this.totalCountSeats = totalCountSeats;
   }

   public Integer getSubAccountsCount()
   {
      return subAccountsCount;
   }

   public void setSubAccountsCount(Integer subAccountsCount)
   {
      this.subAccountsCount = subAccountsCount;
   }

   public List<SubAccount> getSubAccounts()
   {
      return subAccounts;
   }

   public void setSubAccounts(List<SubAccount> subAccounts)
   {
      this.subAccounts = subAccounts;
   }
}
