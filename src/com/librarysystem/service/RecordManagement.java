package com.librarysystem.service;

import com.librarysystem.model.Book;
import com.librarysystem.model.TransactionRecord;
import com.librarysystem.model.Member;

import java.time.*;
import java.util.*;

public class RecordManagement {
    private final List<TransactionRecord> borrowedRecords = new ArrayList<>();

    public List<TransactionRecord> showBorrowedRecords() {
        if (borrowedRecords.isEmpty()) {
            throw new NoSuchElementException("No records found");
        }
        for (TransactionRecord borrowedRecord : borrowedRecords) {
            System.out.println(borrowedRecord);
        }
        return borrowedRecords;
    }

    public List<TransactionRecord> newRecord(Member member, Book book) {
        String borrowID = UUID.randomUUID().toString();
        String memberID = member.getID();
        String ISBN = book.getISBN();
        LocalDate borrowedDate = LocalDate.now();
        LocalDate dueDate = borrowedDate.plusDays(14);

        TransactionRecord transactionRecord = new TransactionRecord(borrowID, memberID, ISBN, null, borrowedDate, dueDate);
        borrowedRecords.add(transactionRecord);

        return borrowedRecords;
    }


    public List<TransactionRecord> memberRecord(Member member) {
        String memberID = member.getID();
        List<TransactionRecord> memberRecords = new ArrayList<>();
        for (TransactionRecord borrowedRecord : borrowedRecords) {
            if (memberID.equals(borrowedRecord.getMemberID())) {
                memberRecords.add(borrowedRecord);
            }
        }
        if (memberRecords.isEmpty()) {
            throw new NoSuchElementException("No records found");
        }
        return memberRecords;
    }
}
