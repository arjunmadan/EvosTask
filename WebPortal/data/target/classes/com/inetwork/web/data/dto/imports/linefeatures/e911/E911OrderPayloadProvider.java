package com.inetwork.web.data.dto.imports.linefeatures.e911;

import static org.apache.commons.lang3.StringUtils.trimToNull;

import java.util.Collection;

import com.inetwork.common.dto.e911.E911Address;
import com.inetwork.common.dto.e911.order.create.E911OrderResponse;
import org.apache.commons.lang.BooleanUtils;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.inetwork.common.dto.e911.order.E911OrderPayload;
import com.inetwork.common.exception.ValidationException;
import com.inetwork.common.messaging.HttpStatus;

public class E911OrderPayloadProvider
{
   private final E911RowDetailsValidator e911RowDetailsValidator = new E911RowDetailsValidator();

   public E911OrderPayloads getE911OrderPayloads(Multimap<E911RowDetails, String> e911RowDetailsMappedToTn)
   {
      return e911RowDetailsMappedToTn != null && !e911RowDetailsMappedToTn.isEmpty() ? createE911OrderPayloads(e911RowDetailsMappedToTn) : null;
   }

   private E911OrderPayloads createE911OrderPayloads(Multimap<E911RowDetails, String> e911RowDetailsMappedToTn)
   {
      E911OrderPayloads e911OrderPayloads = new E911OrderPayloads();
      for (E911RowDetails e911RowDetails : e911RowDetailsMappedToTn.keySet())
      {
         try
         {
            e911RowDetailsValidator.validate(e911RowDetails);
            e911OrderPayloads.addValidE911OrderPayload(createE911OrderPayload(e911RowDetails, e911RowDetailsMappedToTn.get(e911RowDetails)));
         }
         catch (ValidationException e)
         {
            e911OrderPayloads.addFailedE911OrderResponse(createFiledE911OrderResponse(e.getErrorDescription(),
                  e911RowDetailsMappedToTn.get(e911RowDetails)));
         }
      }
      return e911OrderPayloads;
   }

   private E911OrderPayload createE911OrderPayload(E911RowDetails e911RowDetails, Collection<String> telephoneNumbers)
   {
      E911OrderPayload e911OrderPayload = new E911OrderPayload();
      e911OrderPayload.setCallerName(defineCallerName(e911RowDetails));
      e911OrderPayload.setDeleteTnSpecificAddress(e911RowDetails.isDeleteTnSpecificAddress());
      e911OrderPayload.setAddress(defineE911Address(e911RowDetails));
      e911OrderPayload.setTelephoneNumbers(Lists.newArrayList(telephoneNumbers));
      e911OrderPayload.setAlternateEndUserIdentifiers(null);
      return e911OrderPayload;
   }

   private String defineCallerName(E911RowDetails e911RowDetails)
   {
      return BooleanUtils.isNotTrue(e911RowDetails.isDeleteTnSpecificAddress()) ? e911RowDetails.getCallerName() : null;
   }

   private E911Address defineE911Address(E911RowDetails e911RowDetails)
   {
      return BooleanUtils.isNotTrue(e911RowDetails.isDeleteTnSpecificAddress()) && e911RowDetails.hasAtLeastOneNonBlankAddressField() ? createE911Address(e911RowDetails)
            : null;
   }

   private E911Address createE911Address(E911RowDetails e911RowDetails)
   {
      E911Address address = new E911Address();
      address.setHousePrefix(trimToNull(e911RowDetails.getHousePrefix()));
      address.setHouseNo(trimToNull(e911RowDetails.getHouseNumber()));
      address.setHouseSuffix(trimToNull(e911RowDetails.getHouseSuffix()));
      address.setPreDirectional(trimToNull(e911RowDetails.getPreDirectional()));
      address.setStreetName(trimToNull(e911RowDetails.getStreetName()));
      address.setStreetSuffix(trimToNull(e911RowDetails.getStreetSuffix()));
      address.setPostDirectional(trimToNull(e911RowDetails.getPostDirectional()));
      address.setAddressLine2(trimToNull(e911RowDetails.getAddressLine2()));
      address.setCity(trimToNull(e911RowDetails.getCity()));
      address.setStateCode(trimToNull(e911RowDetails.getStateCode()));
      address.setZip(trimToNull(e911RowDetails.getZip()));
      address.setZip4(trimToNull(e911RowDetails.getZipPlus4()));
      address.setLatitude(trimToNull(e911RowDetails.getLatitude()));
      address.setLongitude(trimToNull(e911RowDetails.getLongitude()));
      return address;
   }

   private E911OrderResponseWrapper createFiledE911OrderResponse(String errorDescription, Collection<String> telephoneNumbers)
   {
      E911OrderResponseWrapper e911OrderResponseWrapper = new E911OrderResponseWrapper();
      e911OrderResponseWrapper.setE911OrderResponse(createFiledE911OrderResponse(errorDescription));
      e911OrderResponseWrapper.setTelephoneNumbers(Lists.newArrayList(telephoneNumbers));
      return e911OrderResponseWrapper;
   }

   private E911OrderResponse createFiledE911OrderResponse(String errorDescription)
   {
      E911OrderResponse response = new E911OrderResponse();
      response.setResponseStatus(HttpStatus.BAD_REQUEST, errorDescription, HttpStatus.BAD_REQUEST.getCode());
      return response;
   }
}
