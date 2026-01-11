package jdbc_api;

import java.sql.*;

public class Count_Stud {
	
    public static void main(String[] args) {
    	
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","12345");

            PreparedStatement ps =
                con.prepareStatement("SELECT COUNT(*) FROM students");

            ResultSet rs = ps.executeQuery();
            if (rs.next())
                System.out.println("Total Students: " + rs.getInt(1));

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

