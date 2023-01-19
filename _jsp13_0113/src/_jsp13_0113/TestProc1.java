package _jsp13_0113;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestProc1 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SCOTT","tiger");
			CallableStatement cstmt = con.prepareCall("{call myproc(?)}");
			cstmt.setString(1, "아무 말이나");;
			cstmt.executeQuery();
			System.out.println("완료");
			cstmt.close();
			con.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
