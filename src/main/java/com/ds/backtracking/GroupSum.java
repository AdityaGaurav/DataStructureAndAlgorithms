package com.ds.backtracking;

public class GroupSum {

    static boolean groupSum(int start, int[] nums, int target) {
        if (nums == null) throw new NullPointerException("Can not be null");
        if (start < 0) throw new IllegalArgumentException("Can not be less than 0");
        if (start >= nums.length) return target == 0;
        if (groupSum(start + 1, nums, target - nums[start])) return true;
        if (groupSum(start + 1, nums, target)) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] inputs = {2, 4, 8};
        System.out.println(groupSum(0,inputs,16));
    }
}
