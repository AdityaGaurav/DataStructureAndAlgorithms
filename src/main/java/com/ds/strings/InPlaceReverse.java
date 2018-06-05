package com.ds.strings;

public class InPlaceReverse {

    static String doInPlaceReverse(String input){
        String[] inputString = input.split(" ");
        int i=0;
        StringBuilder build = new StringBuilder("");
        while ( i < inputString.length){
              build.append(getReversedString(inputString[i]));
              i++;
              if(i != input.length()-1){
                  build.append(" ");
              }
        }
        return build.toString();
    }

    private static String getReversedString(String s) {
        StringBuilder build = new StringBuilder("");
        int length = s.length();
        while (length >0){
            build.append(s.charAt(length-1));
            length--;
        }
        return build.toString();
    }

    public static void main(String[] args) {
        System.out.println(doInPlaceReverse("Aditya Gaurav t"));
    }

}
