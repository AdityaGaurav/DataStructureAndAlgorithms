package com.ds.collection.list;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

    static void printDuplicates(List<Integer>inputs){
        Set<Integer> newSet = new HashSet<>();
        for (Integer ints: inputs){
            if(!newSet.add(ints)){
                System.out.print(ints);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,3,1,4,2,3);
        printDuplicates(input);
    }
}
