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
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
			System.out.println("DB 접속!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			Properties prop = new Properties();
//			String path = Dao.class.getResource("db.properties").getPath();
//			path = URLDecoder.decode(path, "utf-8");
//			prop.load(new FileReader(path));
//			String driver = prop.getProperty("driver");
//			String url = prop.getProperty("url");
//			String user = prop.getProperty("user");
//			String password = prop.getProperty("password");
//			Class.forName(driver);
//			conn = DriverManager.getConnection(url, user, password);
//			System.out.println("DB연결 성공!");
//		} catch (IOException | SQLException | ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return conn;
	}

	public List<NoticeDto> notice_selectAll(int selectedPage) {
		List<NoticeDto> list = new ArrayList<NoticeDto>();
		String sql = "select *\n"
				+ "from(\n"
				+ "select @rownum:=@rownum+1 rn, a.*\n"
				+ "from notice a\n"
				+ "where (@rownum:=0)=0 order by a.idx desc\n"
				+ ")list\n"
				+ "where rn>? and rn<=?";
//		String sql = "select *\r\n" + "from(\r\n" + "    select rownum rn, a.*\r\n"
//				+ "    from (select idx, author, title, content, fileName, createDate, hit\r\n"
//				+ "            from notice order by idx desc) a\r\n" + "    )\r\n" + "where rn > ? and rn <= ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, (selectedPage - 1) * 10);
			pstmt.setInt(2, selectedPage * 10);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
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

	public NoticeDto notice_selectOne(int idx) {
		String sql = "select idx, author, title, content, fileName, createDate, hit\r\n" + "from notice where idx = ?";
		NoticeDto noticeDto = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				// int idx = rs.getInt("idx");
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

	public int notice_write(NoticeDto noticeDto) {
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
		String sql = "select case when max(idx) is null then 1 else max(idx)+1 end as idx_max\r\n" + "from notice";
		int idx_max = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				idx_max = rs.getInt("idx_max");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return idx_max;
	}

	public int notice_getTotalPost() {
		String sql = "select count(*) from notice";
		int postCount = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				postCount = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return postCount;
	}
	
	public static void main(String[] args) {
		Dao.getInstance();
	}
}
