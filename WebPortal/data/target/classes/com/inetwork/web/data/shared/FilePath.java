package com.inetwork.web.data.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class FilePath implements IsSerializable
{

   private String path;

   public FilePath()
   {
   }

   public String getPath()
   {
      return path;
   }

   public void setPath(String path)
   {
      this.path = path;
   }

}
