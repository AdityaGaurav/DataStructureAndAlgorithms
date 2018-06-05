package com.ds.arrays;

public class SortedArrays {

    static int[] mergeSortedArray(int[] input1, int[] input2) {
        int length1, length2;
        if ((length1 = input1.length) == 0) return input2;
        if ((length2 = input2.length) == 0) return input1;
        int[] newArray = new int[length1 + length2];
        int i = 0, j = 0, k = 0;
        while (i < newArray.length) {
            if (input1[j] < input2[k]) {
                newArray[i++] = input1[j++];
            } else if (input1[j] > input2[k]) {
                newArray[i++] = input2[k++];
            } else {
                newArray[i++] = input1[j++];
                newArray[i++] = input2[k++];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 5, 6, 6, 15};
        int[] input2 = {2, 7, 9, 15};

    }
}
