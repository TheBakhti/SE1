package com.Bakhtiyor;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev=rem;
//            n=n/10;
            n=rev;
        }
        System.out.println(n);
    }
}
