package lab3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/University_student_management_system";

    private static final String USER = "postgres";

    private static final String PASSWORD = "4045";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
