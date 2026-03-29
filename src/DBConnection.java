import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                // This tells Java which driver to use
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // Connects to your specific database
                connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_information_system",
                    "root", 
                    "12345" // <-- PUT YOUR REAL PASSWORD HERE
                );
                System.out.println("Connected to Database Successfully!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Failed! Check your password or if MySQL is running.");
            e.printStackTrace();
        }
        return connection; 
    }
}