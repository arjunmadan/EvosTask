package com.inetwork.web.data.shared;

import com.inetwork.web.data.shared.utils.HumanReadableValue;

public enum ExternalTnsOrderLoaType implements HumanReadableValue
{
    CARRIER("CARRIER"), SUBSCRIBER("SUBSCRIBER");

    private final String humanReadableValue;

    ExternalTnsOrderLoaType(String humanReadableValue)
    {
        this.humanReadableValue = humanReadableValue;
    }

    @Override
    public String getHumanReadableValue()
    {
        return humanReadableValue;
    }

    public static ExternalTnsOrderLoaType toEnum(String stringValue)
    {
        for (ExternalTnsOrderLoaType value : values())
        {
            if (value.toString()
                    .equalsIgnoreCase(stringValue))
            {
                return value;
            }
        }
        return null;
    }
}
