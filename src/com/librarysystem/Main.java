package com.librarysystem;

import com.librarysystem.model.Book;
import com.librarysystem.service.BookManagement;
import com.librarysystem.service.UserManagement;

import javax.swing.border.TitledBorder;
import java.util.*;


public class Main {
    public static void main(String[] args) {
      Book book = new Book("The Great Gatsby", "Rod Wave", "22036");
      Book book1 = new Book("The Dark Knight", "Christopher", "2203658");
      Book book2 = new Book("The Flash", "Greg Berlanti", "556298");
      Book book3 = new Book("Tintin", "Herge", "2203256");
      Book book4 = new Book("The Gentlemen", "Matthew McCounaghey", "5546321");
      Book book5 = new Book("The Dark Ages", "Black", "21336659");
      Book book6 = new Book("The Red Right Hand", "Cillian Murphy", "55269987");
      Book book7 = new Book("By Order", "Cillian Murphy", "12345");
      Book book8 = new Book("Black Star Day", "Cillian Murphy", "5629");
      Book book9 = new Book("Black Star Day", "Arthur Shelby", "22214474");
      Book book10 = new Book("Black Star Day", "John Shelby", "887998");
      Book book11 = new Book("Black Star Day", "Polly Gray", "774414");
      Book book12 = new Book("Black Star Day", "Michael Shelby", "11012");


      BookManagement management = new BookManagement();
      UserManagement userManagement = new UserManagement();

      management.addBook("22036", book);
      management.addBook("2203658", book1);
      management.addBook("556298", book2);
      management.addBook("2203256", book3);
      management.addBook("5546321", book4);
      management.addBook("21336659", book5);
      management.addBook("55269987", book6);
      management.addBook("12345", book7);
      management.addBook("5269", book8);
      management.addBook("22214474", book9);
      management.addBook("887998", book10);
      management.addBook("774414", book11);
      management.addBook("11012", book12);

//      management.searchBooks("Title", "Black Star Day");
//      management.removeBook("Title", "Black Star Day");
      management.displayBooks();
      management.removeBook("887998");
//      management.searchBooks("Author", "Cillian Murphy");
//      management.borrowBook("The Red Right Hand", "Cillian Murphy");


    }
}
