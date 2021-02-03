package com.inetwork.web.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "FeatureFlag")
@XmlType(name = "FeatureFlag")
@XmlAccessorType(XmlAccessType.FIELD)
public class FeatureFlagRequest
{
   @XmlElement(name = "IsEnabled")
   private boolean isEnabled;

   public FeatureFlagRequest()
   {}

   public FeatureFlagRequest(boolean isEnabled) {
      this.isEnabled = isEnabled;
   }

   public boolean isEnabled() {
      return isEnabled;
   }
}
