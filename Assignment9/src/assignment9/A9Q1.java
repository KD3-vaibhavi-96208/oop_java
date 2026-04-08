package assignment9;
	
import java.util.*;

	class Student {
	    private int rollNo;
	    private String name;
	    private double marks;

	    public Student(int rollNo, String name, double marks) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.marks = marks;
	    }

	    public int getRollNo() { return rollNo; }
	    public String getName() { return name; }
	    public double getMarks() { return marks; }

	    @Override
	    public String toString() {
	        return "RollNo=" + rollNo + ", Name=" + name + ", Marks=" + marks;
	    }
	}

	public class A9Q1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        List<Student> list = new ArrayList<>();
	        int choice;

	        do {
	            System.out.println("\n1. Add Student");
	            System.out.println("2. Display All Students");
	            System.out.println("3. Search Student by RollNo");
	            System.out.println("4. Sort by RollNo");
	            System.out.println("5. Sort by Name");
	            System.out.println("6. Sort by Marks");
	            System.out.println("7. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter RollNo: ");
	                    int r = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Enter Name: ");
	                    String n = sc.nextLine();
	                    System.out.print("Enter Marks: ");
	                    double m = sc.nextDouble();

	                    list.add(new Student(r, n, m));
	                    System.out.println("Student Added.");
	                    break;

	                case 2:
	                    if (list.isEmpty()) {
	                        System.out.println("No students to display.");
	                    } else {
	                        Iterator<Student> itr = list.iterator();
	                        while (itr.hasNext()) {
	                            System.out.println(itr.next());
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter RollNo to search: ");
	                    int searchRoll = sc.nextInt();
	                    boolean found = false;

	                    for (Student s : list) {
	                        if (s.getRollNo() == searchRoll) {
	                            System.out.println("Found: " + s);
	                            found = true;
	                            break;
	                        }
	                    }
	                    if (!found)
	                        System.out.println("Student not found.");
	                    break;

	                case 4:
	                    if (list.isEmpty()) {
	                        System.out.println("No students to sort.");
	                    } else {
	                        List<Student> temp = new ArrayList<>(list);
	                        temp.sort(Comparator.comparingInt(Student::getRollNo));
	                        System.out.println("Sorted by RollNo:");
	                        temp.forEach(System.out::println);
	                    }
	                    break;

	                case 5:
	                    if (list.isEmpty()) {
	                        System.out.println("No students to sort.");
	                    } else {
	                        List<Student> temp = new ArrayList<>(list);
	                        temp.sort(Comparator.comparing(Student::getName));
	                        System.out.println("Sorted by Name:");
	                        temp.forEach(System.out::println);
	                    }
	                    break;
	                case 6:
	                    if (list.isEmpty()) {
	                        System.out.println("No students to sort.");
	                    } else {
	                        List<Student> temp = new ArrayList<>(list);
	                        temp.sort(Comparator.comparingDouble(Student::getMarks));
	                        System.out.println("Sorted by Marks:");
	                        temp.forEach(System.out::println);
	                    }
	                    break;
	                case 7:
	                    System.out.println("Exited");
	                    break;
	            }

	        } while (choice != 7);

	        sc.close();
	    }
	}


