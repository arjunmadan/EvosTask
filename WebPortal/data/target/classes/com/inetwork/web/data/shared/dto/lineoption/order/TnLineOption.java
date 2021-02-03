package com.inetwork.web.data.shared.dto.lineoption.order;

import com.inetwork.web.data.shared.dto.orders.orderdetail.A2pSettings;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

import com.google.gwt.core.client.GWT;

public class TnLineOption {
    public interface Reader extends XmlReader<TnLineOption> {
    }

    public interface Writer extends XmlWriter<TnLineOption> {
    }

    public static final Reader READER = GWT.create(Reader.class);
    public static final Writer WRITER = GWT.create(Writer.class);

    @Path("TelephoneNumber")
    private String telephoneNumber;
    @Path("NumberFormat")
    private String numberFormat;
    @Path("RPIDFormat")
    private String rpidFormat;
    @Path("RewriteUser")
    private String rewriteUser;
    @Path("CallForward")
    private String callForward;
    @Path("CallingNameDisplay")
    private String cnamLookup;
    @Path("Protected")
    private String protect;
    @Path("Sms")
    private String sms;
    @Path("A2pSettings")
    private A2pSettings a2pSettings;
    @Path("Passcode")
    private String portOutPasscode;

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

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

    public A2pSettings getA2pSettings() {
        return a2pSettings;
    }

    public void setA2pSettings(A2pSettings a2pSettings) {
        this.a2pSettings = a2pSettings;
    }

    public String getPortOutPasscode() {
        return portOutPasscode;
    }

    public void setPortOutPasscode(String portOutPasscode) {
        this.portOutPasscode = portOutPasscode;
    }
}
