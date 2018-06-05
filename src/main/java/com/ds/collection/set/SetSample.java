package com.ds.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
    static void countDuplicates(String[] inputs) {
        Set<String> names = new HashSet<>();
        int countDups=0;
        for(String s: inputs) {
            if (!names.add(s))
                countDups++;
        }
        System.out.println("Count of duplicates: "+countDups);
    }

    public static void main(String[] args) {
        String[] inputNames = {"A", "B", "C", "D", "A", "B"};
        countDuplicates(inputNames);
    }
}
