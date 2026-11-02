package lab3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseDAO {

    // CREATE: Add a course
    public void addCourse(String name, String code,
                          int credits, String description)
            throws SQLException {

        String sql = "INSERT INTO courses " +
                "(course_name, course_code, credits, description) " +
                "VALUES (?, ?, ?, ?)";

        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, code);
            ps.setInt(3, credits);
            ps.setString(4, description);

            ps.executeUpdate();
            System.out.println("Course added successfully!");
        }
    }

    // READ: Display courses
    public void displayCourses() throws SQLException {

        String sql = "SELECT * FROM courses ORDER BY course_id";

        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        "ID: " + rs.getInt("course_id") +
                                " | Name: " + rs.getString("course_name") +
                                " | Code: " + rs.getString("course_code") +
                                " | Credits: " + rs.getInt("credits") +
                                " | Description: " + rs.getString("description")
                );
            }
        }
    }

    // UPDATE: Update a course
    public void updateCourse(int id, String name,
                             String code, int credits,
                             String description) throws SQLException {

        String sql = "UPDATE courses SET course_name=?, course_code=?, " +
                "credits=?, description=? WHERE course_id=?";

        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, code);
            ps.setInt(3, credits);
            ps.setString(4, description);
            ps.setInt(5, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Course updated successfully!");
            } else {
                System.out.println("Course ID not found.");
            }
        }
    }

    // DELETE: Remove a course
    public void deleteCourse(int id) throws SQLException {

        String sql = "DELETE FROM courses WHERE course_id=?";

        try (Connection con = DBconnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Course deleted successfully!");
            } else {
                System.out.println("Course ID not found.");
            }
        }
    }
}
