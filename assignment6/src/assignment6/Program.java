package assignment6;

import java.util.*;

public class Program {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ArrayList<Book> bookList = new ArrayList<>();

	        int choice;

	        do {
	        	System.out.println("0. Exit");
	            System.out.println("1. Add New Book");
	            System.out.println("2. Display Books (Forward)");
	            System.out.println("3. Display Books (Reverse)");
	            System.out.println("4. Delete Book by Index");
	            System.out.println("5. Sort Books by Price (Descending)");
	            
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter ISBN: ");
	                    String isbn = sc.next();

	                    System.out.print("Enter Price: ");
	                    double price = sc.nextDouble();

	                    System.out.print("Enter Author Name: ");
	                    String author = sc.next();

	                    System.out.print("Enter Quantity: ");
	                    int qty = sc.nextInt();

	                    bookList.add(new Book(isbn, price, author, qty));
	                    System.out.println("Book added successfully!");
	                    break;

	                case 2:
	                    System.out.println("\nBooks in Forward Order:");
	                    for (Book b : bookList) {
	                        System.out.println(b);
	                    }
	                    break;

	                case 3:
	                    System.out.println("\nBooks in Reverse Order:");
	                    for (int i = bookList.size() - 1; i >= 0; i--) {
	                        System.out.println(bookList.get(i));
	                    }
	                    break;

	                case 4:
	                    System.out.print("Enter index to delete: ");
	                    int index = sc.nextInt();

	                    if (index >= 0 && index < bookList.size()) {
	                        bookList.remove(index);
	                        System.out.println("Book deleted successfully!");
	                    } else {
	                        System.out.println("Invalid index!");
	                    }
	                    break;

	                case 5:
	                    bookList.sort((b1, b2) -> Double.compare(b2.getPrice(), b1.getPrice()));
	                    System.out.println("Books sorted by price in descending order!");
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
