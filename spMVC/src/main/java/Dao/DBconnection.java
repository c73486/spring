package Dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class DBconnection {

	public static void main(String[] args) {
		
		System.out.println(DBconnection.getDB_mybatis());
	}
	public static SqlSession getDB_mybatis() 
	{
		SqlSession sess=null;
		
		try {
			InputStream ism=Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(ism);
			sess=sf.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sess;
	}
	public static Connection getDB_jdbc()
	{
		String url="jdbc:mysql://localhost:3306/spmvc";
		String username="root";
		String password="1234";
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
