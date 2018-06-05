package com.ds.backup;

import java.util.Random;

public class SumOfDigit {
    private static int digits;
//    static int sumOfDigit(int digit){
//        int result =0;
//        while (digit > 0){
//            result += digit % 10;
//        }
//    }

    static void printDigit(int n, int length) {
        int d = 0;
        while (n > 0) {
            d += n % 10;
            n /= 10;
        }
        System.out.println(d);
    }

    private static int addDigitRecursive(int n) {
        if (n/10 == 0) {
            return n;
        }
            return (n % 10)+addDigitRecursive(n / 10);
    }

    private static int getRandomNumber(int initial, int limit) {
        if (initial >= limit) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((limit - initial) + 1) + initial;
    }


    public static void main(String[] args) {
        int add = addDigitRecursive(26587);
        System.out.println(add);
    }
}
