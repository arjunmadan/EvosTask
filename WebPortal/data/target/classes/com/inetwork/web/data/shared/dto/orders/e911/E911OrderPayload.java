package com.inetwork.web.data.shared.dto.orders.e911;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.OrderType;
import com.inetwork.web.data.shared.dto.AbstractFeatureOrder;
import com.inetwork.web.data.shared.dto.AdditionalAddressGroupError;
import com.inetwork.web.data.shared.dto.E911AlternateEndUserIdentifierGroupError;
import com.inetwork.web.data.shared.dto.TelephoneNumberGroupError;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class E911OrderPayload extends AbstractFeatureOrder<TelephoneNumberGroupError>
{
   public static final String ROOT_ELEMENT = "E911Order";

   @Override
   public OrderType getOrderType()
   {
      return OrderType.E911;
   }

   public interface Reader extends XmlReader<E911OrderPayload>
   {
   }

   public interface Writer extends XmlWriter<E911OrderPayload>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("TelephoneNumbers/TelephoneNumber")
   private List<String> telephoneNumbers;
   @Path("CallerName")
   private String callerName;
   @Path("Address")
   private E911Address address;
   @Path("DeleteTNSpecificE911Address")
   private Boolean deleteTnSpecificE911Address;
   @Path("AlternateEndUserIdentifiers/AlternateEndUserIdentifier")
   private List<E911AlternateEndUserIdentifier> alternateEndUserIdentifiers;
   @Path("AdditionalAddresses/Address")
   private List<E911Address> e911AdditionalAddresses;
   @Path("ErrorList/E911AddressError")
   private List<AdditionalAddressGroupError> additionalAddressGroupErrors;
   @Path("ErrorList/AEUIError")
   private List<E911AlternateEndUserIdentifierGroupError> alternateEndUserIdentifierGroupErrors;

   public String getCallerName()
   {
      return callerName;
   }

   public void setCallerName(String callerName)
   {
      this.callerName = callerName;
   }

   public E911Address getAddress()
   {
      return address;
   }

   public void setAddress(E911Address address)
   {
      this.address = address;
   }

   public Boolean getDeleteTnSpecificE911Address()
   {
      return deleteTnSpecificE911Address;
   }

   public void setDeleteTnSpecificE911Address(Boolean deleteTnSpecificE911Address)
   {
      this.deleteTnSpecificE911Address = deleteTnSpecificE911Address;
   }

   public List<String> getTelephoneNumbers()
   {
      return telephoneNumbers;
   }

   public void setTelephoneNumbers(List<String> telephoneNumbers)
   {
      this.telephoneNumbers = telephoneNumbers;
   }

   public List<E911AlternateEndUserIdentifier> getAlternateEndUserIdentifiers()
   {
      return alternateEndUserIdentifiers;
   }

   public void setAlternateEndUserIdentifiers(List<E911AlternateEndUserIdentifier> alternateEndUserIdentifiers)
   {
      this.alternateEndUserIdentifiers = alternateEndUserIdentifiers;
   }

   public List<E911AlternateEndUserIdentifierGroupError> getAlternateEndUserIdentifierGroupErrors()
   {
      return alternateEndUserIdentifierGroupErrors;
   }

   public void setAlternateEndUserIdentifierGroupErrors(List<E911AlternateEndUserIdentifierGroupError> alternateEndUserIdentifierGroupErrors)
   {
      this.alternateEndUserIdentifierGroupErrors = alternateEndUserIdentifierGroupErrors;
   }

   public List<E911Address> getE911AdditionalAddresses()
   {
      return e911AdditionalAddresses;
   }

   public void setE911AdditionalAddresses(List<E911Address> e911AdditionalAddresses)
   {
      this.e911AdditionalAddresses = e911AdditionalAddresses;
   }

   public List<AdditionalAddressGroupError> getAdditionalAddressGroupErrors()
   {
      return additionalAddressGroupErrors;
   }

   public void setAdditionalAddressGroupErrors(List<AdditionalAddressGroupError> additionalAddressGroupErrors)
   {
      this.additionalAddressGroupErrors = additionalAddressGroupErrors;
   }
}
