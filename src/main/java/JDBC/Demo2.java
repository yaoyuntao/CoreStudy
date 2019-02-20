package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;


public class Demo2 {
	private static Connection connection = JDBCUtil.getConnection();
	
	public static void main(String[] args) throws SQLException {
//		insert();
//		update();
//		delete();
//		queryByArrayHandler();
//		queryByArrayListHandler();
//		queryByBeanHandler();
//		queryByBeanListHandler();
//		queryByColumnListHandler();
//		queryByScalarHandler();
//		queryByMapHandler();
		queryByMapListHandler();
	}
	
	public static void insert() throws SQLException{
		QueryRunner queryRunner = new QueryRunner();
		String sql = "insert into students(name, age, classId) values(?, ?, ?)";
		Object[] param = {"zhangsan", 18, 1};
		int num = queryRunner.update(connection, sql, param);
		System.out.println(num);
		DbUtils.closeQuietly(connection);
	}
	
	public static void update() throws SQLException{
		QueryRunner queryRunner = new QueryRunner();
		String sql = "update students set name = ?, age = ? where id = ?";
		Object[] param = {"zhangsan", 18, 1};
		int num = queryRunner.update(connection, sql, param);
		System.out.println(num);
		DbUtils.closeQuietly(connection);
	}
	
	public static void delete() throws SQLException{
		QueryRunner queryRunner = new QueryRunner();
		String sql = "delete from students where id = ?";
		int num = queryRunner.update(connection, sql, 2);
		System.out.println(num);
		DbUtils.closeQuietly(connection);
	}
	
	/**
	 * 将结果集中的第一行放入Object数组
	 * @throws SQLException
	 */
	public static void queryByArrayHandler() throws SQLException{
		QueryRunner queryRunner = new QueryRunner();
		String sql = "select * from students limit 2";
		Object[] objects = queryRunner.query(connection, sql, new ArrayHandler());
		System.out.println(objects.length);
		for(Object object : objects){
			System.out.print(object+"\t");
		}
		DbUtils.closeQuietly(connection);
	}
	
	/**
	 * 将结果集中的每一行放入Object数组，再将Object放入list集合
	 * @throws SQLException
	 */
	public static void queryByArrayListHandler() throws SQLException{
		QueryRunner queryRunner = new QueryRunner();
		String sql = "select * from students limit 2";
		List<Object[]> list = queryRunner.query(connection, sql, new ArrayListHandler());
		System.out.println(list.size());
		for(Object[] objects : list){
			for(Object object : objects){
				System.out.print(object+"\t");
			}
			System.out.println();
		}
		DbUtils.closeQuietly(connection);
	}
	
	/**
	 * 将结果集中的第一行封装成javaBean对象
	 * @throws SQLException
	 */
	public static void queryByBeanHandler() throws SQLException{
		QueryRunner queryRunner = new QueryRunner();
		String sql = "select * from students limit 2";
		Students students = queryRunner.query(connection, sql, new BeanHandler<Students>(Students.class));
		System.out.println(students.getName());
		System.out.println(students.getAge());
		DbUtils.closeQuietly(connection);
	}
	
	/**
	 * 将结果集中的每一行封装成javaBean对象，再将Object放入list集合
	 * @throws SQLException
	 */
	public static void queryByBeanListHandler() throws SQLException{
		QueryRunner queryRunner = new QueryRunner();
		String sql = "select * from students limit 2";
		List<Students> list = queryRunner.query(connection, sql, new BeanListHandler<Students>(Students.class));
		for(Students students : list){
			System.out.print(students.getName()+"\t");
			System.out.println(students.getAge());
		}
		DbUtils.closeQuietly(connection);
	}
	
	/**
	 * 将结果集中的指定列放入list集合
	 * @throws SQLException
	 */
	public static void queryByColumnListHandler() throws SQLException{
		QueryRunner queryRunner = new QueryRunner();
		String sql = "select * from students limit 2";
		List<Object> list = queryRunner.query(connection, sql, new ColumnListHandler<Object>("name"));
		for(Object object : list){
			System.out.print(object+"\t");
		}
		DbUtils.closeQuietly(connection);
	}
	
	/**
	 * 结果集中只有一个数据
	 * @throws SQLException
	 */
	public static void queryByScalarHandler() throws SQLException{
		QueryRunner queryRunner = new QueryRunner();
		String sql = "select count(*) from students";
		Long count = queryRunner.query(connection, sql, new ScalarHandler<Long>());
		System.out.print(count);
		DbUtils.closeQuietly(connection);
	}
	
	/**
	 * 将结果集中的每一行放入map集合
	 * @throws SQLException
	 */
	public static void queryByMapHandler() throws SQLException{
		QueryRunner queryRunner = new QueryRunner();
		String sql = "select * from students limit 2";
		Map<String, Object> map = queryRunner.query(connection, sql, new MapHandler());
		System.out.println(map.size());
		for(String key : map.keySet()){
			System.out.print(key+"--"+map.get(key));
		}
		DbUtils.closeQuietly(connection);
	}
	
	/**
	 * 将结果集中的每一行放入map集合，再将map放入list集合
	 * @throws SQLException
	 */
	public static void queryByMapListHandler() throws SQLException{
		QueryRunner queryRunner = new QueryRunner();
		String sql = "select * from students limit 2";
		List<Map<String, Object>> list = queryRunner.query(connection, sql, new MapListHandler());
		for(Map<String, Object> map : list){
			for(String key : map.keySet()){
				System.out.print(key+"--"+map.get(key));
			}
			System.out.println();
		}
		DbUtils.closeQuietly(connection);
	}
}
