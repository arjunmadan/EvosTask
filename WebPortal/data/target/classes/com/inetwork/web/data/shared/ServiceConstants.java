package com.inetwork.web.data.shared;

public final class ServiceConstants {
    private ServiceConstants() {
    }

    public static final int ASSOCIATED_NUMBERS_LIMIT = 10;
    public static final int FIRST = 1;
    public static final int INCORRECT_ACCOUNT = 0;
    public static final int GLOBAL_SEARCH_LIMIT = 2500;
    public static final int ORDER_NUMBERS_LIMIT = 5000;
    public static final int SEARCH_AVAILABLE_NUMBERS_DEFAULT_COUNT = 500;
    public static final int INT_ROW_PER_PAGE = 50;
    public static final int ORDERS_SIZE_LIMIT = 5;
    public static final int DEFAULT_TIMEOUT = 10000;
    public static final int HTTPS_PORT = 443;
    public static final int HTTP_PORT = 80;
    public static final int SC_OK = 200;
    public static final int SC_NO_CONTENT = 204;
    public static final int SC_BAD_REQUEST = 400;
    public static final int SC_FORBIDDEN = 403;

    public static final long MAX_COOKIE_EXPIRE_DAYS = 5L;
    public static final long MILLISECONDS_PER_MINUTE = 1000L * 60L;
    public static final long MILLISECONDS_PER_HOUR = MILLISECONDS_PER_MINUTE * 60L;
    public static final long MILLISECONDS_PER_DAY = 24L * MILLISECONDS_PER_HOUR;
    public static final long MAX_COOKIE_EXPIRE_MILLISECONDS = MAX_COOKIE_EXPIRE_DAYS * MILLISECONDS_PER_DAY;
    public static final long TEN_YEARS_MILLISECONDS = 3652L * MILLISECONDS_PER_DAY;

    public static final int ON_NET_TIER = 0;

    public static final String DASH = "-";
    public static final String FIRST_PAGE = "1";
    public static final String ZERO = "0";
    public static final String CUSTOMER_LIST_BOX_WIDTH = "100%";
    public static final String ROW_PER_PAGE = String.valueOf(INT_ROW_PER_PAGE);
    public static final String DATE_TIME_FORMAT = "MM/dd/yyyy";
    public static final String MULTI_VALUE = "mult";
    public static final String PASSWORD_EXPIRED = "password expired";

    public static final int BANDWITH_VENDOR_ID = 49;
    // ===================================== Request headers ==================================================

    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_XML = "application/xml";
    public static final String CONVERTER_TYPE = "Converter-Type";
    public static final String X_ORIGIN = "X-Origin";
    public static final String GUI = "GUI";
    public static final String CSRF_TOKEN = "X-CSRF-Token";

    // ===================================== Cookies ==================================================

    public static final String COOKIE_INETWORK = "_inetwork_";
    public static final String COOKIE_INETWORK_PATTERN = "[A-F0-9]{32}";

    // ===================================== Servlet paths ==================================================

    public static final String EXPORT_TO_CSV = "exportToCsv";
    public static final String IRIS_API = "iris";
    public static final String PORTAL_API = "proxy_api";

    public static final String ORDER = "order";

    public static final String LNP = "lnp";
    public static final String PASSWORD = "password";
    public static final String USERS = "users";
    public static final String ADMIN = "admin";
    public static final String ACCOUNTS = "accounts";
    public static final String SEARCH = "search";
    public static final String SITE = "site";
    public static final String SITES = "sites";
    public static final String SITE_ID = "siteId";
    public static final String CONTRACT = "contract";
    public static final String SIPPEER = "sipPeer";
    public static final String SIPPEERS = "sippeers";
    public static final String MOVE_TNS = "movetns";
    public static final String PEER_ID = "peerId";
    public static final String PEER_NAME = "peerName";
    public static final String AVAILABLE_NUMBERS = "availableNumbers";
    public static final String ASSOCIATED_NUMBERS = "associatedNumbers";
    public static final String EXPORT_TNS = "exportTelephoneNumbers";
    public static final String AVAILABLE = "available";
    public static final String SUPPORTED = "supported";
    public static final String QUANTITY = "quantity";
    public static final String NPA = "npa";
    public static final String NPA_NXX = "npaNxx";
    public static final String NPA_NXX_X = "npaNxxx";
    public static final String NPA_NXX_XX = "npaNxxX";
    public static final String FULL_NUMBER = "fullNumber";
    public static final String FEEDBACK = "feedback";
    public static final String ENABLE_LCA = "enableLCA";
    public static final String ORDER_BY = "orderBy";
    public static final String LCA = "LCA";
    public static final String RATE_CENTER = "rateCenter";
    public static final String RATE_CENTERS = "rateCenters";
    public static final String COVERED_RATE_CENTERS = "coveredRateCenters";
    public static final String EMBED = "embed";
    public static final String STATE = "state";
    public static final String CITY = "city";
    public static final String CITIES = "cities";
    public static final String LATA = "lata";
    public static final String ZIP = "zip";
    public static final String AREA_CODE = "areaCode";
    public static final String TOLL_FREE_WILD_CARD_PATTERN = "tollFreeWildCardPattern";
    public static final String TOLL_FREE_VANITY = "tollFreeVanity";
    public static final String EIGHT_STAR_STAR = "8**";
    public static final String DOWNLOAD = "download";
    public static final String USER_SERVICES = "userService";
    public static final String AUTHENTICATION = "authentication";
    public static final String LOGOUT = "logout";
    public static final String SUBSCRIPTIONS = "subscriptions";
    public static final String ORDER_TYPE = "orderType";
    public static final String MANAGE_QUEUES = "managequeues";
    public static final String LNP_CHECKER = "lnpchecker";
    public static final String FULL_CHECK = "fullCheck";
    public static final String HISTORY = "history";
    public static final String NOTES = "notes";
    public static final String LOAS = "loas";
    public static final String LOAS_DOWNLOAD = "loas/download";
    public static final String METADATA = "metadata";
    public static final String FILE_NAME = "fileName";
    public static final String TN_DETAIL = "tndetail";
    public static final String PREFER_NEW = "preferNew";
    public static final String TELEPHONE_NUMBER = "telephoneNumber";
    public static final String BTN = "btn";
    public static final String BILLING_REPORTS = "billingreports";
    public static final String MANAGE_ORDERS_SEARCH = "manageorders";
    public static final String TEST_PROPERTIES = "test/properties";
    public static final String PROTECTED = "protected";
    public static final String INITIAL_STATUS = "initialStatus";
    public static final String PREFERENCES = "preferences";
    public static final String PERMITTED_ACCESS = "permittedaccess";
    public static final String PREFERRED_PORTAL = "preferredPortal";
    public static final String MIGRATION = "migrate";
    public static final String DATA = "data";
    public static final String CSRF = "csrf";
    public static final String ROUTES = "routes";
    public static final String NN_ROUTES = "nnroutes";
    public static final String AVAILABLE_NN_ROUTES = "availableNnRoutes";
    // beta portal links
    public static final String BETA_ANGULAR_APP_PREFIX = "/#/";
    public static final String BETA_ADMIN_REPORTS = "adminReports";
    public static final String BETA_ACCOUNT_REPORTS = "reports";
    public static final String BETA_BILLING_REPORTS = "billingreports";
    public static final String BETA_SIP_CREDENTIALS = "sipcredentials";
    public static final String BETA_USERS = "users";
    public static final String BETA_NEW_NUMBER = "newnumber";
    public static final String BETA_MANAGE_EXTERNAL_NUMBERS = "manageexternalnumbers";
    public static final String BETA_TN_REPROVISIONING = "reprovision";
    public static final String BETA_NUMBER_ASSIGNMENT = "numberassignment";
    // TODO need elaboration
    public static final String PRODUCTS = "products";
    public static final String UC_TRUNKING = "UcTrunking";
    public static final String EDGE_MANAGEMENT = "EdgeManagement";
    public static final String SIP_AUTHENTICATION = "SipAuthentication";
    public static final String SBC_TRUNK_GROUPS = "TrunkGroups";
    public static final String SBC_NODE_GROUPS = "sbcNodeGroups";
    public static final String ORIGINATION = "Origination";
    public static final String TERMINATION = "Termination";
    public static final String SETTINGS = "settings";
    public static final String CICS = "cics";
    public static final String RORS = "rors";
    public static final String BILLING_SETTINGS = "billingsettings";
    public static final String NUMBERMANAGEMENT = "NumberManagement";
    public static final String COUNTRIES = "countries";
    public static final String TNTYPES = "tntypes";
    public static final String INTERNATIONAL_VENDORS_SETTINGS = "internationalVendorSettings";
    public static final String VENDORS = "vendors";
    public static final String FEATURES = "features";
    public static final String SMS_FEATURE = "sms";
    public static final String MMS_FEATURE = "mms";
    public static final String HTTP_FEATURE = "http";
    public static final String HTTPV2_FEATURE = "httpv2";
    public static final String TOTALSEATS = "totalseats";
    public static final String TOTALTNS = "totaltns";
    public static final String SUB_ACCOUNTS = "subaccounts";
    public static final String SUB_ACCOUNTS_NO_UC = "subaccountsNoUC";
    public static final String WHOLESALE = "wholesale";
    public static final String LOCATIONS = "locations";
    public static final String ALL = "all";
    public static final String ALL_ORDERS = "All orders";
    public static final String PORT_IN_ORDERS = "Port in orders";
    public static final String LSR_ORDER = "LSR_ORDER";
    public static final String NEW_NUMBER_ORDERS = "New number orders";
    public static final String DISCONNECT_ORDERS = "Disconnect orders";
    public static final String PORT_OUT_ORDERS = "Port out orders";
    public static final String DLDA_ORDERS = "DL/DA orders";
    public static final String LSR_ORDERS = "LSR orders";
    public static final String E911_ORDERS = "E911 orders";
    public static final String TN_OPTION_ORDERS = "TN Option orders";
    public static final String EXTERNAL_TN_ORDERS = "External TN orders";
    public static final String LIDB_ORDERS = "Calling Name (LIDB) orders";
    public static final String BULK_PORTINS_ORDERS = "Bulk Port-in orders";
    public static final String NEW_NUMBER_ORDER = "NEW_NUMBER_ORDER";
    public static final String PORT_NUMBER_ORDER = "PORT_NUMBER_ORDER";
    public static final String PORT_OUT_NUMBER_ORDER = "PORT_OUT_NUMBER_ORDER";
    public static final String DISCONNECT_NUMBER_ORDER = "DISCONNECT_NUMBER_ORDER";
    public static final String IMPORT_TO_ACCOUNT_ORDER = "IMPORT_TO_ACCOUNT_ORDER";
    public static final String LIDB_ORDER = "LIDB_ORDER";
    public static final String BULK_PORTINS_ORDER = "BULK_PORTINS_ORDER";
    public static final String DLDA_ORDER = "DLDA_ORDER";
    public static final String E911_ORDER = "E911_ORDER";
    public static final String TN_OPTION_ORDER = "TN_OPTION_ORDER";
    public static final String EXTERNAL_TNS_ORDER = "EXTERNAL_TNS_ORDER";
    public static final String NUMBERS_ASSIGNMENT_ORDER = "NUMBERS_ASSIGNMENT_ORDER";
    public static final String IMPORT_NUMBER_ORDER = "IMPORT_TN_ORDERS";
    public static final String REMOVE_NUMBER_ORDER = "REMOVE_NUMBER_ORDER";
    public static final String IRIS_DOMAIN_NAME = "dashboard";
    public static final String APPLICATIONS = "applications";
    public static final String APPLICATION_SETTINGS = "applicationSettings";
    public static final String E911_ADDRESS_COLUMN_NAME = "FORMATTED ADDRESS";
    public static final String E911_LOCATION_ID_COLUMN_NAME = "9-1-1 LOCATION ID";
    public static final String LANGUAGE_COLUMN_NAME = "LANGUAGE";
    public static final String IMPORT_TN_ORDER = "IMPORT_TN_ORDER";
    public static final String REMOVE_IMPORTED_TN_ORDER = "REMOVE_IMPORTED_TN_ORDER";

    public static final String MESSAGING_LOST = "MESSAGING_LOST";
    public static final String MESSAGING_LOST_EVENTS = "Messaging Lost events";

    public static final String ACCT_PORTINS_RD_PERMISSION = "acct-portins-rd";
    public static final String ACCT_PORTINS_PERMISSION = "acct-portins";
    public static final String REPORT_LIST_REPORTS_PERMISSION = "report-list-reports";
    public static final String ACCT_NUMBER_ASSIGNMENT_PERMISSION = "acct-numbersassignment";
    public static final String ACCT_TNOPTIONS_NNID_PERMISSION = "acct-tnoptions-nnid";

    public static final String DAILY_DIGEST = "Daily digest";
    public static final String IMMEDIATE = "Immediate";
    public static final String NONE = "NONE";
    public static final String DAILY = "DAILY";
    public static final String HOST = "host";
    public static final String HOSTS = "hosts";

    public static final String DATE = "date";
    public static final String DETAILS = "details";
    public static final String TN_DETAILS = "tndetails";
    public static final String MULTIPLE = "multiple";
    public static final String MULTIPLE_HTML = "<p class='multiple'>multiple</p>";
    public static final String FILES = "files";
    public static final String FROM_SEARCH = "search";

    public static final String TYPE = "type";
    public static final String NEW_NUMBER = "New number";
    public static final String PORT = "Port";
    public static final String INSERVICE = "Inservice";
    public static final String AGING = "Aging";
    public static final String PORT_OUT = "PortOut";
    public static final String PORT_IN_PENDING_FOC = "PortInPendingFoc";
    public static final String FAILED = "Failed";

    public static final String TOTALS = "totals";
    public static final String STATUS = "status";
    public static final String SIZE = "size";
    public static final String PAGE = "page";
    public static final String PERMISSION = "permission";

    public static final String BASE_STATUS_SERVICE_URL = "restServices/status/";
    public static final String STATUS_EXCEPTION = "EXCEPTION";
    public static final String STATUS_PARTIAL = "PARTIAL";
    public static final String STATUS_COMPLETE = "COMPLETE";
    public static final String STATUS_BACKORDERED = "BACKORDERED";
    public static final String STATUS_FAILED = "FAILED";

    public static final String PORTAL = "Portal";
    public static final String SECURITY = "security";
    public static final String USER_CONTEXT = "userContext";
    public static final String HTTP = "http";
    public static final String HTTPS = "https";
    public static final String SSL = "SSL";
    public static final String SMPP_PROTOCOL = "SMPP";
    public static final String HTTP_PROTOCOL = "HTTP";

    public static final String TNS = "tns";
    public static final String TN_STATUS = "tnStatus";
    public static final String INSERVICE_NUMBERS = "inserviceNumbers";
    public static final String IPS = "ips";

    public static final String LINE_FEATURE_ORDER = "lineFeatureOrders";
    public static final String CUSTOMER_ORDER_ID = "customerOrderId";
    public static final String LIDBS_ORDER = "lidbs";
    public static final String LOSING_CARRIER = "losingCarrier";

    public static final String DATES_UTILITY = "dates/utility";
    public static final String VALIDATE = "validate";
    public static final String FIRST_AVAILABLE_FOC_DATE = "firstAvailableFocDate";
    public static final String HOLIDAYS = "holidays";
    public static final String PORT_IN_TYPE = "portInType";
    public static final String PORT_IN_LOSING_CARRIER_IS_WIRELESS = "losingCarrierIsWireless";
    public static final String PORT_IN_ACCOUNT_HAS_WIRELESS_ADAPTER = "accountHasWirelessAdapter";
    public static final String PORT_IN_LOSING_CARRIER_MIN_PORTING_INTERVAL = "minPortingInterval";
    public static final String PORT_IN_LATEST_ALLOWED_EASTERN_TIME = "latestAllowedEasternTime";

    // ===================================== IRIS API paths ==================================================
    public static final String ADMIN_PARAMETERS = "adminparameters";
    public static final String ANALYTICS = "analytics";
    public static final String DISCONNECTS = "disconnects";
    public static final String IMPORT_TO_ACCOUNT = "importToAccount";
    public static final String ORDERS = "orders";
    public static final String PORTINS = "portins";
    public static final String LSRS = "lsrorders";
    public static final String PORTOUTS = "portouts";
    public static final String LIDBS = "lidbs";
    public static final String BULK_PORTINS = "bulkPortins";
    public static final String IMPORT_TN = "importtnorders";
    public static final String REMOVE_IMPORTED_TN = "removeImportedTnOrders";
    public static final String DLDAS = "dldas";
    public static final String E911S = "e911s";
    public static final String TN_OPTIONS = "tnoptions";
    public static final String EXTERNAL_TNS = "externalTns";
    public static final String NUMBERS_ASSIGNMENT = "numbersAssignment";
    public static final String ACTIVATE_STATUS = "activationStatus";
    public static final String TERMINATION_SMALL = "termination";
    public static final String MESSAGING = "messaging";
    public static final String ESPIDS = "espids";
    public static final String TERMINATION_PRODUCTS = TERMINATION_SMALL + "Products";
    public static final String ATTRIBUTES = "attributes";
    public static final String ATTRIBUTE = "attribute";
    public static final String INCLUDE_ATTRIBUTES = "includeAttributes";
    public static final String ACCOUNT = "account";
    public static final String CARRIER = "carrier";
    public static final String TOLL_FREE_CARIER = "tollFreeCarriers";
    public static final String CARRIER_MASK = "carriermask";
    public static final String ROUTING_EXCEPTION = "routingexception";
    public static final String RATE_DECK = "ratedeck";
    public static final String UPLOAD = "upload";
    public static final String PRODUCT = "product";
    public static final String FILE = "file";
    public static final String IDENTITYDOMAINS = "identitydomains";
    public static final String SIP_CREDENTIALS = "sipcredentials";
    public static final String REPROVISION_TNS = "reprovisionTns";
    public static final String NUMBERS_ASSIGNMENT_DATA = "numbersassignmentdata";
    public static final String A2P_CAMPAIGN_IDS = "a2pCampaignIds";
    public static final String A2P_CLASSES = "a2pClasses";
    public static final String BREAK_OUT_COUNTRIES = "breakOutCountries";
    public static final String MESSAGING_BLOCKED_ACCOUNTS = "messagingBlockedAccountIds";
    public static final String IMPORT_TN_ORDERS = "Import Number orders";
    public static final String REMOVE_TN_ORDERS = "Remove Imported Number orders";

    // ===================================== xml binding ==================================================
    public static final String ADMIN_PARAMETERS_XML = "AdminParameters";
    public static final String SIP_PEER_TN = "SipPeerTelephoneNumber";
    public static final String SIP_PEER_TNS = "SipPeerTelephoneNumbers";
    public static final String LNP_ORDER_SUPP = "LnpOrderSupp";
    public static final String MANAGE_ORDERS_RESULT = "ManageOrdersResult";
    public static final String CONVERTER_DESCRIPTION = "ConverterDescription";
    public static final String LIDB_ORDER_XML = "LidbOrder";
    public static final String LSR_ORDER_XML = "LsrOrder";
    public static final String BILLING_REPORT = "BillingReport";

    // ==================================== Search Limit =================================================
    public static final int SEARCH_TNS_LIMIT = 500;
    public static final int NOT_CHOSEN_INDEX = -1;

    // ==================================== Search Filter ================================================
    public static final String ACCOUNT_ID = "accountId";
    public static final String PRIME_CONTACT = "bandwidthPrime";
    public static final String ORDER_ID = "orderId";
    public static final String ACTIVITY_STATE = "activityState";
    public static final String TN = "tn";
    public static final String START_DATE = "startdate";
    public static final String END_DATE = "enddate";
    public static final String ORDER_STATUS = "status";
    public static final String CUSTOMER_INTERNAL_ID = "customerOrderId";
    public static final String AREA_CODES = "areaCodes";
    public static final String PON = "pon";
    public static final String CUSTOMER_NAME = "customerName";
    public static final String BILLING_TELEPHONE_NUMBER = "billingTelephoneNumber";
    public static final String FOC_DATE = "focDate";
    public static final String USER_ID = "userId";
    public static final String VENDOR_ID = "vendorId";
    public static final String VENDOR_NAME = "vendorName";
    public static final String IMPORT_BILLINNG_TYPE = "billingType";
    public static final String ORDER_ID_FRAGMENT = "orderIdFragment";
    public static final String REQUESTED_FOC_DATE = "requestedFocDate";
    public static final String ACTUAL_FOC_DATE = "actualFocDate";
    public static final String LAST_MODIFIED_BY = "lastModifiedBy";
    public static final String LAST_MODIFIED_AFTER = "lastModifiedAfter";
    public static final String MOD_FROM_DATE = "modifiedDateFrom";
    public static final String MOD_TO_DATE = "modifiedDateTo";
    public static final String CREATED_FROM_DATE = "createdDateFrom";
    public static final String CREATED_TO_DATE = "createdDateTo";
    public static final String ORDER_DETAILS = "orderDetails";
    public static final String CALLBACK = "callBack";
    public static final String AEUI = "aeui";
    public static final String CALLING_ENDPOINT = "callingEndpoint";
    public static final String ACTION = "action";

    public static final String EVENT = "event";
    public static final String BDR_ID = "bdrId";
    public static final String LIDB_STATUS_PENDING = "Pending";

    public static final String UC250 = "UC250";
    public static final String UC500 = "UC500";
    public static final String UC1000 = "UC1000";

    public static final String UCTRUNKS = "uctrunks";

    public static final String BLOCKED = "Blocked";
    public static final String ALLOWED = "Allowed";
    public static final String YES = "Yes";
    public static final String NO = "No";

    // ========================================ResultModel column names======================================
    public static final String ACTIVITY_COLUMN_NAME = "ACTIVITY";
    public static final String ORDER_COLUMN_NAME = "ORDER";
    public static final String TYPE_COLUMN_NAME = "TYPE";
    public static final String CUSTOMER_COLUMN_NAME = "CUSTOMER";
    public static final String STATUS_COLUMN_NAME = "STATUS";
    public static final String NOTES_COLUMN_NAME = "NOTES";
    public static final String CALL_FAILURE_REDIRECT_DESTINATION = "CALL FAILURE REDIRECT DESTINATION";
    public static final String ORDER_DATE_COLUMN_NAME = "ORDER DATE";
    public static final String DATE_ORDERED_COLUMN_NAME = "DATE ORDERED";
    public static final String LAST_UPDATE_COLUMN_NAME = "LAST UPDATE";
    public static final String LAST_MODIFIED_COLUMN_NAME = "LAST MODIFIED";
    public static final String LAST_NOTE_COLUMN_NAME = "LAST NOTE";
    public static final String VENDOR_COLUMN_NAME = "VENDOR";
    public static final String SUPP_COLUMN_NAME = "SUPP";
    public static final String FOC_DATE_COLUMN_NAME = "FOC DATE";
    public static final String BW_CONTACT_COLUMN_NAME = "BW CONTACT";
    public static final String CUSTOMER_ID_COLUMN = "CUSTOMER ID";
    public static final String CUSTOMER_NAME_COLUMN = "NAME";

    public static final String ORDER_ID_COLUMN_NAME = "ORDER ID";
    public static final String NOTIFICATION_TYPE_COLUMN_NAME = "ORDER / EVENT TYPE";
    public static final String CUSTOMER_ORDER_ID_COLUMN_NAME = "CUSTOMER ORDER ID";
    public static final String QUANTITY_COLUMN_NAME = "QUANTITY";
    public static final String BILLING_TN_COLUMN_NAME = "BILLING TELEPHONE NUMBER";
    public static final String TELEPHONE_NUMBER_COLUMN_NAME = "TELEPHONE NUMBER";
    public static final String CALLER_IDENTIFIER_COLUMN_NAME = "IDENTIFIER";
    public static final String CALLBACK_NUMBER_COLUMN_NAME = "CALLBACK NUMBER";
    public static final String RATE_CENTER_COLUMN_NAME = "RATE CENTER";
    public static final String TIER_COLUMN_NAME = "TIER";
    public static final String CITY_COLUMN_NAME = "CITY";
    public static final String STATE_COLUMN_NAME = "STATE";
    public static final String ACCOUNT_ID_COLUMN_NAME = "ACCOUNT ID";
    public static final String E_MAIL_COLUMN_NAME = "E-MAIL";
    public static final String FREQUENCY_COLUMN_NAME = "FREQUENCY";
    public static final String ACTION_COLUMN_NAME = "ACTION";
    public static final String CALLER_NAME_COLUMN_NAME = "CALLER NAME";
    public static final String STREET_ADDRESS_COLUMN_NAME = "STREET ADDRESS";
    public static final String ADDRESS_LINE2_COLUMN_NAME = "ADDRESS LINE2";

    public static final String NUMBER = "NUMBER";
    public static final String SUBSCRIBER_INFORMATION = "SUBSCRIBER INFORMATION";
    public static final String SERVICE_TYPE = "SERVICE TYPE";
    public static final String PRESENTATION = "PRESENTATION";
    public static final String DESCRIPTION = "DESCRIPTION";
    public static final String ERROR_MESSAGE = "ERROR MESSAGE";

    public static final String LIDB_COLUMN_NAME = "LIDB";
    public static final String DLDA_COLUMN_NAME = "DLDA";
    public static final String E911_COLUMN_NAME = "E911";
    public static final String  TN_OPTION_COLUMN_NAME = "TnOption";

    public static final String LIDB = "Calling Name Information / LIDB";
    public static final String DL_DA = "Directory Listing / Directory Assistance";
    public static final String SUBSCRIBER_BUSINESS_NAME = "SUBSCRIBER/BUSINESS NAME";
    public static final String SUBSCRIBER = "SUBSCRIBER";
    public static final String SUBSCRIBER_TYPE = "SUBSCRIBER TYPE";
    public static final String LISTING_ADDRESS = "LISTING ADDRESS";
    public static final String INCLUDE_ADDRESS_IN_LISTING = "INCLUDE ADDRESS IN LISTING";

    public static final String E911 = "E911";
    public static final String TOLL_FREE = "tollfree";
    public static final String TN_SPECIFIC_ADDRESS = "TN Specific Address";
    public static final String DELETE_TN_SPECIFIC_ADDRESS = "Delete TN Specific Address";
    public static final String SEE_ORDER_DETAILS = "SEE ORDER DETAILS";

    public static final String TN_OPTION = "TN Option";
    public static final String NUMBER_FORMAT = "NUMBER FORMAT";
    public static final String RPID_FORMAT = "RPID FORMAT";
    public static final String REWRITE_USER = "REWRITE USER";
    public static final String CALL_FORWARD = "CALL FORWARD";
    public static final String CALLING_NAME_DISPLAY = "CALLING NAME DISPLAY";
    public static final String PROTECTED_HEADER = "PROTECTED";
    public static final String SMS = "SMS";
    public static final String A2P_CAMPAIGN_ID = "A2P CAMPAIGN ID";
    public static final String A2P_CLASS = "A2P CLASS";
    public static final String A2P_ACTION = "A2P ACTION";
    public static final String NNID = "NNID ASSIGNMENT";
    public static final String PORT_OUT_PASSCODE = "TN Passcode";

    // ========================================Date/Time patterns======================================

    public static final String EST_EDT_PATTERN = "MM/dd/yyyy h:mma";
    public static final String EST_DATE_PATTERN = "MM/dd/yyyy h:mma z";
    public static final String TIME_ONE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    public static final String TIME_TWO_PATTERN = "yyyyMMdd'T'HHmmss.SSS'Z'";
    public static final String TIME_OLD_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    public static final String TIME_OLD_WITH_TIMEZONE_PATTERN = "yyyy-MM-dd'T'HH:mm:ssZZZ";
    public static final String GENERAL_WEB_DATE_FORMAT_PATTERN = "MM/dd/yyyy";
    public static final String GENERAL_WEB_DATE_TIME_FORMAT_PATTERN = "MM/dd/yyyy h:mma 'UTC'";
    public static final String WEB_HISTORY_NOTES_TIME_PATTERN = "MM/dd/yyyy h:mm a";
    public static final String DEFAULT_DATE_FORMAT = "EEE MMM dd HH:mm:ss zzz yyyy";
    public static final String DATE_OLD_PATTERN = "yyyy-MM-dd";
    public static final String REG_EXP_DATE_ONLY_PATTERN = "^\\d{4}-\\d{2}-\\d{2}";
    public static final String REG_EXP_ONE_PATTERN = "^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}";
    public static final String REG_EXP_TWO_PATTERN = "^\\d{8}T\\d{6}\\.\\d{3}";
    public static final String REG_EXP_OLD_PATTERN = "^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}";
    public static final String REG_EXP_OLD_WITH_TIMEZONE_PATTERN = "^(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}[\\+,-]\\d{2}:\\d{2})$";
    public static final String REG_EXP_WEB_HISTORY_PATTERN = "^\\d{2}/\\d{2}/\\d{4} \\d{1,2}:\\d{1,2} [A,P]M";
    public static final String REG_EXP_WEB_DATE_PATTERN = "^\\d{2}/\\d{2}/\\d{4}";
    public static final String REG_EXP_DEFAULT_DATE_PATTERN = "(?:[a-zA-Z]{3}\\s){2}\\d{2}\\s\\d{2}:\\d{2}:\\d{2}\\s([A-Z]+)\\s\\d{4}";
}
