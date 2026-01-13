package callable_use;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

public class First {

	public static void main(String[] args) throws Exception {
         Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","12345");
		
		 CallableStatement call=con.prepareCall("{call getall()}");
		 
		 ResultSet set = call.executeQuery();
		 
		 while(set.next()) {
			 
			 System.out.println(set.getString(2));
			 System.out.println(set.getInt(1));
			 System.out.println("*******************");
			 
		 }
			 
		 con.close();
		 call.close();
		 set.close();
		
	}

}