package jdbc_api;

import java.sql.*;
import java.util.Scanner;

public class DeleteByName {
	
    public static void main(String[] args) {
    	
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc1","root","12345");

            PreparedStatement ps =
                con.prepareStatement("DELETE FROM students WHERE name=?");

            ps.setString(1, name);
            ps.executeUpdate();

            System.out.println("Deleted Successfully");
            con.close(); sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
