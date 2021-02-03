package com.inetwork.web.data.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DateValidation")
@XmlAccessorType(XmlAccessType.NONE)
public class DateValidation implements Serializable
{
   private static final long serialVersionUID = -5298701188879509615L;

   private boolean businessDay;
   private boolean validForLargeLsr;
   private int businessDayBetweenCurrent;

   @XmlElement(name = "BusinessDay")
   public boolean isBusinessDay()
   {
      return businessDay;
   }

   public void setBusinessDay(boolean businessDay)
   {
      this.businessDay = businessDay;
   }

   @XmlElement(name = "BusinessDayBetweenCurrent")
   public int getBusinessDayBetweenCurrent()
   {
      return businessDayBetweenCurrent;
   }

   public void setBusinessDayBetweenCurrent(int businessDayBetweenCurrent)
   {
      this.businessDayBetweenCurrent = businessDayBetweenCurrent;
   }

   @XmlElement(name = "ValidForLargeLsr")
   public boolean isValidForLargeLsr()
   {
      return validForLargeLsr;
   }

   public void setValidForLargeLsr(boolean validForLargeLsr)
   {
      this.validForLargeLsr = validForLargeLsr;
   }
}
