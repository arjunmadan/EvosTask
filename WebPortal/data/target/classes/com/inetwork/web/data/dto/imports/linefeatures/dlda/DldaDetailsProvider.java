package com.inetwork.web.data.dto.imports.linefeatures.dlda;

import static com.inetwork.web.data.shared.utils.StringUtils.isNotBlank;

import com.inetwork.web.data.dto.imports.linefeatures.LineFeaturesRow;

public class DldaDetailsProvider
{

   public DldaDetailsKey provideDetails(LineFeaturesRow row)
   {
      DldaDetailsKey dldaDetailsKey = null;
      if (dataIsValid(row))
      {
         dldaDetailsKey = new DldaDetailsKey();
         dldaDetailsKey.setSubscriberType(row.getSubscriberType());
         dldaDetailsKey.setListingType(row.getListingType());
         dldaDetailsKey.setListAddress(row.getListAddress());
         dldaDetailsKey.setFirstName(row.getFirstName());
         dldaDetailsKey.setFirstName2(row.getFirstName2());
         dldaDetailsKey.setLastName(row.getLastName());
         dldaDetailsKey.setDesignation(row.getDesignation());
         dldaDetailsKey.setTitleOfLineage(row.getTitleOfLineage());
         dldaDetailsKey.setTitleOfAddress(row.getTitleOfAddress());
         dldaDetailsKey.setTitleOfAddress2(row.getTitleOfAddress2());
         dldaDetailsKey.setTitleOfLineageName2(row.getTitleOfLineageName2());
         dldaDetailsKey.setTitleOfAddressName2(row.getTitleOfAddressName2());
         dldaDetailsKey.setTitleOfAddress2Name2(row.getTitleOfAddress2Name2());
         dldaDetailsKey.setPlaceListingAs(row.getPlaceListingAs());
         dldaDetailsKey.setHousePrefix(row.getHousePrefix());
         dldaDetailsKey.setHouseNumber(row.getHouseNumber());
         dldaDetailsKey.setHouseSuffix(row.getHouseSuffix());
         dldaDetailsKey.setPreDirectional(row.getPreDirectional());
         dldaDetailsKey.setStreetName(row.getStreetName());
         dldaDetailsKey.setStreetSuffix(row.getStreetSuffix());
         dldaDetailsKey.setPostDirectional(row.getPostDirectional());
         dldaDetailsKey.setAddressLine2(row.getAddressLine2());
         dldaDetailsKey.setCity(row.getCity());
         dldaDetailsKey.setStateCode(row.getStateCode());
         dldaDetailsKey.setZip(row.getZip());
         dldaDetailsKey.setZipPlus4(row.getZipPlus4());
         dldaDetailsKey.setServiceType(row.getDldaServiceType());
      }
      return dldaDetailsKey;
   }

   private boolean dataIsValid(LineFeaturesRow row)
   {
      return isNotBlank(row.getSubscriberType()) || isNotBlank(row.getListingType()) || isNotBlank(row.getListAddress())
            || isNotBlank(row.getFirstName()) || isNotBlank(row.getFirstName2()) || isNotBlank(row.getLastName()) || isNotBlank(row.getDesignation())
            || isNotBlank(row.getTitleOfLineage()) || isNotBlank(row.getTitleOfAddress()) || isNotBlank(row.getTitleOfAddress2())
            || isNotBlank(row.getTitleOfLineageName2()) || isNotBlank(row.getTitleOfAddressName2()) || isNotBlank(row.getTitleOfAddress2Name2())
            || isNotBlank(row.getPlaceListingAs()) || isNotBlank(row.getHousePrefix()) || isNotBlank(row.getHouseNumber())
            || isNotBlank(row.getHouseSuffix()) || isNotBlank(row.getPreDirectional()) || isNotBlank(row.getStreetName())
            || isNotBlank(row.getStreetSuffix()) || isNotBlank(row.getPostDirectional()) || isNotBlank(row.getAddressLine2())
            || isNotBlank(row.getCity()) || isNotBlank(row.getStateCode()) || isNotBlank(row.getZip()) || isNotBlank(row.getZipPlus4())
            || isNotBlank(row.getDldaServiceType());

   }
}
