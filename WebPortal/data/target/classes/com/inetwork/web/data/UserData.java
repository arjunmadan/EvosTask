package com.inetwork.web.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.inetwork.common.dto.admin.account.AccountPayload;
import com.inetwork.common.dto.admin.account.AccountPayloads;
import com.inetwork.common.dto.admin.user.UserScope;
import com.inetwork.common.dto.admin.usermanagement.account.LdapAccount;
import com.inetwork.common.dto.admin.usermanagement.account.LdapAccountsDto;
import com.inetwork.common.dto.admin.usermanagement.role.LdapRole;
import com.inetwork.common.dto.admin.usermanagement.user.LdapUser;
import com.inetwork.common.dto.admin.usermanagement.user.profile.UserProfile;
import com.inetwork.web.data.dto.security.RolePayload;
import com.inetwork.web.data.dto.security.RolesPayload;
import com.inetwork.web.data.dto.security.User;
import com.inetwork.web.data.shared.utils.CollectionUtils;
import com.google.common.collect.Lists;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name = "UserData")
@XmlType(name = "UserData")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class UserData extends User
{
   private String sessionId;
   private boolean rememberMe;
   private boolean admin;
   private boolean fromLdap;
   private boolean withPortInRdPermission;
   private boolean withPortInEditPermission;
   private boolean withReportPermission;
   private boolean withNumberAssignmentPermission;
   private boolean withTnOptionsNnidPermission;
   private UserScope scope;

   @XmlElement(name = "AllAccounts")
   @JsonInclude(Include.NON_EMPTY)
   private AccountPayloads allAccounts;

   public UserData(LdapUser ldapUser)
   {
      super();
      setUsername(ldapUser.getUserName());
      setEmailAddress(ldapUser.getEmail());
      if (ldapUser.getUserProfile() != null)
      {
         UserProfile userProfile = ldapUser.getUserProfile();
         setFirstName(userProfile.getFirstName());
         setLastName(userProfile.getLastName());
         if (userProfile.getTelephoneNumbers() != null)
         {
            setTelephoneNumber(userProfile.getTelephoneNumbers()
                  .getCellPhone());
         }
      }
      List<RolePayload> roles = Lists.newArrayList();
      if (ldapUser.getUserSettings() != null)
      {
         UserScope userScope = ldapUser.getUserSettings()
               .getScopeEnum();
         setScope(userScope);
         if (UserScope.SYSTEM.equals(userScope) || UserScope.ALL.equals(userScope))
         {
            setAdmin(true);
         }
      }
      if (ldapUser.getRoles() != null)
      {
         convertRoles(roles, ldapUser.getRoles()
               .getLdapRoles());
      }
      setRoles(new RolesPayload(roles));
      setAccounts(convertFromLdapAccounts(ldapUser.getAccounts()));
      fromLdap = true;
   }

   private void convertRoles(List<RolePayload> roles, List<LdapRole> ldapRoles)
   {
      if (CollectionUtils.isEmpty(ldapRoles))
      {
         return;
      }
      for (LdapRole ldapRole : ldapRoles)
      {
         roles.add(new RolePayload(ldapRole.getRoleId()));
      }
   }

   public static AccountPayloads convertFromLdapAccounts(LdapAccountsDto ldapAccounts)
   {
      if (ldapAccounts == null)
      {
         return null;
      }
      List<AccountPayload> accounts = Lists.newArrayList();
      for (LdapAccount ldapAccount : ldapAccounts)
      {
         AccountPayload account = new AccountPayload();
         account.setAccountId(ldapAccount.getId());
         account.setCompanyName(ldapAccount.getName());
         accounts.add(account);
      }
      return new AccountPayloads(accounts);
   }

   public UserData()
   {
   }

   public String getSessionId()
   {
      return sessionId;
   }

   public void setSessionId(String sessionId)
   {
      this.sessionId = sessionId;
   }

   public boolean isRememberMe()
   {
      return rememberMe;
   }

   public void setRememberMe(boolean rememberMe)
   {
      this.rememberMe = rememberMe;
   }

   public AccountPayloads getAllAccounts()
   {
      return allAccounts;
   }

   public void setAllAccounts(AccountPayloads allAccounts)
   {
      this.allAccounts = allAccounts;
   }

   public boolean isAdmin()
   {
      return admin;
   }

   public void setAdmin(boolean admin)
   {
      this.admin = admin;
   }

   public boolean isFromLdap()
   {
      return fromLdap;
   }

   public void setFromLdap(boolean fromLdap)
   {
      this.fromLdap = fromLdap;
   }

   public boolean isWithPortInRdPermission()
   {
      return withPortInRdPermission;
   }

   public void setWithPortInRdPermission(boolean withPortInRdPermission)
   {
      this.withPortInRdPermission = withPortInRdPermission;
   }

   public boolean isWithPortInEditPermission()
   {
      return withPortInEditPermission;
   }

   public void setWithPortInEditPermission(boolean withPortInEditPermission)
   {
      this.withPortInEditPermission = withPortInEditPermission;
   }

   public boolean isWithReportPermission()
   {
      return withReportPermission;
   }

   public void setWithReportPermission(boolean withReportPermission)
   {
      this.withReportPermission = withReportPermission;
   }

   public boolean isWithNumberAssignmentPermission()
   {
      return withNumberAssignmentPermission;
   }

   public void setWithNumberAssignmentPermission(boolean withNumberAssignmentPermission)
   {
      this.withNumberAssignmentPermission = withNumberAssignmentPermission;
   }

   public boolean isWithTnOptionsNnidPermission()
   {
      return withTnOptionsNnidPermission;
   }

   public void setWithTnOptionsNnidPermission(boolean withTnOptionsNnidPermission)
   {
      this.withTnOptionsNnidPermission = withTnOptionsNnidPermission;
   }

   public UserScope getScope()
   {
      return scope;
   }

   public void setScope(UserScope scope)
   {
      this.scope = scope;
   }

   public String getCompanyName(int accountId)
   {
      AccountPayloads accountPayloads = admin ? getAllAccounts() : getAccounts();
      for (AccountPayload account : accountPayloads)
      {
         if (account.getAccountId()
               .equals(accountId))
         {
            return account.getCompanyName();
         }
      }
      return "";
   }
}
