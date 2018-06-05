package com.ds.backup;

public class PrintStar {

    static void printStarPattern(int n) {
        if (n == 1) System.out.println("*");
        else {
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println("");
            printStarPattern(n - 1);
        }
    }

    public static void main(String[] args) {
        printStarPattern(4);
    }
}
