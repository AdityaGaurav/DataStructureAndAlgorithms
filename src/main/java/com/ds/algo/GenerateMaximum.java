package com.ds.algo;

import java.util.ArrayList;
import java.util.List;

public class GenerateMaximum {

    void maxNumber(int input) {
        List<Integer> numbers = new ArrayList<>();
        while (input >= 0) {
            if (input / 10 == 0) {
                numbers.add(input);
            }
            numbers.add(input % 10);
            input /= 10;
        }
//        for (int i = 0; i<9; i++ ) {
//
//        }

        int num1 = 8756404;
        int[] times = new int[10];
        while(true){
            if(num1==0){
                break;
            }
            int val = num1%10;
            times[val]++;
            num1 /= 10;
        }
        for(int i=9; i>=0; i--){
            for(int j=0; j<times[i]; j++){
                System.out.print(i);
            }
        }
        System.out.println();


    }

    static int numberFromArray(int[] input) {
        int result = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            result = result* 10 + input[i];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] ints = {1,2,3};
        System.out.println(numberFromArray(ints));
    }
}