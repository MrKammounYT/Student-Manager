package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQL {
	
	static String host = "sql7.freemysqlhosting.net";
	static String port ="3306";
	static String database = "sql7580740";
	static String username = "sql7580740";
	static String password = "24csxMWg19";
	static Connection connection;
	
	
	public static boolean checkConnection() {  
		try {
			if (connection.isClosed()) {
				return false;
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
		    
	}
	
	
	public static boolean isConnected() {
		return (connection == null ? false:true);
	}
	
	public static void connect() throws ClassNotFoundException,SQLException{
		 if(!isConnected()) {
			 connection = (Connection) DriverManager.getConnection("jdbc:mysql://" +
				     host + ":" + port + "/" + database + "?useSSL=false",
				     username, password);
		 }
	}
	
	public static void disconnect() {
		 if(isConnected()) {
			 try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 }

	}
	
	public static Connection getConnection() {
		return connection;
	}

}
