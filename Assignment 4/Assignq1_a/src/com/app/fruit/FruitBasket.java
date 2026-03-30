package com.app.fruit;

import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basket size: ");
        int size = sc.nextInt();

        fruit[] basket = new fruit[size];
        int counter = 0;

        int choice;

        do {
            System.out.println("\n0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits");
            System.out.println("5. Display fresh fruits (details + taste)");
            System.out.println("6. Display tastes of stale fruits");
            System.out.println("7. Mark fruit as stale (by index)");
            System.out.println("8. Mark all sour fruits stale");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (counter < size) {
                        System.out.print("Enter name, weight, color: ");
                        String nm = sc.next();
                        double wt = sc.nextDouble();
                        String color = sc.next();

                        basket[counter++] = new Mango(nm, color, wt);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 2:
                    if (counter < size) {
                        System.out.print("Enter name, weight, color: ");
                        String nm = sc.next();
                        double wt = sc.nextDouble();
                        String color = sc.next();

                        basket[counter++] = new Orange(nm, color, wt);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 3:
                    if (counter < size) {
                        System.out.print("Enter name, weight, color: ");
                        String nm = sc.next();
                        double wt = sc.nextDouble();
                        String color = sc.next();

                        basket[counter++] = new Apple(nm, color, wt);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 4:
                    for (fruit f : basket) {
                        if (f != null)
                            System.out.println(f.getName());
                    }
                    break;

                case 5: 
                    for (fruit f : basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f);
                            System.out.println("Taste: " + f.taste());
                        }
                    }
                    break;

                case 6: // Stale fruits taste
                    for (fruit f : basket) {
                        if (f != null && !f.isFresh()) {
                            System.out.println(f.getName() + " taste: " + f.taste());
                        }
                    }
                    break;

                case 7: 
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();

                    if (index >= 0 && index < counter && basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println("Fruit marked as stale.");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 8: 
                    for (fruit f : basket) {
                        if (f != null && f.taste().equals("sour")) {
                            f.setFresh(false);
                        }
                    }
                    System.out.println("All sour fruits marked stale.");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}