package com.inetwork.web.data.dto.imports.linefeatures;

import com.inetwork.common.util.csv.model.CsvHeaderName;

public class LineFeaturesRow {
    @CsvHeaderName(LineOptionsRowHeader.TN)
    private String number;
    @CsvHeaderName(LineOptionsRowHeader.CNAM_DISPLAY)
    private String cnamDisplay;
    @CsvHeaderName(LineOptionsRowHeader.PROTECTED_TN)
    private String protectedTn;
    @CsvHeaderName(LineOptionsRowHeader.CALL_FORWARD_TN)
    private String callForwardTn;
    @CsvHeaderName(LineOptionsRowHeader.PASSCODE)
    private String passcode;
    @CsvHeaderName(LineOptionsRowHeader.REWRITE_USER_URI)
    private String rewriteUser;
    @CsvHeaderName(LineOptionsRowHeader.LIDB_NAME)
    private String name;
    @CsvHeaderName(LineOptionsRowHeader.LIDB_SERVICE_TYPE)
    private String serviceType;
    @CsvHeaderName(LineOptionsRowHeader.LIDB_PRESENTATION)
    private String presentation;

    @CsvHeaderName(LineOptionsRowHeader.DLDA_SUBSCRIBER_TYPE)
    private String subscriberType;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_LISTING_TYPE)
    private String listingType;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_LIST_ADDRESS)
    private String listAddress;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_FIRST_NAME)
    private String firstName;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_FIRST_NAME2)
    private String firstName2;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_LAST_NAME)
    private String lastName;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_DESIGNATION)
    private String designation;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_TITLE_OF_LINEAGE)
    private String titleOfLineage;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_TITLE_OF_ADDRESS)
    private String titleOfAddress;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_TITLE_OF_ADDRESS2)
    private String titleOfAddress2;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_TITLE_OF_LINEAGE_NAME2)
    private String titleOfLineageName2;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_TITLE_OF_ADDRESS_NAME2)
    private String titleOfAddressName2;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_TITLE_OF_ADDRESS_2NAME2)
    private String titleOfAddress2Name2;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_PLACE_LISTING_AS)
    private String placeListingAs;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_HOUSE_PREFIX)
    private String housePrefix;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_HOUSE_NUMBER)
    private String houseNumber;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_HOUSE_SUFFIX)
    private String houseSuffix;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_PRE_DIRECTIONAL)
    private String preDirectional;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_STREET_NAME)
    private String streetName;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_STREET_SUFFIX)
    private String streetSuffix;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_POST_DIRECTIONAL)
    private String postDirectional;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_ADDRESS_LINE2)
    private String addressLine2;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_CITY)
    private String city;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_STATE_CODE)
    private String stateCode;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_ZIP)
    private String zip;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_ZIP_PLUS_4)
    private String zipPlus4;
    @CsvHeaderName(LineOptionsRowHeader.DLDA_SERVICE_TYPE)
    private String dldaServiceType;

    @CsvHeaderName(LineOptionsRowHeader.E911_CALLER_NAME)
    private String callerName;
    @CsvHeaderName(LineOptionsRowHeader.E911_SERVICE_TYPE)
    private String e911ServiceType;
    @CsvHeaderName(LineOptionsRowHeader.E911_HOUSE_PREFIX)
    private String e911HousePrefix;
    @CsvHeaderName(LineOptionsRowHeader.E911_HOUSE_NUMBER)
    private String e911HouseNumber;
    @CsvHeaderName(LineOptionsRowHeader.E911_HOUSE_SUFFIX)
    private String e911HouseSuffix;
    @CsvHeaderName(LineOptionsRowHeader.E911_PRE_DIRECTIONAL)
    private String e911PreDirectional;
    @CsvHeaderName(LineOptionsRowHeader.E911_STREET_NAME)
    private String e911StreetName;
    @CsvHeaderName(LineOptionsRowHeader.E911_STREET_SUFFIX)
    private String e911StreetSuffix;
    @CsvHeaderName(LineOptionsRowHeader.E911_POST_DIRECTIONAL)
    private String e911PostDirectional;
    @CsvHeaderName(LineOptionsRowHeader.E911_ADDRESS_LINE2)
    private String e911AddressLine2;
    @CsvHeaderName(LineOptionsRowHeader.E911_CITY)
    private String e911City;
    @CsvHeaderName(LineOptionsRowHeader.E911_STATE_CODE)
    private String e911StateCode;
    @CsvHeaderName(LineOptionsRowHeader.E911_ZIP)
    private String e911Zip;
    @CsvHeaderName(LineOptionsRowHeader.E911_ZIP_PLUS_4)
    private String e911ZipPlus4;
    @CsvHeaderName(LineOptionsRowHeader.LATITUDE)
    private String latitude;
    @CsvHeaderName(LineOptionsRowHeader.LONGITUDE)
    private String longitude;

    @CsvHeaderName(LineOptionsRowHeader.SMS)
    private String sms;
    @CsvHeaderName(LineOptionsRowHeader.A2P_CAMPAIGN_ID)
    private String a2pCampaignId;
    @CsvHeaderName(LineOptionsRowHeader.A2P_MESSAGE_CLASS)
    private String a2pMessageClass;
    @CsvHeaderName(LineOptionsRowHeader.A2P_ACTION)
    private String a2pAction;
    @CsvHeaderName(LineOptionsRowHeader.NNID)
    private String nnid;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCnamDisplay() {
        return cnamDisplay;
    }

    public void setCnamDisplay(String cnamDisplay) {
        this.cnamDisplay = cnamDisplay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getSubscriberType() {
        return subscriberType;
    }

    public void setSubscriberType(String subscriberType) {
        this.subscriberType = subscriberType;
    }

    public String getListingType() {
        return listingType;
    }

    public void setListingType(String listingType) {
        this.listingType = listingType;
    }

    public String getListAddress() {
        return listAddress;
    }

    public void setListAddress(String listAddress) {
        this.listAddress = listAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName2() {
        return firstName2;
    }

    public void setFirstName2(String firstName2) {
        this.firstName2 = firstName2;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getTitleOfLineage() {
        return titleOfLineage;
    }

    public void setTitleOfLineage(String titleOfLineage) {
        this.titleOfLineage = titleOfLineage;
    }

    public String getTitleOfAddress() {
        return titleOfAddress;
    }

    public void setTitleOfAddress(String titleOfAddress) {
        this.titleOfAddress = titleOfAddress;
    }

    public String getTitleOfAddress2() {
        return titleOfAddress2;
    }

    public void setTitleOfAddress2(String titleOfAddress2) {
        this.titleOfAddress2 = titleOfAddress2;
    }

    public String getTitleOfLineageName2() {
        return titleOfLineageName2;
    }

    public void setTitleOfLineageName2(String titleOfLineageName2) {
        this.titleOfLineageName2 = titleOfLineageName2;
    }

    public String getTitleOfAddressName2() {
        return titleOfAddressName2;
    }

    public void setTitleOfAddressName2(String titleOfAddressName2) {
        this.titleOfAddressName2 = titleOfAddressName2;
    }

    public String getTitleOfAddress2Name2() {
        return titleOfAddress2Name2;
    }

    public void setTitleOfAddress2Name2(String titleOfAddress2Name2) {
        this.titleOfAddress2Name2 = titleOfAddress2Name2;
    }

    public String getPlaceListingAs() {
        return placeListingAs;
    }

    public void setPlaceListingAs(String placeListingAs) {
        this.placeListingAs = placeListingAs;
    }

    public String getHousePrefix() {
        return housePrefix;
    }

    public void setHousePrefix(String housePrefix) {
        this.housePrefix = housePrefix;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseSuffix() {
        return houseSuffix;
    }

    public void setHouseSuffix(String houseSuffix) {
        this.houseSuffix = houseSuffix;
    }

    public String getPreDirectional() {
        return preDirectional;
    }

    public void setPreDirectional(String preDirectional) {
        this.preDirectional = preDirectional;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetSuffix() {
        return streetSuffix;
    }

    public void setStreetSuffix(String streetSuffix) {
        this.streetSuffix = streetSuffix;
    }

    public String getPostDirectional() {
        return postDirectional;
    }

    public void setPostDirectional(String postDirectional) {
        this.postDirectional = postDirectional;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZipPlus4() {
        return zipPlus4;
    }

    public void setZipPlus4(String zipPlus4) {
        this.zipPlus4 = zipPlus4;
    }

    public String getDldaServiceType() {
        return dldaServiceType;
    }

    public void setDldaServiceType(String dldaServiceType) {
        this.dldaServiceType = dldaServiceType;
    }

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public String getE911ServiceType() {
        return e911ServiceType;
    }

    public void setE911ServiceType(String e911ServiceType) {
        this.e911ServiceType = e911ServiceType;
    }

    public String getE911HousePrefix() {
        return e911HousePrefix;
    }

    public void setE911HousePrefix(String e911HousePrefix) {
        this.e911HousePrefix = e911HousePrefix;
    }

    public String getE911HouseNumber() {
        return e911HouseNumber;
    }

    public void setE911HouseNumber(String e911HouseNumber) {
        this.e911HouseNumber = e911HouseNumber;
    }

    public String getE911HouseSuffix() {
        return e911HouseSuffix;
    }

    public void setE911HouseSuffix(String e911HouseSuffix) {
        this.e911HouseSuffix = e911HouseSuffix;
    }

    public String getE911PreDirectional() {
        return e911PreDirectional;
    }

    public void setE911PreDirectional(String e911PreDirectional) {
        this.e911PreDirectional = e911PreDirectional;
    }

    public String getE911StreetName() {
        return e911StreetName;
    }

    public void setE911StreetName(String e911StreetName) {
        this.e911StreetName = e911StreetName;
    }

    public String getE911StreetSuffix() {
        return e911StreetSuffix;
    }

    public void setE911StreetSuffix(String e911StreetSuffix) {
        this.e911StreetSuffix = e911StreetSuffix;
    }

    public String getE911PostDirectional() {
        return e911PostDirectional;
    }

    public void setE911PostDirectional(String e911PostDirectional) {
        this.e911PostDirectional = e911PostDirectional;
    }

    public String getE911AddressLine2() {
        return e911AddressLine2;
    }

    public void setE911AddressLine2(String e911AddressLine2) {
        this.e911AddressLine2 = e911AddressLine2;
    }

    public String getE911City() {
        return e911City;
    }

    public void setE911City(String e911City) {
        this.e911City = e911City;
    }

    public String getE911StateCode() {
        return e911StateCode;
    }

    public void setE911StateCode(String e911StateCode) {
        this.e911StateCode = e911StateCode;
    }

    public String getE911Zip() {
        return e911Zip;
    }

    public void setE911Zip(String e911Zip) {
        this.e911Zip = e911Zip;
    }

    public String getE911ZipPlus4() {
        return e911ZipPlus4;
    }

    public void setE911ZipPlus4(String e911ZipPlus4) {
        this.e911ZipPlus4 = e911ZipPlus4;
    }

    public String getProtectedTn() {
        return protectedTn;
    }

    public void setProtectedTn(String protectedTn) {
        this.protectedTn = protectedTn;
    }

    public String getCallForwardTn() {
        return callForwardTn;
    }

    public void setCallForwardTn(String callForwardTn) {
        this.callForwardTn = callForwardTn;
    }

    public String getRewriteUser() {
        return rewriteUser;
    }

    public void setRewriteUser(String rewriteUser) {
        this.rewriteUser = rewriteUser;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getA2pCampaignId() {
        return a2pCampaignId;
    }

    public void setA2pCampaignId(String a2pCampaignId) {
        this.a2pCampaignId = a2pCampaignId;
    }

    public String getA2pMessageClass() {
        return a2pMessageClass;
    }

    public void setA2pMessageClass(String a2pMessageClass) {
        this.a2pMessageClass = a2pMessageClass;
    }

    public String getA2pAction() {
        return a2pAction;
    }

    public void setA2pAction(String a2pAction) {
        this.a2pAction = a2pAction;
    }

    public String getNnid() {
        return nnid;
    }

    public void setNnid(String nnid) {
        this.nnid = nnid;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
