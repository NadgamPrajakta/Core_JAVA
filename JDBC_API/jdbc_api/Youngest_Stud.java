package jdbc_api;

import java.sql.*;

public class Youngest_Stud {
	
    public static void main(String[] args) {
    	
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc1","root","12345");

            PreparedStatement ps =
                con.prepareStatement(
                    "SELECT * FROM students ORDER BY age ASC LIMIT 1");

            ResultSet rs = ps.executeQuery();

            if (rs.next())
                System.out.println(
                    rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

