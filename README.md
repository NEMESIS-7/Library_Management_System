# Library Management System

## Overview

This project is a simple library management system that allows for the management of books and library members. The system provides functionalities to add, search, display, and remove books and members, and includes an interactive console-based menu for user interactions.

## Classes

### `Book`

Represents a book in the library with attributes:

- `Title`: The title of the book.
- `Author`: The author of the book.
- `ISBN`: The International Standard Book Number of the book.

#### Methods

- `Book(String Title, String Author, String ISBN)`: Constructor to initialize the book's title, author, and ISBN.
- `void setTitle(String Title)`: Sets the title of the book.
- `String getTitle()`: Returns the title of the book.
- `void setAuthor(String Author)`: Sets the author of the book.
- `String getAuthor()`: Returns the author of the book.
- `void setISBN(String ISBN)`: Sets the ISBN of the book.
- `String getISBN()`: Returns the ISBN of the book.
- `void displayInformation(Book book)`: Displays the information of the book.
- `String toString()`: Returns a string representation of the book.

**Note:** Methods for borrowing and returning books are commented out but are intended to manage book availability.

### `BookManagement`

Handles operations related to managing books in the library:

- `void addBook(String ISBN, Book book)`: Adds a book to the library.
- `void dislpayMapping()`: Displays the mapping of books by their ISBN.
- `void displayBooksByTitle()`: Displays all books by their title and author.
- `Book searchByTitle(String title)`: Searches for a book by its title and returns it if found.
- `void searchBookByAuthor(String author)`: Searches for books by their author and displays them.
- `void searchBookByISBN(String number)`: Searches for a book by its ISBN and displays it.
- `void removeBookByTitle(String title)`: Removes a book from the library by its title.
- `void removeBookByAuthor(String author)`: Removes a book from the library by its author.
- `void removeBook(String Title)`: Removes a book from the library by its title.

### `Member`

Represents a library member with attributes:

- `ID`: The member's ID.
- `Name`: The member's name.
- `Email`: The member's email address.
- `Password`: The member's password.
- `Role`: The member's role (e.g., Reader or Employee).

#### Methods

- `Member(String name, String ID, String email, String role)`: Constructor to initialize the member's details.
- `String getID()`, `void setID(String ID)`: Get and set the member's ID.
- `String getName()`, `void setName(String name)`: Get and set the member's name.
- `String getEmail()`, `void setEmail(String email)`: Get and set the member's email.
- `String getPassword()`, `void setPassword(String password)`: Get and set the member's password.
- `String getRole()`, `void setRole(String role)`: Get and set the member's role.
- `void displayInfo()`: Displays the member's information.
- `String toString()`: Returns a string representation of the member.

### `Reader`

Extends `Member` to represent library readers:

- `Reader(String name, String ID, String email, String role)`: Constructor to initialize the reader's details.
- `void displayInfo()`: Displays the reader's information.

### `Employee`

Extends `Member` to represent library employees:

- `Employee(String name, String ID, String email, String role)`: Constructor to initialize the employee's details and prompts for an employee ID.
- `String getEmployeeID()`, `void setEmployeeID(String employeeID)`: Get and set the employee's ID.
- `void displayInfo()`: Displays the employee's information.

**Note:** The `Fiction` and `NonFiction` classes are defined but commented out and are not currently included in the project.

### `UserManagement`

Handles operations related to managing library members:

- `void addMember(String ID, Member member)`: Adds a member to the system.
- `void displayMembers()`: Displays all members in the system.
- `Member searchByID(String ID)`: Searches for a member by their ID and returns it if found.
- `Member searchByName(String name)`: Searches for a member by their name and returns it if found.
- `void showEmails()`: Displays the email addresses of all members along with their names.
- `void showLibrarians()`: Displays the names and roles of all members who are librarians.

### `Main`

The entry point of the application that provides an interactive console-based menu for managing members and books. Includes the following functionalities:

- **Manage Members**
    - `1. Add Member`: Adds a new member.
    - `2. Search Member by ID`: Searches for a member by their ID.
    - `3. Search Member by Name`: Searches for a member by their name.
    - `4. Display All Members`: Displays all members.
    - `5. Return to com.librarysystem.Main Menu`: Returns to the main menu.

- **Manage Books**
    - `1. Add Book`: Adds a new book.
    - `2. Search Book by Title`: Searches for a book by its title.
    - `3. Search Book by Author`: Searches for books by their author.
    - `4. Display All Books`: Displays all books.
    - `5. Remove Book by Title`: Removes a book by its title.
    - `6. Return to com.librarysystem.Main Menu`: Returns to the main menu.

- **View Information**
    - `1. Show All Emails`: Displays the emails of all members.
    - `2. Show All Librarians`: Displays all members who are librarians.
    - `3. Return to com.librarysystem.Main Menu`: Returns to the main menu.

## Usage

Run the `Main` class to start the application. Follow the on-screen menu options to manage members and books, or view information.

## Contributing

Feel free to fork the repository, make changes, and submit pull requests.

