package com.inetwork.web.data.dto.imports.linefeatures.dlda;

public enum DldaServiceType
{
   NEW(false), REMOVE(true);

   private boolean deleteDlda;

   DldaServiceType(boolean deleteDlda)
   {
      this.deleteDlda = deleteDlda;
   }

   public boolean isDeleteDlda() {
      return deleteDlda;
   }
}
