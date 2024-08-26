package com.librarysystem;

import com.librarysystem.model.Book;
import com.librarysystem.model.Member;
import com.librarysystem.service.BookManagement;
import com.librarysystem.service.RecordManagement;
import com.librarysystem.service.UserManagement;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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

      Member member1 = new Member("Bruce Wayne", "001", "bruce@wayne.com", "Librarian");
      Member member2 = new Member("Clark Kent", "002", "clark@dailyplanet.com", "Reader");
      Member member3 = new Member("Diana Prince", "003", "diana@themyscira.com", "Librarian");
      Member member4 = new Member("Barry Allen", "004", "barry@ccpd.com",  "Reader");
      Member member5 = new Member("Arthur Curry", "005", "arthur@atlantis.com", "Reader");
      Member member6 = new Member("Hal Jordan", "006", "hal@oa.com", "Librarian");
      Member member7 = new Member("Victor Stone", "007", "victor@star.com", "Reader");
      Member member8 = new Member("Oliver Queen", "008", "oliver@queen.com", "Reader");
      Member member9 = new Member("John Constantine", "009", "john@occult.com", "Reader");
      Member member10 = new Member("Billy Batson", "010", "billy@shazam.com", "Reader");
      Member member11 = new Member("Kara Zor-El", "011", "kara@krypton.com", "Librarian");
      Member member12 = new Member("J'onn J'onzz", "012", "jonn@mars.com", "Reader");




      UserManagement userManagement = new UserManagement();
      BookManagement management = new BookManagement();

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

      /*Book search = management.searchBookByISBN("2224474");
      if (search != null) {
        System.out.println(search);
      }else{
        System.out.println("No book found");
      }
      management.searchBooks("Title", "Black Star Day");
      management.removeBook("887998");
      management.searchBooks("Author", "John Shelby");
      management.displayBooks();
      management.borrowBook("The Red Right Hand", "Cillian Murphy");
      management.borrowBook("The Red Right Hand", "Cillian Murphy");
      management.returnBook("The Red Right Hand", "Cillian Murphy");
      management.borrowBook("The Red Right Hand", "Cillian Murphy");
      management.returnBook("The Red Right Hand", "Cillian Murphy");*/

      userManagement.addMember("001", member1);
      userManagement.addMember("002", member2);
      userManagement.addMember("003", member3);
      userManagement.addMember("004", member4);
      userManagement.addMember("005", member5);
      userManagement.addMember("006", member6);
      userManagement.addMember("007", member7);
      userManagement.addMember("008", member8);
      userManagement.addMember("009", member9);
      userManagement.addMember("010", member10);
      userManagement.addMember("011", member11);
      userManagement.addMember("012", member12);

//      userManagement.displayMembers();
      try{
        Member idSearch = userManagement.searchByID("002");
        System.out.println(idSearch);
      }catch (NoSuchElementException m){
        System.out.println(m.getMessage());
      }
      userManagement.showLibrarians();
      RecordManagement recordManagement = new RecordManagement();
      try{
        management.borrowBook("The Red Right Hand", "Cillian Murphy");
      }catch (NoSuchElementException m){
        System.out.println(m.getMessage());
      }

      LocalDate localDate = LocalDate.now();
      System.out.println(localDate);
      LocalTime time = LocalTime.now().withNano(0).withSecond(0);
      System.out.println(time);

      String ID = UUID.randomUUID().toString();
      System.out.println(ID);















    }
}
