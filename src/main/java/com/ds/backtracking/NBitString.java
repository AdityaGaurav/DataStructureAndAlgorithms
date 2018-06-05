package com.ds.backtracking;

public class NBitString {
    static int[] A = new int[4];

    static void nBitString(int n) {
        if (n < 1) {
            for (int i : A) {
                System.out.print(i);
            }
            System.out.println();
        } else {
            A[n - 1] = 0;
            nBitString(n - 1);
            A[n - 1] = 1;
            nBitString(n - 1);
        }
    }

    public static void main(String[] args) {
        nBitString(4);
    }
}
