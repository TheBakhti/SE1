package com.Bakhtiyor;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {


//    static void Fibonacci(int N)
//    {
//        int num1 = 0, num2 = 1;
//
//        int counter = 0;
//
//        // Iterate till counter is N
//        while (counter < N) {
//
//            // Print the number
//            System.out.print(num1 + " ");
//
//            // Swap
//            int num3 = num2 + num1;
//            num1 = num2;
//            num2 = num3;
//            counter = counter + 1;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter N: ");
//        int N = scanner.nextInt();
//        Fibonacci(N);
//    }
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
