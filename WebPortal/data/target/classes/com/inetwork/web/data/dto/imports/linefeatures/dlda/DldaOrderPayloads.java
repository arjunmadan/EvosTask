package com.inetwork.web.data.dto.imports.linefeatures.dlda;

import com.inetwork.common.dto.dlda.order.DldaOrderPayload;
import com.inetwork.common.dto.dlda.order.DldaOrderResponse;

public class DldaOrderPayloads
{
   private DldaOrderPayload newDldaOrdersPayload;
   private DldaOrderPayload removeDldaOrdersPayload;
   private DldaOrderResponse failedDldaOrdersResponse;

   public DldaOrderPayload getNewDldaOrdersPayload() {
      return newDldaOrdersPayload;
   }

   public void setNewDldaOrdersPayload(
           DldaOrderPayload newDldaOrdersPayload) {
      this.newDldaOrdersPayload = newDldaOrdersPayload;
   }

   public DldaOrderPayload getRemoveDldaOrdersPayload() {
      return removeDldaOrdersPayload;
   }

   public void setRemoveDldaOrdersPayload(
           DldaOrderPayload removeDldaOrdersPayload) {
      this.removeDldaOrdersPayload = removeDldaOrdersPayload;
   }

   public DldaOrderResponse getFailedDldaOrdersResponse() {
      return failedDldaOrdersResponse;
   }

   public void setFailedDldaOrdersResponse(
           DldaOrderResponse failedDldaOrdersResponse) {
      this.failedDldaOrdersResponse = failedDldaOrdersResponse;
   }

   public boolean hasNewOrder() {
      return newDldaOrdersPayload != null;
   }

   public boolean hasRemoveOrder() {
      return removeDldaOrdersPayload != null;
   }

   public boolean hasFailedOrder() {
      return failedDldaOrdersResponse != null;
   }
}
