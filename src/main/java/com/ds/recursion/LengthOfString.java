package com.ds.recursion;

public class LengthOfString {

    /**
     * Returns the length of 'input'
     * @param input : to calculate the length of
     * @return Count of characters
     */
    private static int getLengthOfStringRecursive(String input) {
        if (input == null) throw new NullPointerException("");
        if (input.isEmpty()) throw new IllegalArgumentException("");
        //base case
        if (input.length() == 1) return 1;
            //recursive case
        else return 1 + getLengthOfStringRecursive(input.substring(1));
    }

    private static int getLengthOfStringIterative(String input){
        if (input == null) throw new NullPointerException("");
        //if (input.isEmpty()) throw new IllegalArgumentException("");
        int length=0;
        if(input.isEmpty()) return length;
        while(!input.isEmpty()){
            length++;
            input = input.substring(1);
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(getLengthOfStringIterative("Aditya Gaurav"));
    }
}
