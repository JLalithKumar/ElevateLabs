# Java JDBC Employee Database App

A simple **Command-Line Interface (CLI) application** to manage employee records using Java JDBC. The application allows users to **add, view, update, and delete employees** in a MySQL database.

---

## Objective
To create a Java program that allows users to **maintain an employee database** via a CLI. The project introduces **JDBC concepts**, database connectivity, and CRUD (Create, Read, Update, Delete) operations, providing hands-on experience with Java database programming.

---

## Features
- **Add Employee** – Input employee name, department, and salary to add a new record.  
- **View Employees** – Display all employees along with their IDs, departments, and salaries.  
- **Update Employee** – Modify the salary of an existing employee using their ID.  
- **Delete Employee** – Remove an employee record using the assigned ID.  
- **Auto-Generated IDs** – Employee IDs are automatically assigned by the database.  
- **User-Friendly CLI** – Menu-driven interface for easy navigation.

---

## Implementation Details
- **EmployeeDBApp Class** – Contains the main method and handles menu-driven CLI operations.  
- **JDBC Connection** – Connects to a MySQL database using `DriverManager.getConnection`.  
- **PreparedStatement & Statement** – Execute SQL queries safely for CRUD operations.  
- **Scanner** – Accepts user input from the console.  
- **ResultSet** – Retrieves and displays employee records dynamically.  
- **Menu-Driven Loop** – Allows continuous interaction until the user chooses to exit.  
- **Auto-Increment ID Handling** – Fetches the database-generated employee ID after insertion and displays it to the user.  

---

## Conclusion
This project provides a practical example of **Java JDBC programming** with MySQL. It demonstrates how to perform **CRUD operations**, handle **user input via CLI**, and interact with a database efficiently. Users learn the essentials of **database connectivity, SQL integration, and menu-driven program design** in Java.  
