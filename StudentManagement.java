import java.util.*;

public class StudentManagementSystem {

    private static Student[] students = new Student[100];  // Initial capacity of 100 students
    private static int studentCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        if (studentCount >= students.length) {
            System.out.println("Student list is full!");
            return;
        }

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        Student student = new Student(name, rollNumber);
        students[studentCount++] = student;
        System.out.println("Student added successfully!");
    }

    private static void displayStudents() {
        if (studentCount == 0) {
            System.out.println("No students found!");
        } else {
            System.out.println("\nStudent List:");
            for (int i = 0; i < studentCount; i++) {
                Student student = students[i];
                System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber());
            }
        }
    }
}

class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}


