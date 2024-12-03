# Library Management System

This project is a basic Library Management System built using the Spring Boot framework. The system allows users to manage a collection of books, enabling features like adding books, borrowing books, and returning books.

---

## Features

- **Add Books:** Users can add new books to the library by providing the title, author, and ISBN.
- **View Books:**
  - View all available books for borrowing.
  - View borrowed books available for return.
- **Borrow Books:** Users can mark a book as borrowed from the library.
- **Return Books:** Users can mark a borrowed book as returned to the library.
- Fully functional front-end using Thymeleaf for seamless interaction with back-end services.
- Basic error handling and validations.

---

## Technology Stack

- **Framework:** Spring Boot
- **Front-End:** Thymeleaf
- **Back-End Language:** Java
- **Database:** In-memory data storage (using Java `ArrayList` for simplicity)
- **Build Tool:** Maven

---

## Setup Instructions

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/laurennguye/CSC-548-Library-App.git
2. **Navigate to the Project Directory:**
   ```bash
   cd CSC-548-Library-App
3. **Build the Project**
   ```bash
   mvn clean install
4. **Run the Application**
   ```bash
   mvn spring-boot:run
5. **Access the Application:** Open a browser and navigate to http://localhost:8080/library.

---

## Project Structure

## Project Structure

```plaintext
src/main/java/com/example/demo
├── DemoApplication.java        # Main application entry point
├── LibraryController.java      # Handles HTTP requests and routes
├── LibraryService.java         # Business logic for book management
├── Book.java                   # Book model class

src/main/resources/templates
├── library.html                # Main library page
├── borrow.html                 # Borrow books page
├── return.html                 # Return books page
```

---

## Contributors

- **Dean**  
  - Integrated Spring Boot into the project.  
  - Developed core back-end functionality, including:  
    - `LibraryController.java`: Handles HTTP requests and routes.  
    - `LibraryService.java`: Implements business logic for book management.  
    - `library.html`: Connects back-end to the user interface.  

- **Lauren**  
  - Created and designed front-end pages:  
    - `return.html`: Page for returning borrowed books.  
    - `borrow.html`: Page for borrowing available books.  
  - Debugged and tested the application, addressing key issues such as:  
    - Display errors for front-end pages.  
    - Resolving compilation and functionality issues.  

---

## Future Enhancements

- Add user authentication and role-based access control.  
- Enhance the user interface with modern frameworks like React or Angular.  
- Integrate a database such as MySQL or MongoDB for persistent data storage.  
- Implement search and filter options for better book management.  
- Develop RESTful APIs to improve scalability and interoperability.
