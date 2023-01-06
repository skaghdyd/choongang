package empDaoEx;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connect {
	private static Connection conn;

	public static Connection getConnect() {
		if (conn == null) {
			try {
				Properties prop = new Properties();
				String path = Connect.class.getResource("db.properties").getPath();
				path = URLDecoder.decode(path, "utf-8");
				prop.load(new FileReader(path));
				String driver = prop.getProperty("driver");
				String url = prop.getProperty("url");
				String user = prop.getProperty("user");
				String password = prop.getProperty("password");
				Class.forName(driver);
//				Class.forName("oracle.jdbc.driver.OracleDriver");
//				String url = "jdbc:oracle:thin:@localhost:1521:xe";
//				String user = "SCOTT";
//				String password = "tiger";
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("DB연결 성공!");
			} catch (IOException | SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
}