package callable_use;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

public class Fifth {

	public static void main(String[] args) throws Exception {
		
         Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","12345");
		
		
		 CallableStatement call=con.prepareCall("{call getavg(?)}");
		 
		 call.registerOutParameter(1,Types.DOUBLE);
		 
		 ResultSet set = call.executeQuery();
		 
		 while(set.next() ) {
			 
			 System.out.println("Average:" + set.getDouble(1));
		 }
	}

}
