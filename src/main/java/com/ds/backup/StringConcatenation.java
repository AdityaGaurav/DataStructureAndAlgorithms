package com.ds.backup;

public class StringConcatenation {

    private static String build="";

    static String concatString(String inp, int length) {
        if (length == 1) {
            return build += inp.charAt(0);
        } else {
            build += inp.charAt(length - 1);
            return concatString(inp, length - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(concatString("Aditya",6));
    }
}
