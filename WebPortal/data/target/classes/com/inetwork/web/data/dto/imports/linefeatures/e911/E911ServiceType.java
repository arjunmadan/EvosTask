package com.inetwork.web.data.dto.imports.linefeatures.e911;

public enum E911ServiceType
{
   NEW(false), REMOVE(true);

   private boolean deleteTnSpecificAddress;

   E911ServiceType(boolean deleteTnSpecificAddress)
   {
      this.deleteTnSpecificAddress = deleteTnSpecificAddress;
   }

   public boolean isDeleteTnSpecificAddress()
   {
      return deleteTnSpecificAddress;
   }
}
