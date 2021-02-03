package com.inetwork.web.data.shared.dto.orders.orderdetail.portorder;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

public class PortinLosingCarrierResponse
{
   public interface Reader extends XmlReader<PortinLosingCarrierResponse>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);

   @Path("LosingCarrier")
   private PortinLosingCarrierInfo portinLosingCarrierInfo;

   public PortinLosingCarrierInfo getPortinLosingCarrierInfo()
   {
      return portinLosingCarrierInfo;
   }

   public void setPortinLosingCarrierInfo(PortinLosingCarrierInfo portinLosingCarrierInfo)
   {
      this.portinLosingCarrierInfo = portinLosingCarrierInfo;
   }
}
