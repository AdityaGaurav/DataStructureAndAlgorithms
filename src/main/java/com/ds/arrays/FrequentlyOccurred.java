package com.ds.arrays;

import java.util.Map;
import java.util.TreeMap;

public class FrequentlyOccurred {

    static int frequentlyOccurredElement(int[] input){
        if(input.length == 1) return input[0];
        int maxNum=0; int count=Integer.MIN_VALUE;
        Map<Integer, Integer> frequency = new TreeMap <>();
        for(int i: input){
            if(frequency.containsKey(i))
                frequency.put(i,frequency.get(i)+1);
            else
                frequency.put(i ,1);
            if(frequency.get(i) > count) {
                maxNum = i;
                count = frequency.get(i);
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] inputs = {1,3,4,5,6,7,4};
        System.out.println(frequentlyOccurredElement(inputs));
    }
}
