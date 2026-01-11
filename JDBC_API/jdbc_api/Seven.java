package jdbc_api;

import java.sql.*;
import java.util.Scanner;

public class Seven {
	
    public static void main(String[] args) {
    	
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ID to Update: ");
            int id = sc.nextInt();

            System.out.print("Enter New Age: ");
            int age = sc.nextInt();

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc1",
                "root",
                "12345"
            );

            PreparedStatement ps =
                con.prepareStatement("UPDATE students SET age=? WHERE id=?");

            ps.setInt(1, age);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            System.out.println(rows + " Record Updated");

            con.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
