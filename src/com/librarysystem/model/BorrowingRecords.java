package com.librarysystem.model;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class BorrowingRecords {
    private String borrowedID;
    private String memberID;
    private List <BorrowingRecords> borrowedRecords = new ArrayList<BorrowingRecords>();

    public BorrowingRecords(String borrowedID, String memberID, String ISBN, LocalDateTime returnDate, LocalDateTime borrowedDate, LocalDateTime dueDate) {
        this.borrowedID = borrowedID;
        this.memberID = memberID;
        this.ISBN = ISBN;
        this.returnDate = returnDate;
        this.borrowedDate = borrowedDate;
        this.dueDate = null;
    }

    private String ISBN;
    private LocalDateTime borrowedDate;
    private LocalDateTime returnDate;
    private LocalDateTime dueDate;

    public String getBorrowedID() {
        return borrowedID;
    }

    public void setBorrowedID(String borrowedID) {
        this.borrowedID = borrowedID;
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

    public LocalDateTime getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDateTime borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "BorrowingRecord{" +
                "id='" + borrowedID + '\'' +
                ", memberId='" + memberID + '\'' +
                ", isbn='" + ISBN + '\'' +
                ", borrowedAt=" + borrowedDate +
                ", dueDate=" + dueDate +
                ", returnedAt=" + returnDate +
                '}';
    }
    }
