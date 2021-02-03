package com.inetwork.web.data.shared.dto.orders;

import java.util.List;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype.AreaCodeSearchAndOrderType;
import com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype.BaseOrderType;
import com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype.CitySearchAndOrderType;
import com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype.CombinedSearchAndOrderType;
import com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype.ExistingTelephoneNumberOrderType;
import com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype.LATASearchAndOrderType;
import com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype.NPANXXSearchAndOrderType;
import com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype.RateCenterSearchAndOrderType;
import com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype.StateSearchAndOrderType;
import com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype.TollFreeVanitySearchAndOrderType;
import com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype.TollFreeWildCharSearchAndOrderType;
import com.inetwork.web.data.shared.dto.orders.orderdetail.ordertype.ZIPSearchAndOrderType;

public class Order
{

   public static final String ROOT_ELEMENT = "Order";

   public interface Reader extends XmlReader<Order>
   {
   }

   public interface Writer extends XmlWriter<Order>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("ExistingTelephoneNumberOrderType")
   private ExistingTelephoneNumberOrderType existingTelephoneNumberOrderType;
   @Path("RateCenterSearchAndOrderType")
   private RateCenterSearchAndOrderType rateCenterSearchAndOrderType;
   @Path("AreaCodeSearchAndOrderType")
   private AreaCodeSearchAndOrderType areaCodeSearchAndOrderType;
   @Path("NPANXXSearchAndOrderType")
   private NPANXXSearchAndOrderType npanxxSearchAndOrderType;
   @Path("TollFreeWildCharSearchAndOrderType")
   private TollFreeWildCharSearchAndOrderType tollFreeWildCharSearchAndOrderType;
   @Path("TollFreeVanitySearchAndOrderType")
   private TollFreeVanitySearchAndOrderType tollFreeVanitySearchAndOrderType;
   @Path("LATASearchAndOrderType")
   private LATASearchAndOrderType lataSearchAndOrderType;
   @Path("ZIPSearchAndOrderType")
   private ZIPSearchAndOrderType zipSearchAndOrderType;
   @Path("CitySearchAndOrderType")
   private CitySearchAndOrderType citySearchAndOrderType;
   @Path("StateSearchAndOrderType")
   private StateSearchAndOrderType stateSearchAndOrderType;
   @Path("CombinedSearchAndOrderType")
   private CombinedSearchAndOrderType combinedSearchAndOrderType;
   @Path("SiteId")
   private Integer siteId;
   @Path("CustomerOrderId")
   private String customerOrderId;
   @Path("Name")
   private String name;
   @Path("OrderCreateDate")
   private String orderCreateDate;
   @Path("PeerId")
   private Integer peerId;
   @Path("id")
   private String orderId;
   @Path("BackOrderRequested")
   private Boolean backOrderRequested;
   @Path("PartialAllowed")
   private Boolean partialAllowed;
   @Path("CloseOrder")
   private Boolean closeOrder;
   @Path("TnAttributes/TnAttribute")
   private List<String> tnAttributes;

   private BaseOrderType baseOrderType;

   public void setBaseOrderType(BaseOrderType baseOrderType)
   {
      this.baseOrderType = baseOrderType;
   }

   public BaseOrderType getBaseOrderType()
   {
      return baseOrderType;
   }

   public String getOrderId()
   {
      return orderId;
   }

   public void setOrderId(String orderId)
   {
      this.orderId = orderId;
   }

   public ExistingTelephoneNumberOrderType getExistingTelephoneNumberOrderType()
   {
      return existingTelephoneNumberOrderType;
   }

   public void setExistingTelephoneNumberOrderType(ExistingTelephoneNumberOrderType existingTelephoneNumberOrderType)
   {
      this.existingTelephoneNumberOrderType = existingTelephoneNumberOrderType;
      setBaseOrderType(existingTelephoneNumberOrderType);
   }

   public RateCenterSearchAndOrderType getRateCenterSearchAndOrderType()
   {
      return rateCenterSearchAndOrderType;
   }

   public void setRateCenterSearchAndOrderType(RateCenterSearchAndOrderType rateCenterSearchAndOrderType)
   {
      this.rateCenterSearchAndOrderType = rateCenterSearchAndOrderType;
      setBaseOrderType(rateCenterSearchAndOrderType);
   }

   public AreaCodeSearchAndOrderType getAreaCodeSearchAndOrderType()
   {
      return areaCodeSearchAndOrderType;
   }

   public void setAreaCodeSearchAndOrderType(AreaCodeSearchAndOrderType areaCodeSearchAndOrderType)
   {
      this.areaCodeSearchAndOrderType = areaCodeSearchAndOrderType;
      setBaseOrderType(areaCodeSearchAndOrderType);
   }

   public NPANXXSearchAndOrderType getNpanxxSearchAndOrderType()
   {
      return npanxxSearchAndOrderType;
   }

   public void setNpanxxSearchAndOrderType(NPANXXSearchAndOrderType npanxxSearchAndOrderType)
   {
      this.npanxxSearchAndOrderType = npanxxSearchAndOrderType;
      setBaseOrderType(npanxxSearchAndOrderType);
   }

   public TollFreeWildCharSearchAndOrderType getTollFreeWildCharSearchAndOrderType()
   {
      return tollFreeWildCharSearchAndOrderType;
   }

   public void setTollFreeWildCharSearchAndOrderType(TollFreeWildCharSearchAndOrderType tollFreeWildCharSearchAndOrderType)
   {
      this.tollFreeWildCharSearchAndOrderType = tollFreeWildCharSearchAndOrderType;
      setBaseOrderType(tollFreeWildCharSearchAndOrderType);
   }

   public TollFreeVanitySearchAndOrderType getTollFreeVanitySearchAndOrderType()
   {
      return tollFreeVanitySearchAndOrderType;
   }

   public void setTollFreeVanitySearchAndOrderType(TollFreeVanitySearchAndOrderType tollFreeVanitySearchAndOrderType)
   {
      this.tollFreeVanitySearchAndOrderType = tollFreeVanitySearchAndOrderType;
      setBaseOrderType(tollFreeVanitySearchAndOrderType);
   }

   public LATASearchAndOrderType getLataSearchAndOrderType()
   {
      return lataSearchAndOrderType;
   }

   public void setLataSearchAndOrderType(LATASearchAndOrderType lataSearchAndOrderType)
   {
      this.lataSearchAndOrderType = lataSearchAndOrderType;
      setBaseOrderType(lataSearchAndOrderType);
   }

   public ZIPSearchAndOrderType getZipSearchAndOrderType()
   {
      return zipSearchAndOrderType;
   }

   public void setZipSearchAndOrderType(ZIPSearchAndOrderType zipSearchAndOrderType)
   {
      this.zipSearchAndOrderType = zipSearchAndOrderType;
      setBaseOrderType(zipSearchAndOrderType);
   }

   public CitySearchAndOrderType getCitySearchAndOrderType()
   {
      return citySearchAndOrderType;
   }

   public void setCitySearchAndOrderType(CitySearchAndOrderType citySearchAndOrderType)
   {
      this.citySearchAndOrderType = citySearchAndOrderType;
      setBaseOrderType(citySearchAndOrderType);
   }

   public StateSearchAndOrderType getStateSearchAndOrderType()
   {
      return stateSearchAndOrderType;
   }

   public void setStateSearchAndOrderType(StateSearchAndOrderType stateSearchAndOrderType)
   {
      this.stateSearchAndOrderType = stateSearchAndOrderType;
      setBaseOrderType(stateSearchAndOrderType);
   }

   public CombinedSearchAndOrderType getCombinedSearchAndOrderType()
   {
      return combinedSearchAndOrderType;
   }

   public void setCombinedSearchAndOrderType(CombinedSearchAndOrderType combinedSearchAndOrderType)
   {
      this.combinedSearchAndOrderType = combinedSearchAndOrderType;
      setBaseOrderType(combinedSearchAndOrderType);

   }

   public Integer getSiteId()
   {
      return siteId;
   }

   public void setSiteId(Integer siteId)
   {
      this.siteId = siteId;
   }

   public String getCustomerOrderId()
   {
      return customerOrderId;
   }

   public void setCustomerOrderId(String customerOrderId)
   {
      this.customerOrderId = customerOrderId;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getOrderCreateDate()
   {
      return orderCreateDate;
   }

   public void setOrderCreateDate(String orderCreateDate)
   {
      this.orderCreateDate = orderCreateDate;
   }

   public Integer getPeerId()
   {
      return peerId;
   }

   public void setPeerId(Integer peerId)
   {
      this.peerId = peerId;
   }

   public Boolean isBackOrderRequested()
   {
      return backOrderRequested;
   }

   public void setBackOrderRequested(Boolean backOrderRequested)
   {
      this.backOrderRequested = backOrderRequested;
   }

   public Boolean isPartialAllowed()
   {
      return partialAllowed;
   }

   public void setPartialAllowed(Boolean partialAllowed)
   {
      this.partialAllowed = partialAllowed;
   }

   public Boolean getCloseOrder()
   {
      return closeOrder;
   }

   public void setCloseOrder(Boolean closeOrder)
   {
      this.closeOrder = closeOrder;
   }

   public List<String> getTnAttributes()
   {
      return tnAttributes;
   }

   public void setTnAttributes(List<String> tnAttributes)
   {
      this.tnAttributes = tnAttributes;
   }
}
