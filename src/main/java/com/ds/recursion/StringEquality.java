package com.ds.recursion;

public class StringEquality {

    static boolean isStringEqual(String input1, String input2){
        if(input1.isEmpty() && input2.isEmpty()) return true;
        else if(input1.isEmpty() || input2.isEmpty()) return false;
        else if (input1.charAt(0) != input2.charAt(0)) return false;
        else return isStringEqual(input1.substring(1), input2.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(isStringEqual("adityaa","adityaa"));
    }
}
