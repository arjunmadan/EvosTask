package com.inetwork.web.data.shared.dto.orders.tnoption;

import com.google.gwt.core.client.GWT;
import com.inetwork.web.data.shared.dto.orders.orderdetail.A2pSettings;

import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class TnOption {
    public interface Reader extends XmlReader<TnOption> {
    }

    public interface Writer extends XmlWriter<TnOption> {
    }

    public static final Reader READER = GWT.create(Reader.class);
    public static final Writer WRITER = GWT.create(Writer.class);

    @Path("NumberFormat")
    private String numberFormat;
    @Path("RPIDFormat")
    private String rpidFormat;
    @Path("RewriteUser")
    private String rewriteUser;
    @Path("CallForward")
    private String callForward;
    @Path("NNID")
    private String nnid;
    @Path("CallingNameDisplay")
    private String cnamLookup;
    @Path("PortOutPasscode")
    private String portOutPasscode;
    @Path("Protected")
    private String protect;
    @Path("Sms")
    private String sms;
    @Path("FinalDestinationURI")
    private String finalDestinationUri;
    @Path("A2pSettings")
    private A2pSettings a2pSettings;
    @Path("ESPID")
    private String espid;

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

    public String getPortOutPasscode() {
        return portOutPasscode;
    }

    public void setPortOutPasscode(String portOutPasscode) {
        this.portOutPasscode = portOutPasscode;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getFinalDestinationUri() {
        return finalDestinationUri;
    }

    public void setFinalDestinationUri(String finalDestinationUri) {
        this.finalDestinationUri = finalDestinationUri;
    }

    public A2pSettings getA2pSettings() {
        return a2pSettings;
    }

    public void setA2pSettings(A2pSettings a2pSettings) {
        this.a2pSettings = a2pSettings;
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

    public String getProtect() {
        return protect;
    }

    public void setProtect(String protect) {
        this.protect = protect;
    }

    public int getTnOptionCount() {
        return (numberFormat == null ? 0 : 1) + (rpidFormat == null ? 0 : 1) + (rewriteUser == null ? 0 : 1) + (callForward == null ? 0 : 1)
                + (cnamLookup == null ? 0 : 1) + (protect == null ? 0 : 1) + (sms == null ? 0 : 1) + (finalDestinationUri == null ? 0 : 1)
                + (a2pSettings == null ? 0 : 1) + (nnid == null ? 0 : 1) + (portOutPasscode == null ? 0 : 1);
    }
}
