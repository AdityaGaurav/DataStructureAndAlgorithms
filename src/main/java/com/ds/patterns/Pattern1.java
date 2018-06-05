package com.ds.patterns;

public class Pattern1 {

    static void starPattern(int n){
        if(n <= 0) throw new IllegalArgumentException("");
        for(int i =0 ; i<n; i++){
            for(int j=0; j< n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void starPattern2(int n){
        for(int i =0 ; i< n; i++){
            for(int j =0; j <= i ; j++){
                System.out.print("&");
            }
            System.out.println("");
        }
    }

    static void starPatter3(int n){
        for(int i= 0; i<= n ;i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        starPatter3(3);
    }
}
