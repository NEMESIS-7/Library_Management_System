import java.util.*;

public class BookManagement {
    private final Hashtable<String, Book> db = new Hashtable<>();

  //method to add book to the library using a book object
    public void addBook(String ISBN, Book book) {
        db.put(ISBN, book);
        String title = book.getTitle();
        System.out.println(title + " has been added to the library");
    }
    public void dislpayMapping(){
        for( Map.Entry<String, Book> book : db.entrySet()){
            System.out.println(book.getKey() + " " + book.getValue());
        }
    }
    public void displayBooksByTitle() {
        for (Map.Entry<String, Book> entry : db.entrySet()) {
            System.out.println("ISBN: " + entry.getKey() + " - " + "Book: " + entry.getValue().getTitle() + ", written by " + entry.getValue().getAuthor());
        }
    }
    public Book searchByTitle(String title) {
        for(Map.Entry<String, Book> entry : db.entrySet()) {
            if(entry.getValue().getTitle().equals(title)) {
                return entry.getValue();
            }
        }
        return null;
    }
    public void searchBookByAuthor(String author) {
        boolean found = false;
        for (Map.Entry<String, Book> entry : db.entrySet()) {
            if (entry.getValue().getAuthor().equals(author)) {
                System.out.println("book with author: " + author + " has the title: " + entry.getValue().getTitle() + " and ISBN: " + entry.getValue().getISBN() + " is in the library");
                found = true;
                break;
            }
        }
        System.out.println("the book with author: " + author + " is not in the library");
    }

    public void searchBookByISBN(String number) {                           // create a single function for this (DRY)
        boolean found = false;
        for (Map.Entry<String, Book> entry : db.entrySet()) {
            if (entry.getValue().getISBN().equals(number)) {
                System.out.println("book with ISBN: " + number + " has the title: " + entry.getValue().getTitle() + " and author: " + entry.getValue().getAuthor() + " is in the library");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("the book with ISBN: " + number + " is not in the library");
        }
    }
    public void removeBookByTitle(String title) {
        if (db.containsKey(title)) {
            db.remove(title);
            System.out.println(title + " has been removed from the library");
        }else{
            System.out.println("the book with title: " + title + " is not in the library");
        }
    }
    public void removeBookByAuthor(String author) {
        boolean found = false;
        Iterator<Map.Entry<String, Book>> iterator = db.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            if (entry.getValue() != null && entry.getValue().getAuthor().equals(author)) {
                iterator.remove();
                System.out.println("Book with author: " + author + " titled " + entry.getValue().getTitle() + " has been removed from the library");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The book with author: " + author + " is not in the library");
        }
    }
    public void removeBook(String Title) {
        if (db.containsKey(Title)) {
            db.remove(Title);
            System.out.println(Title + " has been removed from the library");
        }else{
            System.out.println(Title + " does not exist in the library");
        }

    }
}