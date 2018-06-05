package com.ds.backup;

public class PrimeNumber {

    private static boolean isPrimeNumber(int n, int i) {
        if (i == 2) {
            return n % 2 == 0;
        }
        return n % i == 0 || isPrimeNumber(n, i - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(13, 11));
    }
}
