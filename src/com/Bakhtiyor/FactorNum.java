package com.Bakhtiyor;

import java.util.Scanner;

public class FactorNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num ;++i) {
            if(num % i == 0){
                System.out.println(i+" ");
            }
        }
    }
}
