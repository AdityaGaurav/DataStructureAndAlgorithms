package com.ds.arrays;

public class SortedArrays {

    static int[] mergeSortedArray(int[] input1, int[] input2) {
        int length1, length2;
        if ((length1 = input1.length) == 0) return input2;
        if ((length2 = input2.length) == 0) return input1;
        int[] newArray = new int[length1 + length2];
        int i = 0, j = 0, k = 0;
        while (j < input1.length && k < input2.length) {
            if (input1[j] < input2[k]) {
                newArray[i++] = input1[j++];
            } else if (input1[j] > input2[k]) {
                newArray[i++] = input2[k++];
            } else {
                newArray[i++] = input1[j++];
                newArray[i++] = input2[k++];
            }
        }
        while (j < input1.length)
            newArray[i++] = input1[j++];
        while (k < input2.length)
            newArray[i++] = input2[k++];
        return newArray;
    }

    public static void main(String[] args) {
        int[] input2 = {1, 5, 6, 6, 15, 17, 18};
        int[] input1 = {2, 7, 9, 15};
        int[] result = mergeSortedArray(input1, input2);
        for (int i : result)
            System.out.println(i);

    }
}
