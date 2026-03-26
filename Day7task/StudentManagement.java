import java.util.*;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    private String studentId;
    private String grade;

    public Student(String name, int age, String studentId, String grade) {
        super(name, age);
        this.studentId = studentId;
        this.grade = grade;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student ID: " + studentId + ", Grade: " + grade);
    }
}

public class StudentManagement {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);

        sc.close();
    }

    private static void addStudent(Scanner sc) {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter student ID: ");
        String studentId = sc.nextLine();
        System.out.print("Enter grade: ");
        String grade = sc.nextLine();

        Student student = new Student(name, age, studentId, grade);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("\nAll Students:");
            for (Student student : students) {
                student.display();
                System.out.println();
            }
        }
    }
}