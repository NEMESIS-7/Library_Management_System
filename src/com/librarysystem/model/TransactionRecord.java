package com.librarysystem.model;

import java.time.*;
import java.util.*;

public class TransactionRecord {
    private String recordID;
    private String memberID;
    private String ISBN;
    private LocalDate borrowedDate;
    private LocalDate returnDate;
    private LocalDate dueDate;
    private final List<TransactionRecord> borrowedRecords = new ArrayList<>();


    public TransactionRecord(String recordID, String memberID, String ISBN, LocalDate returnDate, LocalDate borrowedDate, LocalDate dueDate) {
        this.recordID = recordID;
        this.memberID = memberID;
        this.ISBN = ISBN;
        this.returnDate = null;
        this.borrowedDate = borrowedDate;
        this.dueDate = dueDate;
    }

    public String getBorrowedID() {
        return recordID;
    }

    public void setBorrowedID(String recordID) {
        this.recordID = recordID;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Borrowing Record [" +
                "TrancationID: " + recordID + '\'' +
                ", Member ID: '" + memberID + '\'' +
                ", Book ISBN'" + ISBN + '\'' +
                ", Date Borrowed: " + borrowedDate +
                ", Date to be Returned: " + dueDate +
                ", Date Returned: " + returnDate +
                ']';
    }
    }
