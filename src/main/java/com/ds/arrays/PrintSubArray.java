package com.ds.arrays;

public class PrintSubArray {

    static void printSubArray(int[] nums, int length){
        if(length == 1)
            System.out.println(nums[0]);
        else {
            printSubArray(nums, length-1);
            for (int i=0; i< length; i++)
                System.out.print(nums[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        printSubArray(nums, nums.length);
    }
}
