# Library Management System

## Project Description

The Library Management System is a simple Java-based console application designed to manage a collection of books and members within a library. It allows for adding, removing, borrowing, and returning books, as well as managing member information. This system is intended to provide a basic framework for managing a small library and can be extended to include more advanced features as needed.

## Features

- **Book Management**:
  - Add books to the library
  - Check availability of books
  - Borrow and return books

- **Member Management**:
  - Add members (Readers and Employees)
  - Display member information
  - Specific roles for members (Reader and Employee)

- **Library Management**:
  - Add books to the library
  - Remove books from the library
  - Display a list of all available books
  - Search for a book in the library

## Classes and Methods

### Book Class

- **Constructor**
  - `Book(String Title, String author, String ISBN)`: Initializes a new book with the given title, author, and ISBN. The book is marked as available by default.

- **Setters and Getters**
  - `void setTitle(String Title)`: Sets the title of the book.
  - `String getTitle()`: Returns the title of the book.
  - `void setAuthor(String author)`: Sets the author of the book.
  - `String getAuthor()`: Returns the author of the book.
  - `void setISBN(String ISBN)`: Sets the ISBN of the book.
  - `String getISBN()`: Returns the ISBN of the book.

- **Availability**
  - `boolean isAvailable()`: Checks if the book is available.

- **Book Methods**
  - `void displayInformation()`: Displays information about the book (title, author, ISBN).
  - `void borrowBook()`: Marks the book as borrowed if it is available.
  - `void returnBook()`: Marks the book as available if it was borrowed.

### Member Class

- **Constructor**
  - `Member(String name, String ID, String email)`: Initializes a new member with the given name, ID, and email.

- **Setters and Getters**
  - `void setID(String ID)`: Sets the ID of the member.
  - `String getID()`: Returns the ID of the member.
  - `void setName(String name)`: Sets the name of the member.
  - `String getName()`: Returns the name of the member.
  - `void setEmail(String email)`: Sets the email of the member.
  - `String getEmail()`: Returns the email of the member.

- **Member Methods**
  - `void displayInfo()`: Displays information about the member (name, ID, email).

### Reader Class (extends Member)

- **Constructor**
  - `Reader(String name, String ID, String email)`: Initializes a new reader with the given name, ID, and email.

- **Methods**
  - `void displayInfo()`: Displays information about the reader.

### Employee Class (extends Member)

- **Constructor**
  - `Employee(String name, String ID, String email)`: Initializes a new employee with the given name, ID, and email. Prompts for employee ID during initialization.

- **Setters and Getters**
  - `void setEmployeeID(String employeeID)`: Sets the employee ID.
  - `String getEmployeeID()`: Returns the employee ID.

- **Methods**
  - `void displayInfo()`: Displays information about the employee.

### Library Class

- **Methods**
  - `void addBook()`: Adds one or more books to the library. Prompts for book details.
  - `void removeBook()`: Removes a book from the library by title.
  - `void displayBooks()`: Displays all books currently in the library.
  - `void searchBook()`: Searches for a book by title in the library.

## Installation

1. **Clone the repository**:
    ```
    git clone https://github.com/yourusername/library-management-system.git
    cd library-management-system
    ```

2. **Compile the Java files**:
    ```
    javac Book.java Member.java Library.java
    ```

3. **Run the application**:
    ```
    java Library
    ```

## Usage

### Adding Books to the Library(Using the LIbrary Class)

Create an object of the `Library` class and follow the prompts to add books:
```java
Library library = new Library();
library.addBook();
```
### Removing Books from the Library
Create an object of the `Library` class and follow the prompts to remove a book:
```java
Library library = new Library();
library.removeBook();
```
### Displaying all books in the library
Create an object of the `Library` class and follow the prompts to display all books:
```java
Library library = new Library();
library.displayBook();
```
### Searching for a book in the library
Create an object of the `Library` class and follow the prompts to search for a book in the library:
```java
Library library = new Library();
library.searchBook();
```

