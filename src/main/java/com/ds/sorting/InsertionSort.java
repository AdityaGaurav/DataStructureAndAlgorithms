package com.ds.sorting;

public class InsertionSort {

    private static int[] sort(int[] input) {
        for (int lastSortedIndex = 0; lastSortedIndex < input.length - 1; lastSortedIndex++) {
            for (int j = lastSortedIndex + 1; j > 0; j--) {
                if (input[j - 1] > input[j]) {
                    swapInput(input, j - 1, j);
                }
            }
        }
        return input;
    }

    private static void swapInput(int[] input, int i, int j) {
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }

    public static void main(String[] args) {
        int[] inputs = {20, 35, -15, 7, 55, 1, -22};
        for (int i : sort(inputs)) {
            System.out.println(i);
        }
    }
}
