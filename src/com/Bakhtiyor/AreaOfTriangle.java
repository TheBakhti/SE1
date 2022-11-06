package com.Bakhtiyor;

import java.awt.geom.Area;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter a perpendicular height: ");
        double height = scanner.nextDouble();
        double Area = (base*height)/2;
        System.out.println("Area of Triangle: " + Area);
    }
}
