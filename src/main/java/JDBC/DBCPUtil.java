package JDBC;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DBCPUtil {
	private static Connection connection;
	
	private DBCPUtil(){
		super();
	}
	
	static{
		//初始化BasicDataSource对象
		BasicDataSource basicDataSource = new BasicDataSource();
		//设置驱动
		basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		//设置url
		basicDataSource.setUrl("jdbc:mysql://118.89.164.57:3306/test?characterEncoding=UTF-8&autoReconnect=true");
		//设置用户名
		basicDataSource.setUsername("root");
		//设置密码
		basicDataSource.setPassword("123abc");
		//设置最大连接数
		basicDataSource.setMaxActive(10);
		//设置最大空闲连接数，超过后会被释放
		basicDataSource.setMaxIdle(5);
		//设置最小空闲连接数，如果不够则会创建连接至N个
		basicDataSource.setMinIdle(3);
		//连接池启动时，创建的初始连接数
		basicDataSource.setInitialSize(1);
		//从连接池获取连接的超时时间，超过此时间会抛出异常
		basicDataSource.setMaxWait(3000);
		
		//sql查询，用于验证当前连接的有效性
		basicDataSource.setValidationQuery("SELECT 1");
		//从连接池中获取连接时，是否检查连接有效性
		basicDataSource.setTestOnBorrow(true);
		//归还连接时，是否检查连接有效性
		basicDataSource.setTestOnReturn(true);
		
		//是否启动空闲连接回收器，启动后必须加上setValidationQuery
		basicDataSource.setTestWhileIdle(true);
		//每隔6分钟检查一次连接池中的连接
		basicDataSource.setTimeBetweenEvictionRunsMillis(360000);
		//每次检查10个连接
		basicDataSource.setNumTestsPerEvictionRun(10);
		//如果连接空闲超过5分钟，则会被回收
		basicDataSource.setMinEvictableIdleTimeMillis(300000);
		
		try {
			connection = basicDataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
}
