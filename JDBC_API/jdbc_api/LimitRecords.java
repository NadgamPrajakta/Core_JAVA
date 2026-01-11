package jdbc_api;

import java.sql.*;
import java.util.Scanner;

public class LimitRecords {
	
    public static void main(String[] args) {
    	
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Limit: ");
            int limit = sc.nextInt();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc1","root","12345");

            PreparedStatement ps =
                con.prepareStatement("SELECT * FROM students LIMIT ?");

            ps.setInt(1, limit);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt(1)+" "+
                    rs.getString(2)+" "+
                    rs.getInt(3));
            }
            con.close(); sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
