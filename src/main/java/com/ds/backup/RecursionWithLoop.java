package com.ds.backup;

public class RecursionWithLoop {

    static void printRecursively(int n){
        if(n ==0){
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("   "+n);
            printRecursively(n - 1);
            System.out.println("To make number even: "+n * 2);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        printRecursively(4);
    }
}
