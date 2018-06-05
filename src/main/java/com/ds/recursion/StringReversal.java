package com.ds.recursion;

public class StringReversal {

    static void doStringReversal(String input){
        if (input.length() ==1) System.out.print(input.charAt(0));
        else {
            System.out.print(input.charAt(input.length()-1));
            doStringReversal(input.substring(0, input.length()-1));
        }
    }

    public static void main(String[] args) {
        doStringReversal("Aditya");
    }
}
