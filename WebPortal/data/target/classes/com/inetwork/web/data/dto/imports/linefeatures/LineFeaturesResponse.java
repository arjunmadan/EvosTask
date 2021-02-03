package com.inetwork.web.data.dto.imports.linefeatures;

import com.inetwork.common.dto.lidb.order.LidbOrderResponse;
import com.inetwork.common.dto.tnoption.TnOptionOrderResponse;
import com.inetwork.web.data.dto.imports.linefeatures.dlda.DldaOrderResponsesWrapper;
import com.inetwork.web.data.dto.imports.linefeatures.e911.E911OrderResponsesWrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "LineFeaturesResponse")
@XmlType(name = "LineFeaturesResponse")
@XmlAccessorType(XmlAccessType.NONE)
public class LineFeaturesResponse
{
   @XmlElement(name = "TnOptionOrderResponse")
   private TnOptionOrderResponse tnOptionOrderResponse;
   @XmlElement(name = "LidbOrderResponse")
   private LidbOrderResponse lidbOrderResponse;
   @XmlElement(name = "DldaOrderResponsesWrapper")
   private DldaOrderResponsesWrapper dldaOrderResponsesWrapper;
   @XmlElement(name = "E911OrderResponsesWrapper")
   private E911OrderResponsesWrapper e911OrderResponsesWrapper;
   @XmlElement(name = "FileFormatError")
   private String fileFormatErrorMessage;

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

   public E911OrderResponsesWrapper getE911OrderResponsesWrapper()
   {
      return e911OrderResponsesWrapper;
   }

   public void setE911OrderResponsesWrapper(E911OrderResponsesWrapper e911OrderResponsesWrapper)
   {
      this.e911OrderResponsesWrapper = e911OrderResponsesWrapper;
   }

   public DldaOrderResponsesWrapper getDldaOrderResponsesWrapper() {
      return dldaOrderResponsesWrapper;
   }

   public void setDldaOrderResponsesWrapper(DldaOrderResponsesWrapper dldaOrderResponsesWrapper) {
      this.dldaOrderResponsesWrapper = dldaOrderResponsesWrapper;
   }
}
