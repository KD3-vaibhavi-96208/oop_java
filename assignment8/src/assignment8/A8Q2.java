package assignment8;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class A8Q2 {
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("\n0. Exit \n1. Add element \n2. Show arraylist");
		System.out.println("Enter choice");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice =0 ;
		List<String> arrList =  new ArrayList<String>();
		
		class StringComparator implements Comparator<String>{
			@Override
			public int compare(String x, String y) {
				return x.compareTo(y);
			}
	}
		
		while((choice = menu()) != 0) {
			switch (choice) {
			case 1: 
				System.out.println("Enter the color to insert in arraylist :");
				String color = sc.nextLine();
				arrList.add(color);
				break;
			case 2:
				System.out.println("\nInserted elemets :");
				Collections.sort(arrList, new StringComparator());
				for(String e : arrList) {
					System.out.println(e+" ");
				}
				break;

			default:
				break;
			}			
		}
	}
}
