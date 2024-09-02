package com.librarysystem.model;

public class Employee extends Member{
    private String employeeID;

    public String getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    //method to take employee information
    public Employee(String name, String ID, String email, String password) {
        super(name, ID, email, Roles.LIBRARIAN, password);        //calling the constructor of the super class member
        System.out.println("Enter your employee ID: ");
        this.employeeID = input.nextLine();

    }
    //method  to display user information
    @Override
    public void displayInfo(){
        System.out.println("Employee information:  ");
        super.displayInfo();

    }
}
