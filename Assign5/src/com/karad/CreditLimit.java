package com.karad;
import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account Number: ");
        int acc = sc.nextInt();

        System.out.print("Beginning Balance: ");
        int balance = sc.nextInt();

        System.out.print("Charges: ");
        int charges = sc.nextInt();

        System.out.print("Credits: ");
        int credits = sc.nextInt();

        System.out.print("Credit Limit: ");
        int limit = sc.nextInt();

        int newBalance = balance + charges - credits;

        System.out.println("New Balance: " + newBalance);

        if (newBalance > limit)
            System.out.println("Credit limit exceeded");
    }
}