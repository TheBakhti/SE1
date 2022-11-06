package com.Bakhtiyor;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A side: ");
        double A = scanner.nextDouble();
        System.out.print("Enter B side: ");
        double B = scanner.nextDouble();
        double Area = A*B;
        System.out.println("Area of Rectangle: " + Area);
    }
}
