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
		conn = Connect.getConnect();
	}

	public List<Emp> selectAll(String choose) {
		List<Emp> list = new ArrayList<Emp>();
		String sql = null;
		switch (choose) {
		case "asc":
			sql = "select * from emp order by deptno";
			break;
		case "desc":
			sql = "select * from emp order by deptno desc";
			break;
		default:
			sql = "select * from emp";
			break;
		}

		try {
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public Emp select(int empno) {
		String sql = "select * from emp where empno=?";
		Emp emp = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				int empNo = rs.getInt("EMPNO");
				String eName = rs.getString("ENAME");
				String job = rs.getString("JOB");
				int mgr = rs.getInt("MGR");
				Date hireDate = rs.getDate("HIREDATE");
				int sal = rs.getInt("SAL");
				int comm = rs.getInt("COMM");
				int deptNo = rs.getInt("DEPTNO");
				emp = new Emp(empNo, eName, job, mgr, hireDate, sal, comm, deptNo);
			}
			pstmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;
	}
	
	public List<Emp> selDeptSvg() {
		List<Emp> list = new ArrayList<Emp>();
		String sql = "select deptno, job, avg(sal) as avg_sal from emp group by deptno, job order by deptno, job";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int deptNo = rs.getInt("deptno");
				String job = rs.getString("job");
				int sal = rs.getInt("avg_sal");
				Emp emp = new Emp(0, null, job, 0, null, sal, 0, deptNo);
				list.add(emp);
			}
			pstmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}
	public static void main(String[] args) {
		EmpDao ed = EmpDao.getInstance();
		List<Emp> list = ed.selectAll("a");
//		for(Emp emp : list) {
//			System.out.println(emp);
//		}
		list.stream()
			.forEach(e->System.out.println(e));
		double avg = list.stream()
						.mapToInt(Emp::getSal)
						.average()
						.getAsDouble();
	}
}
