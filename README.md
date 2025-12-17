# Personal Expense Tracker (Java)

A **console-based Java application** that helps users record, manage, and analyze their personal expenses. The project is designed using **Core Java concepts**, **OOP principles**, and the **Java Collections Framework**, making it ideal for learning and interview preparation.

---

## Features

* Add daily expenses with:

  * Amount
  * Category
  * Date
  * Description
* View all recorded expenses
* View expenses by category with total amount
* Monthly expense summary (category-wise + total)
* Input validation for amount, category, date, month, and year
* Graceful handling of invalid inputs using exception handling

---

## Technologies & Concepts Used

* **Java (Core Java)**
* **Object-Oriented Programming (OOP)**

  * Encapsulation
  * Classes & Objects
  * Constructors
  * Method Overriding (`toString()`)
* **Java Collections Framework**

  * `ArrayList`
  * `HashMap`
* **Java 8 Date & Time API**

  * `LocalDate`
* **Exception Handling**

  * `try-catch`
* **Control Flow Statements**

  * `if-else`, `switch-case`, loops
* **User Input Handling**

  * `Scanner`

---

## Project Structure

```
Personal-Expense-Tracker-Java
│
├── src
│   └── personalexpensetracker
│       ├── Expense.java
│       ├── ExpenseManager.java
│       └── Main.java
│
├── README.md
└── .gitignore
```

---

## How to Run the Project

1. **Clone the repository**

   ```bash
   git clone https://github.com/yourusername/Personal-Expense-Tracker-Java.git
   ```

2. **Open the project** in Eclipse / IntelliJ / VS Code

3. **Compile and run** `Main.java`

4. Follow the on-screen menu to use the application

---

## Sample Menu Output

```
==== Personal Expense Tracker ====
1. Add Expense
2. View All Expenses
3. View Expenses by Category
4. Monthly Summary
5. Exit
```

---

## Learning Outcomes

* Hands-on experience with **Core Java and OOP concepts**
* Practical usage of **Collections (ArrayList & HashMap)**
* Real-world implementation of **date handling** using `LocalDate`
* Writing clean, readable, and maintainable Java code
* Understanding how to validate user input and handle runtime exceptions

---

## Future Enhancements

* File handling to store expenses permanently
* Database integration (MySQL)
* REST API using Spring Boot

---
