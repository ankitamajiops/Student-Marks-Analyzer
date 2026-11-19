# Approach – Student Marks Analyzer

## 1. Understanding the Problem

The objective is to develop a Java console application that accepts student details and analyzes their marks.

The program should calculate:
- Average marks of all students.
- Highest marks.
- Lowest marks.
- Names of all students who achieved the highest marks.

It should also handle invalid inputs and boundary cases.

## 2. Proposed Solution

The application uses an object-oriented approach.

A `Student` class represents each student and stores their name and marks. The `StudentMarksAnalyzer` class manages input, validation, calculations, and output.

## 3. Implementation Steps

1. Import `ArrayList` and `Scanner`.
2. Create the `Student` class with private `name` and `marks` fields.
3. Create a constructor and getter methods.
4. Accept the number of students from the user.
5. Validate the number of students within the range 0–1000.
6. Accept each student's name and marks.
7. Validate that names are not empty and marks are between 0 and 100.
8. Store student objects in an `ArrayList<Student>`.
9. Calculate the total, highest, and lowest marks.
10. Calculate the average using floating-point division.
11. Display all students who obtained the highest marks.

## 4. Data Structure Used

**ArrayList<Student>**

An ArrayList is used because the number of student records can vary depending on user input.

It provides:
- Dynamic storage.
- Easy insertion of student objects.
- Convenient traversal using loops.

## 5. Input Validation

The application uses separate methods for validation.

- `readInteger()`: Validates integer input and checks the allowed range.
- `readName()`: Rejects empty or whitespace-only names.
- `try-catch`: Handles invalid numeric input through `NumberFormatException`.

## 6. Calculation Logic

- Total marks are calculated by adding the marks of all students.
- Highest marks are determined by comparing each student's marks.
- Lowest marks are determined using the same comparison approach.
- Average is calculated by dividing total marks by the number of students.
- A separate traversal displays every student whose marks equal the highest marks.

## 7. Edge Cases Considered

- Zero students.
- A student scoring 0 marks.
- A student scoring 100 marks.
- Multiple students obtaining the same highest marks.
- Negative marks.
- Marks greater than 100.
- Alphabetic input where an integer is expected.
- Empty or whitespace-only student names.

## 8. Complexity Analysis

Let `n` be the number of students.

- **Time Complexity:** O(n). The input and statistics operations involve traversing the student records.
- **Space Complexity:** O(n). The ArrayList stores the student records.

## 9. Possible Future Improvements

- Add grade and percentage classification.
- Support file-based data storage.
- Generate downloadable performance reports.
- Add a graphical user interface.