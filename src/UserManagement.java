import java.util.*;
public class UserManagement {
    private final Hashtable<String, Member> members = new Hashtable<>();

    public void addMember(String ID, Member member) {
        String name = member.getName();
        members.put(ID, member);
        System.out.println(name + " added to the table");
    }

    public void displayMembers() {
        for (Member member : members.values()) {
            System.out.println("Name: " + member.getName() + ", ID: " + member.getID() + ", Role: " + member.getRole() + '.');
        }
    }

    public Member searchByID(String ID) {
        for(Map.Entry<String, Member> entry : members.entrySet()) {
            if(entry.getValue().getID().equals(ID)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public Member searchByName(String name) {
        for (Member member : members.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    /*public void showRoles(String role) {
        boolean found = false;
        for (Map.Entry<String, Member> entry : members.entrySet()) {
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