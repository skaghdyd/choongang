package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	private static EmpDao empDao = new EmpDao();

	public static EmpDao getInstance() {
		return empDao;
	}

	private Connection conn;

	private EmpDao() {
		try {
			conn = Connect.getConnect();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Emp> selectAll() throws SQLException {
		List<Emp> list = new ArrayList<Emp>();
		
		String sql = "select * from emp";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			int empNo = rs.getInt("EMPNO");
			String eName = rs.getString("ENAME");
			String job = rs.getString("JOB");
			int mgr = rs.getInt("MGR");
			Date hireDate = rs.getDate("HIREDATE");
			int sal = rs.getInt("SAL");
			int comm = rs.getInt("COMM");
			int deptNo = rs.getInt("DEPTNO");
			Emp emp = new Emp(empNo, eName, job, mgr, hireDate, sal, comm, deptNo);
			list.add(emp);
		}
		pstmt.close();
		rs.close();
		
		return list;
	}
}
