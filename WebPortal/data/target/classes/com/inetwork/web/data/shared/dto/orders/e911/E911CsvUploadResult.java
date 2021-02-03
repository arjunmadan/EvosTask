package com.inetwork.web.data.shared.dto.orders.e911;

import java.util.List;

import com.inetwork.web.data.shared.dto.lineoption.CsvUploadResult;

public class E911CsvUploadResult extends CsvUploadResult
{
   private List<String> successfulTelephoneNumbers;

   public List<String> getSuccessfulTelephoneNumbers()
   {
      return successfulTelephoneNumbers;
   }

   public void setSuccessfulTelephoneNumbers(List<String> successfulTelephoneNumbers)
   {
      this.successfulTelephoneNumbers = successfulTelephoneNumbers;
   }
}
