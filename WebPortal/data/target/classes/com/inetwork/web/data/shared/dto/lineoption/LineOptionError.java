package com.inetwork.web.data.shared.dto.lineoption;

import com.google.gwt.user.client.rpc.IsSerializable;

public class LineOptionError implements IsSerializable
{
   private String telephoneNumber;
   private int errorCode;
   private String description;

   public LineOptionError()
   {
   }

   public LineOptionError(String telephoneNumber, int errorCode, String description)
   {
      this.telephoneNumber = telephoneNumber;
      this.errorCode = errorCode;
      this.description = description;
   }

   public String getTelephoneNumber()
   {
      return telephoneNumber;
   }

   public void setTelephoneNumber(String telephoneNumber)
   {
      this.telephoneNumber = telephoneNumber;
   }

   public int getErrorCode()
   {
      return errorCode;
   }

   public void setErrorCode(int errorCode)
   {
      this.errorCode = errorCode;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }
}
