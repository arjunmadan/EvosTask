package com.inetwork.web.data.dto.security;

import com.inetwork.common.dto.IncrementIdDto;

public class ContactUserDto extends IncrementIdDto
{
   private String securityIdentifier;
   private String firstName;
   private String lastName;
   private String phone;
   private String email;

   public String getSecurityIdentifier()
   {
      return securityIdentifier;
   }

   public void setSecurityIdentifier(String securityIdentifier)
   {
      this.securityIdentifier = securityIdentifier;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public String getPhone()
   {
      return phone;
   }

   public void setPhone(String phone)
   {
      this.phone = phone;
   }

   public String getEmail()
   {
      return email;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }
}
