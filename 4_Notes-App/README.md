# Notes App

A simple **Command-Line Interface (CLI) based application** to manage notes efficiently.

---

## Objective
To create a Java program that allows users to **write, save, and view notes** in a structured manner using file input/output operations. The notes persist even after the program is closed.

---

## Features
- Write Note – Input a note and save it to a file (`notes.txt`).  
- Read Notes – Display all saved notes line by line.  
- Persistence – Notes remain saved even after the application is closed.  
- Menu-Driven Interface – Provides simple and intuitive options for interacting with the app.  

---

## Implementation Details
- **NotesApp Class** – Contains methods to write and read notes, and the main menu-driven interface.  
- **FileWriter** – Used to write notes to the file in append mode.  
- **FileReader + BufferedReader** – Used to read notes line by line from the file.  
- **System.lineSeparator()** – Ensures that each note is saved on a new line and is cross-platform compatible.  
- **Try-with-Resources** – Automatically closes file resources after reading or writing.  

---

## Conclusion
This project provides a practical example of **File I/O in Java**. It demonstrates how to design and implement a simple, structured program that **persists data using files** while providing a **user-friendly menu-driven interface**.
