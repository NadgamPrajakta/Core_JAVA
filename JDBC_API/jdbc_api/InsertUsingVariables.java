package jdbc_api;

import java.sql.*;

public class InsertUsingVariables {
	
    public static void main(String[] args) {
    	
        try {
            int id = 5;
            String name = "Kiran";
            int age = 26;

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc1","root","12345");

            PreparedStatement ps =
                con.prepareStatement("INSERT INTO students VALUES (?, ?, ?)");

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);

            ps.executeUpdate();
            System.out.println("Inserted Using Variables");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

