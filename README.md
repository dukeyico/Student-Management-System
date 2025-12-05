
# Student Management System

## Overview

The **Student Management System** is a robust backend application designed to handle the administrative operations of a school. Built using the **MVC (Model-View-Controller)** architecture, this system provides RESTful APIs for managing student personal records.

This project demonstrates a production-ready implementation of a Spring Boot application, complete with cloud deployment, database integration, and automated CI/CD pipelines.

## Live Demo

**Base URL:** `https://student-management-system-production-723e.up.railway.app`
*(Note: As this is a backend API, accessing the root URL may return a 404. Please use the API endpoints in the API section.)*

## Tech Stack

* **Backend Framework:** Java 21, Spring Boot 3.4.2
* **Architecture:** MVC (Model-View-Controller)
* **Database:** MySQL (Production), H2 (Local Testing)
* **ORM:** Hibernate / Spring Data JPA
* **Build Tool:** Maven
* **Cloud Platform:** Railway
* **CI/CD:** GitHub Actions

## Key Features

* **CRUD Operations:** Full Create, Read, Update, and Delete capabilities for student records.
* **MVC Architecture:** Clean separation of concerns between the Data Layer (Model), API Layer (Controller), and Business Logic (Service).
* **Database Integration:** Persistent storage using MySQL with HikariCP for connection pooling.
* **Environment Configuration:** strict separation of local and production configurations using Spring Profiles and Environment Variables.
* **Automated Deployment:** Continuous deployment pipeline triggered via GitHub Actions.

## API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/students` | Retrieve a list of all students |
| `GET` | `/students/{id}` | Retrieve a specific student by ID |
| `POST` | `/students/new` | Register a new student |
| `PUT` | `/students/{id}` | Update an existing student's details |
| `DELETE` | `/students/{id}` | Remove a student from the system |

## Architecture

The application follows the standard Spring Boot MVC flow:

1.  **Controller Layer:** Handles incoming HTTP requests and maps them to the correct service methods.
2.  **Service Layer:** Contains the business logic (e.g., validating student age, checking for duplicate emails).
3.  **Repository Layer:** Interacts directly with the MySQL database using Spring Data JPA.
4.  **Database:** Stores persistent data.

## Local Setup & Installation

To run this project locally on your machine:

**Prerequisites:**

* Java JDK 17 or 21
* Maven
* MySQL Server (running on port 3306)

**Steps:**

1.  **Clone the repository**

    ```bash
    git clone https://github.com/YourUsername/Student-Management-System.git
    cd Student-Management-System
    ```

2.  **Configure Database**
    Update `src/main/resources/application.properties` with your local credentials:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/school_db
    spring.datasource.username=root
    spring.datasource.password=your_password
    ```

3.  **Run the Application**

    ```bash
    mvn spring-boot:run
    ```

4.  **Access the API**
    Open your browser or Postman and go to: `http://localhost:8080/students`

## Deployment & CI/CD

This project is deployed on **Railway** using a CI/CD pipeline.

* **Infrastructure:** The application runs on a dedicated container service coupled with a managed MySQL instance on Railway's internal network.
* **Automation:** A GitHub Actions workflow monitors the `main` branch. Upon a successful push:
    1.  The project is built using Maven.
    2.  Tests are executed to ensure stability.
    3.  If tests pass, the Railway CLI triggers a deployment to the production environment.

## Environment Variables

For security, sensitive keys are not committed to the repository. The production environment uses the following injected variables:

* `DATABASE_URL`: The JDBC connection string.
* `DATABASE_USERNAME`: Database user.
* `DATABASE_PASSWORD`: Database password.
* `PORT`: The dynamic port assigned by Railway.

## Contributing
Contributions are welcome\! Please fork the repository and create a pull request for any feature enhancements or bug fixes.

## License

This project is open-source and available under the [Apache License](https://www.apache.org/licenses/LICENSE-2.0).

## Link to the live project: [Student Management System](https://student-management-system-production-723e.up.railway.app/students/new)
