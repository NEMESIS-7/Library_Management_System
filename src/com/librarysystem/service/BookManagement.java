package com.librarysystem.service;

import com.librarysystem.model.Book;

import java.util.*;

public class BookManagement {
    private final HashMap<String, Book> db = new HashMap<>();

  //method to add book to the library using a book object
    public void addBook(String ISBN, Book book) {
        db.put(ISBN, book);
        String title = book.getTitle();
        System.out.println(title + " written by " + book.getAuthor() +  " has been added to the library");
    }
    public void dislpayMapping(){
        for( Map.Entry<String, Book> book : db.entrySet()){
            System.out.println(book.getKey() + " " + book.getValue());
        }
    }
    public void displayBooks() {
        if(db.isEmpty()){
            System.out.println("There are no books in the library");
        }else{
            for (Map.Entry<String, Book> entry : db.entrySet()) {
                System.out.println("ISBN: " + entry.getKey() + " - " + entry.getValue().getTitle() + ", written by " + entry.getValue().getAuthor());
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

    public List<Book> searchBooks(String attribute, String query){
        List<Book> searchResults = new ArrayList<>();

        for (Map.Entry<String, Book> entry : db.entrySet()) {
            Book book = entry.getValue();
            if(attribute.equals("Title") && book.getTitle().equals(query)){
                searchResults.add(book);
            }else if(attribute.equals("Author") && book.getAuthor().equals(query)){
                searchResults.add(book);
            }else if(attribute.equals("ISBN") && book.getISBN().equals(query)){
                searchResults.add(book);
            }
        }
        if (searchResults.isEmpty()){
            System.out.println("There is no book with " + attribute + " in the library");
        }else{
            for (Book book : searchResults){
                System.out.println(book);
            }
        }
        return searchResults;
    }
/*    public void removeBook (String attribute, String query){
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
    }*/
    public void removeBookByTitle(String title) {
        if (db.containsKey(title)) {
            db.remove(title);
            System.out.println(title + " has been removed from the library");
        }else{
            System.out.println("the book with title: " + title + " is not in the library");
        }
    }
    public void removeBook(String attribute, String query) {
        boolean removed = false;
        Iterator<Map.Entry<String, Book>> iterator = db.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            Book book = entry.getValue();
            boolean match = false;
            switch (attribute.toLowerCase()) {
                case "title":
                    match = book.getTitle().equals(query);
                    break;
                case "author":
                    match = book.getAuthor().equals(query);
                    break;
                case "isbn":
                    match = book.getISBN().equals(query);
                default:
                    System.out.println("Invalid");
            }
            if(match){
                iterator.remove();
                System.out.println(book.getTitle() + " written by " + book.getAuthor() +  " has been removed from the library");
                removed = true;
                break;
            }
        }
        if(!removed){
            System.out.println("There is no book with " + attribute + ": " + query + " in the library");
        }
    }
    public boolean borrowBook(String Title) {
        Book book = searchBook(Title, "title");
        if (book != null) {
            System.out.println("The book is not available");
            db.remove(book.getISBN());
            return true;
        }else{
            System.out.println(book.getTitle() + " has been borrowed successfully");
            return false;
        }
    }
}
