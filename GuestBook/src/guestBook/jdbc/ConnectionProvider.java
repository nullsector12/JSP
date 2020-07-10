package guestBook.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	// DB Connection Á¤º¸
	
	
	public static Connection getConnection() throws SQLException {
		
		String jdbcUrl = "jdbc:apache:commons:dbcp:pool";
		
		return DriverManager.getConnection(jdbcUrl);
		
//	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
//	String user = "scott";
//	String pw = "gkskvhqnvhtn123";
//	
//	return DriverManager.getConnection(dbUrl, user, pw);
	}

}
