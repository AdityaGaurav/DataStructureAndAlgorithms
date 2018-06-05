package com.ds.arrays;

import java.util.ArrayList;
import java.util.List;

public class CommonElementInTwoSorted {

    static List<Integer> commonElementInTwoSortedArrays(int[] input1, int[] input2) {
        List<Integer> commons = new ArrayList<>();
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer1 < input1.length && pointer2 < input2.length) {
            if (input1[pointer1] == input2[pointer2]) {
                commons.add(input1[pointer1]);
                pointer1++;
                pointer2++;
            } else if (input1[pointer1] > input2[pointer2]) {
                pointer2++;
            } else {
                pointer1++;
            }
        }
        return commons;
    }

    public static void main(String[] args) {
        int[] ints1 = {1, 4, 6, 9};
        int[] ints2 = {1, 6, 10, 11, 12};
        List<Integer> result = commonElementInTwoSortedArrays(ints1, ints2);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
