package com.sunbeam;
public class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Atharva", "Patil", 25000);
        Employee emp2 = new Employee("Snehal", "Joshi", 30000);

        // Before raise
        System.out.println("Yearly Salary of " + emp1.getFirstName() + ": " + emp1.getYearlySalary());
        System.out.println("Yearly Salary of " + emp2.getFirstName() + ": " + emp2.getYearlySalary());

        // 10% raise
        emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.10);
        emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.10);

        // After raise
        System.out.println("\nAfter 10% Raise:");
        System.out.println("Yearly Salary of " + emp1.getFirstName() + ": " + emp1.getYearlySalary());
        System.out.println("Yearly Salary of " + emp2.getFirstName() + ": " + emp2.getYearlySalary());
    }
}