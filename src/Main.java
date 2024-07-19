public class Main {
    public static void main(String[] args) {
       Book book = new Book("the great gatsby", "clare", "223256");
       Book book1 = new Book("the dark knight", "christian bale", "2003");
       Book book2 = new Book("the gentlemen", "matthew mccounaghey", "2020");
       Book book3 = new Book("Tintin", "HERGE", "2232030");

       Library1 library = new Library1();
       library.addBook("the great gatsby", book);
       library.addBook("the dark knight", book1);
       library.addBook("the gentlemen", book2);
       library.addBook("tintin", book3);
       library.displayBooksByTitle();
       library.searchBookByTitle("the great gatsby");
       library.searchBookByAuthor("HERGE");
       library.searchBookByISBN("2232030");
       library.removeBookByTitle("the great gatsby");
       library.displayBooksByTitle();
       library.removeBookByAuthor("MATTHEW MCCOUNAGHEY");
       library.removeBook("the dark knight");
       library.displayBooksByTitle();

    }
}