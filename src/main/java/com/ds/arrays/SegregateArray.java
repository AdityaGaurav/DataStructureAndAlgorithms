package com.ds.arrays;

//Segregate array positive and negative
public class SegregateArray {

    static int[] segregateArrayPositiveAndNeg(int[] input) {
        if (input == null) throw new NullPointerException("Can not be null");
        if (input.length == 1) return input;
        int i = 0;
        int j = 0;
        while (i < input.length) {
            if (input[i] < 0 ) {
                int tmp = input[i];
                input[i++] = input[j];
                input[j++] = tmp;
            } else
                i++;
        }
        return input;
    }

    public static void main(String[] args) {
        int[] ints = {-1, -2, -2, -1, -3, -3, -5, 8};
        segregateArrayPositiveAndNeg(ints);
        for (int i : ints) {
            System.out.println(i);
        }
    }

}
