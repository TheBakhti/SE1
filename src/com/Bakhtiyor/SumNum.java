package com.Bakhtiyor;

import java.io.Console;
import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner scanner = new Scanner(System.in);

        do
        {

            System.out.println("Enter a number (0 = end): ");
            String input = scanner.next(); ;
            number = Integer.parseInt(input);


            sum += number;

        } while (number != 0);
        System.out.println("Sum of entered numbers is: " + String.valueOf(sum));


    }

    }

