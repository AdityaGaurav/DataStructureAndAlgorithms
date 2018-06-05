package com.ds.collection.set;

import java.util.*;

public class SetIterator {

    static void iterateHashSet() {
        Set<String> inps = new TreeSet<>();
        inps.add("A");
        inps.add("C");
        inps.add("B");
//        inps.add(null);
//        inps.add(null);
        inps.add("A");
        for (String s : inps) {
            System.out.println(s);
        }
        Iterator<String> stringIte = inps.iterator();
        System.out.println("======= Iterator ========");
        while (stringIte.hasNext()) {
            System.out.println(stringIte.next());
        }
    }

    public static void main(String[] args) {
        iterateHashSet();
    }
}
