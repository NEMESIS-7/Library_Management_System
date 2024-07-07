import java.util.*;

public class Library1 {
    private boolean availabity = true;
    private final Vector<String> library= new Vector<>();
    public Hashtable<String, Book> library1 = new Hashtable<>();

    //method to add book to the library using a book object
    public void addBook(Book book) {
        library.add(book.getTitle());
        System.out.println(book.getTitle() + " has been added to the library");
        System.out.println(book.getISBN());
        System.out.println(book.getAuthor());
    }
    //method to remove a book from the library
    public void removeBook(Book book){
        for (int i = 0; i < library.size(); i++) {
            if (library.contains(book.getTitle())){
                library.remove(library.get(i));
                System.out.println(book.getTitle() + " has been removed from the library");
                System.out.println(book.getISBN());
                break;
            }else{
                System.out.println(book.getTitle() + " was never in the library");
                break;
            }
        }
    }
    public void displayISBN(){
        for (int i = 0; i < library.size(); i++) {
            System.out.println();
        }
    }
    //method to check for the availability of a book
    public void isAvailable(String Title){
        for (int i = 0; i < library.size(); i++) {
            if(library.contains(Title.toLowerCase())){
                availabity = true;
                System.out.println(Title + " is available.");
                break;
            }else{
                availabity = false;
                System.out.println(Title + " is not available.");
                break;
            }
        }
    }
    //method to display all books in the library
    public void displayBooks(){
        if (library.isEmpty()){
            System.out.println("there are no books in the library");
        }else{
            for (String i : library) {
                System.out.println(i.toUpperCase() + " is in the library");
            }
        }
    }
    public void borrowBook(String Title){
        for (int i = 0; i < library.size(); i++) {
            if(library.contains(Title.toLowerCase())){
                availabity = true;
                library.remove(Title.toLowerCase());
                System.out.println(Title.toUpperCase() + " has been borrowed successfully");
                availabity = false;
                break;
            }else{
                System.out.println(Title.toUpperCase() + " is not available for borrowing");
                break;
            }
        }
    }
    public void returnBook(String Title){
       // availabity = false;
        System.out.println(Title + " has been returned and is now available for borrowing.");
        library.add(Title.toLowerCase());
        availabity = true;
    }
    public void searchBook(String Title){
        for (int i = 0; i < library.size(); i++) {
            if(library.contains(Title.toLowerCase())){
                System.out.println(Title + " is in the library");
                break;
            }else{
                System.out.println(Title + " is not in the library");
                break;
            }
        }
    }
    public void searchBookByISBN(String ISBN){
        for (int i = 0; i < library.size(); i++) {
            if(library.contains(ISBN)){
                System.out.println("book with " + ISBN + " is in the library");
                break;
            }else{
                System.out.println("book with ISBN: " + ISBN + " is not in the library");
                break;
            }
        }
    }
}