package com.ds.sample;

public class StarPattern {

    static void printStart(int rows) {
        if (rows < 0) throw new IllegalArgumentException("Can not be less than zero");
        //int x = 2 * rows - 2;
        for (int i = 0; i < rows; i++) {
            for (int j = rows-1; j < i; j--) {
                System.out.print(" ");
            }
           // x = x-1;
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printStart(5);
    }
}
