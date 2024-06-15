import java.util.*;
public class Library {
    Scanner input = new Scanner(System.in);
    Vector <String> library= new Vector<>();
    //method to add a book to the library
    public void addbook(){
        for(int i = 0; i < library.size(); i++){
            System.out.println("enter the book you want to add to the library: ");
            String newBook = input.nextLine();
            library.add(newBook);
            System.out.println("the book has been added to the library");
        }
    }
    //method to remove a book from the library
    public void removeBook(){
        System.out.println("enter the title of the book you want to remove from the library: ");
        String newBook = input.nextLine();
        if( library.remove(newBook)) {
            System.out.println("the book has been removed from the library");
        }

    }
    //method to display all books in the library
    public void displayBooks(){
        for (String book : library) {
            System.out.println(book + " is somewhere in the library");
        }
    }
    //method to search for a book
    public void searchBook(){
        System.out.println("enter the title of the book you are searching for: ");
        String searchBook = input.nextLine();
        for (String book : library) {
            if(book.contains(searchBook)) {
                System.out.println(book + " is somewhere in the library");
            }else{
                System.out.println(book + " is not available in the library");
            }
        }
    }
    //printing all books in the library
//    public void availableBoooks(){
//        System.out.println(library.toString() + "are currently available or have been available at some point.");
//    }
}
