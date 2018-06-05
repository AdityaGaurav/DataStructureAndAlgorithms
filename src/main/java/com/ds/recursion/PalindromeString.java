package com.ds.recursion;

public class PalindromeString {

    static boolean isPalindromeIterative(String input) {
        if (input == null) throw new NullPointerException("Input should not be null");
        if (input.trim().isEmpty()) throw new IllegalArgumentException("Input should not be empty");
        int length = input.length();
        boolean result = true;
        for (int index = 0; index < length / 2; index++) {
            if (!(input.charAt(index) == input.charAt(length - 1 - index))) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static boolean isPalindromeRecursively(String input, int length) {
        if (length < 2) {
            return true;
        } else {
            char first = input.charAt(0);
            char last = input.charAt(length - 1);
            return first == last && isPalindromeRecursively(input.substring(1, length - 1), length - 2);
        }
    }

    private static boolean isPalindrome(String input) {
        if (input.length() <= 1) {
            return true;
        } else return input.charAt(0) == input.charAt(input.length() - 1) &&
                isPalindrome(input.substring(1, input.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("mfm"));
    }
}
