package com.ds.recursion;

public class PrintDigitsPattern {
    static void printDigitPatternDesc(int number) {
        //base case
        if (number / 10 == 0) {
            System.out.println(number);
        } else {
            printDigitPatternDesc(number / 10);
            System.out.println(number);
        }
    }

    static void printDigitPattern(int number) {
        //base case
        if (number / 10 == 0) {
            System.out.println(number);
        } else {
            System.out.println(number / 10);
            printDigitPattern(number / 10);
        }
    }



    public static void main(String[] args) {
        printDigitPattern(786999);
    }
}
