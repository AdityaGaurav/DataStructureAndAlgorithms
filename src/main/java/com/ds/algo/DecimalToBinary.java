package com.ds.algo;

public class DecimalToBinary {

    static void printBinary(int number) {
        if (number == 0) System.out.println(0);
        while (number > 0) {
            System.out.println(number % 2);
        }
    }

    public static void main(String[] args) {
        printBinary(4);
    }
}
