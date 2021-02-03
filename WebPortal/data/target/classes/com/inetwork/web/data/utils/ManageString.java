package com.inetwork.web.data.utils;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;

public class ManageString {

    private ManageString() {
    }

    public static Stream<String> getStringStreamByDelimiter(String string, String separator) {
        return Optional.ofNullable(StringUtils.split(string, separator))
                .map(Arrays::stream)
                .orElseGet(Stream::empty)
                .filter(Objects::nonNull)
                .distinct()
                .map(StringUtils::trim);
    }

    public static String addValueToString(String string, String value) {
        return Stream.concat(getStringStreamByDelimiter(string, ","), Stream.of(value)).filter(Objects::nonNull)
                .distinct().collect(Collectors.joining(","));
    }

    public static String removeValueFromString(String string, String value) {
        return getStringStreamByDelimiter(string, ",").filter(str -> str.isEmpty() || !str.equals(value))
                .collect(Collectors.joining(","));
    }

}
