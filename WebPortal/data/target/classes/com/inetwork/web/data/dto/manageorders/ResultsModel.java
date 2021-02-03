package com.inetwork.web.data.dto.manageorders;

import com.inetwork.web.data.dto.ResponseStatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name = "ManageOrdersResult")
@XmlType(name = "ManageOrdersResult")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResultsModel
{
   @XmlElementWrapper(name = "ResultsModel")
   @XmlElement(name = "ResultModel")
   private List<ResultModel> resultModel;
   @XmlElement(name = "FilterOrderResults")
   private FilterOrderResults filterOrderResults;
   @XmlElement(name = "ResponseStatus")
   private ResponseStatus responseStatus;
   @XmlElement(name = "TotalCount")
   private int totalCount = 0;

   public int getTotalCount()
   {
      return totalCount;
   }

   public void setTotalCount(int totalCount)
   {
      this.totalCount = totalCount;
   }

   public ResponseStatus getResponseStatus()
   {
      return responseStatus;
   }

   public void setResponseStatus(ResponseStatus responseStatus)
   {
      this.responseStatus = responseStatus;
   }

   public List<ResultModel> getResultModel()
   {
      return resultModel;
   }

   public void setResultModel(List<ResultModel> resultModel)
   {
      this.resultModel = resultModel;
   }

   public FilterOrderResults getFilterOrderResults()
   {
      return filterOrderResults;
   }

   public void setFilterOrderResults(FilterOrderResults filterOrderResults)
   {
      this.filterOrderResults = filterOrderResults;
   }
}
