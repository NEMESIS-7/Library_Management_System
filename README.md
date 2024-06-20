# Library Management System

## Project Description

The Library Management System is a Java-based application designed to efficiently manage books and members within a library setting. It supports operations such as adding, removing, borrowing, and returning books, alongside member management functionalities. This system serves as a foundational tool for organizing a small library and can be extended with additional features as needed.

## Features

- Library Management:
  - Add books to the library
  - Remove books from the library
  - Display a list of all available books
  - Search for a book in the library
  - Check availability of books
  - Borrow and return books

- Member Management:
  - Add members (Readers and Employees)
  - Display member information
  - Specific roles for members (Reader and Employee)

## Classes and Methods

### Book Class

- Constructor:
  - `Book(String title, String author, String ISBN)`: Initializes a new book with title, author, and ISBN. Availability is set to true by default.

- Setters and Getters:
  - `void setTitle(String title)`: Sets the title of the book.
  - `String getTitle()`: Returns the title of the book.
  - `void setAuthor(String author)`: Sets the author of the book.
  - `String getAuthor()`: Returns the author of the book.
  - `void setISBN(String ISBN)`: Sets the ISBN of the book.
  - `String getISBN()`: Returns the ISBN of the book.

- Availability:
  - `boolean isAvailable()`: Checks if the book is available.

- Operations:
  - `void displayInformation()`: Displays information about the book (title, author, ISBN).
  - `void borrowBook()`: Marks the book as borrowed.
  - `void returnBook()`: Marks the book as available.

### Member Class

- Constructor:
  - `Member(String name, String ID, String email)`: Initializes a new member with name, ID, and email.

- Setters and Getters:
  - `void setID(String ID)`: Sets the ID of the member.
  - `String getID()`: Returns the ID of the member.
  - `void setName(String name)`: Sets the name of the member.
  - `String getName()`: Returns the name of the member.
  - `void setEmail(String email)`: Sets the email of the member.
  - `String getEmail()`: Returns the email of the member.

- Operations:
  - `void displayInfo()`: Displays information about the member.

### Reader Class (extends Member)

- Constructor:
  - `Reader(String name, String ID, String email)`: Initializes a new reader with name, ID, and email.

- Operations:
  - `void displayInfo()`: Displays information about the reader.

### Employee Class (extends Member)

- Constructor:
  - `Employee(String name, String ID, String email)`: Initializes a new employee with name, ID, email, and prompts for employee ID during initialization.

- Setters and Getters:
  - `void setEmployeeID(String employeeID)`: Sets the employee ID.
  - `String getEmployeeID()`: Returns the employee ID.

- Operations:
  - `void displayInfo()`: Displays information about the employee.

### Library Class

- Operations:
  - `void addBook()`: Adds one or more books to the library.
  - `void removeBook()`: Removes a book from the library by title.
  - `void displayBooks()`: Displays all books currently in the library.
  - `void searchBook()`: Searches for a book by title in the library.
  - `void availableBooks()`: Displays books that are currently available.

## Installation

1. Clone the repository:
```
git clone https://github.com/MVRK0/Library_Management_System.git
```
2. Compile and run the files.

## Contributing and Suggestions
If you have any questions or suggestions, please contact me via email at elikemfenuksu@gmail.com.
As an alternative, fork the repo, clone it locally, create a new branch for your contribution or bug fix then make your changes and push them to the forked repo.
After, create a pull request from the forked repo to the OG one.

## Your Questions and Contributions are always Welcome.
