package com.ds.recursion;

public class FindCharacter {

    private static int getOccurrenceOfCharacter(String input, char c) {
        if(input.isEmpty()) return 0;
        else if (input.charAt(0) == c) return 1+ getOccurrenceOfCharacter(input.substring(1),c);
        else return getOccurrenceOfCharacter(input.substring(1),c);
    }

    public static void main(String[] args) {
        System.out.println(getOccurrenceOfCharacter("XabcaXvw, tuwXcbXXXw, qityrsmnX; XXX123eryiop[X]",'X'));
    }

}
