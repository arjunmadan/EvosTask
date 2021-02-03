package com.inetwork.web.data.shared.dto;

import java.io.Serializable;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.orders.e911.E911Address;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class AdditionalAddressGroupError implements Error
{
   public interface Reader extends XmlReader<AdditionalAddressGroupError>, Serializable
   {
   }

   public interface Writer extends XmlWriter<AdditionalAddressGroupError>, Serializable
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("Addresses/Address")
   private List<E911Address> addresses;
   @Path("Code")
   private Integer code;
   @Path("Description")
   private String description;

   public List<E911Address> getAddresses()
   {
      return addresses;
   }

   public void setAddresses(List<E911Address> addresses)
   {
      this.addresses = addresses;
   }

   @Override
   public Integer getCode()
   {
      return code;
   }

   public void setCode(Integer code)
   {
      this.code = code;
   }

   @Override
   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public boolean contains(E911Address address)
   {
      return address != null && addresses.contains(address);
   }
}
