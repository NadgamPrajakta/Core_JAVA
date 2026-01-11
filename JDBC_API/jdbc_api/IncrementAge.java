package jdbc_api;

import java.sql.*;

public class IncrementAge {
	
    public static void main(String[] args) {
    	
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc1","root","12345");

            PreparedStatement ps = con.prepareStatement("UPDATE students SET age = age + 1");

            ps.executeUpdate();
            System.out.println("Age Incremented for All");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
