package panda.nono.WebFavorite.util;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class JDBCUtil {
	static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	static String driver = PropertiesUtil.getValue("driver");
	static String url = PropertiesUtil.getValue("url");
	static String userName = PropertiesUtil.getValue("userName");
	static String password = PropertiesUtil.getValue("password");
	public static Connection getConnection() {
		Connection conn = null;
		try {
			dataSource.setDriverClass(driver);
			dataSource.setUser(userName);
			dataSource.setPassword(password);
			dataSource.setJdbcUrl(url);
			conn = dataSource.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
