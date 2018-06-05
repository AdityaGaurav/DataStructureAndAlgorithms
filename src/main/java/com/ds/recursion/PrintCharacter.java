package com.ds.recursion;

public class PrintCharacter {

    static void printCharacterOfString(String input){
        if(input.length() == 1){
            System.out.println(input.charAt(0));
        }
        else {
            System.out.println(input.charAt(0));
            printCharacterOfString(input.substring(1));
        }
    }

    static String reverseString(String input){
        if(input.isEmpty()){
            return "";
        } else {
            return reverseString(input.substring(1))+input.charAt(0);
        }
    }

    static String reverse(String input, int length){
        if(length == 1){
            return input.charAt(0)+"";
        } else {
            return input.charAt(length-1)+reverse(input,length-1);
        }
    }

    public static void main(String[] args) {
     //   printCharacterOfString("Aditya");
        System.out.println(reverse("Aditys",6));
    }
}
