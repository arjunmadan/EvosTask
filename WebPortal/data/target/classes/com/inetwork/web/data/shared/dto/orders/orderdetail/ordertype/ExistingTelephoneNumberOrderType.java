package com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype;

import com.google.gwt.core.client.GWT;
import java.util.List;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class ExistingTelephoneNumberOrderType extends BaseOrderType
{

   @Override
   public String getOrderType()
   {
      return "Existing Telephone Number";
   }

   @Override
   public String getSearchFilterValues()
   {
      return "";
   }

   public interface Reader extends XmlReader<ExistingTelephoneNumberOrderType>
   {
   }

   public interface Writer extends XmlWriter<ExistingTelephoneNumberOrderType>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   public ExistingTelephoneNumberOrderType()
   {

   }

   public ExistingTelephoneNumberOrderType(List<String> telephoneNumbers)
   {
      this.telephoneNumbers = telephoneNumbers;
   }

   @Path("TelephoneNumberList/TelephoneNumber")
   private List<String> telephoneNumbers;

   @Path("ReservationIdList/ReservationId")
   private List<String> reservationIds;

   public List<String> getTelephoneNumbers()
   {
      return telephoneNumbers;
   }

   public void setTelephoneNumbers(List<String> telephoneNumbers)
   {
      this.telephoneNumbers = telephoneNumbers;
   }

   public List<String> getReservationIds()
   {
      return reservationIds;
   }

   public void setReservationIds(List<String> reservationIds)
   {
      this.reservationIds = reservationIds;
   }
}
