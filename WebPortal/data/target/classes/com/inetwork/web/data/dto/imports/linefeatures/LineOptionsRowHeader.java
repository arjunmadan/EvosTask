package com.inetwork.web.data.dto.imports.linefeatures;

import java.util.List;

import com.google.common.collect.Lists;

public final class LineOptionsRowHeader {
    private LineOptionsRowHeader() {
    }

    public static final List<String> E911_HEADERS = createE911Headers();

    public static final String TN = Prefix.TN + "TN";
    public static final String CNAM_DISPLAY = Prefix.CNAM + "CNAM Display";
    public static final String PROTECTED_TN = Prefix.PROTECTED + "Protected TN";
    public static final String CALL_FORWARD_TN = Prefix.CALL_FORWARD + "TN";
    public static final String REWRITE_USER_URI = Prefix.REWRITE_USER + "New URI User";

    public static final String LIDB_NAME = Prefix.LIDB + "Name";
    public static final String LIDB_SERVICE_TYPE = Prefix.LIDB + "Service Type";
    public static final String LIDB_PRESENTATION = Prefix.LIDB + "Presentation";

    public static final String DLDA_SUBSCRIBER_TYPE = Prefix.DLDA + "SubscriberType";
    public static final String DLDA_LISTING_TYPE = Prefix.DLDA + "ListingType";
    public static final String DLDA_LIST_ADDRESS = Prefix.DLDA + "ListAddress";
    public static final String DLDA_FIRST_NAME = Prefix.DLDA + "FirstName";
    public static final String DLDA_FIRST_NAME2 = Prefix.DLDA + "FirstName2";
    public static final String DLDA_LAST_NAME = Prefix.DLDA + "LastName";
    public static final String DLDA_DESIGNATION = Prefix.DLDA + "Designation";
    public static final String DLDA_TITLE_OF_LINEAGE = Prefix.DLDA + "TitleOfLineage";
    public static final String DLDA_TITLE_OF_ADDRESS = Prefix.DLDA + "TitleOfAddress";
    public static final String DLDA_TITLE_OF_ADDRESS2 = Prefix.DLDA + "TitleOfAddress2";
    public static final String DLDA_TITLE_OF_LINEAGE_NAME2 = Prefix.DLDA + "TitleOfLineageName2";
    public static final String DLDA_TITLE_OF_ADDRESS_NAME2 = Prefix.DLDA + "TitleOfAddressName2";
    public static final String DLDA_TITLE_OF_ADDRESS_2NAME2 = Prefix.DLDA + "TitleOfAddress2Name2";
    public static final String DLDA_PLACE_LISTING_AS = Prefix.DLDA + "PlaceListingAs";
    public static final String DLDA_HOUSE_PREFIX = Prefix.ADDR + "HousePrefix";
    public static final String DLDA_HOUSE_NUMBER = Prefix.ADDR + "HouseNumber";
    public static final String DLDA_HOUSE_SUFFIX = Prefix.ADDR + "HouseSuffix";
    public static final String DLDA_PRE_DIRECTIONAL = Prefix.ADDR + "PreDirectional";
    public static final String DLDA_STREET_NAME = Prefix.ADDR + "StreetName";
    public static final String DLDA_STREET_SUFFIX = Prefix.ADDR + "StreetSuffix";
    public static final String DLDA_POST_DIRECTIONAL = Prefix.ADDR + "PostDirectional";
    public static final String DLDA_ADDRESS_LINE2 = Prefix.ADDR + "AddressLine2";
    public static final String DLDA_CITY = Prefix.ADDR + "City";
    public static final String DLDA_STATE_CODE = Prefix.ADDR + "StateCode";
    public static final String DLDA_ZIP = Prefix.ADDR + "Zip";
    public static final String DLDA_ZIP_PLUS_4 = Prefix.ADDR + "Zip+4";
    public static final String DLDA_SERVICE_TYPE = Prefix.DLDA + "ServiceType";

    public static final String E911_CALLER_NAME = Prefix.E911 + "CallerName";
    public static final String E911_SERVICE_TYPE = Prefix.E911 + "ServiceType";
    public static final String E911_HOUSE_PREFIX = Prefix.E911 + "HousePrefix";
    public static final String E911_HOUSE_NUMBER = Prefix.E911 + "HouseNumber";
    public static final String E911_HOUSE_SUFFIX = Prefix.E911 + "HouseSuffix";
    public static final String E911_PRE_DIRECTIONAL = Prefix.E911 + "PreDirectional";
    public static final String E911_STREET_NAME = Prefix.E911 + "StreetName";
    public static final String E911_STREET_SUFFIX = Prefix.E911 + "StreetSuffix";
    public static final String E911_POST_DIRECTIONAL = Prefix.E911 + "PostDirectional";
    public static final String E911_ADDRESS_LINE2 = Prefix.E911 + "AddressLine2";
    public static final String E911_CITY = Prefix.E911 + "City";
    public static final String E911_STATE_CODE = Prefix.E911 + "StateCode";
    public static final String E911_ZIP = Prefix.E911 + "Zip";
    public static final String E911_ZIP_PLUS_4 = Prefix.E911 + "Zip+4";
    public static final String LATITUDE = Prefix.E911 + "Latitude";
    public static final String LONGITUDE = Prefix.E911 + "Longitude";

    public static final String SMS = Prefix.MESSAGING + "SMS";
    public static final String A2P_CAMPAIGN_ID = Prefix.A2P_SETTINGS + "CampaignId";
    public static final String A2P_MESSAGE_CLASS = Prefix.A2P_SETTINGS + "MessageClass";
    public static final String A2P_ACTION = Prefix.A2P_SETTINGS + "Action";
    public static final String NNID = Prefix.NNID + "Assignment";
    public static final String PASSCODE = Prefix.PASSCODE + "TN Passcode";

    private static List<String> createE911Headers() {
        List<String> e911Headers = Lists.newArrayList();
        e911Headers.add(E911_CALLER_NAME);
        e911Headers.add(E911_SERVICE_TYPE);
        e911Headers.add(E911_HOUSE_PREFIX);
        e911Headers.add(E911_HOUSE_NUMBER);
        e911Headers.add(E911_HOUSE_SUFFIX);
        e911Headers.add(E911_PRE_DIRECTIONAL);
        e911Headers.add(E911_STREET_NAME);
        e911Headers.add(E911_STREET_SUFFIX);
        e911Headers.add(E911_POST_DIRECTIONAL);
        e911Headers.add(E911_ADDRESS_LINE2);
        e911Headers.add(E911_CITY);
        e911Headers.add(E911_STATE_CODE);
        e911Headers.add(E911_ZIP);
        e911Headers.add(E911_ZIP_PLUS_4);
        return e911Headers;
    }
}
