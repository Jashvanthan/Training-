import java.util.List;
import java.util.Scanner;
public class AddStudentMain {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Student Management System");
        System.out.println("Choose an option:");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
   switch (choice) {
    case 1:
        // Add student logic
            System.out.println("Enter student name:");
            String name = scanner.nextLine();
            System.out.println("Enter student mark:");
            int mark = scanner.nextInt();
            System.out.println("Enter student email:");
            String email = scanner.next();
            Student student = new Student(0, name, mark, email);
            boolean added = studentDAO.addStudent(student);
            if(added) {
                System.out.println("Student added successfully.");
                System.out.println("Generated ID: " + student.getId());
            } else {
                System.out.println("Failed to add student.");
            }
        break;
    case 2:
        // View all students logic
        List<Student> students = studentDAO.getAllStudents();
        System.out.println("Current students in the database:");    
        for (Student s : students) {
            System.out.println("ID: " + s.getId() + ", Name: " + s.getName() + ", Mark: " + s.getMark() + ", Email: " + s.getEmail());
        }
        System.out.println("Total students: " + students.size());
        System.out.println("\tend of list.\t");
        break;
    case 3:
        // Update student logic
        System.out.println("Enter the ID of the student to update:");
        int idToUpdate = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter new student name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new student mark:");
        int newMark = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter new student email:");
        String newEmail = scanner.nextLine();
        Student updatedStudent = new Student(idToUpdate, newName, newMark, newEmail);
        boolean updated = studentDAO.updateStudent(updatedStudent);
        if(updated) {
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Failed to update student.");
        }

        break;
    case 4:
        // Delete student logic
        System.out.println("Enter the ID of the student to delete:");
        int idToDelete = scanner.nextInt();
        boolean deleted = studentDAO.deleteStudent(idToDelete);
        if(deleted) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Failed to delete student.");
        }
        break;
    default:
        System.out.println("Invalid option.");
        break;
   }
        scanner.close();
}
}
