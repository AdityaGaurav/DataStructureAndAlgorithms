package com.ds.recursion;

public class Factorial {
    static int getFactorialIterative(int n) {
        if (n < 0) throw new IllegalArgumentException("Input should be grater than 0");
        if (n == 0) return 1;
        if (n == 1) return 1;
        int i = 1, result = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }

    static int getFactorialRecursive(int n) {
        if (n < 0) throw new IllegalArgumentException("Input should be grater than 0");
        //base case
        if (n == 0) return 1;
        else return n * getFactorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int inp = 4;
        System.out.println(getFactorialRecursive(inp));
    }
}
