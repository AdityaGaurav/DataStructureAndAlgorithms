package com.ds.strings;

public class ExtractNumbers {

    static String extractNumber(String input) {
        if (input == null) throw new NullPointerException("Should not be null");
        int length = input.length();
        int i = 0;
        StringBuilder numbers = new StringBuilder("");
        while (i < length) {
            char c = input.charAt(i);
            if (c >= 48 && c <= 57)
                numbers.append(c);
            i++;
        }
        return numbers.toString();
    }

    public static void main(String[] args) {
        String input = "!@12#45as  34";
        System.out.println(extractNumber(input));
    }
}
