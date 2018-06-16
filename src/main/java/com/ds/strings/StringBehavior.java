package com.ds.strings;

public class StringBehavior {
    public static void main(String[] args) {
        //String
        String a = "abc";
        String b = "abc";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        String c  = new String("abc");
        String d = c;
        System.out.println(c == d);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        //String immutability
        System.out.println(a+"cvbf");
        System.out.println(a);

        //substring method
        System.out.println(a.substring(1,3)+" substring");

        System.out.println(a.equals(null));

    }
}
