package com.inetwork.web.data.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.inetwork.web.data.shared.utils.JsInteropUtil;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

// For JsInterop exports, I'm intentionally ignoring setters.  These properties should be loaded at runtime and should
// not be considered dynamic.  This means that unboxing wrappers are not included for setters.
@JsType(namespace = "gwt.properties", name = "Properties")
public class IrisWebProperties implements IsSerializable
{
   private Integer onDemandEarliestPossibleTime;
   private Integer onDemandBeginningBusinessTime;
   private Integer onDemandEndBusinessTime;
   private Integer onDemandLatestTime;

   private int lsrLargeTnCount;
   private int lsrMinDaysForLargeTns;
   private String bandwidthSpid;
   private String betaPortalName;
   private Integer defaultRefreshTime;
   private String tgaUiUrl;

   @JsIgnore
   public Integer getOnDemandEarliestPossibleTime()
   {
      return onDemandEarliestPossibleTime;
   }

   @JsIgnore
   public void setOnDemandEarliestPossibleTime(Integer onDemandEarliestPossibleTime)
   {
      this.onDemandEarliestPossibleTime = onDemandEarliestPossibleTime;
   }

   @JsProperty(name = "onDemandEarliestPossibleTime")
   public int getOnDemandEarliestPossibleTimeAsInt()
   {
      return JsInteropUtil.unboxInteger(getOnDemandEarliestPossibleTime());
   }

   @JsIgnore
   public Integer getOnDemandBeginningBusinessTime()
   {
      return onDemandBeginningBusinessTime;
   }

   @JsIgnore
   public void setOnDemandBeginningBusinessTime(Integer onDemandBeginningBusinessTime)
   {
      this.onDemandBeginningBusinessTime = onDemandBeginningBusinessTime;
   }

   @JsProperty(name = "onDemandBeginningBusinessTime")
   public int getOnDemandBeginningBusinessTimeAsInt()
   {
      return JsInteropUtil.unboxInteger(onDemandBeginningBusinessTime);
   }

   @JsIgnore
   public Integer getOnDemandEndBusinessTime()
   {
      return onDemandEndBusinessTime;
   }

   @JsIgnore
   public void setOnDemandEndBusinessTime(Integer onDemandEndBusinessTime)
   {
      this.onDemandEndBusinessTime = onDemandEndBusinessTime;
   }

   @JsProperty(name = "onDemandEndBusinessTime")
   public int getOnDemandEndBusinessTimeAsInt()
   {
      return JsInteropUtil.unboxInteger(onDemandEndBusinessTime);
   }

   @JsIgnore
   public Integer getOnDemandLatestTime()
   {
      return onDemandLatestTime;
   }

   @JsIgnore
   public void setOnDemandLatestTime(Integer onDemandLatestTime)
   {
      this.onDemandLatestTime = onDemandLatestTime;
   }

   @JsProperty(name = "onDemandLatestTime")
   public int getOnDemandLatestTimeAsInt()
   {
      return JsInteropUtil.unboxInteger(onDemandLatestTime);
   }

   @JsProperty
   public int getLsrLargeTnCount()
   {
      return lsrLargeTnCount;
   }

   @JsIgnore
   public void setLsrLargeTnCount(int lsrLargeTnCount)
   {
      this.lsrLargeTnCount = lsrLargeTnCount;
   }

   @JsProperty
   public int getLsrMinDaysForLargeTns()
   {
      return lsrMinDaysForLargeTns;
   }

   @JsIgnore
   public void setLsrMinDaysForLargeTns(int lsrMinDaysForLargeTns)
   {
      this.lsrMinDaysForLargeTns = lsrMinDaysForLargeTns;
   }

   @JsProperty
   public String getBandwidthSpid()
   {
      return bandwidthSpid;
   }

   @JsIgnore
   public void setBandwidthSpid(String bandwidthSpid)
   {
      this.bandwidthSpid = bandwidthSpid;
   }

   @JsIgnore
   public void setBetaPortalName(String betaPortalName)
   {
      this.betaPortalName = betaPortalName;
   }

   @JsProperty
   public String getBetaPortalName()
   {
      return betaPortalName;
   }

   @JsIgnore
   public Integer getDefaultRefreshTime()
   {
      return defaultRefreshTime;
   }

   @JsIgnore
   public void setDefaultRefreshTime(Integer defaultRefreshTime)
   {
      this.defaultRefreshTime = defaultRefreshTime;
   }

   @JsProperty(name = "defaultRefreshTime")
   public int getDefaultRefreshTimeAsInt()
   {
      return JsInteropUtil.unboxInteger(defaultRefreshTime);
   }

   @JsProperty
   public String getTgaUiUrl()
   {
      return tgaUiUrl;
   }

   @JsIgnore
   public void setTgaUiUrl(String tgaUiUrl)
   {
      this.tgaUiUrl = tgaUiUrl;
   }
}
