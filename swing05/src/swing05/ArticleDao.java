package swing05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArticleDao {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	ArticleDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	int insert(Article article) {
		
		String sql = "insert into article(writer, title, content, count) values (?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getWriter());
			pstmt.setString(2, article.getTitle());
			pstmt.setString(3, article.getContent());
			pstmt.setInt(4, article.getCount());
			
			int result = pstmt.executeUpdate();
			
			return result;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
	int delete(int id) {
		return id;
	}
	
	int update(Article article) {
		return 0;
	}

	Article select(int inputId) {
		String sql = "select * from article where id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, inputId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				int id = rs.getInt(1);
				String writer = rs.getString(2);
				String title = rs.getString(3);
				String content = rs.getString(4);
				int count = rs.getInt(5);

				Article article = new Article(id, writer, title, content, count);

				return article;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	List<Article> selectAll() {
		List<Article> articleList = new ArrayList<Article>();
		String sql = "select id, writer, title, content, count from article";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String writer = rs.getString(2);
				String title = rs.getString(3);
				String content = rs.getString(4);
				int count = rs.getInt(5);

				Article article = new Article(id, writer, title, content, count);
				articleList.add(article);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return articleList;
	}

	public static void main(String[] args) {
		ArticleDao dao = new ArticleDao();
//		List<Article> articleList = dao.selectAll();
//		for (Article article : articleList) {
//			System.out.println(article);
//	 	}
//		System.out.println("---");
//		
//		Stream<Article> articleListStream = articleList.stream();
//		articleListStream.forEach(article->System.out.println(article));
//		
//		System.out.println("---");
		
//		List<Article> articleList2 = new ArrayList();
//		for(int i=0; i<10; i++) {
//			Article article2 = new Article(0,"강"+i,"제목"+i,"내용"+i,0);
//			articleList2.add(article2);
//		}
//		articleList2.stream().forEach(article2->dao.insert(article2));
//		dao.selectAll().stream().forEach(article->System.out.println(article));
		
		List<Article> articleList3 = new ArrayList();
		IntStream.rangeClosed(1, 10)
			.asLongStream()
			.forEach(e->{
				Article article3 = new Article(0, "호"+e, "제목"+e, "내용"+e,0);
				articleList3.add(article3);
			});
		articleList3.stream()
			.forEach(e->System.out.println(e));
	}
}
