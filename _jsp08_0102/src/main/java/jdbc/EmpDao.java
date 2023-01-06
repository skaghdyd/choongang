package jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

public class EmpDao {
	private static EmpDao empDao = new EmpDao();

	public static EmpDao getInstance() {
		return empDao;
	}

	private Connection conn;

	private Connection getConnect() {
		if (conn == null) {
			try {
				Properties prop = new Properties();
				String path = EmpDao.class.getResource("db.properties").getPath();
				path = URLDecoder.decode(path, "utf-8");
				prop.load(new FileReader(path));
				String driver = prop.getProperty("driver");
				String url = prop.getProperty("url");
				String user = prop.getProperty("user");
				String password = prop.getProperty("password");
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("DB연결 성공!");
			} catch (IOException | SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}

	private EmpDao() {
		conn = this.getConnect();
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
}
