package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {

	private static Connection connection;
	
	private JDBCUtil(){
		super();
	}

	static{
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://118.89.164.57:3306/test?characterEncoding=UTF-8";
		String user = "root";
		String password = "123abc";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}
	
}
