package com.inetwork.web.data.dto.availablenumbers;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "CityListResponse")
@XmlType(name = "CityListResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class CityListResponse
{

   @XmlElementWrapper(name = "Cities")
   @XmlElement(name = "City")
   private List<String> cities;

   public List<String> getCities()
   {
      return cities;
   }

   public void setCities(List<String> cities)
   {
      this.cities = cities;
   }
}
