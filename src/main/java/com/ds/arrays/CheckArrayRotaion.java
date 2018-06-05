package com.ds.arrays;

public class CheckArrayRotaion {
    private static boolean isArrayRotated(int[] input1, int[] input2) {
        if (input1.length < input2.length) {
            return false;
        }
        int i = 0;
        int temp = input1[i];
        while (i < input1.length) {
            if (temp != input2[i]) {
                i++;
            } else {
                int j=0;
                int common = i;
                int indexToEnd = input2.length;
                while (i < indexToEnd) {
                    if (input1[j] != input2[i]) {
                        return false;
                    }
                    j++;
                    i++;
                    if (i == input1.length) {
                        i = 0;
                        indexToEnd = common;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] ints1 = {1, 2, 3, 4, 5, 6, 7};
        int[] ints2 = {4, 5, 8, 7, 1, 2, 3};
        System.out.println(isArrayRotated(ints1,ints2));
    }
}
