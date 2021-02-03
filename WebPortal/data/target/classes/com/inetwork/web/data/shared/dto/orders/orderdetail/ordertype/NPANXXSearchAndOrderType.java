package com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.utils.StringUtils;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class NPANXXSearchAndOrderType extends LcaSearchOrderType
{

   public interface Reader extends XmlReader<NPANXXSearchAndOrderType>
   {
   }

   public interface Writer extends XmlWriter<NPANXXSearchAndOrderType>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("NpaNxx")
   private String npaNxx;

   public String getNpaNxx()
   {
      return npaNxx;
   }

   public void setNpaNxx(String npaNxx)
   {
      this.npaNxx = npaNxx;
   }

   @Override
   public String getOrderType()
   {
      return getSubType();
   }

   @Override
   public String getSearchFilterValues()
   {
      return getSubType() + " = " + npaNxx + super.getSearchFilterValues();
   }

   private String getSubType()
   {
      if (StringUtils.isNotEmpty(npaNxx) && npaNxx.length() > 6)
      {
         return "NPA-NXX-X";
      }
      return "NPA-NXX";
   }
}
