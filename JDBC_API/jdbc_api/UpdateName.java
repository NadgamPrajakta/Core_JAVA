package jdbc_api;

import java.sql.*;
import java.util.Scanner;

public class UpdateName {
	
    public static void main(String[] args) {
    	
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter New Name: ");
            String name = sc.nextLine();

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc1","root","12345");

            PreparedStatement ps =
                con.prepareStatement("UPDATE students SET name=? WHERE id=?");

            ps.setString(1, name);
            ps.setInt(2, id);
            ps.executeUpdate();

            System.out.println("Name Updated");
            con.close(); sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
