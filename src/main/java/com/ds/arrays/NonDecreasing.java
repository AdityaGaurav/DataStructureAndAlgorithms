package com.ds.arrays;

public class NonDecreasing {

    public static boolean checkPossibility(int[] nums) {
        int i;
        int count = 0;
        for (i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
                if(i -2 < 0 || nums[i-2] <= nums[i]){
                    nums[i-1] = nums[i];
                } else {
                    nums[i] = nums[i-1];
                }
            }
        }
        return true;
    }

    static boolean check(int[] nums){
        if(nums == null) return true;
        int len = nums.length;
        int sum = 0;

        for(int i=0; i<len-1 && sum <2; i++){
            if(nums[i] > nums[i+1]){
                sum++;
                if(i-1>=0 && nums[i-1] > nums[i+1]) nums[i+1] = nums[i];
                else{
                    nums[i] = nums[i+1];
                }
            }
        }
        return sum < 2;
    }

    public static void main(String[] args) {
         int[] nums = {3, 4, 2, 2};
//        int[] nums = {-1, 4, 2, 3};
        System.out.println(check(nums));
    }
}
