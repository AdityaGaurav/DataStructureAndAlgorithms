package com.ds.algo;

import java.util.*;

public class FormMaxNumber {

    static void printLargest(Vector<String> arr) {
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String X, String Y) {
                String XY = X + Y;
                String YX = Y + X;
                return XY.compareTo(YX)>0 ? -1 : 1;
            }
        });
        Iterator it = arr.iterator();

        while (it.hasNext())
            System.out.print(it.next());
    }

    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(s);
        }

        while(sb.charAt(0)=='0'&&sb.length()>1)
            sb.deleteCharAt(0);

        return sb.toString();
    }

    public static void main(String[] args) {

        Vector<String> arr;
        arr = new Vector<>();

        //output should be 6054854654
        arr.add("1");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        printLargest(arr);
    }
}
