package assignment8;

import java.util.Scanner;

class Employee {
		    private int id;
		    private String name;
		    private double salary;

		    public Employee(int id, String name, double salary) {
		        this.id = id;
		        this.name = name;
		        this.salary = salary;
		    }

		    @Override
		    public String toString() {
		        return "Employee [Id=" + id + ", Name=" + name + ", Salary=" + salary + "]";
		    }
		}

		interface Stack {
		    int STACK_SIZE = 3;
		    void push(Employee e);
		    Employee pop();
		}

		class FixedStack implements Stack {
		    private Employee[] arr = new Employee[STACK_SIZE];
		    private int top = -1;

		    public void push(Employee e) {
		        if (top == STACK_SIZE - 1) {
		            System.out.println("Stack Overflow !!!");
		            return;
		        }
		        arr[++top] = e;
		        System.out.println("Employee pushed.");
		    }

		    public Employee pop() {
		        if (top == -1) {
		            System.out.println("Stack Underflow !!!");
		            return null;
		        }
		        return arr[top--];
		    }
		}

		class GrowableStack implements Stack {
		    private Employee[] arr = new Employee[STACK_SIZE];
		    private int top = -1;

		    public void push(Employee e) {
		        if (top == arr.length - 1) {
		            Employee[] temp = new Employee[arr.length * 2];
		            for (int i = 0; i < arr.length; i++)
		                temp[i] = arr[i];
		            arr = temp;
		            System.out.println("Stack grown to size " + arr.length);
		        }
		        arr[++top] = e;
		        System.out.println("Employee pushed.");
		    }

		    public Employee pop() {
		        if (top == -1) {
		            System.out.println("Stack Underflow !!!");
		            return null;
		        }
		        return arr[top--];
		    }
		}

		public class A8Q1 {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        Stack stack = null;
		        int choice;

		        do {
		            System.out.println("\n1. Choose Fixed Stack");
		            System.out.println("2. Choose Growable Stack");
		            System.out.println("3. Push Employee");
		            System.out.println("4. Pop Employee");
		            System.out.println("5. Exit");
		            System.out.print("Enter choice: ");
		            choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    if (stack == null)
		                        stack = new FixedStack();
		                    else
		                        System.out.println("Stack already selected!");
		                    break;

		                case 2:
		                    if (stack == null)
		                        stack = new GrowableStack();
		                    else
		                        System.out.println("Stack already selected!");
		                    break;

		                case 3:
		                    if (stack == null) {
		                        System.out.println("NO stack chosen !!!");
		                    } else {
		                        System.out.print("Enter Id: ");
		                        int id = sc.nextInt();
		                        sc.nextLine();
		                        System.out.print("Enter Name: ");
		                        String name = sc.nextLine();
		                        System.out.print("Enter Salary: ");
		                        double sal = sc.nextDouble();

		                        stack.push(new Employee(id, name, sal));
		                    }
		                    break;

		                case 4:
		                    if (stack == null) {
		                        System.out.println("NO stack chosen !!!");
		                    } else {
		                        Employee e = stack.pop();
		                        if (e != null)
		                            System.out.println("Popped: " + e);
		                    }
		                    break;

		                case 5:
		                    System.out.println("Exited");
		                    break;
		            }

		        } while (choice != 5);

		        sc.close();
		    }
		
}
