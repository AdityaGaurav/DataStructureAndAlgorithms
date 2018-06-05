package com.ds.recursion;

public class MysteryNumber {

    static int mysteryNumber(int n) {
        if (n < 10) {
            return n;
        } else {
            int a = n / 10;
            int b = n % 10;
            return 1 + mysteryNumber(a + b);
        }
    }

    public static void main(String[] args) {
        System.out.println(mysteryNumber(648));
    }
}
