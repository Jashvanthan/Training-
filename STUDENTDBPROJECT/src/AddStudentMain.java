import java.util.List;
import java.util.Scanner;
public class AddStudentMain {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student mark:");
        int mark = scanner.nextInt();
        System.out.println("Enter student email:");
        String email = scanner.next();
        Student student = new Student(0, name, mark, email);
        
        boolean added = studentDAO.addStudent(student);
        List<Student> students = studentDAO.getAllStudents();
        System.out.println("Current students in the database:");
        for (Student s : students) {
            System.out.println("ID: " + s.getId() + ", Name: " + s.getName() + ", Mark: " + s.getMark() + ", Email: " + s.getEmail());
        }
        if (added) {
            System.out.println("Student added successfully.");
            System.out.println("Generated ID: " + student.getId());
        } else {
            System.out.println("Failed to add student.");
        }
        scanner.close();
    }
}
