package jdbc_api;

import java.sql.*;

public class SelectNames {
	
    public static void main(String[] args) {
    	
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc1","root","12345");

            PreparedStatement ps =
                con.prepareStatement("SELECT name FROM students");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
