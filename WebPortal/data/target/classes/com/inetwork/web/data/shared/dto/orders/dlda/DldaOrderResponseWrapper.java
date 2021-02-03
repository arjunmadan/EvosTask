package com.inetwork.web.data.shared.dto.orders.dlda;

import com.google.gwt.core.client.GWT;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class DldaOrderResponseWrapper
{
   public interface Reader extends XmlReader<DldaOrderResponseWrapper>
   {
   }

   public interface Writer extends XmlWriter<DldaOrderResponseWrapper>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("NewDldaOrderResponse")
   private DldaOrderResponse newDldaOrderResponse;

   @Path("RemoveDldaOrderResponse")
   private DldaOrderResponse removeDldaOrderResponse;

   @Path("FailedDldaOrderResponse")
   private DldaOrderResponse failedDldaOrderResponse;

   public DldaOrderResponse getNewDldaOrderResponse() {
      return newDldaOrderResponse;
   }

   public void setNewDldaOrderResponse(
           DldaOrderResponse newDldaOrderResponse) {
      this.newDldaOrderResponse = newDldaOrderResponse;
   }

   public DldaOrderResponse getRemoveDldaOrderResponse() {
      return removeDldaOrderResponse;
   }

   public void setRemoveDldaOrderResponse(
           DldaOrderResponse removeDldaOrderResponse) {
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
