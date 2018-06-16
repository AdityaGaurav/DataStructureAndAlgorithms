package com.ds.arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int i;
        int[] tmp = new int[nums.length];
        int j=0;
        for(i=k+1; i< nums.length; i++)
            tmp[j++] = nums[i];
        for (i = 0; i< k+1; i++)
            tmp[j++] = nums[i];

        for(int x: tmp)
            System.out.println(x);
    }

    public static void main(String[] args) {
        int[] nums ={1,2};
        rotate(nums, 2);
    }


}
