import java.util.*;
public class MemberManagement {
    private final Hashtable<Integer, Member> members = new Hashtable<>();

    public void addMember(int ID, Member member) {
        members.put(ID, member);
    }

    public void displayMembers() {
        for (Map.Entry<Integer, Member> entry : members.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getName());
        }
    }

    public Member searchMemberByID(String ID) {
        for(Map.Entry<Integer, Member> entry : members.entrySet()) {
            if(entry.getValue().getID().equals(ID)) {
                return entry.getValue();
            }
        }throw new RuntimeException("member not found");
    }

    public Member searchMemberByName(String name) {
        for (Member member : members.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        throw new RuntimeException("no member found with name: " + name);
    }

    /*public void showRoles(String role) {
        boolean found = false;
        for (Map.Entry<Integer, Member> entry : members.entrySet()) {
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
        for (Map.Entry<Integer, Member> entry : members.entrySet()) {
            System.out.println(entry.getValue().getEmail() + ": " + entry.getValue().getName());
        }
    }
    public void showLibrarians() {
        for (Map.Entry<Integer, Member> entry : members.entrySet()) {
            if (entry.getValue().getRole().equals("Librarian")) {
                System.out.println(entry.getValue().getRole() + ": " + entry.getValue().getName());
            }
        }
    }

}