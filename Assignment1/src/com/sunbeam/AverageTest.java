package com.sunbeam;
import java.util.Scanner;

public class AverageTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Input is not a double value");
            return;
        }
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Input is not a double value");
            return;
        }
        double num2 = sc.nextDouble();

        double avg = (num1 + num2) / 2;
        System.out.println("Average = " + avg);

        sc.close();
    }
}