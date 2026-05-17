import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Major: ");
                    String major = input.nextLine();

                    Student student = new Student(id, name, major);

                    manager.addStudent(student);

                    break;

                case 2:

                    manager.displayStudents();

                    break;

                case 3:

                    System.out.print("Enter student ID to remove: ");
                    int removeId = input.nextInt();

                    manager.removeStudent(removeId);

                    break;

                case 4:

                    System.out.println("Program terminated.");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        input.close();
    }
}