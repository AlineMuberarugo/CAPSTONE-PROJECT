package lab2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseDAO {



    public void listCourses() {

        String sql = "SELECT * FROM courses";

        try (Connection connection = DBconnection.getConnection()) {

            if (connection == null) {
                System.out.println("Database connection failed.");
                return;
            }

            try (PreparedStatement statement =
                         connection.prepareStatement(sql);
                 ResultSet result = statement.executeQuery()) {

                System.out.println("\nAVAILABLE COURSES");

                while (result.next()) {

                    System.out.println(
                            "Course ID: " + result.getInt("course_id"));

                    System.out.println(
                            "Course Name: " +
                                    result.getString("course_name"));

                    System.out.println(
                            "Course Code: " +
                                    result.getString("course_code"));

                    System.out.println(
                            "Credits: " + result.getInt("credits"));

                    System.out.println(
                            "Description: " +
                                    result.getString("description"));

                }
            }

        } catch (SQLException e) {
            System.out.println("Error retrieving courses.");
            e.printStackTrace();
        }
    }
}
