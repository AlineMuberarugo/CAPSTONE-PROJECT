package lab3;

import java.sql.SQLException;
import java.util.Scanner;

public class Lab3Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();
        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();

        boolean running = true;

        while (running) {

            System.out.println("\nUNIVERSITY MANAGEMENT SYSTEM");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Add Course");
            System.out.println("6. Display Courses");
            System.out.println("7. Update Course");
            System.out.println("8. Delete Course");
            System.out.println("9. Enroll Student in Course");
            System.out.println("10. View Students and Their Courses");
            System.out.println("0. Exit");

            try {
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(input.nextLine());

                switch (choice) {

                    case 1:
                        System.out.print("First name: ");
                        String firstName = input.nextLine();

                        System.out.print("Last name: ");
                        String lastName = input.nextLine();

                        System.out.print("Email: ");
                        String email = input.nextLine();

                        System.out.print("Age: ");
                        int age = Integer.parseInt(input.nextLine());

                        if (age <= 0) {
                            System.out.println("Age must be positive.");
                            break;
                        }
                        studentDAO.addStudent(
                                firstName, lastName, email, age);
                        break;
                        case 2:
                        studentDAO.displayStudents();
                        break;
                        case 3:
                        System.out.print("Student ID: ");
                        int studentUpdateId =
                                Integer.parseInt(input.nextLine());

                        System.out.print("New first name: ");
                        String newFirstName = input.nextLine();

                        System.out.print("New last name: ");
                        String newLastName = input.nextLine();

                        System.out.print("New email: ");
                        String newEmail = input.nextLine();

                        System.out.print("New age: ");
                        int newAge = Integer.parseInt(input.nextLine());

                        studentDAO.updateStudent(
                                studentUpdateId, newFirstName,
                                newLastName, newEmail, newAge);
                        break;
                        case 4:
                        System.out.print("Student ID to delete: ");
                        int studentDeleteId =
                                Integer.parseInt(input.nextLine());

                        studentDAO.deleteStudent(studentDeleteId);
                        break;
                        case 5:
                        System.out.print("Course name: ");
                        String courseName = input.nextLine();

                        System.out.print("Course code: ");
                        String courseCode = input.nextLine();

                        System.out.print("Credits: ");
                        int credits = Integer.parseInt(input.nextLine());

                        System.out.print("Description: ");
                        String description = input.nextLine();

                        courseDAO.addCourse(
                                courseName, courseCode,
                                credits, description);
                        break;
                        case 6:
                        courseDAO.displayCourses();
                        break;
                        case 7:
                        System.out.print("Course ID: ");
                        int courseUpdateId =
                                Integer.parseInt(input.nextLine());

                        System.out.print("New course name: ");
                        String newCourseName = input.nextLine();

                        System.out.print("New course code: ");
                        String newCourseCode = input.nextLine();

                        System.out.print("New credits: ");
                        int newCredits =
                                Integer.parseInt(input.nextLine());

                        System.out.print("New description: ");
                        String newDescription = input.nextLine();

                        courseDAO.updateCourse(
                                courseUpdateId, newCourseName,
                                newCourseCode, newCredits,
                                newDescription);
                        break;

                    case 8:
                        System.out.print("Course ID to delete: ");
                        int courseDeleteId =
                                Integer.parseInt(input.nextLine());

                        courseDAO.deleteCourse(courseDeleteId);
                        break;
                        case 9:
                        System.out.print("Student ID: ");
                        int studentId =
                                Integer.parseInt(input.nextLine());

                        System.out.print("Course ID: ");
                        int courseId =
                                Integer.parseInt(input.nextLine());

                        enrollmentDAO.enrollStudent(studentId, courseId);
                        break;
                        case 10:
                        enrollmentDAO.displayStudentCourses();
                        break;
                        case 0:
                        running = false;
                        System.out.println("Thank you for using the system!");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");

            } catch (SQLException e) {
                System.out.println("Database error: " + e.getMessage());

            } catch (Exception e) {
                System.out.println("An unexpected error occurred: "
                        + e.getMessage());
            }
        }

        input.close();
    }
}
