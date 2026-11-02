package lab2;

import java.util.Scanner;

public class Lab2Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();
        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();

        int choice;

        do {
            System.out.println(" UNIVERSITY DATABASE SYSTEM");
            System.out.println("1. Register New Student");
            System.out.println("2. Display All Students");
            System.out.println("3. List Available Courses");
            System.out.println("4. Update Student Enrollment");
            System.out.println("5. Delete Student");
            System.out.println("0. Exit");


            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();

                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();

                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();

                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();

                    studentDAO.insertStudent(
                            firstName, lastName, email, age);
                    break;
                case 2:
                    studentDAO.displayStudents();
                    break;
                case 3:

                    courseDAO.listCourses();
                    break;
                    case 4:
                        System.out.print("Enter enrollment ID: ");
                    int enrollmentId = scanner.nextInt();

                    System.out.print("Enter new grade: ");
                    double grade = scanner.nextDouble();

                    enrollmentDAO.updateEnrollment(
                            enrollmentId, grade);
                    break;
                case 5:
                    System.out.print("Enter student ID to delete: ");
                    int studentId = scanner.nextInt();
                    studentDAO.deleteStudent(studentId);

                    break;
                case 0:
                    System.out.println("Exiting University System...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}