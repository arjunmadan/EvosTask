package com.inetwork.web.data.shared.dto;

import java.io.Serializable;

public interface Error extends Serializable
{
   Integer getCode();

   String getDescription();

   void setDescription(String description);

   void setCode(Integer code);
}
