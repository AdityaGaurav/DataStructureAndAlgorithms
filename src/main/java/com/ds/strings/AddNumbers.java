package com.ds.strings;

public class AddNumbers {

    private static int addNumberFromString(String input) {
        if (input == null) throw new NullPointerException("");
        StringBuilder number = new StringBuilder("");
        int i = 0;
        int length = input.length();
        int sum = 0;
        while (i < length) {
            char c = input.charAt(i);
            if (c >= 48 && c <= 57) {
                number.append(c);
            } else {
                if (number.length() > 0) {
                    sum += Integer.parseInt(number.toString());
                    number = new StringBuilder("");
                }
            }
            i++;
        }
        if (number.length() > 0)
            sum += Integer.parseInt(number.toString());

        return sum;
    }

    public static void main(String[] args) {
        String input = "!@12#4b5as";
        System.out.println(addNumberFromString(input));
    }
}
