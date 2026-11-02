# University Management System
### Building Data-Driven Java Applications with JDBC & OOP

## 1. Project Overview

The University Management System is a Java-based application developed to manage university students, courses, instructors, and student enrollments.

This project demonstrates the practical application of Object-Oriented Programming (OOP), Java Collections, JDBC, PostgreSQL, and Git/GitHub.

The project is divided into three labs, progressing from object-oriented design to database integration and a complete console-based application.

## 2. Project Objectives

The main objectives of this project are to:

- Apply OOP principles, including encapsulation, inheritance, and polymorphism.
- Use Java Collections and Generics to manage application data.
- Connect Java applications to PostgreSQL using JDBC.
- Implement CRUD operations and SQL JOIN queries.
- Apply the Data Access Object (DAO) design pattern.
- Handle invalid inputs and database errors.
- Practice Git and GitHub collaboration through branching, Pull Requests, and merge conflict resolution.

## 3. Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections and Generics
- JDBC (Java Database Connectivity)
- PostgreSQL
- SQL
- PreparedStatement
- Git
- GitHub
- IntelliJ IDEA

## 4. Project Structure

The project is organized into three main labs.

### Lab 1: Object-Oriented Design
Contains the classes and methods used to represent students, courses, and instructors.

### Lab 2: Database Integration
Contains the JDBC connection and DAO classes used to interact with the PostgreSQL database.

### Lab 3: Mini Capstone Project
Combines the previous labs into a console-based University Management application.

The project includes the following main components:

- Student
- Course
- Instructor
- DBconnection
- StudentDAO
- CourseDAO
- EnrollmentDAO
- Main

The exact package and file organization may vary depending on the implementation.

## 5. Lab 1: Object-Oriented Design in Action

### Scenario
University Student Management System.

This lab focuses on designing and implementing university-related classes using Object-Oriented Programming principles.

### Features

- Design Student, Course, and Instructor classes.
- Implement fields, constructors, getters, setters, and toString() methods.
- Apply encapsulation using private fields.
- Apply inheritance to represent related classes.
- Implement polymorphism through method overriding.
- Use Java Collections to manage students, course rosters, and instructor assignments.

### Concepts Practiced

- Classes and Objects
- Encapsulation
- Inheritance
- Polymorphism
- Method Overriding
- Constructors
- List, Set, and Map
- Generics

## 6. Lab 2: Database Integration with JDBC

### Scenario
Extend the University System with Persistent Storage.

This lab introduces PostgreSQL integration, allowing application data to be stored and retrieved from a relational database.

### Database Tables

The database contains the following main tables:

- students
- courses
- enrollments

### Features

- Establish database connections using JDBC.
- Insert student records.
- Retrieve and display course records.
- Update enrollment information.
- Delete student records.
- Use PreparedStatement to execute parameterized SQL queries.
- Implement DAO classes for database operations.

### Concepts Practiced

- JDBC
- PostgreSQL
- SQL CRUD operations
- PreparedStatement
- ResultSet
- Database Connections
- DAO Design Pattern

## 7. Lab 3: Mini Capstone Project

### Scenario
University Management Console Application.

Lab 3 combines the concepts developed in Labs 1 and 2 into a console-based application.

### Features

- Add and remove students.
- Add and remove courses.
- Enroll students in courses.
- View students with their enrolled courses using SQL JOIN queries.
- Handle invalid user inputs.
- Handle database exceptions.
- Organize database operations using DAO classes.

### Git and GitHub Collaboration

The project also demonstrates version control and collaboration practices.

- Create feature branches for new functionalities.
- Commit and push code changes.
- Submit and review Pull Requests.
- Merge approved changes.
- Resolve merge conflicts.

## 8. Database Design

The system uses PostgreSQL to store and manage university information.

### Main Relationships

- A student can enroll in multiple courses.
- A course can have multiple students.
- The enrollments table connects students and courses.
- An instructor can be assigned to courses.

The students and courses tables have a many-to-many relationship through the enrollments table.

### Database Connection

The application uses JDBC to connect to PostgreSQL.

The database connection is configured in the DBconnection.java class.

The connection configuration includes:

- Database URL
- Database username
- Database password

Database credentials should be configured securely before running the application.

## 9. Application Architecture

The application follows a layered approach to separate responsibilities.

### Console Layer

Handles user interaction, menu options, and input collection.

### DAO Layer

Contains database operations such as inserting, retrieving, updating, and deleting records.

### JDBC Layer

Establishes database connections and executes SQL statements.

### Database Layer

Stores persistent student, course, and enrollment information.

## 10. How to Run the Project

### Prerequisites

Ensure the following software is installed:

- Java Development Kit (JDK)
- IntelliJ IDEA
- PostgreSQL
- PostgreSQL JDBC Driver
- Git

### Setup Instructions

1. Clone or download the project repository.
2. Open the project in IntelliJ IDEA.
3. Create the PostgreSQL database.
4. Create the required database tables.
5. Configure the database connection in DBconnection.java.
6. Ensure the PostgreSQL JDBC Driver is added to the project.
7. Run the Main.java file.
8. Follow the console menu to manage students, courses, and enrollments.

## 11. Learning Outcomes

Through this project, the following skills are developed:

- Designing maintainable Java applications using OOP.
- Managing data using Java Collections and Generics.
- Connecting Java applications to PostgreSQL using JDBC.
- Implementing CRUD operations and SQL JOIN queries.
- Separating business logic and database operations using DAO.
- Handling exceptions and invalid user inputs.
- Managing source code using Git and GitHub.
- Practicing collaborative software development.

## 12. Author

**Aline Muberarugo**

University Management System

Java | JDBC | PostgreSQL | OOP | Git & GitHub

## 13. Conclusion

The University Management System demonstrates the development of a data-driven Java application from object-oriented design to database integration and version control.

The project provides practical experience in building maintainable applications, managing relational data, and applying software development practices used in real-world projects.