package com.ds.backup;

public class AddNumber {
    //static int sum;

    static int getSumOfNumber(int[]nums, int length){
        if(length== 1){
            return nums[0];
        }
        else {
            int sum;
            sum = nums[length-1];
            return sum+ getSumOfNumber(nums, length-1);
        }
    }

    public static void main(String[] args) {
        int[] n = {1,2,3,-4,-5};
        int result = getSumOfNumber(n,5);
        System.out.println(result);
    }
}
