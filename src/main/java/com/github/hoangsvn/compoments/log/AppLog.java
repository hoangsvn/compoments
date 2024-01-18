package com.github.hoangsvn.compoments.log;

import org.slf4j.LoggerFactory;

public class AppLog {

    public static void INFO(Class<?> clazz, String... value) {
        LoggerFactory.getLogger(clazz).info(LogString(value));
    }

    public static void ERROR(Class<?> clazz, String... value) {
        LoggerFactory.getLogger(clazz).error(LogString(value));
    }

    public static void WARM(Class<?> clazz, String... value) {
        LoggerFactory.getLogger(clazz).warn(LogString(value));
    }


    public static String LogString(String... value) {

        StringBuilder logMessage = new StringBuilder(String.format("%-45s :", value[0]));
        if (value.length > 1) {
            for (int i = 1; i < value.length; i++) {
                logMessage.append(" ").append(value[i]);
            }
        }
        return logMessage.toString();
    }

    public static String CustomBoderString(String index, String repeat, String str, int totalLength) {
        int strLength = str.length();
        int borderLength = (totalLength - strLength) / 2 - 3;
        StringBuilder borderedStr = new StringBuilder();
        borderedStr.append(index);
        borderedStr.append(repeat.repeat(borderLength));
        borderedStr.append("[ ").append(str).append(" ]");
        borderedStr.append(repeat.repeat(borderLength));
        borderedStr.append(index);
        return borderedStr.toString();
    }
}
