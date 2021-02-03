package com.inetwork.web.data.dto.imports.linefeatures.e911;

import com.inetwork.common.exception.ValidationException;
import com.inetwork.common.util.EnumUtil;
import com.inetwork.common.util.validation.Validator;

public class E911RowDetailsValidator implements Validator<E911RowDetails>
{
   private static final String INVALID_SERVICE_TYPE_ERROR_MESSAGE = "\'%s\' is not a valid E911 ServiceType. Valid values are: "
         + EnumUtil.toString(E911ServiceType.values());

   @Override
   public void validate(E911RowDetails e911RowDetails) throws ValidationException
   {
      if (!e911RowDetails.isServiceTypeValid())
      {
         throw new ValidationException(INVALID_SERVICE_TYPE_ERROR_MESSAGE, e911RowDetails.getServiceType());
      }
   }
}
