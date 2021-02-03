package com.inetwork.web.data.dto.imports.linefeatures.e911;

import java.util.List;

import com.google.common.collect.Lists;
import com.inetwork.common.dto.e911.order.E911OrderPayload;

public class E911OrderPayloads
{
   private final List<E911OrderPayload> validE911OrdersPayloads;
   private final List<E911OrderResponseWrapper> failedE911OrderResponses;

   public E911OrderPayloads()
   {
      validE911OrdersPayloads = Lists.newArrayList();
      failedE911OrderResponses = Lists.newArrayList();
   }

   public boolean addValidE911OrderPayload(E911OrderPayload payload)
   {
      return payload != null && validE911OrdersPayloads.add(payload);
   }

   public boolean addFailedE911OrderResponse(E911OrderResponseWrapper response)
   {
      return response != null && failedE911OrderResponses.add(response);
   }

   public boolean isNotEmpty()
   {
      return !validE911OrdersPayloads.isEmpty() || !failedE911OrderResponses.isEmpty();
   }

   public List<E911OrderPayload> getValidE911OrdersPayloads()
   {
      return Lists.newArrayList(validE911OrdersPayloads);
   }

   public List<E911OrderResponseWrapper> getFailedE911OrderResponses()
   {
      return Lists.newArrayList(failedE911OrderResponses);
   }
}
