package com.librarysystem.service;

import com.librarysystem.model.Book;
import com.librarysystem.model.Member;
import org.postgresql.gss.GSSOutputStream;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class UserManagement {
    private final HashMap<String, Member> members = new HashMap<>();

    public void addMember(String ID, Member member) {
        String name = member.getName();
        members.put(ID, member);
        System.out.println("Welcome to Kingmaker Library Management Systems, " + name);
    }

    public void displayMembers() {
        for (Member member : members.values()) {
            if(members.isEmpty()){
                System.out.println("No members found");
            }
            System.out.println("Name: " + member.getName() + ", ID: " + member.getID() + ", Role: " + member.getRole() + '.');
        }
    }

    public List<Member> searchMembers(String attribute, String query) {
        List<Member> searchResults = new ArrayList<>();
        for (Map.Entry<String, Member> entry : members.entrySet()) {
            Member member = entry.getValue();
            if (attribute.equals("Name") && member.getName().equals(query)) {
                searchResults.add(member);
            } else if (attribute.equals("ID") && member.getRole().equals(query)) {
                searchResults.add(member);
            } else if (attribute.equals("Email") && member.getEmail().equals(query)) {
                searchResults.add(member);
            }
        }
        if (searchResults.isEmpty()) {
            switch (attribute.toLowerCase()) {
                case "name" -> System.out.println("There is no member called " + query + " in the library");
                case "id" -> System.out.println("There is no member with ID: " + query + " in the library");
                case "email" -> System.out.println("There is no member with email: " + query + " in the library");
            }
        } else {
            for (Member member : searchResults) {
                System.out.println(member);
            }
        }
        return searchResults;
    }

    public Member searchByID(String ID) {
        for (Map.Entry<String, Member> entry : members.entrySet()) {
            Member member = entry.getValue();
            if (entry.getValue().getID().equals(ID)) {
                return member;
            }
        }
        throw new NoSuchElementException("No member with ID: " + ID);
    }
    /*public void showRoles(String role) {
        boolean found = false;
        for (Map.Entry<String, com.librarysystem.model.Member> entry : members.entrySet()) {
            if (entry.getValue().getRole().equals(role)) {
                System.out.println(entry.getKey() + " " + entry.getValue().getName() + " " + entry.getValue().getRole());
                found = true;
            }
        }
        if (!found) {
            throw new RuntimeException("no member with role " + role + " found");
        }
    }*/
    public void showEmails(){
        for (Map.Entry<String, Member> entry : members.entrySet()) {
            System.out.println(entry.getValue().getEmail() + ": " + entry.getValue().getName());
        }
    }
    public void showLibrarians() {
        for (Map.Entry<String, Member> entry : members.entrySet()) {
            if (entry.getValue().getRole().equals("Librarian")) {
                System.out.println(entry.getValue().getRole() + ": " + entry.getValue().getName());
            }
        }
    }
}