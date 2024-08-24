package com.librarysystem.service;

import com.librarysystem.model.Book;

import java.util.*;

public class BookManagement {
    private final HashMap<String, Book> db = new HashMap<>();

    //method to add book to the library using a book object
    public void addBook(String ISBN, Book book) {
        db.put(ISBN, book);
        String title = book.getTitle();
        System.out.println(title + " written by " + book.getAuthor() + " has been added to the library");
    }

    public void dislpayMapping() {
        for (Map.Entry<String, Book> book : db.entrySet()) {
            System.out.println(book.getKey() + " " + book.getValue());
        }
    }

    public void displayBooks() {
        if (db.isEmpty()) {
            System.out.println("There are no books in the library");
        } else {
            for (Map.Entry<String, Book> entry : db.entrySet()) {
                System.out.println("ISBN: " + entry.getKey() + " - " + entry.getValue().getTitle() + ", written by " + entry.getValue().getAuthor());
            }
        }
    }

    public Book searchBook(String attribute, String query) {
        for (Map.Entry<String, Book> entry : db.entrySet()) {
            Book book = entry.getValue();
            if (attribute.equals("Title") && book.getTitle().equals(query)) {
                return book;
            } else if (attribute.equals("Author") && book.getAuthor().equals(query)) {
                return book;
            } else if (attribute.equals("ISBN") && book.getISBN().equals(query)) {
                return book;
            }
        }
        System.out.println("There is no book with " + attribute + " in the library");
        return null;
    }

    public List<Book> searchBooks(String attribute, String query) {
        List<Book> searchResults = new ArrayList<>();

        for (Map.Entry<String, Book> entry : db.entrySet()) {
            Book book = entry.getValue();
            if (attribute.equals("Title") && book.getTitle().equals(query)) {
                searchResults.add(book);
            } else if (attribute.equals("Author") && book.getAuthor().equals(query)) {
                searchResults.add(book);
            } else if (attribute.equals("ISBN") && book.getISBN().equals(query)) {
                searchResults.add(book);
            }
        }
        if (searchResults.isEmpty()) {
            switch (attribute) {
                case "author" -> System.out.println("There is no book written by " + query + " in the library");
                case "ISBN" -> System.out.println("There is no book with ISBN: " + query + " in the library");
                case "title" -> System.out.println("There is no book titled " + query + " in the library");
            }
        } else {
            for (Book book : searchResults) {
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
    public void removeBook(String ISBN) {
        boolean found = false;
        for (Map.Entry<String, Book> entry : db.entrySet()) {
            Book book = entry.getValue();
            if (book.getISBN().equals(ISBN)) {
                found = true;
                db.remove(entry.getKey());
                System.out.println(book.getTitle() + ", written by " + book.getAuthor() + " has been removed successfully");
            }

        }
        if (!found) {
            System.out.println(ISBN + " does not exist in the library");
        }
    }


    /*    public void removeBook(String attribute, String query) {
            boolean removed = false;
            Iterator<Map.Entry<String, Book>> iterator = db.entrySet().iterator();
            while (iterator.hasNext()) {
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
        }*/
    public Book borrowBook(String Title, String Author) {
        for (Map.Entry<String, Book> entry : db.entrySet()) {
            Book book = entry.getValue();
            if (book.getTitle().equals(Title) && book.getAuthor().equals(Author)) {
                if (book.isAvailable()) {
                    System.out.println(book.getTitle() + ", written by " + book.getAuthor() + " has been borrowed");
                    book.setAvailable(false);
                    return book;
                } else {
                    System.out.println(book.getTitle() + ", written by " + book.getAuthor() + " is not available for borrowing");
                }
            }
        }
        return null;
    }
    public Book returnBook(String Title, String Author) {
        for (Map.Entry<String, Book> entry : db.entrySet()) {
            Book book = entry.getValue();
            if (book.getTitle().equals(Title) && book.getAuthor().equals(Author)) {
                if (!book.isAvailable()) {
                    System.out.println(book.getTitle() + ", written by " + book.getAuthor() + " has been been successfully returned and can now be borrowed.");
                    book.setAvailable(true);
                    return book;
                }
            }
        }
        return null;
    }
}