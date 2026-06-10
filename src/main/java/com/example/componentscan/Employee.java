package com.example.componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
    @Value("6")
    private int employeeID;
    @Value("John")
    private String firstName;
    @Value("Smit")
    private String lastName;
    @Value("#{4*4}")
    private double salary;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
