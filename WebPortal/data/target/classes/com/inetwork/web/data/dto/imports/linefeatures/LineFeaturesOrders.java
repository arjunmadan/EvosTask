package com.inetwork.web.data.dto.imports.linefeatures;

import com.inetwork.common.dto.lidb.order.LidbOrderPayload;
import com.inetwork.common.dto.tnoption.TnOptionOrderPayload;
import com.inetwork.web.data.dto.imports.linefeatures.dlda.DldaOrderPayloads;
import com.inetwork.web.data.dto.imports.linefeatures.e911.E911OrderPayloads;

public class LineFeaturesOrders
{
   private TnOptionOrderPayload tnOptionOrderPayload;
   private LidbOrderPayload lidbOrderPayload;
   private DldaOrderPayloads dldaOrderPayloads;
   private E911OrderPayloads e911OrderPayloads;

   public LidbOrderPayload getLidbOrderPayload()
   {
      return lidbOrderPayload;
   }

   public void setLidbOrderPayload(LidbOrderPayload lidbOrderPayload)
   {
      this.lidbOrderPayload = lidbOrderPayload;
   }

   public E911OrderPayloads getE911OrderPayloads()
   {
      return e911OrderPayloads;
   }

   public void setE911OrderPayloads(E911OrderPayloads e911OrderPayloads)
   {
      this.e911OrderPayloads = e911OrderPayloads;
   }

   public TnOptionOrderPayload getTnOptionOrderPayload()
   {
      return tnOptionOrderPayload;
   }

   public void setTnOptionOrderPayload(TnOptionOrderPayload tnOptionOrderPayload)
   {
      this.tnOptionOrderPayload = tnOptionOrderPayload;
   }

   public DldaOrderPayloads getDldaOrderPayloads() {
      return dldaOrderPayloads;
   }

   public void setDldaOrderPayloads(DldaOrderPayloads dldaOrderPayloads) {
      this.dldaOrderPayloads = dldaOrderPayloads;
   }
}
