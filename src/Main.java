import java.util.*;

public class Main {

  private static final Scanner input = new Scanner(System.in);
  private static final UserManagement userManagement = new UserManagement();
  private static final BookManagement bookManagement = new BookManagement();

  public static void main(String[] args) {
    boolean exit = false;
    while (!exit) {
      printBorder();
      System.out.println("|       LIBRARY MANAGEMENT SYSTEM       |");
      printBorder();
      System.out.println("|  1. Manage Members                    |");
      System.out.println("|  2. Manage Books                      |");
      System.out.println("|  3. View Information                  |");
      System.out.println("|  4. Exit                              |");
      printBorder();
      System.out.print("|  Choose an option: ");

      String choice = input.nextLine();
      printBorder();

      switch (choice) {
        case "1":
          manageMembers();
          break;
        case "2":
          manageBooks();
          break;
        case "3":
          viewInformation();
          break;
        case "4":
          exit = true;
          System.out.println("|  Exiting the system. Goodbye!         |");
          printBorder();
          break;
        default:
          System.out.println("|  Invalid choice. Please try again.    |");
          printBorder();
      }
    }
  }

  private static void manageMembers() {
    printSectionTitle("Manage Members");
    System.out.println("|  1. Add Member                        |");
    System.out.println("|  2. Search Member by ID               |");
    System.out.println("|  3. Search Member by Name             |");
    System.out.println("|  4. Display All Members               |");
    System.out.println("|  5. Return to Main Menu               |");
    printBorder();
    System.out.print("|  Choose an option: ");

    String choice = input.nextLine();
    printBorder();

    switch (choice) {
      case "1":
        addMember();
        break;
      case "2":
        searchMemberByID();
        break;
      case "3":
        searchMemberByName();
        break;
      case "4":
        userManagement.displayMembers();
        printBorder();
        break;
      case "5":
        break;
      default:
        System.out.println("|  Invalid choice. Please try again.    |");
        printBorder();
    }
  }

  private static void manageBooks() {
    printSectionTitle("Manage Books");
    System.out.println("|  1. Add Book                          |");
    System.out.println("|  2. Search Book by Title              |");
    System.out.println("|  3. Search Book by Author             |");
    System.out.println("|  4. Display All Books                 |");
    System.out.println("|  5. Remove Book by Title              |");
    System.out.println("|  6. Return to Main Menu               |");
    printBorder();
    System.out.print("|  Choose an option: ");

    String choice = input.nextLine();
    printBorder();

    switch (choice) {
      case "1":
        addBook();
        break;
      case "2":
        searchBookByTitle();
        break;
      case "3":
        searchBookByAuthor();
        break;
      case "4":
        bookManagement.displayBooksByTitle();
        printBorder();
        break;
      case "5":
        removeBookByTitle();
        break;
      case "6":
        break;
      default:
        System.out.println("|  Invalid choice. Please try again.    |");
        printBorder();
    }
  }

  private static void viewInformation() {
    printSectionTitle("View Information");
    System.out.println("|  1. Show All Emails                   |");
    System.out.println("|  2. Show All Librarians               |");
    System.out.println("|  3. Return to Main Menu               |");
    printBorder();
    System.out.print("|  Choose an option: ");

    String choice = input.nextLine();
    printBorder();

    switch (choice) {
      case "1":
        userManagement.showEmails();
        printBorder();
        break;
      case "2":
        userManagement.showLibrarians();
        printBorder();
        break;
      case "3":
        break;
      default:
        System.out.println("|  Invalid choice. Please try again.    |");
        printBorder();
    }
  }

  private static void addMember() {
    printSectionTitle("Add Member");
    System.out.print("|  Enter member name: ");
    String name = input.nextLine();
    System.out.print("|  Enter member ID: ");
    String id = input.nextLine();
    System.out.print("|  Enter member email: ");
    String email = input.nextLine();
    System.out.print("|  Enter member role: ");
    String role = input.nextLine();
    printBorder();

    Member newMember = new Member(name, id, email, role);
    userManagement.addMember(id, newMember);
    printBorder();
  }

  private static void searchMemberByID() {
    printSectionTitle("Search Member by ID");
    System.out.print("|  Enter member ID: ");
    String id = input.nextLine();
    printBorder();
    Member member = userManagement.searchByID(id);
    if (member != null) {
      member.displayInfo();
    } else {
      System.out.println("|  Member not found.                    |");
    }
    printBorder();
  }

  private static void searchMemberByName() {
    printSectionTitle("Search Member by Name");
    System.out.print("|  Enter member name: ");
    String name = input.nextLine();
    printBorder();
    Member member = userManagement.searchByName(name);
    if (member != null) {
      member.displayInfo();
    } else {
      System.out.println("|  Member not found.                    |");
    }
    printBorder();
  }

  private static void addBook() {
    printSectionTitle("Add Book");
    System.out.print("|  Enter book title: ");
    String title = input.nextLine();
    System.out.print("|  Enter book author: ");
    String author = input.nextLine();
    System.out.print("|  Enter book ISBN: ");
    String isbn = input.nextLine();
    printBorder();

    Book newBook = new Book(title, author, isbn);
    bookManagement.addBook(isbn, newBook);
    printBorder();
  }

  private static void searchBookByTitle() {
    printSectionTitle("Search Book by Title");
    System.out.print("|  Enter book title: ");
    String title = input.nextLine();
    printBorder();
    Book book = bookManagement.searchByTitle(title);
    if (book != null) {
      book.displayInformation(book);
    } else {
      System.out.println("|  Book not found.                      |");
    }
    printBorder();
  }

  private static void searchBookByAuthor() {
    printSectionTitle("Search Book by Author");
    System.out.print("|  Enter book author: ");
    String author = input.nextLine();
    printBorder();
    bookManagement.searchBookByAuthor(author);
    printBorder();
  }

  private static void removeBookByTitle() {
    printSectionTitle("Remove Book by Title");
    System.out.print("|  Enter book title: ");
    String title = input.nextLine();
    printBorder();
    bookManagement.removeBook(title);
    printBorder();
  }

  private static void printBorder() {
    System.out.println("+---------------------------------------+");
  }

  private static void printSectionTitle(String title) {
    printBorder();
    System.out.println("|              " + title + "             |");
    printBorder();
  }


}
