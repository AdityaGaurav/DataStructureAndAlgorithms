package com.ds.backup;

public class LargestNumber {

    private static int max = Integer.MIN_VALUE;

    private static int largestNumber(int[] nums, int length) {
        if (length == 1) {
            return max > nums[0] ? max : nums[0];
        } else {
            if (max < nums[length - 1]) {
                max = nums[length - 1];
            }
            return largestNumber(nums, length - 1);
        }
    }

    static boolean isSortedArray(int[] nums , int length){
        if(length == 1){
            return nums[0] <= nums[1];
        }
        else {
            return nums[length -1] < nums[length -2] ? false : isSortedArray(nums, length-1);
        }
    }


    public static void main(String[] args) {
        int[] n = {1,3,1,3,1};
        int result = largestNumber(n, n.length);
        boolean re= isSortedArray(n,n.length);
        System.out.println(re);
    }
}
