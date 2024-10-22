package com.librarysystem.service;

import com.librarysystem.model.Member;
import com.librarysystem.model.Roles;

import java.util.*;
public class UserManagement {
    private final Map<String, Member> members = new HashMap<>();

    public void addMember(String ID, Member member) {
        //initializing a string object to store the member's name
        if(member.getRole() == Roles.LIBRARIAN){
            String name = member.getName();
            //storing the member object in the map
            members.put(ID, member);
            //printing a message to the console
            System.out.println("Welcome to Kingmaker Library Management Systems, " + name);
        }else{
            throw new UnauthorizedAccessException("As a " + member.getRole() + " you are not allowed to add members to the library");
        }
    }

    public void displayMembers(Member member) {
        //for each loop to iterate through the values in the map
        if(member.getRole() == Roles.LIBRARIAN){
            if (members.isEmpty()) {
                System.out.println("No members found");
            }
            for (Member object : members.values()) {
                //returning the values in the map
                System.out.println("Name: " + object.getName() + ", ID: " + object.getID() + ", Role: " + object.getRole() + '.');
            }
        }
    }

    //method to return a list
    public List<Member> searchMembers(String attribute, String query, Member user) {
        List<Member> searchResults;
        if (user.getRole() == Roles.LIBRARIAN) {
            searchResults = new ArrayList<>();
            //for each loop to iterate through the entries in the set of entries
            for (Map.Entry<String, Member> entry : members.entrySet()) {
                //storing a retrieved member object(entry) in the variable "member"
                Member member = entry.getValue();
                //adding to the search results if conditions are met
                if (attribute.equalsIgnoreCase("Name") && member.getName().equals(query)) {
                    searchResults.add(member);
                } else if (attribute.equalsIgnoreCase("ID") && member.getID().equals(query)) {
                    searchResults.add(member);
                } else if (attribute.equalsIgnoreCase("Email") && member.getEmail().equals(query)) {
                    searchResults.add(member);
                }
            }
            //handling the event that the query does not match any entry in the map meaning no object was added to the list
            if (searchResults.isEmpty()) {
                switch (attribute.toLowerCase()) {
                    //printing personalized messages
                    case "name" -> System.out.println("There is no member called " + query + " in the library");
                    case "id" -> System.out.println("There is no member with ID: " + query + " in the library");
                    case "email" -> System.out.println("There is no member with email: " + query + " in the library");
                }
                //if the query finds matches, then this else block will be executed
            } else {
                //for each loop to print the member object in the search results list
                for (Member member : searchResults) {
                    System.out.println(member);
                }
            }

        }else{
            throw new UnauthorizedAccessException("As a " + user.getRole() + " you are not allowed to search for members of the libray");
        }

        return searchResults;
    }

    public Member searchByID(String ID, Member user) {
        if (user.getRole() == Roles.LIBRARIAN) {
            for (Map.Entry<String, Member> entry : members.entrySet()) {
                Member member = entry.getValue();
                //condition to return the member object if the ID matches
                if (member == null) {
                    throw new NoSuchElementException("No member with ID: " + ID + " in the library");
                }
                return member;
            }
        }
        throw new UnauthorizedAccessException("As a " + user.getRole() + " you are not allowed to search for members of the library");
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
    public void showEmails(Member member) {
        if(member.getRole() == Roles.LIBRARIAN){
            //for each loop to iterate through each entry "member object" and return the emails
            for (Map.Entry<String, Member> entry : members.entrySet()) {
                //returning the query
                System.out.println(entry.getValue().getEmail() + ": " + entry.getValue().getName());
            }
        }else{
            throw new UnauthorizedAccessException("As a " + member.getRole() + " you are not allowed to show emails");
        }
    }

    public List<Member> showMemberRoles(String query, Member user) {
        if (user.getRole() == Roles.LIBRARIAN) {
            //looping the entry set and returning all librarians
            List<Member> searchResults = new ArrayList<>();
            for (Map.Entry<String, Member> entry : members.entrySet()) {
                Member member = entry.getValue();
                if (query.equalsIgnoreCase("librarian")) {
                    searchResults.add(member);
                } else if (query.equalsIgnoreCase("reader")) {
                    searchResults.add(member);
                }
            }
            if (searchResults.isEmpty()) {
                switch (query.toLowerCase()) {
                    case "librarian":
                        System.out.println("There are no " + query + "s in the library");
                        break;
                    case "reader":
                        System.out.println("There are no " + query + "s in the reader");
                        break;
                    default:
                        System.out.println("There are no " + query + "s in the library");
                }
            } else {
                for (Member member : searchResults) {
                    System.out.println(member);
                }
            }
            return searchResults;
        }
        throw new UnauthorizedAccessException("As a " + user.getRole() + " you are not allowed to access this feature");
    }

    public Member login(String ID, String password) {
        for (Member member : members.values()) {
            if (ID.equals(member.getID())) {
                if (member.getPassword().equals(password)) {
                    return member;
                }else if(!member.getPassword().equals(password)){
                    System.out.println("Wrong password");
                }
            }
        }
        throw new NoSuchElementException("No member with ID: " + ID);
    }
}