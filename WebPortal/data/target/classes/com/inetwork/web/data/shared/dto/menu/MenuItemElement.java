package com.inetwork.web.data.shared.dto.menu;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.google.gwt.user.client.rpc.IsSerializable;

@XmlRootElement(name = "MenuItem")
@XmlType(name = "MenuItem")
@XmlAccessorType(XmlAccessType.NONE)
public class MenuItemElement implements IsSerializable
{

   @XmlElement(name = "Label")
   private String label;

   @XmlElement(name = "href")
   private String href;

   @XmlElementWrapper(name = "MenuItems")
   @XmlElement(name = "MenuItem")
   private ArrayList<MenuItemElement> menuItemElements;

   public MenuItemElement()
   {
   }

   public String getLabel()
   {
      return label;
   }

   public void setLabel(String label)
   {
      this.label = label;
   }

   public String getHref()
   {
      return href;
   }

   public void setHref(String href)
   {
      this.href = href;
   }

   public ArrayList<MenuItemElement> getMenuItemElements()
   {
      return menuItemElements;
   }

   public void setMenuItemElements(ArrayList<MenuItemElement> menuItemElements)
   {
      this.menuItemElements = menuItemElements;
   }
}
