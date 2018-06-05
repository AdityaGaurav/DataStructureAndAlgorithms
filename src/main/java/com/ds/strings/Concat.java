package com.ds.strings;

public class Concat {
    private static String concatInputs(String... inputs) {
        if (inputs.length == 0) {
            return "";
        }
        int length = 0;
        for (String s : inputs)
            length += s.length();
        char[] inpChars = new char[length];
        int count = 0;
        for (String s : inputs)
            for (char c : s.toCharArray())
                inpChars[count++] = c;

        return new String(inpChars);
    }


    public static void main(String[] args) {
        System.out.println(concatInputs("Aditya", " ", "Tripathi"));
    }
}
