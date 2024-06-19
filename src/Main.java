import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book book = new Book("gatsby", "maverick", "12345");
//        //calling the getter methods
//        System.out.println("the name of the book is:" + book.getTitle());
//        System.out.println("the author of the book is:" + book.getAuthor());
//        System.out.println("the book's number is:" + book.getISBN());
//
//        //calling the setter methods to change the book attributes
//        book.setTitle("Hamlet");
//        book.setAuthor("Shakespoppi");
//        book.setISBN("246111");
//        //printing the new attributes
//        System.out.println("the name of the book is:" + book.getTitle());
//        System.out.println("the author of the book is:" + book.getAuthor());
//        System.out.println("the book's number is:" + book.getISBN());
//
//        //checking availability using the isAvailable method and a ternary operator
//        System.out.println((((book.isAvailable())) ? "the book is available" : "no, book is not available"));
        //borrowing a book
//        System.out.println("are you borrowing or returning a book? ");
//        String answer = input.nextLine().toLowerCase();
////        if (answer.equals("borrowing")) {
////            book.borrowBook();
////        }else if (answer.equals("returning")) {
////            book.returnBook();
////        } else {
////            System.out.println("invalid choice");
////        }
//
//        switch (answer) {
//            case "borrowing":
//                book.borrowBook();
//                break;
//            case "returning":
//                book.returnBook();
//                break;
//            default:
//                System.out.println("Invalid choice");
//        }
//        book.borrowBook();
//        //returning a book
//        book.returnBook();

        //calling the reader methods
//        Reader(input);
//        //calling the employee methods
//        Employee(input);
//        Library library = new Library();
//        Library(input, library);
//        Reader reader = new Reader("mac", "2326", "nac@dfg");
//        reader.displayInfo();
//        Employee employee = new Employee("jigga", "1236", "jiggaman");
//        employee.displayInfo();
        //adding or removing a book
//        Library library = new Library();
//        System.out.println("are you adding or removing a book from the library?");
//        String answer = input.nextLine().toLowerCase();
//        switch (answer) {
//            case "adding":
//                library.addBook();
//                break;
//            case "removing":
//                library.removeBook();
//                break;
//            default:
//                System.out.println("invalid input");
//        }
        //displaying all books in the library
        //library.displayBooks();
        //searching for a book in the library
        //library.searchBook();

        Reader reader = new Reader("big shaq", "223365", "bigshag@something.com");
        reader.displayInfo();
        Employee employee = new Employee("Obidi", "the best", "emcee");
        employee.displayInfo();

    }

//    public static void Library(Scanner input, Library library) {
//        System.out.println("are you adding, removing, searching for, looking to display all books? ");
//        String answer = input.nextLine();
//        switch (answer) {
//            case "adding":
//                library.addBook();
//                break;
//            case "removing a book":
//                library.removeBook();
//                break;
//            case "searching":
//                library.searchBook();
//                break;
//            case "display books":
//                library.displayBooks();
//                break;
//        }
//    }
//
//    public static void Reader(Scanner input) {
//        System.out.println("enter your name: ");
//        String readerName = input.nextLine();
//        System.out.println("enter your ID: ");
//        String readerID = input.nextLine();
//        System.out.println("enter your email: ");
//        String readerEmail = input.nextLine();
//        Reader reader = new Reader(readerName, readerID, readerEmail);
//        reader.displayInfo();
//    }
//
//    public static void Employee(Scanner input) {
//        System.out.println("enter your name: ");
//        String employeeName = input.nextLine();
//        System.out.println("enter your ID: ");
//        String employeeID = input.nextLine();
//        System.out.println("enter your email: ");
//        String employeeEmail = input.nextLine();
//        Employee employee = new Employee(employeeName, employeeID, employeeEmail);
//        employee.displayInfo();
//    }
//
//    public static void Book(Scanner input) {
//        System.out.println("enter the name of the book: ");
//        String bookName = input.nextLine();
//        System.out.println("enter the author of the book: ");
//        String bookAuthor = input.nextLine();
//        System.out.println("enter the ISBN of the book: ");
//        String bookISBN = input.nextLine();
//        Book book = new Book(bookName, bookAuthor, bookISBN);
//        book.displayInformation();
//    }
}