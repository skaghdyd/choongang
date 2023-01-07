package dao;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import notice.NoticeDto;

public class Dao {
	private static Dao dao = new Dao();

	private Dao() {
	}

	public static Dao getInstance() {
		return dao;
	}

	private Connection conn = getConnect();

	private Connection getConnect() {
		try {
			Properties prop = new Properties();
			String path = Dao.class.getResource("db.properties").getPath();
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
		return conn;
	}
	
	public List<NoticeDto> notice_selectAll(int selectedPage){
		List<NoticeDto> list = new ArrayList<NoticeDto>();
		String sql = "select *\r\n"
				+ "from(\r\n"
				+ "    select rownum rn, a.*\r\n"
				+ "    from (select idx, author, title, content, fileName, createDate, hit\r\n"
				+ "            from notice order by idx desc) a\r\n"
				+ "    )\r\n"
				+ "where rn > ? and rn <= ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, (selectedPage - 1) * 10);
			pstmt.setInt(2, selectedPage * 10);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int idx = rs.getInt("idx");
				System.out.println("idx >>> " + idx);
				String author = rs.getString("author");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String fileName = rs.getString("fileName");
				String createDate = rs.getString("createDate");
				int hit = rs.getInt("hit");
				NoticeDto noticeDto = new NoticeDto(idx, author, title, content, fileName, createDate, hit);
				list.add(noticeDto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public NoticeDto notice_selectOne(int idx){
		String sql = "select idx, author, title, content, fileName, createDate, hit\r\n"
				+ "from notice where idx = ?";
		NoticeDto noticeDto = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				//int idx = rs.getInt("idx");
				String author = rs.getString("author");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String fileName = rs.getString("fileName");
				String createDate = rs.getString("createDate");
				int hit = rs.getInt("hit");
				noticeDto = new NoticeDto(idx, author, title, content, fileName, createDate, hit);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return noticeDto;
	}
	
	public int notice_write(NoticeDto noticeDto){
		String sql = "insert into notice (idx, author, title, content, fileName, createDate, hit)\r\n"
				+ "values(?,?,?,?,?,?,?)";
		int rs = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, notice_getMaxIdx());
			pstmt.setString(2, noticeDto.getAuthor());
			pstmt.setString(3, noticeDto.getTitle());
			pstmt.setString(4, noticeDto.getContent());
			pstmt.setString(5, noticeDto.getFileName());
			pstmt.setString(6, noticeDto.getCreateDate());
			pstmt.setInt(7, noticeDto.getHit());
			rs = pstmt.executeUpdate();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}

private int notice_getMaxIdx() {
		String sql = "select case when max(idx) is null then 1 else max(idx)+1 end as idx_max\r\n"
				+ "from notice";
		int idx_max = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				idx_max = rs.getInt("idx_max");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return idx_max;
	}

	//	public int insertEmpTemp(Emp emp) {
//		String sql = "insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)"
//				+ "values(?, ?, ?, ?, ?, ?, ?, ?)";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, emp.getEmpno());
//			pstmt.setString(2, emp.getEname());
//			pstmt.setString(3, emp.getJob());
//			pstmt.setInt(4, emp.getMgr());
//			pstmt.setString(5, emp.getHiredate());
//			pstmt.setInt(6, emp.getSal());
//			pstmt.setInt(7, emp.getComm());
//			pstmt.setInt(8, emp.getDeptno());
//
//			int res = pstmt.executeUpdate();
//			pstmt.close();
//			return res;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return 0;
//	}
//
//	public int updateEmpTemp(Emp emp) {
//		String sql = "update emp_temp " + "set ename = ?," + "job = ?," + "mgr = ?," + "hiredate = ?," + "sal = ?,"
//				+ "comm = ?," + "deptno = ? " + "where empno = ?";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, emp.getEname());
//			pstmt.setString(2, emp.getJob());
//			pstmt.setInt(3, emp.getMgr());
//			pstmt.setString(4, emp.getHiredate());
//			pstmt.setInt(5, emp.getSal());
//			pstmt.setInt(6, emp.getComm());
//			pstmt.setInt(7, emp.getDeptno());
//			pstmt.setInt(8, emp.getEmpno());
//
//			int res = pstmt.executeUpdate();
//			pstmt.close();
//			return res;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return 0;
//	}
//
//	public List<Dept> selectDeptTemp() {
//		List<Dept> list = new ArrayList<Dept>();
//		String sql = "select * from dept_temp order by deptno";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				int deptNo = rs.getInt("deptno");
//				String dName = rs.getString("dname");
//				String loc = rs.getString("loc");
//				Dept dept = new Dept(deptNo, dName, loc);
//				list.add(dept);
//			}
//			pstmt.close();
//			rs.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return list;
//	}
//
//	public Emp selectEmpTemp(int empno) {
//		String sql = "select empno, ename, job, mgr, to_char(hiredate, 'YYYY/MM/DD') as hiredate, sal, comm, deptno from emp_temp where empno=?";
//		Emp emp = null;
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, empno);
//			ResultSet rs = pstmt.executeQuery();
//			if (rs.next()) {
//				int empNo = rs.getInt("EMPNO");
//				String eName = rs.getString("ENAME");
//				String job = rs.getString("JOB");
//				int mgr = rs.getInt("MGR");
//				String hireDate = rs.getString("HIREDATE");
//				int sal = rs.getInt("SAL");
//				int comm = rs.getInt("COMM");
//				int deptNo = rs.getInt("DEPTNO");
//				emp = new Emp(empNo, eName, job, mgr, hireDate, sal, comm, deptNo);
//			}
//			pstmt.close();
//			rs.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return emp;
//	}
//
//	public List<Emp> selectEmpTempAll() {
//		List<Emp> list = new ArrayList<Emp>();
//		String sql = "select empno, ename, job, mgr, to_char(hiredate, 'YYYY/MM/DD') as hiredate, sal, comm, deptno from emp_temp order by empno";
//		Emp emp = null;
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				int empNo = rs.getInt("EMPNO");
//				String eName = rs.getString("ENAME");
//				String job = rs.getString("JOB");
//				int mgr = rs.getInt("MGR");
//				String hireDate = rs.getString("HIREDATE");
//				int sal = rs.getInt("SAL");
//				int comm = rs.getInt("COMM");
//				int deptNo = rs.getInt("DEPTNO");
//				emp = new Emp(empNo, eName, job, mgr, hireDate, sal, comm, deptNo);
//				list.add(emp);
//			}
//			pstmt.close();
//			rs.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return list;
//	}
//	
//	public String selectEmpJson() {
//		List<String> list = new ArrayList<String>();
//		String sql = "select json_object(\r\n"
//				+ "empno,\r\n"
//				+ "ename,\r\n"
//				+ "job,\r\n"
//				+ "mgr,\r\n"
//				+ "'hiredate' value to_char(hiredate,'YYYY/MM/DD'),\r\n"
//				+ "sal,\r\n"
//				+ "comm,\r\n"
//				+ "deptno\r\n"
//				+ ") as emp_json\r\n"
//				+ "from emp_temp";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				String empJson= rs.getString("emp_json");
//				list.add(empJson);
//			}
//			
//			pstmt.close();
//			rs.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return "[" + String.join(",", list) + "]";
//	}
//	
//	public int delteEmpTemp(int empno) {
//		String sql = "delete from emp_temp where empno = ?";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, empno);
//			int res = pstmt.executeUpdate();
//			pstmt.close();
//			return res;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return 0;
//	}
	public static void main(String[] args) {
		Dao.getInstance();
	}
}
