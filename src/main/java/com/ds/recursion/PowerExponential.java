package com.ds.recursion;

public class PowerExponential {

    static int getExponentialPowIterative(int number, int power) {
        int i = 1, result =number;
        while (i < power) {
            result = result * number;
            i++;
        }
        return result;
    }

    static int getExponentialPowerRecursively(int num, int pow){
        if(pow == 1){
            return num;
        }
        else {
            return num * getExponentialPowIterative(num, pow -1);
        }
    }

    public static void main(String[] args) {
        System.out.println(getExponentialPowerRecursively(3,4));
    }
}
