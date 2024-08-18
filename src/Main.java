import javax.swing.plaf.basic.BasicToolBarSeparatorUI;

public class Main {
    public static void main(String[] args) {
      Member member = new Member("Maverick", "22032896", "elikemfenuku@gmail.com", "Librarian");
      Member member1 = new Member("slick", "2235896", "ghg@gmail.com", "Reader");
      Member member2 = new Member("Frank Castle", "8895554", "punisher@gmail.com", "Librarian");
      Member member3 = new Member("Lucien Castle", "2215059", "luciencastle@gmail.com", "Librarian");

      UserManagement management = new UserManagement();
      management.addMember(member.getID(), member);
      management.addMember(member1.getID(), member1);
      management.addMember(member2.getID(), member2);
      management.addMember(member3.getID(), member3);
      Member nameSearch = management.searchByName("Maverick");
      System.out.println(nameSearch != null ? nameSearch : "Member not found");
      Member idSearch = management.searchByID("8895554");
      System.out.println(idSearch != null ? idSearch : "Member not found");
      management.showLibrarians();
      management.showEmails();
      management.displayMembers();

      Book book = new Book("The Great Gatsby", "Maverick", "220325");
      Book book1 = new Book("The Dark Knight", "OJ Simpson", "2203256");
      Book book2 = new Book("Top Gun", "Cruise", "2203556");
      Book book3 = new Book("Titanic", "Shelly", "226215445");
      BookManagement bookManagement = new BookManagement();
      bookManagement.addBook(book.getISBN(), book);
      bookManagement.addBook(book1.getISBN(), book1);
      bookManagement.addBook(book2.getISBN(), book2);
      bookManagement.addBook(book3.getISBN(), book3);
      bookManagement.displayBooksByTitle();
      Book bookSearch = bookManagement.searchByTitle("the great gatsby");
      System.out.println(bookSearch != null ? bookSearch : "The book was not found" );
    }
}