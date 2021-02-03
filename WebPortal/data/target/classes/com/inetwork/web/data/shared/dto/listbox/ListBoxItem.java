package com.inetwork.web.data.shared.dto.listbox;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.google.gwt.user.client.rpc.IsSerializable;

@XmlRootElement(name = "ListBoxItem")
@XmlType(name = "ListBoxItem")
@XmlAccessorType(XmlAccessType.NONE)
public class ListBoxItem implements IsSerializable
{

   public ListBoxItem()
   {
   }

   public ListBoxItem(String item, String value)
   {
      this.item = item;
      this.value = value;
   }

   @XmlAttribute(name = "default")
   private boolean defaultItem;

   @XmlElement(name = "Item")
   private String item;

   @XmlElement(name = "Value")
   private String value;

   public String getItem()
   {
      return item;
   }

   public void setItem(String item)
   {
      this.item = item;
   }

   public String getValue()
   {
      return value;
   }

   public void setValue(String value)
   {
      this.value = value;
   }

   public boolean isDefaultItem()
   {
      return defaultItem;
   }

   public void setDefaultItem(boolean defaultItem)
   {
      this.defaultItem = defaultItem;
   }
}
