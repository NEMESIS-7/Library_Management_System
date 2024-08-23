package com.librarysystem;

import com.librarysystem.model.Book;
import com.librarysystem.service.BookManagement;
import com.librarysystem.service.UserManagement;

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

      management.displayBooks();
//      Object searchResults = management.searchBook("ISBN", "22036");
//      System.out.println(searchResults);

      List<Book> results = management.searchBooks("Author", "Cillian Murphy");
      if (results != null && !results.isEmpty()) {
        for (Book foundbook : results) {
          System.out.println(foundbook);
          break;
        }
      } else {
        System.out.println("No results found");
      }

    }
}
