package com.inetwork.web.data.shared.dto.listbox;

import com.google.common.collect.Lists;
import com.google.gwt.user.client.rpc.IsSerializable;

import java.util.ArrayList;

public class ListBoxes implements IsSerializable
{

   private ArrayList<ListBoxItem> states = Lists.newArrayList();
   private ArrayList<ListBoxItem> vendors = Lists.newArrayList();
   private ArrayList<ListBoxItem> ucUsageCategories = Lists.newArrayList();
   private ArrayList<ListBoxItem> tiers = Lists.newArrayList();
   private ArrayList<ListBoxItem> trafficTypes = Lists.newArrayList();
   private ArrayList<ListBoxItem> rateTypes = Lists.newArrayList();

   public ListBoxes()
   {
   }

   public ArrayList<ListBoxItem> getStates()
   {
      return states;
   }

   public void setStates(ArrayList<ListBoxItem> states)
   {
      this.states = states;
   }

   public ArrayList<ListBoxItem> getVendors()
   {
      return vendors;
   }

   public void setVendors(ArrayList<ListBoxItem> vendors)
   {
      this.vendors = vendors;
   }

   public ArrayList<ListBoxItem> getUcUsageCategories()
   {
      return ucUsageCategories;
   }

   public void setUcUsageCategories(ArrayList<ListBoxItem> ucUsageCategories)
   {
      this.ucUsageCategories = ucUsageCategories;
   }

   public ArrayList<ListBoxItem> getTiers()
   {
      return tiers;
   }

   public void setTiers(ArrayList<ListBoxItem> tiers)
   {
      this.tiers = tiers;
   }

   public void setTrafficTypes(ArrayList<ListBoxItem> trafficTypes)
   {
      this.trafficTypes = trafficTypes;
   }

   public ArrayList<ListBoxItem> getTrafficTypes()
   {
      return trafficTypes;
   }

   public void setRateTypes(ArrayList<ListBoxItem> rateTypes)
   {
      this.rateTypes = rateTypes;
   }

   public ArrayList<ListBoxItem> getRateTypes()
   {
      return rateTypes;
   }
}
