package com.librarysystem.service;

import com.librarysystem.model.Book;
import com.librarysystem.service.BorrowingRecords;

import java.util.*;

public class BookManagement {
    private final HashMap<String, Book> db = new HashMap<>();

  //method to add book to the library using a book object
    public void addBook(String ISBN, Book book) {
        db.put(ISBN, book);
        String title = book.getTitle();
        System.out.println(title + " has been added to the library");
    }
    public void dislpayMapping(){
        for( Map.Entry<String, Book> book : db.entrySet()){
            System.out.println(book.getKey() + " " + book.getValue());
        }
    }
    public void displayBooksByTitle() {
        if(db.isEmpty()){
            System.out.println("There are no books in the library");
        }else{
            for (Map.Entry<String, Book> entry : db.entrySet()) {
                System.out.println("ISBN: " + entry.getKey() + " - " + "com.librarysystem.model.Book: " + entry.getValue().getTitle() + ", written by " + entry.getValue().getAuthor());
            }
        }
    }
    public Book searchBook(String attribute, String query){
        for (Map.Entry<String, Book> entry : db.entrySet()) {
            Book book = entry.getValue();
            if(attribute.equals("Title") && book.getTitle().equals(query)){
                return book;
            }else if(attribute.equals("Author") && book.getAuthor().equals(query)){
                return book;
            }else if(attribute.equals("ISBN") && book.getISBN().equals(query)){
                return book;
            }
        }
        System.out.println("There is no book with " + attribute + " in the library");
        return null;
    }

    public void removeBook (String attribute, String query){
        for (Map.Entry<String, Book> entry : db.entrySet()) {
            Book book = entry.getValue();
            if(attribute.equals("ISBN") && book.getISBN().equals(query)){
                db.remove(entry.getKey());
            }else if(attribute.equals("Title") && book.getTitle().equals(query)){
                db.remove(entry.getKey());
            }else if(attribute.equals("Author") && book.getAuthor().equals(query)){
                db.remove(entry.getKey());
            }else{
                System.out.println("There is no book with " + attribute + " in the library");
            }
        }
    }
    public void removeBookByTitle(String title) {
        if (db.containsKey(title)) {
            db.remove(title);
            System.out.println(title + " has been removed from the library");
        }else{
            System.out.println("the book with title: " + title + " is not in the library");
        }
    }
    public void removeBookByAuthor(String author) {
        boolean found = false;
        Iterator<Map.Entry<String, Book>> iterator = db.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            if (entry.getValue() != null && entry.getValue().getAuthor().equals(author)) {
                iterator.remove();
                System.out.println("com.librarysystem.model.Book with author: " + author + " titled " + entry.getValue().getTitle() + " has been removed from the library");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The book with author: " + author + " is not in the library");
        }
    }
//    public void removeBook(String Title) {
//        if (db.containsKey(Title)) {
//            db.remove(Title);
//            System.out.println(Title + " has been removed from the library");
//        } else {
//            System.out.println(Title + " does not exist in the library");
//        }
//
//    }

    public boolean borrowBook(String Title) {
        Book book = searchByTitle(Title);
        if (book != null) {
            System.out.println("The book is not available");
            return true;
        }else{
            System.out.println(book.getTitle() + " has been borrowed successfully");
            return false;
        }
    }
}
