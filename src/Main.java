public class Main {
    public static void main(String[] args) {
      Member member = new Member("Maverick", "22032896", "elikemfenuku@gmail.com", "Librarian");
      Member member1 = new Member("slick", "2235896", "ghg@gmail.com", "Reader");
      Member member2 = new Member("Frank Castle", "8895554", " punuusher@gmail.com", "Librarian");
      Member member3 = new Member("Lucien Caslte", "2215059", "luciencastle@gmail.com", "Librarian");

      MemberManagement management = new MemberManagement();
      management.addMember();
    }
}