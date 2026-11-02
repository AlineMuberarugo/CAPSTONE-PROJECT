package lab3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnrollmentDAO {

    // Enroll a student in a course
    public void enrollStudent(int studentId, int courseId)
            throws SQLException {

        String sql = "INSERT INTO enrollments (student_id, course_id) " +
                "VALUES (?, ?)";

        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, studentId);
            ps.setInt(2, courseId);

            ps.executeUpdate();
            System.out.println("Student enrolled successfully!");
        }
    }

    // View students with their enrolled courses using JOIN
    public void displayStudentCourses() throws SQLException {

        String sql = "SELECT s.student_id, s.first_name, s.last_name, " +
                "c.course_id, c.course_name, e.grade " +
                "FROM students s " +
                "JOIN enrollments e ON s.student_id = e.student_id " +
                "JOIN courses c ON e.course_id = c.course_id " +
                "ORDER BY s.student_id";

        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        "Student ID: " + rs.getInt("student_id") +
                                " | Student: " + rs.getString("first_name") +
                                " " + rs.getString("last_name") +
                                " | Course ID: " + rs.getInt("course_id") +
                                " | Course: " + rs.getString("course_name") +
                                " | Grade: " + rs.getBigDecimal("grade")
                );
            }
        }
    }
}
