package JDBC.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcOperation {
    // Database URL, Username, Password
    private static final String URL = "jdbc:mysql://localhost:3306/my_territory";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

public void addJet(int id, String jetName, String type) {
    String query = "INSERT INTO jet (id, jet_name, type) VALUES (?, ?, ?)";

    // Try-with-resources automatically closes Connection and PreparedStatement
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(query)) {
            
            ps.setInt(1, id);
            ps.setString(2, jetName);
            ps.setString(3, type);

            int rows = ps.executeUpdate();
            System.out.println(rows + " record inserted successfully!");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
