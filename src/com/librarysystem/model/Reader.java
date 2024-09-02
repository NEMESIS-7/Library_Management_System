package com.librarysystem.model;

public class Reader extends Member{
   public Reader(String name, String ID, String email, String password) {
       super(name, ID, email, Roles.READER, password); //constructor
   }

   //displaying reader information
    @Override
    public void displayInfo(){
        System.out.println("Reader information:  ");
        super.displayInfo();
    }
}
