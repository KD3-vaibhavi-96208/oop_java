package assignment8;

import java.util.ArrayList;
import java.util.Scanner;

public class A8Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter how many element of list do you want? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            list.add(sc.nextLine());
        }

        System.out.print("Enter new value to replace second element: ");
        String newValue = sc.nextLine();

        System.out.println("Before: " + list);
        list.set(1, newValue);
        System.out.println("After: " + list);

        sc.close();
    }

}

