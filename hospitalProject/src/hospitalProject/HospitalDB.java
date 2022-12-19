package hospitalProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalDB {
	Connection conn;
	Statement stmt;
	ResultSet rs;

	public HospitalDB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 설치 완료");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
		System.out.println("접속 완료");
	}

	public List searchChart(String ssn) throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from chart where ssn = '" + ssn + "'");
		
		List resultList = new ArrayList();
		while (rs.next()) {
			Map<String, String> map = new HashMap();
			String date = rs.getString("date");
			String name = rs.getString("name");
			String symptom = rs.getString("symptom");
			String opinion = rs.getString("opinion");

			map.put("date", date);
			map.put("name", name);
			map.put("symptom", symptom);
			map.put("opinion", opinion);

			resultList.add(map);
		}

		return resultList;
	}

	public List searchPatient(String name) throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from patient where name like '%" + name + "%'");
		List resultList = new ArrayList();
		while (rs.next()) {
			Map<String, String> map = new HashMap();
			String nm = rs.getString("name");
			String ssn = rs.getString("ssn");
			String phoneNum = rs.getString("phoneNum");
			String fileName = rs.getString("fileName");

			map.put("name", nm);
			map.put("ssn", ssn);
			map.put("phoneNum", phoneNum);
			map.put("fileName", fileName);

			resultList.add(map);
		}

		return resultList;
	}

	public List searchReservation(String date) throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from reservation where date = '" + date + "'");
		List resultList = new ArrayList();
		while (rs.next()) {
			Map<String, String> map = new HashMap();
			String name = rs.getString("name");
			String doctor = rs.getString("doctor");
			String ssn = rs.getString("ssn");
			String phoneNum = rs.getString("phoneNum");

			map.put("name", name);
			map.put("doctor", doctor);
			map.put("ssn", ssn);
			map.put("phoneNum", phoneNum);

			resultList.add(map);
		}
		return resultList;
	}

	public int insert(String date, String name, String ssn, String symptom, String opinion) throws SQLException {

		String nameChk = checkSsn(ssn);
		if(nameChk==null) {
			//해당 주민으로 조회된 회원이 없으면..
			return -1;
		} else if (!nameChk.equals(name)) {
			//조회된 이름과 입력한 이름이 불일치한 경우..
			return -2;
		}

		stmt = conn.createStatement();
		int result = stmt.executeUpdate("insert into chart " + "values (0,'" + date + "','" + name + "','" + ssn + "','"
				+ symptom + "','" + opinion + "')");
		System.out.println("insert " + result + "건 성공");
		return result; //0 또는 1이 return 됨..
	}

	private String checkSsn(String ssn) throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select name from patient where ssn = '" + ssn + "'");
		if(rs.next()) {
			return rs.getString("name");
		}
		return null;
	}

	public boolean addIdCheck(String id) throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from user where id = '" + id + "'");
		if (rs.next()) {
			// 값이 없으면 중복이므로 false
			return false;
		} else {
			// 값이 없으면 중복이 아니므로 true
			return true;
		}
	}

	public int addUser(String id, String name, String password) throws SQLException {
		stmt = conn.createStatement();
		int result = stmt
				.executeUpdate("insert into user " + "values ('" + id + "','" + name + "','" + password + "')");
		System.out.println("addUser " + result + "건 성공");
		return result;
	}

	public String loginCheck(String id) throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select password from user where id = '" + id + "'");
		String password = null;
		if (rs.next()) {
			password = rs.getString("password");
		}
		return password;
	}

	public int addPatient(String name, String ssn, String phoneNum, String filePath) throws SQLException {
		// 중복체크
		if (patientDupCheck(ssn) == false)
			return -1;

		stmt = conn.createStatement();
		int result = stmt.executeUpdate(
				"insert into patient values('" + name + "', '" + ssn + "', '" + phoneNum + "', '" + filePath + "')");
		return result;

	}

	// 환자 중복 체크(ssn 주민번호로 체크)
	private boolean patientDupCheck(String ssn) throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from patient where ssn = '" + ssn + "'");
		if (rs.next()) {
			return false;
		}
		return true;
	}

}
