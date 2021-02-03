package com.inetwork.web.data.shared.lnpupdate;

public enum SubscriberType {
    BUSINESS("business"),
    RESIDENTIAL("residential");

    private final String value;

    SubscriberType(final String value) {
        this.value = value;
    }

    public String getDatabaseValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

}