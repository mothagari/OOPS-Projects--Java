# OOPS-Projects--Java
Collection of Object Oriented Programming Projects in Java Programing Language
1. 💳 Bank Management System

## 📌 Project Overview

The Bank Management System is a Java-based application developed using Object-Oriented Programming (OOP) principles. It enables users to perform secure banking operations such as account creation, user authentication, balance inquiry, and fund transfers. The system interacts with a MySQL database using JDBC and includes robust exception handling for reliability.

---

## 🚀 Features

- 🔐 **User Authentication** (Login/Sign-Up)
- 🧾 **Account Management** (Create, View, Delete)
- 💸 **Fund Transfer** (Between accounts)
- 💰 **Balance Inquiry**
- ❗ **Exception Handling** for errors like insufficient funds, invalid input, etc.
- 🧱 **Modular Design** using OOP Concepts

---

## 🛠️ Technologies Used

| Technology         | Description                     |
|--------------------|---------------------------------|
| Java               | Core programming language       |
| JDBC               | Database connectivity           |
| MySQL              | Database backend                |
| OOP Principles     | Encapsulation, Inheritance, Polymorphism, Abstraction |
|Exception Handling | For robust error management     |

---

## 🏗️ OOP Concepts Applied

- **Encapsulation** – Private attributes with getters/setters for user and account classes.
- **Inheritance** – Parent `Account` class with child classes like `SavingsAccount`, `CurrentAccount`.
- **Polymorphism** – Method overloading for transactions and overriding for account-specific rules.
- **Abstraction** – Interface or abstract classes for transaction behavior.

---

## 🧮 Database Schema (MySQL)

```sql
CREATE DATABASE bank_management;

USE bank_management;

CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL
);

CREATE TABLE accounts (
    account_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    account_type VARCHAR(20),
    balance DECIMAL(10,2) DEFAULT 0.00,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);
⚙️ How to Run
Clone the repo:

bash
Copy
Edit
git clone https://github.com/yourusername/bank-management-system.git
cd bank-management-system
Set up MySQL:

Import the schema above.

Set database URL, username, and password in the DBConnection.java file.

Compile and run the project:

bash
Copy
Edit
javac *.java
java Main
📂 Project Structure
css
Copy
Edit
BankManagementSystem/
├── Main.java
├── DBConnection.java
├── models/
│   ├── User.java
│   ├── Account.java
│   └── SavingsAccount.java
├── services/
│   ├── AuthService.java
│   ├── AccountService.java
│   └── TransactionService.java
└── exceptions/
    ├── InsufficientFundsException.java
    └── InvalidAccountException.java
