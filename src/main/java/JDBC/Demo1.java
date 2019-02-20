package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
	private static Connection connection = JDBCUtil.getConnection();
	
	public static void main(String[] args) throws SQLException {
//		testStatement();
		testPreparedStatement();
	}
	
	/**
	 * Statement
	 * @throws SQLException
	 */
	public static void testStatement() throws SQLException{
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from students limit 1");
		//获取列属性的集合
		ResultSetMetaData metaData = resultSet.getMetaData();
		//获取总列数
		System.out.println(metaData.getColumnCount());
		//获取列名
		System.out.println(metaData.getColumnLabel(1));
	}
	
	/**
	 * PreparedStatement
	 * @throws SQLException
	 */
	public static void testPreparedStatement() throws SQLException{
		PreparedStatement preparedStatement = connection.prepareStatement("select * from students limit 1");
		ResultSet resultSet = preparedStatement.executeQuery();
		//获取列属性的集preparedStatement合
		ResultSetMetaData metaData = resultSet.getMetaData();
		//获取总列数
		System.out.println(metaData.getColumnCount());
		//获取列名
		System.out.println(metaData.getColumnLabel(1));
	}
}
