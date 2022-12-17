package jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

	public static Connection conn = null;
	public static Statement stmt = null;
	public static ResultSet rs = null;

	public static void connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 설치 완료");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
		System.out.println("접속 완료");
	}

	public static void selectOne(int id) throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from student where id = '" + id + "'");
		while (rs.next()) {
			String name = rs.getString("name");
			String hakbun = rs.getString("hakbun");
			String address = rs.getString("address");
//			System.out.println(id + " - " + name + " - " + hakbun + " - " + address);

			System.out.printf("%d - %s - %s - %s%n", id, name, hakbun, address);
		}
	}

	public static void selectAll() throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from student");
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String hakbun = rs.getString("hakbun");
			String address = rs.getString("address");
//			System.out.println(id + " - " + name + " - " + hakbun + " - " + address);
			System.out.printf("%d - %s - %s - %s%n", id, name, hakbun, address);
		}
	}

	public static void insert(String name, String hakbun, String address) throws SQLException {
		stmt = conn.createStatement();
		int result = stmt
				.executeUpdate("insert into student " + "values (0,'" + name + "','" + hakbun + "','" + address + "')");
		System.out.println(result + "건 성공");
	}

	public static void update(int id, String name, String hakbun, String address) throws SQLException {
		stmt = conn.createStatement();
		int result = stmt.executeUpdate("update student " + "set name = '" + name + "', hakbun = '" + hakbun
				+ "', address = '" + address + "' " + "where id = " + id);
		System.out.println(result + "건 성공");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		connect();
//		insert("김강동", "202204", "서울 강동구");
//		insert("김강북", "202205", "서울 강북구");
		System.out.println("---");
		System.out.println("기존");
		selectAll();
		System.out.println("---");
		System.out.println("업데이트 1");
		update(1, "홍홍홍", "202200", "서울 서울구");
		selectAll();
		System.out.println("---");
		System.out.println("업데이트 2");
		update(1, "홍길동", "202201", "서울 마포구");
		selectAll();
		System.out.println("---");
		selectOne(1);
		selectOne(2);
		selectOne(3);
		selectOne(4);
		selectOne(5);
	}

}
