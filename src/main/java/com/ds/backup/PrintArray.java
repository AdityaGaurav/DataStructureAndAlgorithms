package com.ds.backup;

public class PrintArray {

    static void printArrayRecursively(int[] n, int length) {
        if (length == 1) {
            System.out.println(n[0]);
        } else {
            System.out.println(n[length-1]);
            printArrayRecursively(n, length - 1);
        }
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        printArrayRecursively(num, 5);
    }
}
