package com.Bakhtiyor;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a radius: ");
        double radius = scanner.nextDouble();
        double Area = Math.PI*Math.pow(radius,2);
        System.out.println("Area of Circle: "+Area);
    }

}
