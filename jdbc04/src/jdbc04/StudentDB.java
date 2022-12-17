package jdbc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDB {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	StudentDB() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 설치 완료");
		conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/thisisjava",
				"java",
				"mysql"
				);
		System.out.println("접속 완료");
	}
	
	void selectOne(int id) throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from student where id = '" + id + "'");
		while(rs.next()) {
			String name = rs.getString("name");
			String hakbun = rs.getString("hakbun");
			String address = rs.getString("address");
			System.out.println(id + " - " + name + " - " + hakbun + " - " + address);
		}
	}
	
	void selectAll() throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from student");
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String hakbun = rs.getString("hakbun");
			String address = rs.getString("address");
			System.out.println(id + " - " + name + " - " + hakbun + " - " + address);
		}
	}
	
	void insert(String name, String hakbun, String address) throws SQLException {
		stmt = conn.createStatement();
		int result = stmt.executeUpdate(
				"insert into student "
				+ "values (0,'" + name + "','" + hakbun + "','" + address + "')");
		System.out.println(result + "건 성공");
	}
	
	void update(int id, String name, String hakbun, String address) throws SQLException {
		stmt = conn.createStatement();
		int result = stmt.executeUpdate(
				"update student "
				+ "set name = '" + name + "', hakbun = '" + hakbun + "', address = '" + address + "' "
				+ "where id = " + id);
		System.out.println(result + "건 성공");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentDB studentDB = new StudentDB();
		System.out.println("---");
		studentDB.selectAll();
		System.out.println("---");
		studentDB.selectOne(1);
		studentDB.selectOne(2);
		studentDB.selectOne(3);
		studentDB.selectOne(4);
		studentDB.selectOne(5);
		System.out.println("---");
		System.out.println("업데이트 1");
		studentDB.update(1, "홍홍홍", "202200", "서울 서울구");
		studentDB.selectAll();
		System.out.println("---");
		System.out.println("업데이트 2");
		studentDB.update(1, "홍길동", "202201", "서울 마포구");
		studentDB.selectAll();
		System.out.println("---");
	}

}
