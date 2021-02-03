package com.inetwork.web.data.dto.imports.linefeatures.cnam;

import static com.inetwork.web.data.shared.dto.lineoption.TnOptionAttribute.OFF;
import static com.inetwork.web.data.shared.dto.lineoption.TnOptionAttribute.ON;
import static com.inetwork.web.data.shared.dto.lineoption.TnOptionAttribute.SYSTEMDEFAULT;
import static com.inetwork.web.data.shared.utils.BooleanUtils.isFalse;
import static com.inetwork.web.data.shared.utils.BooleanUtils.toBooleanObject;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.apache.commons.lang.StringUtils.isEmpty;

import com.inetwork.web.data.dto.imports.linefeatures.LineFeaturesRow;
import com.inetwork.web.data.dto.imports.linefeatures.tnoption.TnOptionDetailsKey;
import com.inetwork.web.data.shared.utils.StringUtils;

public class TnOptionDetailsProvider {
    private static final TnOptionDetailsKey EMPTY_DETAILS = new TnOptionDetailsKey();

    public TnOptionDetailsKey provideDetails(LineFeaturesRow row) {
        TnOptionDetailsKey tnOptionDetailsKey = new TnOptionDetailsKey();
        if (StringUtils.isNotEmpty(row.getCnamDisplay())) {
            tnOptionDetailsKey.setCnamLookup(toTnOptionAttributeValue(row.getCnamDisplay(), ON, OFF));
        }
        String callForwardTn = row.getCallForwardTn();
        if (StringUtils.isNotEmpty(callForwardTn)) {
            Boolean callForwarding = toBooleanObject(callForwardTn);
            tnOptionDetailsKey.setCallForward(callForwarding != null && isFalse(callForwarding) ? SYSTEMDEFAULT.toString() : callForwardTn);
        }
        if (StringUtils.isNotEmpty(row.getRewriteUser())) {
            tnOptionDetailsKey.setRewriteUser(row.getRewriteUser());
        }
        if (StringUtils.isNotEmpty(row.getProtectedTn())) {
            tnOptionDetailsKey.setProtect(toTnOptionAttributeValue(row.getProtectedTn(), TRUE, FALSE));
        }
        if (StringUtils.isNotEmpty(row.getSms())) {
            tnOptionDetailsKey.setSms(toTnOptionAttributeValue(row.getSms(), ON, OFF));
        }
        if (StringUtils.isNotEmpty(row.getNnid())) {
            tnOptionDetailsKey.setNnid(row.getNnid());
        }
        tnOptionDetailsKey.setPasscode(toNotEmptyTnOptionAttributeValue(row.getPasscode()));
        tnOptionDetailsKey.setA2pAction(toNotEmptyTnOptionAttributeValue(row.getA2pAction()));
        tnOptionDetailsKey.setA2pCampaignId(toNotEmptyTnOptionAttributeValue(row.getA2pCampaignId()));
        tnOptionDetailsKey.setA2pMessageClass(toNotEmptyTnOptionAttributeValue(row.getA2pMessageClass()));

        return EMPTY_DETAILS.equals(tnOptionDetailsKey) ? null : tnOptionDetailsKey;
    }

    private String toTnOptionAttributeValue(String value, String positiveValue, String negativeValue) {
        if (value == null) {
            return null;
        }
        Boolean booleanObject = toBooleanObject(value);
        if (booleanObject == null) {
            return value;
        }
        if (booleanObject) {
            return positiveValue;
        }
        return negativeValue;
    }

    private String toTnOptionAttributeValue(String value, Object positiveValue, Object negativeValue) {
        return toTnOptionAttributeValue(value, positiveValue.toString(), negativeValue.toString());
    }

    /**
     * Some attributes can not be passed to API as an empty string value. In this case, we convert empty attribute into null
     * (i.e. not defined)
     */
    private String toNotEmptyTnOptionAttributeValue(String value) {
        return isEmpty(value) ? null : value;
    }
}
