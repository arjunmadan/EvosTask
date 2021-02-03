package com.inetwork.web.data.dto.imports.linefeatures.dlda;

import com.inetwork.common.exception.ValidationException;
import com.inetwork.common.util.validation.Validator;
import com.inetwork.web.data.shared.dto.orders.dlda.ServiceType;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DldaRowValidator implements Validator<DldaDetailsKey>
{
   private static final String INVALID_SERVICE_TYPE_ERROR_MESSAGE = "\'%s\' is not a valid ServiceType. Valid values are: "
         + String.join(", ",
           Arrays.stream(ServiceType.values())
                   .map(ServiceType::getHumanReadableValue)
                   .collect(Collectors.toList()));

   @Override
   public void validate(DldaDetailsKey dldaDetailsKey) throws ValidationException
   {
      if (!dldaDetailsKey.isServiceTypeValid())
      {
         throw new ValidationException(INVALID_SERVICE_TYPE_ERROR_MESSAGE, dldaDetailsKey.getServiceType());
      }
   }
}
