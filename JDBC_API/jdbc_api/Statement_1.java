package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Statement_1 {
	
    public static void main(String[] args) {
    	
        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc1",
                "root",
                "12345"
            );

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Execute Query
            String sql = "INSERT INTO students VALUES (1, 'Prajkta', 21)";
            stmt.executeUpdate(sql);

            System.out.println("Record Inserted Successfully");

            // 5. Close Connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
