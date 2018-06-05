package com.ds.sorting;

public class BubbleSort {

    static int[] sort(int[] input) {
        int tmp = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - i-1; j++) {
                if (input[j] > input[j + 1]) {
                    tmp = input[j + 1];
                    input[j + 1] = input[j];
                    input[j] = tmp;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = {12,19,-4,0,9,-12};
        input = sort(input);
        for (int i:input){
            System.out.println(i);
        }
    }
}
