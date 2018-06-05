package com.ds.backup;

public class BAseExponential {

    static int getBaseExponential(int n, int exp){
        // Base case
        if(exp == 1){
            return n;
        }
        else {
            //Recursive Steps
            return n * getBaseExponential(n, exp -1);
        }
    }

    public static void main(String[] args) {
        System.out.println(getBaseExponential(4,2));
    }
}
