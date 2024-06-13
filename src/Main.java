import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book mybook = new Book("gatsby", "maverick", "12345");
        //calling the getter methods
        System.out.println("the name of the book is:" + mybook.getTitle());
        System.out.println("the author of the book is:" + mybook.getAuthor());
        System.out.println("the book's number is:" + mybook.getISBN());

        //calling the setter methods
        mybook.setTitle("Hamlet");
        mybook.setAuthor("Shakespoppi");
        mybook.setISBN("246111");

        //checking availability using a ternary operator
        System.out.println((((mybook.isAvailable())) ? "book is available" : "no, book is not available"));

        //trying to borrow a book
        mybook.checkout();
        //trying to borrow a borrowed book
        mybook.checkout();
        //trying to return a book
        mybook.returnBook();
        //trying to return a book that's been returned
        mybook.returnBook();

        //calling the reader methods
        System.out.println("enter your name: ");
        String readerName = input.nextLine();
        System.out.println("enter your ID: ");
        String readerID = input.nextLine();
        System.out.println("enter your email: ");
        String readerEmail = input.nextLine();
        Reader reader = new Reader(readerName, readerID, readerEmail);
        reader.displayInfo();
        //calling the employee methods
        System.out.println("enter your name: ");
        String employeeName = input.nextLine();
        System.out.println("enter your employee ID: ");
        String employeeID = input.nextLine();
        System.out.println("enter your employee email: ");
        String employeeEmail = input.nextLine();
        Employee employee = new Employee(employeeName, employeeID, employeeEmail);
        employee.displayInfo();

    }
}