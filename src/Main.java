import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book book = new Book("gatsby", "maverick", "12345");
        //calling the getter methods
        System.out.println("the name of the book is:" + book.getTitle());
        System.out.println("the author of the book is:" + book.getAuthor());
        System.out.println("the book's number is:" + book.getISBN());

        //calling the setter methods to change the book attributes
        book.setTitle("Hamlet");
        book.setAuthor("Shakespoppi");
        book.setISBN("246111");
        //printing the new attributes
        System.out.println("the name of the book is:" + book.getTitle());
        System.out.println("the author of the book is:" + book.getAuthor());
        System.out.println("the book's number is:" + book.getISBN());

        //checking availability using the isAvailable method and a ternary operator
        System.out.println((((book.isAvailable())) ? "the book is available" : "no, book is not available"));
        //checking out a book
        book.checkout();
        //returning a book
        book.returnBook();

        //calling the reader methods
        System.out.println("enter your name: ");
        String readerName = input.nextLine();
        System.out.println("enter your ID: ");
        String readerID = input.nextLine();
        System.out.println("enter your email: ");
        String readerEmail = input.nextLine();
        Reader reader = new Reader(readerName, readerID, readerEmail);
        //displaying reader information
        reader.displayInfo();
        //calling the employee methods
        System.out.println("enter your name: ");
        String employeeName = input.nextLine();
        System.out.println("enter your employee ID: ");
        String employeeID = input.nextLine();
        System.out.println("enter your employee email: ");
        String employeeEmail = input.nextLine();
        //instantiating object of the employee class and passing the variables as parameters to
        Employee employee = new Employee(employeeName, employeeID, employeeEmail);
        //displaying employee(librarian) info
        employee.displayInfo();

    }
}