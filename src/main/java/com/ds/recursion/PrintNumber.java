package com.ds.recursion;

public class PrintNumber {

    static void printNumberDesc(int n) {
        //base case
        if (n == 0) {
            return;
        } else {
            //recursive case
            System.out.println(n);
            printNumberDesc(n - 1);
        }
    }

    static void printNumberAsc(int n) {
        //base case
        if (n == 0) {
            return;
        } else {
            //recursive case
            printNumberAsc(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        printNumberAsc(10);
    }
}
