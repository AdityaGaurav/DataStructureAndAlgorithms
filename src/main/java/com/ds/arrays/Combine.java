package com.ds.arrays;

import java.util.Arrays;

public class Combine {

    static int[] combineArrays(int[] ... ints){
        int totalLength = 0;
        for (int[] inp: ints){
            totalLength += inp.length;
        }
        int[] tmp = new int[totalLength];
        int counter=0;
        for (int[] inp: ints){
            for (int i: inp){
                tmp[counter++] = i;
            }
        }
        return tmp;
    }

    static int getMedian(int[] numbers){
        Arrays.sort(numbers);
        int length = numbers.length;
        int middle=0;
        return (middle = length/2) == 0 ? (numbers[middle]+numbers[middle+1])/2: numbers[middle];
    }

    public static void main(String[] args) {
        int[] i1 = {1,2,3,4};
        int[] i2 = {21,23,27};
        int[] i3 = {54,65,78};
        for (int i: combineArrays(i1,i2,i3)){
            System.out.println(i);
        }
        System.out.println(getMedian(combineArrays(i1,i2,i3)));
    }
}
