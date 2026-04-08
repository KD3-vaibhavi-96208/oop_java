package com.sunbeam;
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    // Setters & Getters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Yearly Salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }
}