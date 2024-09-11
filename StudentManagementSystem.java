import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Student class represents each student and is serializable for file storage
class Student implements Serializable {
    private int id;
    private String name;
    private double marks;
    private String grade;

    // Constructor to initialize Student object
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    // Calculate grade based on marks
    private String calculateGrade(double marks) {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }

    public int getId() {
        return id;
    }

    public void setMarks(double marks) {
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Grade: " + grade;
    }
}

public class StudentManagementSystem {
    private static final String FILE_NAME = "students.txt";  // File to store student data
    private static List<Student> studentList = new ArrayList<>();  // List to hold students

    public static void main(String[] args) {
        loadStudentsFromFile();  // Load students from file
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Main menu loop
        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addStudent(scanner);
                case 2 -> viewStudents();
                case 3 -> updateStudent(scanner);
                case 4 -> deleteStudent(scanner);
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Marks: ");
        double marks = scanner.nextDouble();

        Student student = new Student(id, name, marks);
        studentList.add(student);
        saveStudentsToFile();  // Save updated list to file
        System.out.println("Student added successfully!");
    }

    private static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\nStudent List:");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    private static void updateStudent(Scanner scanner) {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        for (Student student : studentList) {
            if (student.getId() == id) {
                System.out.print("Enter new marks: ");
                double marks = scanner.nextDouble();
                student.setMarks(marks);
                saveStudentsToFile();  // Save updated list to file
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void deleteStudent(Scanner scanner) {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                saveStudentsToFile();  // Save updated list to file
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Load students from file
    private static void loadStudentsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            studentList = (List<Student>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No previous data found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading student data.");
        }
    }

    // Save students to file
    private static void saveStudentsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(studentList);
        } catch (IOException e) {
            System.out.println("Error saving student data.");
        }
    }
}
