package com.inetwork.web.data.shared.dto.lineoption;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.orders.dlda.DldaOrderResponseWrapper;
import com.inetwork.web.data.shared.dto.orders.e911.E911OrderResponseWrapper;
import com.inetwork.web.data.shared.dto.orders.lidb.LidbOrderResponse;
import com.inetwork.web.data.shared.dto.orders.tnoption.TnOptionOrderResponse;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class LineFeaturesResponse
{
   public interface Reader extends XmlReader<LineFeaturesResponse>
   {
   }

   public interface Writer extends XmlWriter<LineFeaturesResponse>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("FileFormatError")
   private String fileFormatErrorMessage;
   @Path("TnOptionOrderResponse")
   private TnOptionOrderResponse tnOptionOrderResponse;
   @Path("DldaOrderResponsesWrapper")
   private DldaOrderResponseWrapper dldaOrderResponseWrapper;
   @Path("LidbOrderResponse")
   private LidbOrderResponse lidbOrderResponse;
   @Path("E911OrderResponsesWrapper/E911OrderResponseWrapper")
   private List<E911OrderResponseWrapper> e911OrderResponseWrappers;

   public LidbOrderResponse getLidbOrderResponse()
   {
      return lidbOrderResponse;
   }

   public void setLidbOrderResponse(LidbOrderResponse lidbOrderResponse)
   {
      this.lidbOrderResponse = lidbOrderResponse;
   }

   public TnOptionOrderResponse getTnOptionOrderResponse()
   {
      return tnOptionOrderResponse;
   }

   public void setTnOptionOrderResponse(TnOptionOrderResponse tnOptionOrderResponse)
   {
      this.tnOptionOrderResponse = tnOptionOrderResponse;
   }

   public String getFileFormatErrorMessage()
   {
      return fileFormatErrorMessage;
   }

   public void setFileFormatErrorMessage(String fileFormatErrorMessage)
   {
      this.fileFormatErrorMessage = fileFormatErrorMessage;
   }

   public List<E911OrderResponseWrapper> getE911OrderResponseWrappers()
   {
      return e911OrderResponseWrappers;
   }

   public void setE911OrderResponseWrappers(List<E911OrderResponseWrapper> e911OrderResponseWrappers)
   {
      this.e911OrderResponseWrappers = e911OrderResponseWrappers;
   }

   public DldaOrderResponseWrapper getDldaOrderResponseWrapper() {
      return dldaOrderResponseWrapper;
   }

   public void setDldaOrderResponseWrapper(
           DldaOrderResponseWrapper dldaOrderResponseWrapper) {
      this.dldaOrderResponseWrapper = dldaOrderResponseWrapper;
   }
}
