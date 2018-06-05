package com.ds.sample;

public class Sample1 {
    private static void sample1(int n) {
        if (n == 5) {
            System.out.println("if: " + n);
            return;
        } else {
            System.out.println("else: " + n);
        }
        System.out.println(n++);
    }



    public static void main(String[] args) {
        int i=5;
        while(i-->0);
        sample1(4);
    }
}
