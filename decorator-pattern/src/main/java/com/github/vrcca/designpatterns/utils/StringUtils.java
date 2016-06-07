package com.github.vrcca.designpatterns.utils;

public class StringUtils {

    public static String capitalize(String text) {
        String sizeName = text.toLowerCase();
        sizeName = Character.toUpperCase(sizeName.charAt(0)) + sizeName.substring(1);
        return sizeName;
    }
}
