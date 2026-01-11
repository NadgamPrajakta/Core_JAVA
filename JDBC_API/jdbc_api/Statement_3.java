package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Statement_3 {
	
    public static void main(String[] args) {
    	
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc1",
                "root",
                "12345"
            );

            Statement stmt = con.createStatement();
            String sql = "UPDATE students SET age = 22 WHERE id = 1";
            stmt.executeUpdate(sql);

            System.out.println("Record Updated Successfully");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
