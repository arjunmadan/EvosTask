package com.inetwork.web.data.dto.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.common.base.MoreObjects;
import java.util.Objects;
import com.inetwork.common.dto.Contact;
import com.inetwork.common.dto.admin.AdminPayload;
import com.inetwork.common.dto.admin.account.AccountPayloads;

/**
 * Represents a user's information. Objects of this class are presented to users. Objects of this class are not stored
 * in the database.
 */
@XmlRootElement(name = "User")
@XmlType(name = "User")
@XmlAccessorType(XmlAccessType.NONE)
@JsonInclude(Include.NON_NULL)
public class User implements AdminPayload
{
   private static final long serialVersionUID = -2388953808186789585L;

   @XmlElement(name = "Username")
   private String username;
   @XmlElement(name = "Password")
   private String password;
   @XmlElement(name = "FirstName")
   private String firstName;
   @XmlElement(name = "LastName")
   private String lastName;
   @XmlElement(name = "EmailAddress")
   private String emailAddress;
   @XmlElement(name = "TelephoneNumber")
   private String telephoneNumber;
   @XmlElement(name = "Roles")
   private RolesPayload roles;
   @XmlElement(name = "Accounts")
   private AccountPayloads accounts;
   @XmlTransient
   private UserRequestSearchType requestSearchType;

   public User()
   {
      super();
   }

   public User(String username)
   {
      this();
      setUsername(username);
   }

   public String getUsername()
   {
      return username;
   }

   public void setUsername(String username)
   {
      this.username = username;
   }

   public String getPassword()
   {
      return password;
   }

   public void setPassword(String password)
   {
      this.password = password;
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

   public String getEmailAddress()
   {
      return emailAddress;
   }

   public void setEmailAddress(String emailAddress)
   {
      this.emailAddress = emailAddress;
   }

   public RolesPayload getRoles()
   {
      return roles;
   }

   public void setRoles(RolesPayload roles)
   {
      this.roles = roles;
   }

   public void addRole(RolePayload role)
   {
      if (getRoles() == null)
      {
         setRoles(new RolesPayload());
      }
      getRoles().add(role);
   }

   public String getTelephoneNumber()
   {
      return telephoneNumber;
   }

   public void setTelephoneNumber(String telephoneNumber)
   {
      this.telephoneNumber = telephoneNumber;
   }

   public AccountPayloads getAccounts()
   {
      return accounts;
   }

   public void setAccounts(AccountPayloads accounts)
   {
      this.accounts = accounts;
   }

   public UserRequestSearchType getRequestSearchType()
   {
      return requestSearchType;
   }

   public void setRequestSearchType(UserRequestSearchType requestSearchType)
   {
      this.requestSearchType = requestSearchType;
   }

   public static User fromContactUser(ContactUserDto contactUserDto)
   {
      if (contactUserDto == null)
      {
         return null;
      }
      User user = new User(contactUserDto.getSecurityIdentifier());
      user.setEmailAddress(contactUserDto.getEmail());
      user.setFirstName(contactUserDto.getFirstName());
      user.setLastName(contactUserDto.getLastName());
      user.setTelephoneNumber(contactUserDto.getPhone());
      return user;
   }

   public static User createUser(UserDto userDto, Contact contact, RolesPayload roles)
   {
      if (userDto == null)
      {
         return null;
      }
      return createUser(userDto.getLoginName(), contact, roles);
   }

   public static User createUser(String username, Contact contact, RolesPayload roles)
   {
      User user = new User(username);

      if (contact != null)
      {
         user.setEmailAddress(contact.getEmail());
         user.setFirstName(contact.getFirstName());
         user.setLastName(contact.getLastName());
         user.setTelephoneNumber(contact.getPhone());
      }
      user.setRoles(roles);
      return user;
   }

   public static User createUser(String username, Contact contact, RolesPayload roles, AccountPayloads accounts)
   {
      if (StringUtils.isEmpty(username))
      {
         return null;
      }
      User user = new User(username);

      if (contact != null)
      {
         user.setEmailAddress(contact.getEmail());
         user.setFirstName(contact.getFirstName());
         user.setLastName(contact.getLastName());
         user.setTelephoneNumber(contact.getPhone());
      }
      user.setAccounts(accounts);
      user.setRoles(roles);
      return user;
   }

   public static User createUser(String username, AccountPayloads accounts)
   {
      if (StringUtils.isEmpty(username))
      {
         return null;
      }
      User user = new User(username);
      user.setAccounts(accounts);
      return user;
   }

   public static User createUser(String username, Contact contact)
   {
      if (StringUtils.isEmpty(username))
      {
         return null;
      }
      User user = new User(username);
      if (contact != null)
      {
         user.setFirstName(contact.getFirstName());
         user.setLastName(contact.getLastName());
      }
      return user;
   }

   @Override
   public String toString()
   {
      return MoreObjects.toStringHelper(this)
            .add("username", getUsername())
            .add("firstName", getFirstName())
            .add("lastName", getLastName())
            .add("emailAddress", getEmailAddress())
            .add("telephoneNumber", getTelephoneNumber())
            .addValue(getRoles())
            .add("accounts", getAccounts())
            .toString();
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(getUsername(), getFirstName(), getLastName(), getEmailAddress(), getTelephoneNumber(), getRoles());
   }

   @Override
   public boolean equals(final Object obj)
   {
      if (obj instanceof User)
      {
         final User that = (User) obj;
         return Objects.equals(getUsername(), that.getUsername()) && Objects.equals(getFirstName(), that.getFirstName())
               && Objects.equals(getLastName(), that.getLastName()) && Objects.equals(getEmailAddress(), that.getEmailAddress())
               && Objects.equals(getTelephoneNumber(), that.getTelephoneNumber()) && Objects.equals(getRoles(), that.getRoles());
      }
      return false;
   }
}
