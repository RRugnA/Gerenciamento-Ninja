package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private String url = "jdbc:mysql://localhost:3308/sgmn?useTimezone=true&serverTimezone=UTC";
	private String username = "root";
	private String password = "";
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	public Connection getConnection() {
		
		try {
			Class.forName(driver);			
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
