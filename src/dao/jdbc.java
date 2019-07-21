package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbutils.ResultSetHandler;

/*
 * @author 梁杰
 * 
 */
public class jdbc {
	//连接参数
	final static String url = "jdbc:mysql://localhost:3306/superbook";
	final static String user = "root";
	final static String password = "root";
	
	//加载驱动类
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//本地线程变量，用于事务控制，为每一个进程创建一个connection对象
	private static ThreadLocal<Connection> TL = new ThreadLocal<Connection>();
	
	
	//创建链接对象
	public static Connection getConnection () throws SQLException{
		//尝试从本地的线程中找到connection
		Connection conn = null;
		conn = TL.get();
		
		//如果拿不到或者拿到的不可用
		if(conn == null || conn.isClosed()) {
			//重新创建一个connection
			conn = DriverManager.getConnection(url, user, password);
			//存储到TL
			TL.set(conn);
		}
		return conn;
	}
	
	//关闭连接
		
	public static void close (ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void close (Statement stmt) {
		try {
			if(stmt != null) {
				stmt.close();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close (Connection conn) {
		try {
			if(conn != null) {
				conn.close();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close (Connection conn, Statement stmt, ResultSet rs) {
		close(rs);
		close(stmt);
		close(conn);
		TL.remove();
	}
	
	//查询语句
	public static <T> T select(String sql,ResultSetHandler<T> h, Object...params) {
		Connection conn =null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			//获取链接
			conn = getConnection();
			//执行预编译SQL语句
			stmt = conn.prepareStatement(sql);
			//拼接SQl语句，设置参数
			if(params != null) {
				for(int i = 0 ; i < params.length; i++ ) {
					stmt.setObject(i+1, params[i]);
				}
			}
			//获取结果集
			rs = stmt.executeQuery();
			//解析结果集
			T obj = h.handle(rs);
			return obj;
		}catch (Exception e) {//往上抛异常
			throw new RuntimeException(e);
		}finally {
			close(rs);
			close(stmt);
		}
	}
	
	//增改删语句
	public static void update(String sql,Object... params) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			//获取链接
			conn = getConnection();
			//预编译sql语句
			stmt = conn.prepareStatement(sql);
			//设置参数
			if(params != null ) {
			for(int i = 0 ; i<params.length; i++ ) {
				stmt.setObject(i+1, params[i]);
			}
			}
			//执行语句
			stmt.executeUpdate();
		}catch (Exception e) {
			throw new RuntimeException();
		}finally {
			close(stmt);
		}
	}
	
}
