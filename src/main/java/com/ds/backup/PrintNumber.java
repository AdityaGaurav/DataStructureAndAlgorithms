package com.ds.backup;

public class PrintNumber {

    static void printNumber(int n) {
        //Base case
        if (n == 0) {
            return;
        } else {
            //Recursive Steps
            System.out.println(n);
            printNumber(n - 1);
        }
    }

    static void printNumberInAsc(int n){
        if(n == 0){
            return;
        }
        printNumberInAsc(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printNumberInAsc(5);
    }
}
