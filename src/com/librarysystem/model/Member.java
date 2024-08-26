package com.librarysystem.model;

import java.util.*;
public class Member {
    Scanner input = new Scanner(System.in);
    private String ID;
    private String Name;
    private String Email;
    private String Password;
    private String Role;

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    public void setPassword(String password) {
        this.Password = password;
    }
    public String getPassword() {
        return Password;
    }
    public String getRole() {
        return Role;
    }
    public void setRole(String role) {
        this.Role = role;
    }


    //displaying member information

    public void displayInfo(){
        System.out.println("Name: " + Name);
        System.out.println("ID: " + ID);
        System.out.println("Email: " + Email);
        System.out.println("Role: " + Role);
    }

    //constructor
    public Member(String name, String ID, String email, String role) {
        this.Name = name;
        this.ID = ID;
        this.Email = email;
        this.Role = role;

    }

    @Override
    public String toString() {
        return "Search Results: Name: " + Name + ", ID: " + ID + ", Email: " + Email + ", Role: " + Role;
    }
}

class Reader extends Member{
   public Reader(String name, String ID, String email, String role) {
       super(name, ID, email, role); //constructor
   }

   //displaying reader information
    @Override
    public void displayInfo(){
        System.out.println("com.librarysystem.model.Reader information:  ");
        super.displayInfo();
    }
}

class Employee extends Member{
    private String employeeID;

    public String getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    //method to take employee information
    public Employee(String name, String ID, String email, String role) {
        super(name, ID, email, role);        //calling the constructor of the super class member
        System.out.println("enter your employee ID: ");
        this.employeeID = input.nextLine();

    }
    //method  to display user information
    @Override
    public void displayInfo(){
        System.out.println("com.librarysystem.model.Employee information:  ");
        super.displayInfo();

    }
}
