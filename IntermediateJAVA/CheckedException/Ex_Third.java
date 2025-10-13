package CheckedException;

import java.sql.SQLException;

public class Ex_Third {

	public static void main(String[] args) {


		try {
			String dbURL = "";
			if(dbURL.isEmpty()) {
				
				throw new SQLException("Database URL cannot be empty");
			}
		}
		catch (SQLException e) {
			System.out.println("Caugth:" + e.getMessage());
		}
		finally {
			System.out.println("Databse connection validated.");
		}

	}

}
