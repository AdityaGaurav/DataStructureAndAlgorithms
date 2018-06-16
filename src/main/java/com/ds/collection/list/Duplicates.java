package com.ds.collection.list;

import java.lang.reflect.Array;
import java.util.*;

public class Duplicates {

    static void printDuplicates(List<Integer>inputs){
        Set<Integer> newSet = new HashSet<>(inputs);
        for (Integer ints: newSet){
            if(!newSet.add(ints)){
                System.out.print(ints);
            }
        }
    }

    static void removeDuplicatePreserveInsertionOrder(List<Integer> integers){
        Set<Integer> unique = new LinkedHashSet <>(integers);
        for(Integer i: unique)
            System.out.println(i);
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,3,1,4,2,3);
        removeDuplicatePreserveInsertionOrder(input);
    }
}
