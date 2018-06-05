package com.ds.arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int j=1;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i ] > nums[j-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(removeDuplicates(nums));
    }

}
