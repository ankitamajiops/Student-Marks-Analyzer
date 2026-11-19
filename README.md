# Student Marks Analyzer

## 1. Project Overview

Student Marks Analyzer is a Java-based console application that accepts student names and their marks, validates the input, and calculates useful academic statistics.

It helps users quickly understand student performance through average marks, highest marks, lowest marks, and the list of highest-scoring students.

## 2. Problem Statement

Calculating student performance manually can be time-consuming, especially when there are multiple students. This application automates the calculation process and handles invalid inputs to make the results more reliable.

## 3. Features

- Accepts the number of students.
- Takes each student's name and marks as input.
- Validates student names and numeric inputs.
- Restricts marks to the range of 0–100.
- Calculates average, highest, and lowest marks.
- Displays all students who achieved the highest marks.
- Handles zero students and invalid inputs.

## 4. Technologies Used

- Programming Language: Java
- IDE: Visual Studio Code
- Data Structure: ArrayList
- Concepts: Classes, Objects, Encapsulation, Loops, Methods, Exception Handling

## 5. Project Structure

```text
Student-Marks-Analyzer/
├── src/
│   └── StudentMarksAnalyzer.java
├── tests/
│   └── TEST_CASES.md
├── screenshots/
├── README.md
├── APPROACH.md
└── .gitignore
```

## 6. Program Architecture

The application consists of two main classes:

### Student

Stores student information using:
- `name`
- `marks`

Both fields are private and accessed through getter methods.

### StudentMarksAnalyzer

Contains the main program logic:

- `main()`: Controls the overall execution.
- `readInteger()`: Reads and validates integer input.
- `readName()`: Reads and validates student names.
- `displayStatistics()`: Calculates and displays performance statistics.

## 7. How to Run

Make sure Java JDK is installed.

Open the terminal in the project root directory and execute:

```bash
javac -d out src/StudentMarksAnalyzer.java
java -cp out StudentMarksAnalyzer
```

## 8. Design Decisions

- `ArrayList<Student>` is used to store a flexible number of student records.
- Private fields support encapsulation.
- Input validation prevents invalid marks and empty names.
- `try-catch` handles non-numeric input.
- The average is calculated using floating-point division to avoid integer division errors.
- All students with the highest marks are displayed, including ties.

## 9. Complexity Analysis

Let `n` represent the number of students.

- **Time Complexity:** O(n), because the statistics calculation traverses the student list.
- **Space Complexity:** O(n), because student records are stored in an ArrayList.

## 10. Limitations

- Student records are not permanently stored.
- The application supports a maximum of 1000 students.
- The application currently works through a console interface.

## 11. Future Improvements

- Store student records in a file or database.
- Add grade calculation.
- Generate student performance reports.
- Develop a graphical user interface.

## 12. Testing

The application has been tested with normal inputs, boundary marks, invalid numeric inputs, empty names, and zero students. Detailed test cases are available in `tests/TEST_CASES.md`.