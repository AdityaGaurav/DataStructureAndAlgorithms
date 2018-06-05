package com.ds.backup;

public class NumberPermutation {

    public static void printPermutationOfNumber(int[] input, int startPoint, int lenghtOfArray) {
        if (startPoint == lenghtOfArray) {
            for (int i : input) {
                System.out.print(i);
            }
            System.out.println("");
        } else { //input[] has more than one element
            for (int arrayIndex = startPoint; arrayIndex < lenghtOfArray; arrayIndex++) {
                swapArray(input, startPoint, arrayIndex);
                printPermutationOfNumber(input, startPoint + 1, lenghtOfArray);
                swapArray(input, startPoint, arrayIndex);
//                System.out.print("After recursion ");
//                for (int i : input) {
//                    System.out.print(i);
//                }
//                System.out.println();
            }
        }
    }

    static void swapArray(int[] input, int index1, int index2) {
        int tmp = input[index1];
        input[index1] = input[index2];
        input[index2] = tmp;
    }

    public static void main(String[] args) {
        int[] inp = {1, 2, 3,4};
        printPermutationOfNumber(inp, 0, 4);
    }
}
