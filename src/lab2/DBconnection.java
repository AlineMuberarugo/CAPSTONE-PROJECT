package lab2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    private static final String url =
            "jdbc:postgresql://localhost:5432/University_student_management_system";

    private static final String user = "postgres";

    private static final String password = "4045";

    public static Connection getConnection() {

        try {
            Connection connection =
                    DriverManager.getConnection(url,user, password);

            System.out.println("Database connected successfully!");

            return connection;

        } catch (SQLException e) {

            System.out.println("Connection failed!");
            e.printStackTrace();

            return null;
        }
    }
}