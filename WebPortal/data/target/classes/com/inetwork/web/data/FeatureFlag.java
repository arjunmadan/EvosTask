package com.inetwork.web.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "FeatureFlagResponse")
@XmlType(name = "FeatureFlag")
@XmlAccessorType(XmlAccessType.FIELD)
public class FeatureFlag
{
   @XmlElement(name = "FlagName")
   private String flagName;
   @XmlElement(name = "IsEnabled")
   private boolean isEnabled;

   public FeatureFlag(String name, boolean isEnabled) {
      this.flagName = name;
      this.isEnabled = isEnabled;
   }

   public FeatureFlag()
   {}
}
