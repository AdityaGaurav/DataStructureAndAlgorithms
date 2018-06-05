package com.ds.sorting;

public class MergeSort {

    static void sort(int[] input, int start, int end) {
        if (end - start < 2) return;
        int mid = (start + end) / 2;
        sort(input, start, mid);
        sort(input, mid, end);
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tmpIndex = 0;
        int[] temArray = new int[end - start];
        while (i < mid && j < end) {
            temArray[tmpIndex++] = input[i] < input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tmpIndex, mid - i);
        System.arraycopy(temArray, 0, input, start, tmpIndex);
    }

    public static void main(String[] args) {
        int[] inputs = {35, 20, 7, -15, 55, 1, -22};
        sort(inputs, 0, 7);
        for (int i : inputs) {
            System.out.println(i);
        }
    }
}