package lab2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnrollmentDAO {

    public void updateEnrollment(int enrollmentId, double grade) {

        String sql = "UPDATE enrollments SET grade = ? " +
                "WHERE enrollment_id = ?";

        try (Connection connection = DBconnection.getConnection()) {

            if (connection == null) {
                System.out.println("Database connection failed.");
                return;
            }

            try (PreparedStatement statement =
                         connection.prepareStatement(sql)) {

                statement.setDouble(1, grade);
                statement.setInt(2, enrollmentId);

                int rows = statement.executeUpdate();

                if (rows > 0) {
                    System.out.println("Enrollment updated successfully!");
                } else {
                    System.out.println("Enrollment not found.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error updating enrollment.");
            e.printStackTrace();
        }
    }
}
