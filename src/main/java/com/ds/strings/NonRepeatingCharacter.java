package com.ds.strings;

import java.util.*;

public class NonRepeatingCharacter {

    static char findNonRepeatingCharacter(String input){
        if(input.length() == 1) return input.charAt(0);
        Map<Character, Integer> counts = new LinkedHashMap <>();
        for(int i =0; i< input.length(); i++){
            if(counts.containsKey(input.charAt(i))){
                counts.put(input.charAt(i),counts.get(input.charAt(i))+1);
            } else {
                counts.put(input.charAt(i),1);
            }
        }
         char op ='\u0000';
        for (Map.Entry<Character,Integer> chars: counts.entrySet()){
            if(chars.getValue() == 1){
                return chars.getKey();
            }
        }
        return op;
    }

    private static char getNonRepeatingCharacter(String input){
        List<Character> values = new ArrayList <>();
        for(int i=0; i < input.length(); i++){
            if(values.contains(input.charAt(i))){
                values.remove((Character) input.charAt(i));
            } else {
                values.add(input.charAt(i));
            }
        }
        return values.get(0);
    }

    public static void main(String[] args) {
        String input ="GeeksForGeeks";
        System.out.println(getNonRepeatingCharacter(input));
    }
}
