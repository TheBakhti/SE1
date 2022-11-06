package com.Bakhtiyor;

import java.util.Scanner;

public class Parellogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter a height: ");
        double height = scanner.nextDouble();
        double Area = (base*height);
        System.out.println("Area of Parallogram: " + Area);
    }
}
