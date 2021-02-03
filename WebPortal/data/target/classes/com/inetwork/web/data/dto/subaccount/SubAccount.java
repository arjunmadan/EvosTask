package com.inetwork.web.data.dto.subaccount;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.inetwork.web.data.dto.location.Location;

@XmlRootElement(name = "SubAccount")
@XmlType(name = "SubAccount")
@XmlAccessorType(XmlAccessType.FIELD)
public class SubAccount
{

   @XmlElement(name = "Name")
   private String siteName;

   @XmlElement(name = "SiteId")
   private Integer siteId;

   @XmlElement(name = "SeatsCount")
   private Integer seatsCount;

   @XmlElement(name = "LocationCount")
   private Integer locationCount;

   @XmlElementWrapper(name = "Locations")
   @XmlElement(name = "Location")
   private List<Location> locations;

   @XmlElement(name = "UcType")
   private String ucType;

   @XmlElement(name = "Trunks")
   private String trunks;

   public String getSiteName()
   {
      return siteName;
   }

   public void setSiteName(String siteName)
   {
      this.siteName = siteName;
   }

   public Integer getSiteId()
   {
      return siteId;
   }

   public void setSiteId(Integer siteId)
   {
      this.siteId = siteId;
   }

   public Integer getSeatsCount()
   {
      return seatsCount;
   }

   public void setSeatsCount(Integer seatsCount)
   {
      this.seatsCount = seatsCount;
   }

   public Integer getLocationCount()
   {
      return locationCount;
   }

   public void setLocationCount(Integer locationCount)
   {
      this.locationCount = locationCount;
   }

   public List<Location> getLocations()
   {
      return locations;
   }

   public void setLocations(List<Location> locations)
   {
      this.locations = locations;
   }

   public String getUcType()
   {
      return ucType;
   }

   public void setUcType(String ucType)
   {
      this.ucType = ucType;
   }
}
