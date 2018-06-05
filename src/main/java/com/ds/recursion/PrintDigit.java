package com.ds.recursion;

public class PrintDigit {
    static void printDigitRecursive(int n){
        if( n/ 10 == 0){
            System.out.println(n);
        }
        else {
            System.out.println(n % 10);
            printDigitRecursive(n/10);
        }
    }

    static void printDigitIterative(int n){
        while (n > 0){
            System.out.println(n % 10);
            n /= 10;
        }
    }

    public static void main(String[] args) {
        printDigitIterative(1234);
    }
}
