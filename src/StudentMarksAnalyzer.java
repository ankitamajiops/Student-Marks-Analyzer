
import java.util.ArrayList;
import java.util.Scanner;

// Stores individual student information
class Student {

    private String name;
    private int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    String getName() {
        return name;
    }

    int getMarks() {
        return marks;
    }
}

public class StudentMarksAnalyzer {

    // Validates integer input within a specified range
    public static int readInteger(
        Scanner sc, String message, int min, int max
    ) {

        while (true) {

            System.out.print(message);

            String input = sc.nextLine().trim();

            try {

                int value = Integer.parseInt(input);

                if (value >= min && value <= max) {
                    return value;
                }

                System.out.println(
                    "Please enter a value between "
                    + min + " and " + max
                );

            } catch (NumberFormatException e) {

                System.out.println(
                    "Invalid input! Please enter an integer."
                );
            }
        }
    }

    // Validates student name
    public static String readName(Scanner sc, int number) {

        while (true) {

            System.out.print(
                "Enter student " + number + " name: "
            );

            String name = sc.nextLine().trim();

            if (!name.isEmpty()) {
                return name;
            }

            System.out.println(
                "Name cannot be empty! Try again."
            );
        }
    }

    // Calculates and displays class statistics
    public static void displayStatistics(
        ArrayList<Student> students
    ) {

        if (students.isEmpty()) {

            System.out.println("\nNo students available.");
            return;
        }

        int total = 0;

        int highest = students.get(0).getMarks();
        int lowest = students.get(0).getMarks();

        for (Student student : students) {

            int marks = student.getMarks();

            total += marks;

            if (marks > highest) {
                highest = marks;
            }

            if (marks < lowest) {
                lowest = marks;
            }
        }

        double average =
            (double) total / students.size();

        System.out.println("\n===== CLASS STATISTICS =====");

        System.out.println(
            "Total students: " + students.size()
        );

        System.out.printf(
            "Average marks: %.2f%n", average
        );

        System.out.println(
            "Highest marks: " + highest
        );

        System.out.println(
            "Lowest marks: " + lowest
        );

        System.out.println(
            "\nStudents with highest marks:"
        );

        for (Student student : students) {

            if (student.getMarks() == highest) {

                System.out.println(
                    student.getName()
                    + " - "
                    + student.getMarks()
                );
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students =
            new ArrayList<>();

        System.out.println("==============================");
        System.out.println("     STUDENT MARKS ANALYZER");
        System.out.println("==============================");

        int n = readInteger(
            sc,
            "Enter number of students (0-1000): ",
            0,
            1000
        );

        for (int i = 1; i <= n; i++) {

            System.out.println("\nStudent " + i);

            String name = readName(sc, i);

            int marks = readInteger(
                sc,
                "Enter marks (0-100): ",
                0,
                100
            );

            students.add(
                new Student(name, marks)
            );
        }

        displayStatistics(students);

        sc.close();
    }
}
