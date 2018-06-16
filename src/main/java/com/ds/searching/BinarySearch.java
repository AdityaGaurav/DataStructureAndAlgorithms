package com.ds.searching;

public class BinarySearch {

    private static boolean search(int[] nums, int x) {
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] == x) {
                return true;
            } else if (nums[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    static boolean recursiveSearch(int[] nums, int low, int high, int x) {
        if (nums[(low + high) / 2] == x) return true;
        else {
            int mid = (low + high) / 2;
            if (nums[mid] > x) {
                return recursiveSearch(nums, low++, mid, x);
            } else {
                return recursiveSearch(nums, mid, high--, x);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println(recursiveSearch(nums, 0, 8, 14));
    }
}
