package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
//	public static Connection getConnect() {
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String user = "SCOTT";
//			String password = "tiger";
//			Connection conn = DriverManager.getConnection(url, user, password);
//			System.out.println("DB연결 성공!");
//			return conn;
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}
	private static Connection conn;

	public static Connection getConnect() throws ClassNotFoundException, SQLException {
		if (conn == null) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "SCOTT";
			String password = "tiger";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공!");
		}
		return conn;
	}
}