package com.sunbeam;
import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int qty;
        double total = 0;

        do {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Dosa - 50");
            System.out.println("2. Samosa - 20");
            System.out.println("3. Idli - 30");
            System.out.println("4. Vada - 25");
            System.out.println("5. Generate Bill");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    total += qty * 50;
                    break;

                case 2:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    total += qty * 20;
                    break;

                case 3:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    total += qty * 30;
                    break;

                case 4:
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    total += qty * 25;
                    break;

                case 5:
                    System.out.println("\nTotal Bill = " + total);
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}