package com.librarysystem.model;

import java.util.*;
public class Member {
    Scanner input = new Scanner(System.in);
    private String ID;
    private String Name;
    private String Email;
    private String Password;
    private Roles Role;

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
    public Roles getRole() {
        return Role;
    }
    public void setRole(Roles role) {
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
    public Member(String name, String ID, String email, Roles role, String password) {
        this.Name = name;
        this.ID = ID;
        this.Email = email;
        this.Role = role;
        this.Password = "";

    }

    @Override
    public String toString() {
        return "\nName: " + Name + "\nID: " + ID + "\nEmail: " + Email + "\nRole: " + Role + '.';
    }
}

