package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 성공");
		
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/thisisjava",
				"java",
				"mysql"
				);
		System.out.println("접속 성공");
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(
				"select * from student"
				);
		while(rs.next()) {
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("hakbun"));
			System.out.println(rs.getString("address"));
			System.out.println();
		}
		
		String query = "select * from student where id = 1";
		PreparedStatement pstmt = conn.prepareStatement(query);
		rs = pstmt.executeQuery();
	}
}
