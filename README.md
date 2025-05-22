# DSA Virtual Lab

A collection of fundamental data structure implementations in Java, built with Maven, including unit tests using JUnit 5.

---

## Description

This project implements common data structures like Stack, Queue, and more in Java. It demonstrates core operations such as push/pop, enqueue/dequeue, and traversal. All implementations are tested with automated JUnit 5 tests.

---

## Features

- Stack implemented using arrays  
- Queue implemented using linked lists  
- Custom implementations of various data structures  
- JUnit 5 based unit testing  
- Maven for build and dependency management  

---

## Prerequisites

- Java JDK 11 or higher  
- Apache Maven 3.6.0 or higher  

---

## Getting Started

### Clone the repository

```bash
git clone https://github.com/sarthak-000/dsa-virtual-lab.git
cd dsa-virtual-lab
Building the Project
mvn clean compile
Running the Application
mvn exec:java -Dexec.mainClass="com.dsa.lab.App"
Running Tests
mvn test
Project Structure
src/
 ├─ main/
 │   └─ java/
 │       └─ com/
 │           └─ dsa/
 │               ├─ stack/
 │               ├─ queue/
 │               └─ lab/
 └─ test/
     └─ java/
         └─ com/
             └─ dsa/
                 └─ lab/
Sample Output
pgsql
Copy
Edit
Top element is 30
Stack size is 3
Popped element is 30
Top element after pop is 20
Technologies Used
Java 11+

Maven

JUnit 5

Future Work
Add implementations for additional data structures (e.g., Trees, Graphs)

Include more comprehensive test coverage

Build a simple GUI to visualize operations

Author
sarthak agrawal
sarthak-000
