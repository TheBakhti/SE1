package com.Bakhtiyor;

import java.io.File;
import java.util.Scanner;

public class directory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a com.Bakhtiyor.directory to create: ");
        File dir = new File(scanner.next());

        if (!dir.exists() && dir.mkdir()) {
            System.out.println(dir.getAbsolutePath());
            System.out.println("Dir created...");
        } else {
            System.out.println("This com.Bakhtiyor.directory already exits.");

        }
}
}
