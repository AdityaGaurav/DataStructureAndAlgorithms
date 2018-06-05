package com.ds.strings;

public class Suffix {

    static boolean isSuffix(String inp1, String suffix) {
        int lengthInp = inp1.length() - 1;
        int suffixLength = suffix.length() - 1;
        boolean result = true;
        while ( suffixLength >=0) {
            if (suffix.charAt(suffixLength) == inp1.charAt(lengthInp)) {
                suffixLength--;
                lengthInp--;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String inp = "Hello World";
        String inp2 = "Hello World";
        System.out.println(isSuffix(inp,inp2));
    }
}
