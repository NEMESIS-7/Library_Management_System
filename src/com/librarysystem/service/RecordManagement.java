package com.librarysystem.service;

import com.librarysystem.model.Book;
import com.librarysystem.model.BorrowingRecords;
import com.librarysystem.model.Member;

import java.time.*;
import java.util.*;

public class RecordManagement {
    private final List<BorrowingRecords> borrowedRecords = new ArrayList<>();

    public List<BorrowingRecords> showBorrowedRecords() {
        if (borrowedRecords.isEmpty()) {
            throw new NoSuchElementException("No records found");
        }
        for (BorrowingRecords borrowedRecord : borrowedRecords) {
            System.out.println(borrowedRecord);
        }
        return borrowedRecords;
    }
    public List<BorrowingRecords> newRecord(Member member, Book book) {
        String borrowID = UUID.randomUUID().toString();
        String memberID = member.getID();
        String ISBN = book.getISBN();
        LocalDate borrowedDate = LocalDate.now();
        LocalDate dueDate = borrowedDate.plusDays(14);



        BorrowingRecords borrowingRecords = new BorrowingRecords(borrowID, memberID, ISBN,null,borrowedDate,dueDate);
        borrowedRecords.add(borrowingRecords);

        return borrowedRecords;
    }
}