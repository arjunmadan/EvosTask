package com.inetwork.web.data.shared.dto.orders.lidb;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.AbstractIrisResponse;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class LidbOrderResponse extends AbstractIrisResponse<LidbOrderPayload>
{

   public interface Reader extends XmlReader<LidbOrderResponse>
   {
   }

   public interface Writer extends XmlWriter<LidbOrderResponse>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("LidbOrder")
   private LidbOrderPayload lidbOrderPayload;

   public LidbOrderPayload getPayload()
   {
      return lidbOrderPayload;
   }

   public LidbOrderPayload getLidbOrderPayload()
   {
      return lidbOrderPayload;
   }


   public void setLidbOrderPayload(LidbOrderPayload lidbOrderPayload)
   {
      this.lidbOrderPayload = lidbOrderPayload;
   }

}
