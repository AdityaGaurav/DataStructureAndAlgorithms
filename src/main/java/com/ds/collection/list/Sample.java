package com.ds.collection.list;

import java.util.HashSet;
import java.util.Set;

public class Sample {

    static void setHasSet(){
        Set<Integer> sample = new HashSet <>();
        sample.add(1);
        sample.add(2);
        sample.add(3);
        sample.add(null);
        sample.add(3);
        sample.add(null);
            System.out.println(sample);
    }

    static Integer[] primitiveReturn(){
        Set<Integer> sample = new HashSet <>();
        sample.add(1);
        sample.add(2);
        sample.add(3);
        sample.add(null);
        sample.add(3);
        return (Integer[])sample.toArray();
    }

    public static void main(String[] args) {
        setHasSet();
    }
}
