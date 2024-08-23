package com.librarysystem;

import com.librarysystem.model.Book;
import com.librarysystem.service.BookManagement;
import com.librarysystem.service.UserManagement;

public class Main {
    public static void main(String[] args) {
      Book book = new Book("The Great GAtsby", "Rod Wave", "22036");
      Book book1 = new Book("The Dark Knight", "Christopher", "2203658");
      Book book2 = new Book("The Flash", "Greg Berlanti", "556298");
      Book book3 = new Book("Tintin", "Herge", "2203256");
      Book book4 = new Book("The Gentlemen", "Matthew McCounaghey", "5546321");
      Book book5 = new Book("The Dark Ages", "Black", "21336659");
      Book book6 = new Book("The Red Right Hand", "Cillian Murphy", "55269987");

      BookManagement management = new BookManagement();
      UserManagement userManagement = new UserManagement();

      management.addBook("22036", book);
      management.addBook("2203658", book1);
      management.addBook("556298", book2);
      management.addBook("2203256", book3);
      management.addBook("5546321", book4);
      management.addBook("21336659", book5);
      management.addBook("55269987", book6);

      management.displayBooks();
      management.searchBook("ISBN", "55269987");


    }
}
