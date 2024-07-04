import java.util.*;
public class Library {
    Scanner input = new Scanner(System.in);
    Vector <String> library= new Vector<>();
    //method to add a book to the library
    public void addBook(){
        System.out.println("how many books are you adding to the library?: ");
        int num = input.nextInt();
        //consuming the newline character
        input.nextLine();
        //for loop to store the books to successive indexes
        for(int i = 0; i < num; i++){
            System.out.println("enter the book you want to add to the library: ");
            String newBook = input.nextLine();
            //adding to the vector(array) using the .add method
            library.add(newBook);
            System.out.println(newBook + " has been added to the library");
        }
        //printing the added book(s) using the .toString method
        System.out.println("the books you added are: " + Arrays.toString(library.toArray()));
    }
    //method to remove a book from the library
    public void removeBook(){
        System.out.println("enter the title of the book you want to remove from the library: ");
        String remBook = input.nextLine();
        if(library.contains(remBook)) {
            library.remove(remBook);
            System.out.println( remBook + " book has been removed from the library");
        }else{
            System.out.println( remBook + " book does not exist in the library");
        }
    }
    //method to display all books in the library
    public void displayBooks(){
        for (String book : library) {
            System.out.println(book + " should be in the library");
        }
    }
    //method to search for a book in the library
    public void searchBook(){
        System.out.println("enter the title of the book you are searching for: ");
        String searchBook = input.nextLine();
        //using a for each loop iterate through each book in the library vector
        for (String book : library) {
            if(book.contains(searchBook)) {
                System.out.println(book + " is somewhere in the library");
                break;
            }else {
                System.out.println(book + " is not available in the library");
            }
        }
    }
    //printing all books in the library
//   n
}
