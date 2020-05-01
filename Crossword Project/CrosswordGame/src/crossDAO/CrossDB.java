package crossDAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class CrossDB {
	public static Connection getConnection() 
			  throws Exception
			  {
				  Class.forName("com.mysql.jdbc.Driver");
				  Connection  con = DriverManager.getConnection(
						  "jdbc:mysql://localhost:3306/testing","root","root");
				  return con;
			  }
}
