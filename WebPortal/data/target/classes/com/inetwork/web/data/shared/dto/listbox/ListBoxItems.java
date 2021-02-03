package com.inetwork.web.data.shared.dto.listbox;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.google.gwt.user.client.rpc.IsSerializable;

@XmlRootElement(name = "ListBoxItems")
@XmlType(name = "ListBoxItems")
@XmlAccessorType(XmlAccessType.NONE)
public class ListBoxItems implements IsSerializable
{

   @XmlElement(name = "ListBoxItem")
   private ArrayList<ListBoxItem> listBoxItems;

   public ListBoxItems()
   {
   }

   public ArrayList<ListBoxItem> getListBoxItems()
   {
      return listBoxItems;
   }

   public void setListBoxItems(ArrayList<ListBoxItem> listBoxItems)
   {
      this.listBoxItems = listBoxItems;
   }
}
