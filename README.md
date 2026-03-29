# Student Information System

A simple Java application with a graphical user interface (GUI) that performs Create, Read, Update, and Delete (CRUD) operations on a MySQL database. 

## Features
* **Create:** Add new students to the database.
* **Read:** View all students in a dynamic, clickable table.
* **Update:** Edit existing student information.
* **Delete:** Remove a student from the system.
* **Click-to-Fill:** Clicking a row in the table automatically populates the text fields for quick editing.

## Technologies Used
* **Java:** Core logic and database connection (JDBC).
* **Java Swing:** Graphical User Interface (GUI).
* **MySQL:** Database management and storage.
* **NetBeans IDE:** Project environment.

## How to Run This Project

### 1. Database Setup
Before running the Java application, you must set up the MySQL database:
1. Open **MySQL Workbench**.
2. Go to **Server** -> **Data Import**.
3. Select **Import from Self-Contained File** and choose the `database_setup.sql` file included in this repository.
4. Click **Start Import**. This will automatically create the `student_information_system` database and the `students` table.

### 2. Application Setup
1. Open the project folder in **NetBeans IDE**.
2. Ensure you have the **MySQL JDBC Driver** added to your project's libraries.
3. Open `DBConnection.java` and make sure the `USER` and `PASSWORD` match your local MySQL Workbench credentials (usually `root`).
4. Run the project!

<img width="1071" height="632" alt="image" src="https://github.com/user-attachments/assets/53c6e0ea-3f01-41e6-9bd8-c9be0b7704ed" />
<img width="1074" height="631" alt="image" src="https://github.com/user-attachments/assets/be395d4f-2b3f-4c3e-a8cf-632cedd8e757" />
<img width="702" height="180" alt="image" src="https://github.com/user-attachments/assets/0698d22f-21b5-4e62-99c0-7e938065eb2e" />

