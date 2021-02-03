package com.inetwork.web.data.shared.dto.orders.orderdetail.portorder;

import com.google.gwt.core.client.GWT;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class WirelessInfo {

   public interface Reader extends XmlReader<WirelessInfo>{}

   public interface  Writer extends XmlWriter<WirelessInfo> {}

   public static final Writer WRITER = GWT.create(Writer.class);

   public static final Reader READER = GWT.create(Reader.class);

    @Path("AccountNumber")
    private String accountNumber;
    @Path("PinNumber")
    private String pinNumber;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }
}
