package com.sunbeam;


import java.util.*;

class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students (Iterator)");
            System.out.println("3. Search by Roll No");
            System.out.println("4. Sort by Roll No");
            System.out.println("5. Sort by Name");
            System.out.println("6. Sort by Marks");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int r = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String n = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double m = sc.nextDouble();
                    students.add(new Student(r, n, m));
                    break;

                case 2:
                    Iterator<Student> it = students.iterator();
                    if (!it.hasNext()) System.out.println("Collection is empty.");
                    while (it.hasNext()) {
                        System.out.println(it.next());
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;
                    for (Student s : students) {
                        if (s.rollNo == searchRoll) {
                            System.out.println("Found: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Student not found.");
                    break;

                case 4:
                    students.sort(Comparator.comparingInt(s -> s.rollNo));
                    System.out.println("Sorted by Roll No.");
                    break;

                case 5:
                    students.sort(Comparator.comparing(s -> s.name));
                    System.out.println("Sorted by Name.");
                    break;

                case 6:
                    students.sort((s1, s2) -> Double.compare(s2.marks, s1.marks));
                    System.out.println("Sorted by Marks (Descending).");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}
