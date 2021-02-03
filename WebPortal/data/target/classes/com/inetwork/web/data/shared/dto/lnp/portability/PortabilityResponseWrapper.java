package com.inetwork.web.data.shared.dto.lnp.portability;

import static com.inetwork.web.data.shared.utils.CollectionUtils.isNotEmpty;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.inetwork.web.data.shared.dto.lnp.LnpError;
import com.inetwork.web.data.shared.dto.lnp.PortType;

public class PortabilityResponseWrapper
{
   private NumberPortabilityResponse response;

   private List<LnpError> errors = Lists.newArrayList();
   private List<LnpError> numbersErrors = Lists.newArrayList();

   private List<String> supportedNumbers = Lists.newArrayList();
   private List<String> errorsNumbers = Lists.newArrayList();
   private List<String> portableNumbers;
   private List<String> tollFreeNumbers;

   private Map<String, List<String>> partnersPortableNumbers = Maps.newHashMap();

   public PortabilityResponseWrapper(NumberPortabilityResponse response)
   {
      this.response = response;
      organizeErrors();
      extractSupportedNumbers();
      extractPortableNumbers();
      extractPartnerPortableNumbers();
      extractTollFreeNumbers();
   }

   private void extractTollFreeNumbers()
   {
      tollFreeNumbers = response.getSupportedTollFreeTelephoneNumbers();
   }

   public List<LnpError> getErrors()
   {
      return errors;
   }

   public List<LnpError> getNumbersErrors()
   {
      return numbersErrors;
   }

   public List<LnpError> getPortabilityErrors()
   {
      return response.getPortabilityErrors();
   }

   public List<String> getErrorsNumbers()
   {
      return errorsNumbers;
   }

   public List<String> getSupportedNumbers()
   {
      return supportedNumbers;
   }

   public List<String> getPortableNumbers()
   {
      return portableNumbers;
   }

   public Collection<List<String>> getPartnersPortableNumbers()
   {
      return partnersPortableNumbers.values();
   }

   public List<String> getUnsupportedRateCenterTelephoneNumbers()
   {
      return response.getUnsupportedRateCenterTelephoneNumbers();
   }

   public List<String> getUnsupportedLosingCarrierTelephoneNumbers()
   {
      return response.getUnsupportedLosingCarrierTelephoneNumbers();
   }

   public List<String> getTollFreeNumbers()
   {
      return tollFreeNumbers;
   }

   public List<LosingCarrierGroup> getSupportedLosingCarriers()
   {
      return response.getSupportedLosingCarriers();
   }

   private void extractSupportedNumbers()
   {
      supportedNumbers = response.getSupportedRateCenterTelephoneNumbers();
   }

   private void extractPortableNumbers()
   {
      portableNumbers = Lists.newArrayList(supportedNumbers);
      Iterables.retainAll(portableNumbers, response.getPortableNumbers());
   }

   private void extractPartnerPortableNumbers()
   {
      if (isNotEmpty(response.getPartnerSupportedRateCenters()))
      {
         for (RateCenterGroup rateCenterGroup : response.getPartnerSupportedRateCenters())
         {
            List<String> numbers = Lists.newArrayList(rateCenterGroup.getTelephoneNumbers());
            Iterables.retainAll(numbers, response.getPortableNumbers());
            if (isNotEmpty(numbers))
            {
               if (partnersPortableNumbers.containsKey(rateCenterGroup.getVendor()))
               {
                  numbers.addAll(partnersPortableNumbers.get(rateCenterGroup.getVendor()));
               }
               partnersPortableNumbers.put(rateCenterGroup.getVendor(), numbers);
            }
         }
      }
   }

   private void organizeErrors()
   {
      if (isNotEmpty(response.getErrors()))
      {
         for (LnpError lnpError : response.getErrors())
         {
            if (isNotEmpty(lnpError.getTelephoneNumbers()))
            {
               numbersErrors.add(lnpError);
               errorsNumbers.addAll(lnpError.getTelephoneNumbers());
            }
            else
            {
               errors.add(lnpError);
            }
         }
      }
      if (isNotEmpty(response.getPortabilityErrors()))
      {
         for (LnpError lnpError : response.getPortabilityErrors())
         {
            if (isNotEmpty(lnpError.getTelephoneNumbers()) && !lnpError.isUnknownLosingCarrierError())
            {
               errorsNumbers.addAll(lnpError.getTelephoneNumbers());
            }
         }
      }
   }

   public boolean hasUnknownLosingCarrier()
   {
      return response != null && response.hasUnknownLosingCarrier();
   }

   public boolean hasUnknownLosingCarrierError()
   {
      for (LnpError lnpError : response.getPortabilityErrors())
      {
         if (lnpError.isUnknownLosingCarrierError())
         {
            return true;
         }
      }
      return false;
   }

   public PortType getPortType()
   {
      return response.getPortType();
   }
}
