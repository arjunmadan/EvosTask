package com.inetwork.web.data.dto.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.inetwork.common.dto.legacyhistory.pagination.PaginationLinks;
import com.inetwork.common.dto.history.telephonenumber.TelephoneNumbersHistory;

@XmlRootElement(name = "TelephoneNumbersResponse")
@XmlType(name = "TelephoneNumbersResponse", propOrder =
{
      "telephoneNumberCount", "paginationLinks", "payload"
})
@XmlAccessorType(XmlAccessType.NONE)
public class TelephoneNumbersResponse
{

   private TelephoneNumbersHistory payload;

   private PaginationLinks paginationLinks;

   private Integer telephoneNumberCount;

   @XmlElement(name = "TelephoneNumberCount")
   public Integer getTelephoneNumberCount()
   {
      return telephoneNumberCount;
   }

   @XmlElement(name = "TelephoneNumbers")
   public TelephoneNumbersHistory getPayload()
   {
      return this.payload;
   }

   @XmlElement(name = "Links")
   public PaginationLinks getPaginationLinks()
   {
      return paginationLinks;
   }

   public void setPaginationLinks(PaginationLinks paginationLinks)
   {
      this.paginationLinks = paginationLinks;
   }

   public void setTelephoneNumberCount(Integer telephoneNumberCount)
   {
      this.telephoneNumberCount = telephoneNumberCount;
   }

   public void setPayload(TelephoneNumbersHistory payload)
   {
      this.payload = payload;
   }

}
