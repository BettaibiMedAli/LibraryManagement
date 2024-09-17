# Library Management System

## Description
A simple Spring Boot application that demonstrates the core functionalities of a library system, including managing users, books, and book borrowing. This project focuses solely on the backend, showcasing key Spring Boot features like dependency injection, JPA for database management, and RESTful APIs.

## Features
- Basic CRUD operations for users and books.
- REST API to interact with the backend.
- Book borrowing and return functionality.
- Spring Data JPA integration for database management.
- Maven for dependency management and build automation.

## Architecture: MVC (Model-View-Controller)
The application follows the **MVC (Model-View-Controller)** architecture, ensuring a clear separation of concerns. This structure helps in keeping the code organized, maintainable, and scalable by dividing the application into three interconnected components: the model, the view, and the controller.

## Technologies Used
- **Spring Boot**: For application setup and framework support.
- **Java JDK 17**: For language support.
- **Spring Data JPA**: For ORM and database interactions.
- **Postgresql Database** (or any other database like PostgreSQL): For data persistence.
- **Maven**: For managing dependencies and building the project.

## API Endpoints
- **User Management**:
  - `POST /users`: Create a new user.
  - `GET /users`: Fetch all users.
- **Book Management**:
  - `POST /books`: Add a new book.
  - `GET /books`: Fetch all books.
  - `GET /books/{id}`: Fetch a specific book by ID.
  - `DELETE /books/{id}`: Delete a book by ID.
- **Borrowing and Returning**:
  - `POST /books/{id}/borrow`: Borrow a book.
  - `POST /books/{id}/return`: Return a borrowed book.

## Testing
**Postman** was used for testing the API endpoints. The application was tested by sending various HTTP requests (GET, POST, DELETE) to verify the correct implementation of the functionality.
