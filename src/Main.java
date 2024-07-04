public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "Clare", "11233444");
        Book book1 = new Book("Boys don't cry", "James Cameron", "11233444");
        Book book2 = new Book("Tintin", "HERGE", "1236689");
        Book book3 = new Book("Hit Em Up", "Tupac", "1122538836");
        Library1 library = new Library1();
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.displayBooks();
        library.borrowBook("the great gatsby");

        library.borrowBookByISBN("1122334444");

    }
}