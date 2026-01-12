package jdbc_batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

public class First {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","12345");
		
		 Statement stmt=con.createStatement();
		 
		 String first="insert into employee values(1,'atharva'),(4,'Rashmika');";
		 String second="insert into employee values(2,'Ghatage');";
		 String third="insert into employee values(3,'Prajkta');";		 
		 
		   stmt.addBatch(first);
		   stmt.addBatch(third);
		   stmt.addBatch(second);
		   
		    int[] arr=stmt.executeBatch();
		    	    
		    for(int i: arr)
		    {
		    	System.out.println(i);
		    	
		    }
		     
		     con.close();
		     stmt.close();		   		 
		
	}

}
class Employee 
{
	int id;
	String name;
	
	public Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
}