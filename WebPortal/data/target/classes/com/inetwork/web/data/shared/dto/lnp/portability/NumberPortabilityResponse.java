package com.inetwork.web.data.shared.dto.lnp.portability;

import static com.inetwork.web.data.shared.utils.CollectionUtils.addAll;

import java.util.ArrayList;
import java.util.List;

import com.inetwork.web.data.shared.dto.lnp.PortType;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;

import com.google.common.collect.Lists;
import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.lnp.LnpError;
import com.inetwork.web.data.shared.utils.CollectionUtils;

public class NumberPortabilityResponse
{
   public interface Reader extends XmlReader<NumberPortabilityResponse>
   {
   }

   public static final Reader READER = GWT.create(Reader.class);

   @Path("PortType")
   private PortType portType;

   @Path("Errors")
   private List<LnpError> errors;

   @Path("PortableNumbers/Tn")
   private List<String> portableNumbers;

   @Path("PortabilityErrors/Error")
   private List<LnpError> portabilityErrors;

   @Path("SupportedRateCenters/RateCenterGroup")
   private List<RateCenterGroup> supportedRateCenters;

   @Path("PartnerSupportedRateCenters/RateCenterGroup")
   private List<RateCenterGroup> partnerSupportedRateCenters;

   @Path("SupportedTollFreeNumbers/TollFreeNumberGroup")
   private List<TollFreeNumberGroup> supportedTollFreeNumberGroups;

   @Path("UnsupportedRateCenters/RateCenterGroup")
   private List<RateCenterGroup> unsupportedRateCenters;

   @Path("SupportedLosingCarriers/LosingCarrierTnList")
   private List<LosingCarrierGroup> supportedLosingCarriers;

   @Path("UnsupportedLosingCarriers/LosingCarrierTnList")
   private List<LosingCarrierGroup> unSupportedLosingCarriers;

   public List<String> getPortableNumbers()
   {
      return CollectionUtils.isNotEmpty(this.portableNumbers) ? this.portableNumbers : LnpErrorTelephoneNumberExtractor.EMPTY_LIST;
   }

   public void setPortableNumbers(List<String> portableNumbers)
   {
      this.portableNumbers = portableNumbers;
   }

   public List<LnpError> getErrors()
   {
      return errors;
   }

   public List<String> getErrorsTelephoneNumbers()
   {
      return LnpErrorTelephoneNumberExtractor.extract(this.errors);
   }

   public void setErrors(List<LnpError> errors)
   {
      this.errors = errors;
   }

   public List<LosingCarrierGroup> getSupportedLosingCarriers()
   {
      return supportedLosingCarriers;
   }

   public List<LnpError> getPortabilityErrors()
   {
      return portabilityErrors;
   }

   public List<String> getPortabilityErrorsTelephoneNumbers()
   {
      return LnpErrorTelephoneNumberExtractor.extract(this.portabilityErrors);
   }

   public void setPortabilityErrors(List<LnpError> portabilityErrors)
   {
      this.portabilityErrors = portabilityErrors;
   }

   public void setSupportedLosingCarriers(List<LosingCarrierGroup> supportedLosingCarriers)
   {
      this.supportedLosingCarriers = supportedLosingCarriers;
   }

   public List<LosingCarrierGroup> getUnSupportedLosingCarriers()
   {
      return unSupportedLosingCarriers;
   }

   public void setUnSupportedLosingCarriers(List<LosingCarrierGroup> unSupportedLosingCarriers)
   {
      this.unSupportedLosingCarriers = unSupportedLosingCarriers;
   }

   public List<RateCenterGroup> getSupportedRateCenters()
   {
      return supportedRateCenters;
   }

   public void setSupportedRateCenters(List<RateCenterGroup> supportedRateCenters)
   {
      this.supportedRateCenters = supportedRateCenters;
   }

   public List<RateCenterGroup> getPartnerSupportedRateCenters()
   {
      return partnerSupportedRateCenters;
   }

   public void setPartnerSupportedRateCenters(List<RateCenterGroup> partnerSupportedRateCenters)
   {
      this.partnerSupportedRateCenters = partnerSupportedRateCenters;
   }

   public List<RateCenterGroup> getUnsupportedRateCenters()
   {
      return unsupportedRateCenters;
   }

   public void setUnsupportedRateCenters(List<RateCenterGroup> unsupportedRateCenters)
   {
      this.unsupportedRateCenters = unsupportedRateCenters;
   }

   public List<String> getSupportedRateCenterTelephoneNumbers()
   {
      return getTelephoneNumbersFromRateCenterGroup(supportedRateCenters);
   }

   public List<String> getPartnerSupportedNumbers()
   {
      return getTelephoneNumbersFromRateCenterGroup(partnerSupportedRateCenters);
   }

   public List<String> getUnsupportedRateCenterTelephoneNumbers()
   {
      return getTelephoneNumbersFromRateCenterGroup(unsupportedRateCenters);
   }

   private List<String> getTelephoneNumbersFromRateCenterGroup(List<RateCenterGroup> rcgs)
   {
      List<String> tns = Lists.newArrayList();
      if (rcgs != null)
      {
         for (RateCenterGroup rcg : rcgs)
         {
            tns.addAll(rcg.getTelephoneNumbers());
         }
      }
      return tns;
   }

   public List<String> getSupportedLosingCarrierTelephoneNumbers()
   {
      return getTelephoneNumbersFromLosingCarrierGroup(supportedLosingCarriers);
   }

   public List<String> getUnsupportedLosingCarrierTelephoneNumbers()
   {
      return getTelephoneNumbersFromLosingCarrierGroup(unSupportedLosingCarriers);
   }

   private List<String> getTelephoneNumbersFromLosingCarrierGroup(List<LosingCarrierGroup> losingCarrierGroups)
   {
      List<String> tns = Lists.newArrayList();
      if (losingCarrierGroups != null)
      {
         for (LosingCarrierGroup losingCarrierGroup : losingCarrierGroups)
         {
            tns.addAll(losingCarrierGroup.getTelephoneNumbers());
         }
      }
      return tns;
   }

   public List<TollFreeNumberGroup> getSupportedTollFreeNumberGroups()
   {
      return supportedTollFreeNumberGroups;
   }

   public List<String> getSupportedTollFreeTelephoneNumbers()
   {
      List<String> tns = Lists.newArrayList();
      if (supportedTollFreeNumberGroups != null)
      {
         for (TollFreeNumberGroup tollFreeNumberGroup : supportedTollFreeNumberGroups)
         {
            tns.addAll(tollFreeNumberGroup.getTelephoneNumbers());
         }
      }
      return tns;
   }

   public void setSupportedTollFreeNumberGroups(List<TollFreeNumberGroup> supportedTollFreeNumberGroups)
   {
      this.supportedTollFreeNumberGroups = supportedTollFreeNumberGroups;
   }

   private <E> List<E> newListIfEmpty(List<E> list)
   {
      return list != null ? list : Lists.<E> newArrayList();
   }

   public void addErrors(List<LnpError> errors)
   {
      this.errors = newListIfEmpty(this.errors);
      addAll(this.errors, errors);
   }

   public void addPortableNumbers(List<String> portableNumbers)
   {
      this.portableNumbers = newListIfEmpty(this.portableNumbers);
      addAll(this.portableNumbers, portableNumbers);
   }

   public void addSupportedTollFreeNumberGroups(List<TollFreeNumberGroup> supportedTollFreeNumberGroups)
   {
      this.supportedTollFreeNumberGroups = newListIfEmpty(this.supportedTollFreeNumberGroups);
      addAll(this.supportedTollFreeNumberGroups, supportedTollFreeNumberGroups);
   }

   public void addPortabilityErrors(List<LnpError> portabilityErrors)
   {
      this.portabilityErrors = newListIfEmpty(this.portabilityErrors);
      addAll(this.portabilityErrors, portabilityErrors);
   }

   public void addSupportedRateCenters(List<RateCenterGroup> supportedRateCenters)
   {
      this.supportedRateCenters = newListIfEmpty(this.supportedRateCenters);
      addAll(this.supportedRateCenters, supportedRateCenters);
   }

   public void addPartnerSupportedRateCenters(List<RateCenterGroup> partnerSupportedRateCenters)
   {
      this.partnerSupportedRateCenters = newListIfEmpty(this.partnerSupportedRateCenters);
      addAll(this.partnerSupportedRateCenters, partnerSupportedRateCenters);
   }

   public void addUnsupportedRateCenters(List<RateCenterGroup> unsupportedRateCenters)
   {
      this.unsupportedRateCenters = newListIfEmpty(this.unsupportedRateCenters);
      addAll(this.unsupportedRateCenters, unsupportedRateCenters);
   }

   public void addSupportedLosingCarriers(List<LosingCarrierGroup> supportedLosingCarriers)
   {
      this.supportedLosingCarriers = newListIfEmpty(this.supportedLosingCarriers);
      addAll(this.supportedLosingCarriers, supportedLosingCarriers);
   }

   public void addUnsupportedLosingCarriers(List<LosingCarrierGroup> unSupportedLosingCarriers)
   {
      this.unSupportedLosingCarriers = newListIfEmpty(this.unSupportedLosingCarriers);
      addAll(this.unSupportedLosingCarriers, unSupportedLosingCarriers);
   }

   public LosingCarrierGroup getUnknownLosingCarrier()
   {
      for (LosingCarrierGroup supportedLosingCarrier : supportedLosingCarriers)
      {
         if (supportedLosingCarrier.isUnknownLosingCarrier())
         {
            return supportedLosingCarrier;
         }
      }
      return null;
   }

   public boolean hasUnknownLosingCarrier()
   {
      return getUnknownLosingCarrier() != null;
   }

   private static class LnpErrorTelephoneNumberExtractor
   {
      private static final List<String> EMPTY_LIST = Lists.newArrayList();

      private static List<String> extract(List<LnpError> errors)
      {
         if (CollectionUtils.isEmpty(errors))
            return EMPTY_LIST;

         List<String> extractedTns = Lists.newArrayList();
         for (LnpError error : errors)
         {
            extractedTns.addAll(extract(error));
         }
         return extractedTns;
      }

      private static List<String> extract(LnpError error)
      {
         List<String> extractedTns = error.getTelephoneNumbers();
         return extractedTns != null ? extractedTns : new ArrayList<String>();
      }
   }

   public PortType getPortType()
   {
      return portType;
   }

   public void setPortType(final PortType portType)
   {
      this.portType = portType;
   }
}
