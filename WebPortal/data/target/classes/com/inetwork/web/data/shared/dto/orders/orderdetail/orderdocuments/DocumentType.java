package com.inetwork.web.data.shared.dto.orders.orderdetail.orderdocuments;

import java.util.ArrayList;
import java.util.List;

public enum DocumentType
{

   LOA,
   INVOICE,
   CSR,
   OTHER;

   public static List<String> getNames()
   {
      List<String> documentTypes = new ArrayList<String>(values().length);
      for (DocumentType dt : values())
      {
         documentTypes.add(dt.name());
      }
      return documentTypes;
   }

}
