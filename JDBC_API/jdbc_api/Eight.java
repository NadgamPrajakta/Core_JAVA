package jdbc_api;

import java.sql.*;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ID to Delete: ");
            int id = sc.nextInt();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc1",
                "root",
                "12345"
            );

            PreparedStatement ps =
                con.prepareStatement("DELETE FROM students WHERE id=?");

            ps.setInt(1, id);
            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Deleted Successfully");
            else
                System.out.println("Record Not Found");

            con.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
