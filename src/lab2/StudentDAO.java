package lab2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {
    public void insertStudent(String firstName, String lastName,
                              String email, int age) {

        String sql = "INSERT INTO students " +
                "(first_name, last_name, email, age) " +
                "VALUES (?, ?, ?, ?)";

        try (Connection connection = DBconnection.getConnection()) {

            if (connection == null) {
                System.out.println("Database connection failed.");
                return;
            }

            try (PreparedStatement statement =
                         connection.prepareStatement(sql)) {

                statement.setString(1, firstName);
                statement.setString(2, lastName);
                statement.setString(3, email);
                statement.setInt(4, age);

                int rows = statement.executeUpdate();

                if (rows > 0) {
                    System.out.println("Student registered successfully!");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error inserting student.");
            e.printStackTrace();
        }
    }
    public void displayStudents() {

        String sql = "SELECT * FROM students";

        try (Connection connection = DBconnection.getConnection()) {

            if (connection == null) {
                System.out.println("Database connection failed.");
                return;
            }

            try (PreparedStatement statement =
                         connection.prepareStatement(sql);
                 ResultSet result = statement.executeQuery()) {

                System.out.println("\nREGISTERED STUDENTS");

                while (result.next()) {

                    System.out.println(
                            "ID: " + result.getInt("student_id"));

                    System.out.println(
                            "First Name: " + result.getString("first_name"));

                    System.out.println(
                            "Last Name: " + result.getString("last_name"));

                    System.out.println(
                            "Email: " + result.getString("email"));

                    System.out.println(
                            "Age: " + result.getInt("age"));

                    System.out.println(
                            "Enrollment Date: " +
                                    result.getDate("enrollment_date"));
                }
            }

        } catch (SQLException e) {
            System.out.println("Error displaying students.");
            e.printStackTrace();
        }
    }


    public void deleteStudent(int studentId) {

        String sql = "DELETE FROM students WHERE student_id = ?";

        try (Connection connection = DBconnection.getConnection()) {

            if (connection == null) {
                System.out.println("Database connection failed.");
                return;
            }

            try (PreparedStatement statement =
                         connection.prepareStatement(sql)) {

                statement.setInt(1, studentId);

                int rows = statement.executeUpdate();

                if (rows > 0) {
                    System.out.println("Student deleted successfully!");
                } else {
                    System.out.println("Student not found.");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error deleting student.");
            e.printStackTrace();
        }
    }
}

