package com.ds.arrays;

public class ShiftZero {

    static int[] shiftZero(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int length = nums.length - 1;
        int i = length, j = 0, k = 0;
        while (i >= 0) {
            if (nums[i] == 0) {
                k = i;
                while (k < length - j) {
                    int tmp = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = tmp;
                    k++;
                }
                j++;
            }
            i--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] input = {0, 0, 1, 6, 0, 2, 0, 0, 0, 19 / 89, 1, 0, 23, 0};
        for (int i : shiftZero(input)) {
            System.out.println(i);
        }
    }
}
