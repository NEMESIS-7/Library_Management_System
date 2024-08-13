public class Main {
    public static void main(String[] args) {
      Member member = new Member("Maverick", "22032896", "elikemfenuku@gmail.com", "Librarian");
      Member member1 = new Member("slick", "2235896", "ghg@gmail.com", "Reader");
      Member member2 = new Member("Frank Castle", "8895554", "punuusher@gmail.com", "Librarian");
      Member member3 = new Member("Lucien Castle", "2215059", "luciencastle@gmail.com", "Librarian");

      UserManagement management = new UserManagement();
      management.addMember(1, member);
      management.addMember(2, member1);
      management.addMember(3, member2);
      management.addMember(4, member3);
      Member nameSearch = management.searchByName("mav");
      if (nameSearch != null) {
        System.out.println(nameSearch.getName());
      }else{
        System.out.println("member not found");
      }
      Member idSearch = management.searchByID("1");
      if (idSearch != null) {
        System.out.println(idSearch.getID());
      }else{
        System.out.println(STR."member with id not found");
      }
      management.showLibrarians();
      management.showEmails();
      Member searchMember = management.searchByName("Maverick");
      System.out.println(searchMember);
      management.displayMembers();
    }
}