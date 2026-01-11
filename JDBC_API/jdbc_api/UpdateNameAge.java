package jdbc_api;

import java.sql.*;
import java.util.Scanner;

public class UpdateNameAge {
	
    public static void main(String[] args) {
    	
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("New Name: ");
            String name = sc.nextLine();
            System.out.print("New Age: ");
            int age = sc.nextInt();

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc1","root","12345");

            PreparedStatement ps =
                con.prepareStatement("UPDATE students SET name=?, age=? WHERE id=?");

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setInt(3, id);
            ps.executeUpdate();

            System.out.println("Updated Successfully");
            con.close(); sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
