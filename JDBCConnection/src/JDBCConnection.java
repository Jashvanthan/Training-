import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // Utility method for output
    public static void out(String message) {
        System.out.println(message);
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            if (conn != null) {
                out("Connected to the database!");
                // Show current schema
                try {
                    String schema = conn.getSchema();
                    out("Current schema: " + schema);
                } catch (AbstractMethodError | SQLException e) {
                    out("Could not retrieve schema: " + e.getMessage());
                }
                out("Running SHOW TABLES query...");
                int tableCount = 0;
                try (java.sql.Statement stmt = conn.createStatement()) {
                    java.sql.ResultSet rs = stmt.executeQuery("SHOW TABLES");
                    out("Tables in the database:");
                    while (rs.next()) {
                        out("- " + rs.getString(1));
                        tableCount++;
                    }
                }
                out("Total tables found: " + tableCount);
            } else {
                out("Failed to make connection!");
            }
        } catch (SQLException e) {
            out("SQLException: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
