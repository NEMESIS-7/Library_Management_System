public class Book {
    private String Title;
    private String author;
    private String ISBN;
    private boolean availability;
    //constructor to initialize the variables
    public Book(String Title, String author, String ISBN) {
        this.Title = Title;
        this.author = author;
        this.ISBN = ISBN;
        availability = true;
    }
    //function to set the Title of the book
    public void setTitle(String Title) {
        this.Title = Title;
    }
    //function to return the Title of the book
    public String getTitle() {
        return Title;
    }
    //function to set the author of oa book
    public void setAuthor(String author) {
        this.author = author;
    }
    //function to return the author
    public String getAuthor() {
        return author;
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
    public boolean isAvailable(){
        return availability;
    }
    //method to check if a book has been checked out or is unavailable
    void checkout(){
        if (availability){
           availability = false;
            System.out.println("the book you are looking for has been checked out or is no longer available.");
        }
    }
    //method to return a book
    void returnBook(){
        if (!availability){
           availability = true;
            System.out.println("the book has been returned and is now available.");
        }
    }
}