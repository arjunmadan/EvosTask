package com.inetwork.web.data.shared.dto.orders.orderdetail;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.Address;
import com.inetwork.web.data.shared.dto.host.Host;
import com.inetwork.web.data.shared.dto.host.Hosts;
import com.inetwork.web.data.shared.dto.host.TerminationHost;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class SipPeer
{

   public interface Reader extends XmlReader<SipPeer>
   {
   }

   public interface Writer extends XmlWriter<SipPeer>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);
   public static final Writer WRITER = GWT.create(Writer.class);

   @Path("PeerId")
   private Integer peerId;
   @Path("PeerName")
   private String peerName;
   @Path("Description")
   private String description;
   @Path("IsDefaultPeer")
   private boolean defaultPeer;
   @Path("FinalDestinationUri")
   private String finalDestinationUri;
   @Path("VoiceHosts/Host")
   private List<Host> hosts;
   @Path("VoiceHostGroups/VoiceHostGroup")
   private List<Hosts> voiceHostGroups;
   @Path("TerminationHosts/TerminationHost")
   private List<TerminationHost> terminationHosts;
   @Path("CustomerTraffic")
   private String customerTraffic;
   @Path("Address")
   private Address address;
   @Path("PremiseTrunks")
   private Integer premiseTrunks;
   @Path("CallingName")
   private CallingName callingName;
   @Path("SuggestedAddresses/Address")
   private List<Address> suggestedAddress;

   public CallingName getCallingName()
   {
      return callingName;
   }

   public void setCallingName(CallingName callingName)
   {
      this.callingName = callingName;
   }

   public Integer getPeerId()
   {
      return peerId;
   }

   public void setPeerId(Integer peerId)
   {
      this.peerId = peerId;
   }

   public String getPeerName()
   {
      return peerName;
   }

   public void setPeerName(String peerName)
   {
      this.peerName = peerName;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public boolean isDefaultPeer()
   {
      return defaultPeer;
   }

   public void setDefaultPeer(boolean defaultPeer)
   {
      this.defaultPeer = defaultPeer;
   }

   public String getFinalDestinationUri()
   {
      return finalDestinationUri;
   }

   public void setFinalDestinationUri(String finalDestinationUri)
   {
      this.finalDestinationUri = finalDestinationUri;
   }

   public List<Host> getHosts()
   {
      return hosts;
   }

   public void setHosts(List<Host> hosts)
   {
      this.hosts = hosts;
   }

   public String getCustomerTraffic()
   {
      return customerTraffic;
   }

   public void setCustomerTraffic(String customerTraffic)
   {
      this.customerTraffic = customerTraffic;
   }

   public Address getAddress()
   {
      return address;
   }

   public void setAddress(Address address)
   {
      this.address = address;
   }

   public List<TerminationHost> getTerminationHosts()
   {
      return terminationHosts;
   }

   public void setTerminationHosts(List<TerminationHost> terminationHosts)
   {
      this.terminationHosts = terminationHosts;
   }

   public List<Hosts> getVoiceHostGroups()
   {
      return voiceHostGroups;
   }

   public void setVoiceHostGroups(List<Hosts> voiceHostGroups)
   {
      this.voiceHostGroups = voiceHostGroups;
   }

   public Integer getPremiseTrunks()
   {
      return premiseTrunks;
   }

   public void setPremiseTrunks(Integer premiseTrunks)
   {
      this.premiseTrunks = premiseTrunks;
   }

   public List<Address> getSuggestedAddress()
   {
      return suggestedAddress;
   }

   public void setSuggestedAddress(List<Address> suggestedAddress)
   {
      this.suggestedAddress = suggestedAddress;
   }
}
