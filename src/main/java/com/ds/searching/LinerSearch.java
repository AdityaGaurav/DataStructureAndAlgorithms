package com.ds.searching;

public class LinerSearch {

    static boolean search(int[] input, int x){
        int length = input.length;
        int i=0;
        while(i < length){
            if(input[i] == x)
                return true;
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,45,6,7,3};
        System.out.println(search(nums, 7));
    }
}
