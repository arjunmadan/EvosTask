package com.inetwork.web.data.shared.dto.menu;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.google.gwt.user.client.rpc.IsSerializable;

@XmlRootElement(name = "MenuBar")
@XmlType(name = "MenuBar")
@XmlAccessorType(XmlAccessType.NONE)
public class MenuBarElement implements IsSerializable
{

   @XmlElementWrapper(name = "MenuItems")
   @XmlElement(name = "MenuItem")
   private ArrayList<MenuItemElement> menuItemElements;

   public MenuBarElement()
   {
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
