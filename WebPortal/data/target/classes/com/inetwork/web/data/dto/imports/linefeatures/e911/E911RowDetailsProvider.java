package com.inetwork.web.data.dto.imports.linefeatures.e911;

import static com.inetwork.web.data.shared.utils.StringUtils.isNotBlank;

import com.inetwork.web.data.dto.imports.linefeatures.LineFeaturesRow;

public class E911RowDetailsProvider
{
   public E911RowDetails provide(LineFeaturesRow lineFeaturesRow)
   {
      return isE911DataExists(lineFeaturesRow) ? createRowDetails(lineFeaturesRow) : null;
   }

   private boolean isE911DataExists(LineFeaturesRow row)
   {
      return isNotBlank(row.getCallerName()) || isNotBlank(row.getE911ServiceType()) || isAtLeastOneE911AddressRowExists(row);
   }

   private boolean isAtLeastOneE911AddressRowExists(LineFeaturesRow row)
   {
      return isNotBlank(row.getE911HousePrefix()) || isNotBlank(row.getE911HouseNumber()) || isNotBlank(row.getE911HouseSuffix())
            || isNotBlank(row.getE911PreDirectional()) || isNotBlank(row.getE911StreetName()) || isNotBlank(row.getE911StreetSuffix())
            || isNotBlank(row.getE911PostDirectional()) || isNotBlank(row.getE911AddressLine2()) || isNotBlank(row.getE911City())
            || isNotBlank(row.getE911StateCode()) || isNotBlank(row.getE911Zip()) || isNotBlank(row.getE911ZipPlus4())
              || isNotBlank(row.getLatitude()) || isNotBlank(row.getLongitude());
   }

   private E911RowDetails createRowDetails(LineFeaturesRow row)
   {
      E911RowDetails e911RowDetails = new E911RowDetails();
      e911RowDetails.setCallerName(row.getCallerName());
      setServiceType(e911RowDetails, row.getE911ServiceType());
      return isAtLeastOneE911AddressRowExists(row) ? addE911AddressFields(e911RowDetails, row) : addAddressFields(e911RowDetails, row);
   }

   private void setServiceType(E911RowDetails e911RowDetails, String serviceType)
   {
      e911RowDetails.setServiceType(serviceType);
      e911RowDetails.setE911ServiceType(serviceType);
   }

   private E911RowDetails addE911AddressFields(E911RowDetails e911RowDetails, LineFeaturesRow row)
   {
      e911RowDetails.setHousePrefix(row.getE911HousePrefix());
      e911RowDetails.setHouseNumber(row.getE911HouseNumber());
      e911RowDetails.setHouseSuffix(row.getE911HouseSuffix());
      e911RowDetails.setPreDirectional(row.getE911PreDirectional());
      e911RowDetails.setStreetName(row.getE911StreetName());
      e911RowDetails.setStreetSuffix(row.getE911StreetSuffix());
      e911RowDetails.setPostDirectional(row.getE911PostDirectional());
      e911RowDetails.setAddressLine2(row.getE911AddressLine2());
      e911RowDetails.setCity(row.getE911City());
      e911RowDetails.setStateCode(row.getE911StateCode());
      e911RowDetails.setZip(row.getE911Zip());
      e911RowDetails.setZipPlus4(row.getE911ZipPlus4());
      e911RowDetails.setLatitude(row.getLatitude());
      e911RowDetails.setLongitude(row.getLongitude());
      return e911RowDetails;
   }

   private E911RowDetails addAddressFields(E911RowDetails e911RowDetails, LineFeaturesRow row)
   {
      e911RowDetails.setHousePrefix(row.getHousePrefix());
      e911RowDetails.setHouseNumber(row.getHouseNumber());
      e911RowDetails.setHouseSuffix(row.getHouseSuffix());
      e911RowDetails.setPreDirectional(row.getPreDirectional());
      e911RowDetails.setStreetName(row.getStreetName());
      e911RowDetails.setStreetSuffix(row.getStreetSuffix());
      e911RowDetails.setPostDirectional(row.getPostDirectional());
      e911RowDetails.setAddressLine2(row.getAddressLine2());
      e911RowDetails.setCity(row.getCity());
      e911RowDetails.setStateCode(row.getStateCode());
      e911RowDetails.setZip(row.getZip());
      e911RowDetails.setZipPlus4(row.getZipPlus4());
      e911RowDetails.setLatitude(row.getLatitude());
      e911RowDetails.setLongitude(row.getLongitude());
      return e911RowDetails;
   }
}
