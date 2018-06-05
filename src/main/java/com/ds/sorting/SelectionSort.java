package com.ds.sorting;

public class SelectionSort {

    static public int[] sort(int[] inputs) {
        if (inputs == null) throw new NullPointerException("Input should not be null");
        int length = inputs.length;
        for (int lastUnsortedIndex = length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (inputs[i] > inputs[largest])
                    largest = i;
            }
            swapInput(inputs, largest, lastUnsortedIndex);
        }
        return inputs;
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
