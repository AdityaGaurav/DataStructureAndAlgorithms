package com.ds.strings;

public class Compress {

    static void compressInput(String input){
        int length = input.length()-1;
        int counter =1;
        int len=0;
        StringBuilder build = new StringBuilder("");
        while (len < length){
            if(input.charAt(len) == input.charAt(len+1)){
                counter++;
                len++;
            }else {
                build.append(input.charAt(len)).append(counter);
                counter=1;
                len++;
            }
        }
        build.append(input.charAt(len)).append(counter);
        System.out.println(build.toString());
    }

    public static void main(String[] args) {
        compressInput("abbccaaaaad");
    }
}
