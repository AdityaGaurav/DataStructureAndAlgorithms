package com.ds.algo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ArrayAddition {

    static int[] generateArray(int[] input) {
        String concatInput = "";
        for (int i : input) {
            concatInput = concatInput + i;
        }
        Integer newInput = Integer.parseInt(concatInput);
        String newConcatInput = Integer.toString(newInput + 1);
        int[] output = new int[newConcatInput.length()];
        for (int i = 0; i < output.length; i++) {
            output[i] = Integer.parseInt("" + newConcatInput.charAt(i) + "");
        }
        return output;
    }

    static void addArray(int[] input) {
        Deque<Integer> hold = new ArrayDeque<>();
        if (input == null) throw new NullPointerException("");
        int length = input.length;
        int last = input[length - 1]+1;
        //int add = last + 1;
        int carryForward = 0;
        if (last > 9) {
            carryForward = 1;
            last = 0;
        }
        hold.push(last);
        if (carryForward == 1) {
            for (int i = length - 2; i >= 0 ; i--) {
                int ele = input[i];
                ele = ele+carryForward;
                if ((ele) > 9) {
                    hold.push(0);
                    carryForward =1;
                    if(i == 0){
                        hold.push(1);
                    }
                } else {
                    hold.push(ele);
                    carryForward =0;
                }
            }
        } else {
            for (int i = 0; i <= length - 2; i++) {
                hold.push(input[length - 2 - i]);
            }
        }
        for (int i : hold) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
//        int[] n = {};
//        System.out.println(n.length);
        int[] inp = {9, 9, 9, 1, 9};
//        int[] output = generateArray(inp);
//        for(int i: output){
//            System.out.print(i);
        addArray(inp);
    }
}

