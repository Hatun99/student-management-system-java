import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    // Display all students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.displayInfo();
        }
    }

    // Remove student by ID
    public void removeStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Student removed successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}