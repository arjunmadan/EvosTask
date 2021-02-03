package com.inetwork.web.data.dto.location;

import com.inetwork.common.dto.sippeer.SipPeer;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Location")
@XmlType(name = "Location")
@XmlAccessorType(XmlAccessType.FIELD)
public class Location extends SipPeer
{

   public Location()
   {
      super();
   }

   public Location(SipPeer sipPeer)
   {
      super(sipPeer);
   }

   @XmlElement(name = "SeatsCount")
   private Integer seatsCount;

   public Integer getSeatsCount()
   {
      return seatsCount;
   }

   public void setSeatsCount(Integer seatsCount)
   {
      this.seatsCount = seatsCount;
   }
}
