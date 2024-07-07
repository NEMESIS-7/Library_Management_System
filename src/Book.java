public class Book {
    private String Title;
    private String Author;
    private String ISBN;


    //constructor to initialize the variables
    public Book(String Title, String Author, String ISBN) {
        this.Title = Title.toLowerCase();
        this.Author = Author.toUpperCase();
        this.ISBN = ISBN;
    }

    //function to set the Title of the book
    public void setTitle(String Title) {
        this.Title = Title;
    }

    //function to return the Title of the book
    public String getTitle() {
        return Title;
    }

    //function to set the Author of oa book
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    //function to return the Author
    public String getAuthor() {
        return Author;
    }

    //function to set the ISBN of a book
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    //function to return the ISBN of a book
    public String getISBN() {
        return ISBN;
    }

    //function to check availability
//    public boolean isAvailable() {
//        return availability;
//    }

    //displaying book info
    public void displayInformation(Book book) {
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("ISBN: " + ISBN);
    }

    //method to check if a book has been checked out or is unavailable
//    public void borrowBook() {
//        if (availability) {
//            //updating to false since the book has been borrowed
//            availability = false;
//            System.out.println("the book has been successfully borrowed and is no longer available.");
//        }
//    }
//
//    //method to return a book
//    public void returnBook() {
//        if (!availability) {
//            //updating to true since the book has been returned
//            availability = true;
//            System.out.println("the book has been returned and is now available.");
//        }
//    }
}
//class fiction extends Book {
//    public fiction(String Title, String Author, String ISBN) {
//        super(Title, Author, ISBN);
//    }
//    public void displayInformation() {
//        System.out.println("the details of the fiction book are: ");
//        super.displayInformation();
//    }
//    public void borrowBook() {
//        super.borrowBook();
//        System.out.println("you have borrowed the fiction book successfully.");
//    }
//    public void returnBook() {
//        super.returnBook();
//        System.out.println("you have returned the fiction book successfully.");
//    }
//}
//class nonFiction extends Book {
//    public nonFiction(String Title, String Author, String ISBN) {
//        super(Title, Author, ISBN);
//    }
//    public void displayInformation() {
//        System.out.println("the details of the non-fiction book are: ");
//        super.displayInformation();
//    }
//    public void borrowBook() {
//        super.borrowBook();
//        System.out.println("you have borrowed the non-fiction book successfully.");
//    }
//    public void returnBook() {
//        super.returnBook();
//        System.out.println("you have returned the non-fiction book successfully.");
//    }
//}
