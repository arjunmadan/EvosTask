package com.inetwork.web.data.shared.dto.lineoption;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.user.client.rpc.IsSerializable;

public class CsvUploadResults implements IsSerializable
{
   private Map<String, CsvUploadResult> uploadResults;

   public CsvUploadResults()
   {
      uploadResults = new HashMap<>();
   }

   public <T extends CsvUploadResult> void addUploadResult(T uploadResult, String columnHeader)
   {
      uploadResults.put(columnHeader, uploadResult);
   }

   public <T extends HasCsvUploadResult & CsvExportable> void addUploadResult(T csvExportableWithUploadResult)
   {
      addUploadResult(csvExportableWithUploadResult.getUploadResult(), csvExportableWithUploadResult.getGroupCsvHeader());
   }

   public Map<String, CsvUploadResult> getUploadResults()
   {
      return uploadResults;
   }
}
