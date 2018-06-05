package com.ds.recursion;

public class CountCharacter {

    static int countCharcaterInString(String input){
        if(input.isEmpty()) return 0;
        else return 1+ countCharcaterInString(input.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(countCharcaterInString(" "));
    }
}
