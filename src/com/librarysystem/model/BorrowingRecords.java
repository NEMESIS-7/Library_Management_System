package com.librarysystem.model;

import java.time.*;
import java.util.*;

public class BorrowingRecords {
    private String borrowID;
    private String memberID;
    private String ISBN;
    private LocalDate borrowedDate;
    private LocalDate returnDate;
    private LocalDate dueDate;
    private final List<BorrowingRecords> borrowedRecords = new ArrayList<>();


    public BorrowingRecords(String borrowID, String memberID, String ISBN, LocalDate returnDate, LocalDate borrowedDate, LocalDate dueDate) {
        this.borrowID = borrowID;
        this.memberID = memberID;
        this.ISBN = ISBN;
        this.returnDate = null;
        this.borrowedDate = borrowedDate;
        this.dueDate = dueDate;
    }

    public String getBorrowedID() {
        return borrowID;
    }

    public void setBorrowedID(String borrowID) {
        this.borrowID = borrowID;
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
        return "BorrowingRecord{" +
                "id='" + borrowID + '\'' +
                ", memberId='" + memberID + '\'' +
                ", isbn='" + ISBN + '\'' +
                ", borrowedAt=" + borrowedDate +
                ", dueDate=" + dueDate +
                ", returnedAt=" + returnDate +
                '}';
    }
    }
