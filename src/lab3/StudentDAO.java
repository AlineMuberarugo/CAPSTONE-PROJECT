package lab3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

    public void addStudent(String firstName, String lastName,
                           String email, int age) throws SQLException {

        String sql = "INSERT INTO students " +
                "(first_name, last_name, email, age) VALUES (?, ?, ?, ?)";

        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, email);
            ps.setInt(4, age);

            ps.executeUpdate();
            System.out.println("Student added successfully!");
        }
    }

    // READ: Display all students
    public void displayStudents() throws SQLException {

        String sql = "SELECT * FROM students ORDER BY student_id";

        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("student_id") +
                                " | Name: " + rs.getString("first_name") +
                                " " + rs.getString("last_name") +
                                " | Email: " + rs.getString("email") +
                                " | Age: " + rs.getInt("age")
                );
            }
        }
    }
    public void updateStudent(int id, String firstName,
                              String lastName, String email,
                              int age) throws SQLException {

        String sql = "UPDATE students SET first_name=?, last_name=?, " +
                "email=?, age=? WHERE student_id=?";

        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, email);
            ps.setInt(4, age);
            ps.setInt(5, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("Student ID not found.");
            }
        }
    }


    public void deleteStudent(int id) throws SQLException {

        String sql = "DELETE FROM students WHERE student_id=?";

        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student ID not found.");
            }
        }
    }
}
