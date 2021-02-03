package com.inetwork.web.data.dto.imports.linefeatures.tnoption;

import static com.inetwork.web.data.shared.utils.StringUtils.isNotEmpty;

import com.google.common.base.Objects;
import com.inetwork.common.dto.admin.messaging.A2pSettings;
import com.inetwork.common.dto.tnoption.TnOptionGroup;
import com.inetwork.common.model.order.lineoption.attributes.LineOptionA2pAttribute;

public class TnOptionDetailsKey {
    private String numberFormat;
    private String rpidFormat;
    private String rewriteUser;
    private String callForward;
    private String cnamLookup;
    private String protect;
    private String sms;
    private String a2pCampaignId;
    private String a2pMessageClass;
    private String a2pAction;
    private String nnid;
    private String espid;
    private String passcode;

    public String getNumberFormat() {
        return numberFormat;
    }

    public void setNumberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
    }

    public String getRpidFormat() {
        return rpidFormat;
    }

    public void setRpidFormat(String rpidFormat) {
        this.rpidFormat = rpidFormat;
    }

    public String getRewriteUser() {
        return rewriteUser;
    }

    public void setRewriteUser(String rewriteUser) {
        this.rewriteUser = rewriteUser;
    }

    public String getCallForward() {
        return callForward;
    }

    public void setCallForward(String callForward) {
        this.callForward = callForward;
    }

    public String getCnamLookup() {
        return cnamLookup;
    }

    public void setCnamLookup(String cnamLookup) {
        this.cnamLookup = cnamLookup;
    }

    public String getProtect() {
        return protect;
    }

    public void setProtect(String protect) {
        this.protect = protect;
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

    public String getEspid() {
        return espid;
    }

    public void setEspid(String espid) {
        this.espid = espid;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TnOptionDetailsKey) {
            TnOptionDetailsKey tnOptionDetailsKey = (TnOptionDetailsKey) obj;
            return Objects.equal(numberFormat, tnOptionDetailsKey.getNumberFormat()) && Objects.equal(rpidFormat, tnOptionDetailsKey.getRpidFormat())
                    && Objects.equal(rewriteUser, tnOptionDetailsKey.getRewriteUser()) && Objects.equal(callForward, tnOptionDetailsKey.getCallForward())
                    && Objects.equal(cnamLookup, tnOptionDetailsKey.getCnamLookup()) && Objects.equal(protect, tnOptionDetailsKey.getProtect())
                    && Objects.equal(sms, tnOptionDetailsKey.getSms()) && Objects.equal(a2pCampaignId, tnOptionDetailsKey.getA2pCampaignId())
                    && Objects.equal(a2pMessageClass, tnOptionDetailsKey.getA2pMessageClass())
                    && Objects.equal(a2pAction, tnOptionDetailsKey.getA2pAction()) && Objects.equal(nnid, tnOptionDetailsKey.getNnid())
                    && Objects.equal(espid, tnOptionDetailsKey.getEspid()) && Objects.equal(passcode, tnOptionDetailsKey.getPasscode());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNumberFormat(), getRpidFormat(), getRewriteUser(), getCallForward(), getCnamLookup(), getProtect(), getSms(),
                getA2pCampaignId(), getA2pMessageClass(), getA2pAction(), getNnid(), getEspid(), getPasscode());
    }

    public TnOptionGroup asTnOptionGroup() {
        TnOptionGroup tnOptionGroup = new TnOptionGroup();
        tnOptionGroup.setNumberFormat(numberFormat);
        tnOptionGroup.setRpidFormat(rpidFormat);
        tnOptionGroup.setRewriteUser(rewriteUser);
        tnOptionGroup.setCallForward(callForward);
        tnOptionGroup.setCnamLookup(cnamLookup);
        tnOptionGroup.setProtect(protect);
        tnOptionGroup.setSms(sms);
        tnOptionGroup.setNnid(nnid);
        tnOptionGroup.setEspid(espid);
        tnOptionGroup.setPortOutPasscode(passcode);
        if (isNotEmpty(a2pCampaignId) || isNotEmpty(a2pMessageClass) || isNotEmpty(a2pAction)) {
            A2pSettings a2pSettings = A2pSettings.newBuilder()
                    .withCampaignId(a2pCampaignId)
                    .withMessageClass(a2pMessageClass)
                    .withAction(LineOptionA2pAttribute.toEnum(a2pAction))
                    .build();
            tnOptionGroup.setA2pSettings(a2pSettings);
        }
        return tnOptionGroup;
    }
}
