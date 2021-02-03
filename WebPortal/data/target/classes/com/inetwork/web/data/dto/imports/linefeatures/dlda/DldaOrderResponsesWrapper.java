package com.inetwork.web.data.dto.imports.linefeatures.dlda;

import com.inetwork.common.dto.dlda.order.DldaOrderResponse;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DldaOrderResponsesWrapper")
@XmlType(name = "DldaOrderResponsesWrapper")
@XmlAccessorType(XmlAccessType.NONE)
public class DldaOrderResponsesWrapper implements Serializable {
   private static final long serialVersionUID = -8347959490608091319L;

   @XmlElement(name = "NewDldaOrderResponse")
   private DldaOrderResponse newDldaOrderResponse;

   @XmlElement(name = "RemoveDldaOrderResponse")
   private DldaOrderResponse removeDldaOrderResponse;

   @XmlElement(name = "FailedDldaOrderResponse")
   private DldaOrderResponse failedDldaOrderResponse;

   public DldaOrderResponse getNewDldaOrderResponse() {
      return newDldaOrderResponse;
   }

   public void setNewDldaOrderResponse(DldaOrderResponse newDldaOrderResponse) {
      this.newDldaOrderResponse = newDldaOrderResponse;
   }

   public DldaOrderResponse getRemoveDldaOrderResponse() {
      return removeDldaOrderResponse;
   }

   public void setRemoveDldaOrderResponse(DldaOrderResponse removeDldaOrderResponse) {
      this.removeDldaOrderResponse = removeDldaOrderResponse;
   }

   public DldaOrderResponse getFailedDldaOrderResponse() {
      return failedDldaOrderResponse;
   }

   public void setFailedDldaOrderResponse(
           DldaOrderResponse failedDldaOrderResponse) {
      this.failedDldaOrderResponse = failedDldaOrderResponse;
   }
}
