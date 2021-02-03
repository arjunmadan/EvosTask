package com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import static com.inetwork.web.data.shared.utils.StringUtils.isNotEmpty;

public class CombinedSearchAndOrderType extends LcaSearchOrderType
{

   public interface Reader extends XmlReader<CombinedSearchAndOrderType>
   {
   }

   public interface Writer extends XmlWriter<CombinedSearchAndOrderType>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("AreaCode")
   private String npa;
   @Path("NpaNxx")
   private String npaNxx;
   @Path("NpaNxxX")
   private String npaNxxBlock;
   @Path("RateCenter")
   private String rateCenterAbbreviation;
   @Path("LATA")
   private String lata;
   @Path("City")
   private String city;
   @Path("State")
   private String state;
   @Path("Zip")
   private String zip;
   @Path("LocalVanity")
   private String localVanity;
   @Path("EndsIn")
   private Boolean endsIn;

   private String delimiter;

   @Override
   public String getOrderType()
   {
      return "Combined Search";
   }

   @Override
   public String getSearchFilterValues()
   {
      StringBuilder sb = new StringBuilder();
      delimiter = "";
      append(sb, "Area code (NPA) = ", npa);
      append(sb, "NPA-NXX = ", npaNxx);
      append(sb, "NPA-NXX-X = ", npaNxxBlock);
      append(sb, "State = ", state);
      append(sb, "City = ", city);
      append(sb, "Rate Center = ", rateCenterAbbreviation);
      append(sb, "LATA = ", lata);
      append(sb, "Zip Code = ", zip);
      append(sb, (endsIn != null ? (endsIn ? "Ends with l" : "L") : "L") + "ocal vanity = ", localVanity);
      sb.append(super.getSearchFilterValues());
      return sb.toString();
   }

   private void append(StringBuilder sb, String key, String value)
   {
      if (isNotEmpty(value))
      {
         sb.append(delimiter)
               .append(key)
               .append(value);
         delimiter = ", ";
      }
   }

   public String getNpa()
   {
      return npa;
   }

   public void setNpa(String npa)
   {
      this.npa = npa;
   }

   public String getNpaNxx()
   {
      return npaNxx;
   }

   public void setNpaNxx(String npaNxx)
   {
      this.npaNxx = npaNxx;
   }

   public String getNpaNxxBlock()
   {
      return npaNxxBlock;
   }

   public void setNpaNxxBlock(String npaNxxBlock)
   {
      this.npaNxxBlock = npaNxxBlock;
   }

   public String getRateCenterAbbreviation()
   {
      return rateCenterAbbreviation;
   }

   public void setRateCenterAbbreviation(String rateCenterAbbreviation)
   {
      this.rateCenterAbbreviation = rateCenterAbbreviation;
   }

   public String getLata()
   {
      return lata;
   }

   public void setLata(String lata)
   {
      this.lata = lata;
   }

   public String getCity()
   {
      return city;
   }

   public void setCity(String city)
   {
      this.city = city;
   }

   public String getState()
   {
      return state;
   }

   public void setState(String state)
   {
      this.state = state;
   }

   public String getZip()
   {
      return zip;
   }

   public void setZip(String zip)
   {
      this.zip = zip;
   }

   public String getLocalVanity()
   {
      return localVanity;
   }

   public void setLocalVanity(String localVanity)
   {
      this.localVanity = localVanity;
   }

   public Boolean getEndsIn()
   {
      return endsIn;
   }

   public void setEndsIn(Boolean endsIn)
   {
      this.endsIn = endsIn;
   }

}
