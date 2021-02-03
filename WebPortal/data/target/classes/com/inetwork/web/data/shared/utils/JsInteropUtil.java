package com.inetwork.web.data.shared.utils;

/**
 * This is a dumb class with dumb methods to get around the fact that JsInterop doesn't automatically unbox Integer,
 * Double, Boolean, etc.  One may hope that in the future, such conversions are unnecessary.
 */
public class JsInteropUtil
{
    public static boolean unboxBoolean(Boolean b, boolean valueIfNull)
    {
        return (b == null) ? valueIfNull : b;
    }

    public static boolean unboxBoolean(Boolean b)
    {
        return unboxBoolean(b, false);
    }

    public static int unboxInteger(Integer i, int valueIfNull)
    {
        return (i == null) ? valueIfNull : i;
    }

    public static int unboxInteger(Integer i)
    {
        return unboxInteger(i, 0);
    }
}
