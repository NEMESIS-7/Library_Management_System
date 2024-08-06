import java.util.*;
public class MemberManagement extends BookManagement {
    private final Hashtable<String, Member> members = new Hashtable<>();

    public void addMember(String ID, Member member) {
        members.put(ID, member);
    }
    public void displayMembers(){
        for( Map.Entry<String, Member> entry : members.entrySet() ){
            System.out.println(entry.getKey() + " " + entry.getValue().getName());
        }
    }
    public void searchMemberByID(String ID) {
        Member member = members.get(ID);
        if( member != null ) {
        System.out.println(ID + " belonging to: " + member.getName() + " is a " + member.getRole());
        }
    }
    public Member searchMemberByName(String name) {
        Member member = members.get(name);
        if (member != null) {
            return member;
        }
        return null;
    }

}