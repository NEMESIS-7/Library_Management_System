public class Main {
    public static void main(String[] args) {
       Book book = new Book("the great gatsby", "clare", "223256");
       Book book1 = new Book("the dark knight", "christian bale", "2003");
       Book book2 = new Book("the gentlemen", "matthew mccounaghey", "2020");
       Book book3 = new Book("Tintin", "HERGE", "2232030");

       Library1 library = new Library1();
       library.addBook(book);
       library.addBook(book1);
       library.addBook(book2);
       library.addBook(book3);
       //library.displayBooks();
       library.removeBook(book1);
       library.displayISBN();



    }
}