package jdbc_api;

import java.sql.*;
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc1",
                "root",
                "12345"
            );

            PreparedStatement ps =
                con.prepareStatement("SELECT * FROM Students WHERE id=?");

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("ID: " + rs.getInt(1));
                System.out.println("Name: " + rs.getString(2));
                System.out.println("Age: " + rs.getInt(3));
            } else {
                System.out.println("Student Not Found");
            }

            con.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
