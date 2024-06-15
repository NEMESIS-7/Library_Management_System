# Library Management System

## Overview

This Library Management System seeks to implement a robust and efficient structure capable of catering to the needs of the library and its stakeholders alike. The system manages book inventory, member information, and borrowing processes while providing essential functionalities to ensure smooth library operations.

## Functional Requirements(as of now)

1. **Book Management**:
   - Add and remove books as they become available or otherwise.
   - Store information about each book, including title, author, and ISBN.
   - Check the availability of each book.

2. **Member Management**:
   - Store and retrieve information about members, including ID numbers and names.

## Classes and Their Functions

### Book Class

The `Book` class stores information about a book and provides methods to access and modify this information.

#### Attributes
- `title`: The title of the book.
- `author`: The author of the book.
- `ISBN`: The International Standard Book Number of the book.
- `availability`: A boolean indicating whether the book is available.

#### Methods
- `getTitle()`: Returns the title of the book.
- `getAuthor()`: Returns the author of the book.
- `getISBN()`: Returns the ISBN of the book.
- `setTitle(String Title)`: Changes the title of the book.
- `setAuthor(String Author)`: Changes the author of the book.
- `setISBN(String ISBN)`: Changes the ISBN of the book.
- `isAvailable()`: Returns the availability status of the book.

### Member Class

The `Member` class stores attributes common to both readers and librarians. The `Reader` and `Librarian` classes will inherit from this class.

#### Attributes
- `name`: The name of the member.
- `ID`: The ID number of the member.
- `email`: The email address of the member (optional).

### Reader Class

Inherits from the `Member` class and stores information specific to library readers.

### Librarian Class

Inherits from the `Member` class and stores information specific to librarians, using the concept of polymorphism to manage both types of members.

## Installation and Usage

To install and use the Library Management System, follow these steps:

1. **Clone the Repository**:
   git clone https://github.com/MVRK0/Library_Management_System.git
2. **Navigaste to the project directory**
3. **Build, if necessary, and run the program**

## Contribution
Contribututions are welcome. Just fork the repository and submit a pull request. However, if you have any questions, reach me via email at elikemfenuksu@gmail.com


