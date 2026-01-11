package jdbc_api;

import java.sql.*;
import java.util.Scanner;

public class Nineth {
    public static void main(String[] args) {
    	
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Minimum Age: ");
            int age = sc.nextInt();

            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc1",
                "root",
                "12345"
            );

            PreparedStatement ps =
                con.prepareStatement("SELECT * FROM students WHERE age > ?");

            ps.setInt(1, age);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("age")
                );
            }

            con.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
