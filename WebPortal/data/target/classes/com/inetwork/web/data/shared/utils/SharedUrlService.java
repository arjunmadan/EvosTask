package com.inetwork.web.data.shared.utils;

import static com.inetwork.web.data.shared.ServiceConstants.ACCOUNTS;
import static com.inetwork.web.data.shared.ServiceConstants.ATTRIBUTE;
import static com.inetwork.web.data.shared.ServiceConstants.BILLING_REPORTS;
import static com.inetwork.web.data.shared.ServiceConstants.CARRIER;
import static com.inetwork.web.data.shared.ServiceConstants.CARRIER_MASK;
import static com.inetwork.web.data.shared.ServiceConstants.CONTRACT;
import static com.inetwork.web.data.shared.ServiceConstants.CUSTOMER_ORDER_ID;
import static com.inetwork.web.data.shared.ServiceConstants.FILE;
import static com.inetwork.web.data.shared.ServiceConstants.HOST;
import static com.inetwork.web.data.shared.ServiceConstants.HOSTS;
import static com.inetwork.web.data.shared.ServiceConstants.IDENTITYDOMAINS;
import static com.inetwork.web.data.shared.ServiceConstants.INCLUDE_ATTRIBUTES;
import static com.inetwork.web.data.shared.ServiceConstants.INSERVICE;
import static com.inetwork.web.data.shared.ServiceConstants.INSERVICE_NUMBERS;
import static com.inetwork.web.data.shared.ServiceConstants.IRIS_DOMAIN_NAME;
import static com.inetwork.web.data.shared.ServiceConstants.LINE_FEATURE_ORDER;
import static com.inetwork.web.data.shared.ServiceConstants.LOAS;
import static com.inetwork.web.data.shared.ServiceConstants.MESSAGING;
import static com.inetwork.web.data.shared.ServiceConstants.METADATA;
import static com.inetwork.web.data.shared.ServiceConstants.PAGE;
import static com.inetwork.web.data.shared.ServiceConstants.PERMISSION;
import static com.inetwork.web.data.shared.ServiceConstants.PERMITTED_ACCESS;
import static com.inetwork.web.data.shared.ServiceConstants.PREFERENCES;
import static com.inetwork.web.data.shared.ServiceConstants.PRODUCT;
import static com.inetwork.web.data.shared.ServiceConstants.PRODUCTS;
import static com.inetwork.web.data.shared.ServiceConstants.RATE_DECK;
import static com.inetwork.web.data.shared.ServiceConstants.REPROVISION_TNS;
import static com.inetwork.web.data.shared.ServiceConstants.ROUTING_EXCEPTION;
import static com.inetwork.web.data.shared.ServiceConstants.SEARCH;
import static com.inetwork.web.data.shared.ServiceConstants.SIPPEERS;
import static com.inetwork.web.data.shared.ServiceConstants.SITES;
import static com.inetwork.web.data.shared.ServiceConstants.SIZE;
import static com.inetwork.web.data.shared.ServiceConstants.TERMINATION_PRODUCTS;
import static com.inetwork.web.data.shared.ServiceConstants.TERMINATION_SMALL;
import static com.inetwork.web.data.shared.ServiceConstants.TEST_PROPERTIES;
import static com.inetwork.web.data.shared.ServiceConstants.TNS;
import static com.inetwork.web.data.shared.ServiceConstants.TN_OPTIONS;
import static com.inetwork.web.data.shared.ServiceConstants.TN_STATUS;
import static com.inetwork.web.data.shared.ServiceConstants.TOLL_FREE_CARIER;
import static com.inetwork.web.data.shared.ServiceConstants.TOTALS;
import static com.inetwork.web.data.shared.ServiceConstants.USERS;
import static java.lang.String.valueOf;

import com.google.common.collect.Multimap;
import com.inetwork.web.data.shared.OrderType;

public abstract class SharedUrlService
{


   public abstract UrlBuilder newUrl();

   public String getUrlForAccounts()
   {
      return builderForAccounts().buildString();
   }

   public String getUrlForLdapAccounts(String domainName)
   {
      return builderForLdapAccounts(domainName).buildString();
   }

   public String getUrlForTestProperties()
   {
      return newUrl().addPath(TEST_PROPERTIES)
            .buildString();
   }

   public String getUrlForOrderDocuments(int accountId, OrderType orderType, String orderId, boolean metadata)
   {
      return getUrlForOrderDocuments(accountId, orderType, orderId, metadata, null);
   }

   public String getUrlForOrderDocuments(int accountId, OrderType orderType, String orderId, boolean metadata, String csrfNonce)
   {
      UrlBuilder service = builderForOrder(accountId, orderType, orderId, LOAS);
      if (csrfNonce != null)
      {
         service.addParameter("X-CSRF-Token", valueOf(csrfNonce));
      }
      if (metadata)
      {
         service.addParameter(METADATA, valueOf(true));
      }
      return service.buildString();
   }

   public String getUrlForOrder(int accountId, OrderType orderType, String orderId)
   {
      return builderForOrder(accountId, orderType, orderId).buildString();
   }

   public String getUrlForOrder(int accountId, OrderType orderType)
   {
      return builderForAccount(accountId, orderType.getSearchValue()).buildString();
   }

   public String getUrlForOrders(OrderType orderType)
   {
      return builderForOrders(orderType).buildString();
   }

   public String getUrlForOrders(OrderType orderType, Multimap<String, Object> parameters)
   {
      return builderForOrders(orderType, parameters).buildString();
   }

   public String getUrlForAccountHost(int accountId, String host)
   {
      return builderForAccount(accountId, HOSTS).addParameter(HOST, host)
            .buildString();
   }

   public String getUrlForReprovision()
   {
      return buildForTnReprovision().buildString();
   }

   public String getUrlForSites(int accountId)
   {
      return builderForSites(accountId).buildString();
   }

   public String getUrlForSipPeers(int accountId, int siteId)
   {
      return builderForSipPeers(accountId, siteId).buildString();
   }

   public String getUrlForSipPeerTnsIncludingAttributes(int accountId, int siteId, int sipPeerId, String includeAttributes)
   {
      return builderForSipPeer(accountId, siteId, sipPeerId, TNS)
            .addParameter(INCLUDE_ATTRIBUTES, includeAttributes)
            .buildString();
   }
   
   public String getUrlForSipPeerTns(int accountId, int siteId, int sipPeerId)
   {
      return builderForSipPeer(accountId, siteId, sipPeerId, TNS).buildString();
   }

   public String getUrlForSipPeerTnsByStatus(int accountId, int siteId, int sipPeerId)
   {
      return builderForSipPeer(accountId, siteId, sipPeerId, TNS)
              .addParameter(TN_STATUS, INSERVICE)
              .buildString();
   }

   public String getUrlForOrders(int accountId, OrderType orderType)
   {
      return builderForOrders(accountId, orderType).buildString();
   }

   public String getUrlForOrders(int accountId, OrderType orderType, Multimap<String, Object> parameters)
   {
      return builderForOrders(accountId, orderType).addParameters(parameters)
            .buildString();
   }

   public String getUrlForTnOptionOrder(int accountId)
   {
      return builderForAccount(accountId, TN_OPTIONS).buildString();
   }

   public String getUrlForImportLineFeatures(int accountId, String customerOrderId)
   {
      return getUrlForImportLineFeatures(accountId, customerOrderId, null);
   }

   public String getUrlForImportLineFeatures(int accountId, String customerOrderId, String csrfNonce)
   {
      UrlBuilder builder = builderForAccount(accountId, LINE_FEATURE_ORDER).addParameter(CUSTOMER_ORDER_ID, customerOrderId);
      if (csrfNonce != null)
      {
         builder.addParameter("X-CSRF-Token", csrfNonce);
      }
      return builder.buildString();
   }



   public String getUrlForAccountBillingReports(int accountId)
   {
      return builderForAccount(accountId, BILLING_REPORTS).buildString();
   }

   public String getUrlForAccountBillingReportsFile(int accountId, String bdrId)
   {
      return builderForAccount(accountId, BILLING_REPORTS).addPath(bdrId)
            .addPath(FILE)
            .buildString();
   }

   public String getUrlForActiveNumbers(int accountId, String page, int size)
   {
      return builderForAccount(accountId, INSERVICE_NUMBERS).addParameter(SIZE, size)
            .addParameter(PAGE, page)
            .buildString();
   }

   public String getUrlForCarrierMaskDownload(int id)
   {
      return builderForCarrierMaskDownload(id).buildString();
   }

   public String getUrlForCarrierMaskUpload()
   {
      return builderForCarrierMaskUpload().buildString();
   }

   public String getUrlForRateDeckUpload()
   {
      return builderForRateDeckUpload().buildString();
   }

   public String getUrlForCarrierMaskUpload(String fileName, String carrierMaskName)
   {
      return builderForCarrierMaskUpload(fileName, carrierMaskName).buildString();
   }


   public String getUrlForRateDeckUpload(String fileName, String carrierMaskName)
   {
      return builderForRateDeckUpload(fileName, carrierMaskName).buildString();
   }

   public String getUrlForRoutingExceptionUpload(String fileName, String routingExceptionName)
   {
      return builderForRoutingExceptionUpload(fileName, routingExceptionName).buildString();
   }

   public String getUpdateUrlForRoutingExceptionUpload(int id, String fileName, String routingExceptionName)
   {
      return builderForRoutingExceptionUpdateUpload(id, fileName, routingExceptionName).buildString();
   }

   public String getUrlForRoutingExceptionUpload()
   {
      return builderForRoutingExceptionUpload().buildString();
   }

   public String getUrlForRoutingExceptionUpdateUpload(long id)
   {
      return builderForRoutingException()
              .addPath(valueOf(id))
              .addPath(FILE)
              .buildString();
   }

   public String getUrlForRoutingExceptionDownload(long id)
   {
      return builderForRoutingExceptionDownload(id).buildString();
   }

   public String getUrlForRateDeckDownload(int id)
   {
      return builderForRateDeckDownload(id).buildString();
   }


   public String getUrlForUserPreferences(String userName)
   {
      return builderForUserPreferences(userName).buildString();
   }

   public String getUrlForUserPreference(String userName, String preferenceName)
   {
      return builderForUserPreference(userName, preferenceName).buildString();
   }

   public String getUrlForLdapUserPreferences(String userName)
   {
      return builderForLdapUserPreferences(userName).buildString();
   }

   public String getUrlForLdapUserPreference(String userName, String preferenceName)
   {
      return builderForLdapUserPreference(userName, preferenceName).buildString();
   }

   protected UrlBuilder builderForOrders(OrderType orderType)
   {
      return newUrl().addPath(orderType.getSearchValue());
   }

   protected UrlBuilder builderForOrders(OrderType orderType, Multimap<String, Object> parameters)
   {
      return builderForOrders(orderType).addParameters(parameters);
   }

   protected UrlBuilder builderForAccounts()
   {
      return newUrl().addPath(ACCOUNTS);
   }

   protected UrlBuilder builderForAccountsSearch()
   {
      return builderForAccounts().addPath(SEARCH);
   }

   protected UrlBuilder builderForLdapAccounts(String domainName)
   {
      return builderForLdapDomain(domainName).addPath(ACCOUNTS);
   }

   protected UrlBuilder builderForLdapDomains()
   {
      return newUrl().addPath(IDENTITYDOMAINS);
   }

   protected UrlBuilder builderForLdapDomain(String domainName)
   {
      return builderForLdapDomains().addPath(domainName);
   }

   protected UrlBuilder builderForLdapUserPreference(String userName, String preferenceName)
   {
      return builderForLdapDomain(IRIS_DOMAIN_NAME).addPath(USERS)
            .addPath(userName)
            .addPath(PREFERENCES)
            .addPath(preferenceName);
   }

   protected UrlBuilder builderForLdapUserPreferences(String userName)
   {
      return builderForLdapDomain(IRIS_DOMAIN_NAME).addPath(USERS)
            .addPath(userName)
            .addPath(PREFERENCES);
   }

   public String getUrlForLdapUserPermittedAccess(String permissionId)
   {
      return builderForLdapDomain(IRIS_DOMAIN_NAME).addPath(USERS)
            .addPath(PERMITTED_ACCESS)
            .addParameter(PERMISSION, permissionId)
            .buildString();
   }

   protected UrlBuilder builderForUsers()
   {
      return newUrl().addPath(USERS);
   }

   protected UrlBuilder builderForLdapUsers(String domainName)
   {
      return builderForLdapDomain(domainName).addPath(USERS);
   }

   protected UrlBuilder builderForUser(String userName)
   {
      return builderForUsers().addPath(userName);
   }

   protected UrlBuilder builderForLdapUser(String domainName, String userName)
   {
      return builderForLdapUsers(domainName).addPath(userName);
   }

   protected UrlBuilder builderForUser(String userName, String pathParam)
   {
      return builderForUser(userName).addPath(pathParam);
   }

   protected UrlBuilder builderForUserPreferences(String userName)
   {
      return builderForUser(userName, PREFERENCES);
   }

   protected UrlBuilder buildForTnReprovision()
   {
      return newUrl().addPath(REPROVISION_TNS);
   }

   protected UrlBuilder builderForUserPreference(String userName, String preferenceName)
   {
      return builderForUserPreferences(userName).addPath(preferenceName);
   }

   protected UrlBuilder builderForAccount(int accountId)
   {
      return builderForAccounts().addPath(accountId);
   }

   protected UrlBuilder builderForAccount(int accountId, String pathParam)
   {
      return builderForAccount(accountId).addPath(pathParam);
   }

   protected UrlBuilder builderForTns(Multimap<String, Object> parameters)
   {
      return builderForTns().addParameters(parameters);
   }

   protected UrlBuilder builderForTns()
   {
      return newUrl().addPath(TNS);
   }

   protected UrlBuilder builderForOrders(int accountId, OrderType orderType)
   {
      return builderForAccount(accountId, orderType.getSearchValue());
   }

   protected UrlBuilder builderForOrders(int accountId, OrderType orderType, String pathParam)
   {
      return builderForOrders(accountId, orderType).addPath(pathParam);
   }

   protected UrlBuilder builderForOrder(int accountId, OrderType orderType, String orderId)
   {
      return builderForOrders(accountId, orderType, orderId);
   }

   protected UrlBuilder builderForOrder(int accountId, OrderType orderType, String orderId, String pathParam)
   {
      return builderForOrders(accountId, orderType, orderId).addPath(pathParam);
   }

   protected UrlBuilder builderForOrderCount(int accountId, OrderType orderType)
   {
      return builderForOrders(accountId, orderType, TOTALS);
   }

   protected UrlBuilder builderForSites(int accountId)
   {
      return builderForAccount(accountId).addPath(SITES);
   }

   protected UrlBuilder builderForSite(int accountId, int siteId)
   {
      return builderForSites(accountId).addPath(siteId);
   }

   protected UrlBuilder builderForSite(int accountId, int siteId, String pathParam)
   {
      return builderForSite(accountId, siteId).addPath(pathParam);
   }

   protected UrlBuilder builderForSiteContract(int accountId, int siteId)
   {
      return builderForSites(accountId).addPath(siteId)
            .addPath(CONTRACT);
   }

   protected UrlBuilder builderForSipPeers(int accountId, int siteId)
   {
      return builderForSite(accountId, siteId, SIPPEERS);
   }

   protected UrlBuilder builderForSipPeer(int accountId, int siteId, int sipPeerId)
   {
      return builderForSipPeers(accountId, siteId).addPath(sipPeerId);
   }

   protected UrlBuilder builderForSipPeer(int accountId, int siteId, int sipPeerId, String pathParam)
   {
      return builderForSipPeer(accountId, siteId, sipPeerId).addPath(pathParam);
   }

   protected UrlBuilder builderForTermination()
   {
      return newUrl().addPath(TERMINATION_PRODUCTS);
   }


   protected UrlBuilder builderForAttribute()
   {
      return builderForTermination().addPath(ATTRIBUTE);
   }

   protected UrlBuilder builderForCarrier()
   {
      return builderForTermination().addPath(CARRIER);
   }


   protected UrlBuilder builderForTerminationProduct()
   {
      return builderForTermination().addPath(PRODUCT);
   }

   protected UrlBuilder builderForTerminationProduct(Long id)
   {
      return builderForTermination().addPath(PRODUCT).addPath(valueOf(id));
   }

    protected UrlBuilder builderForTollFreeCarrier()
    {
        return builderForTermination().addPath(TOLL_FREE_CARIER);
    }

   protected UrlBuilder builderForCarrierMask()
   {
      return builderForTermination().addPath(CARRIER_MASK);
   }

   protected UrlBuilder builderForRoutingException()
   {
      return builderForTermination().addPath(ROUTING_EXCEPTION);
   }

   protected UrlBuilder builderForRateDeck()
   {
      return builderForTermination().addPath(RATE_DECK);
   }

   protected UrlBuilder builderForRateDeck(int id)
   {
      return builderForRateDeck().addPath(id);
   }

   protected UrlBuilder builderForCarrierMaskDownload(int id)
   {
      return builderForCarrierMask().addPath(id)
            .addPath(FILE);
   }

   protected UrlBuilder builderForCarrierMaskUpload()
   {
      return builderForCarrierMask().addPath(FILE);
   }

   protected UrlBuilder builderForRateDeckUpload()
   {
      return builderForRateDeck().addPath(FILE);
   }

   protected UrlBuilder builderForCarrierMaskUpload(String fileName, String carrierMaskName)
   {
      return builderForCarrierMaskUpload().addPath(fileName)
            .addPath(carrierMaskName);
   }


   protected UrlBuilder builderForRateDeckUpload(String fileName, String carrierMaskName)
   {
      return builderForRateDeckUpload().addPath(fileName)
            .addPath(carrierMaskName);
   }

   protected UrlBuilder builderForRoutingExceptionDownload(long id)
   {
      return builderForRoutingException().addPath(valueOf(id))
            .addPath(FILE);
   }

   protected UrlBuilder builderForRateDeckDownload(int id)
   {
      return builderForRateDeck().addPath(id)
            .addPath(FILE)
            .addParameter("filetype", "CSV");
   }

   protected UrlBuilder builderForRoutingExceptionUpload()
   {
      return builderForRoutingException().addPath(FILE);
   }

   protected UrlBuilder builderForRoutingExceptionUpload(String fileName, String routingExceptionName)
   {
      return builderForRoutingExceptionUpload()
              .addPath(fileName)
              .addPath(routingExceptionName);
   }

   protected UrlBuilder builderForRoutingExceptionUpdateUpload(int id, String fileName, String routingExceptionName)
   {
      return builderForRoutingExceptionDownload(id)
              .addPath(fileName)
              .addPath(routingExceptionName);
   }

   protected UrlBuilder builderForSipPeerTerminationHosts(int accountId, int siteId, int sipPeerId)
   {
      return builderForSipPeers(accountId, siteId).addPath(sipPeerId)
            .addPath(PRODUCTS)
            .addPath(TERMINATION_SMALL)
            .addPath(HOSTS);
   }

   protected UrlBuilder builderForTerminationSmsHost(int accountId, int siteId, int sipPeerId, String urlValue, int hostId)
   {
      return builderForTerminationSmsHosts(accountId, siteId, sipPeerId, urlValue).addPath(hostId);
   }

   protected UrlBuilder builderForTerminationSmsHosts(int accountId, int siteId, int sipPeerId, String urlValue)
   {
      return builderForSipPeer(accountId, siteId, sipPeerId).addPath(PRODUCTS)
            .addPath(MESSAGING)
            .addPath(urlValue)
            .addPath(HOSTS);
   }

}
