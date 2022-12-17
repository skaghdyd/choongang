package swing05;

import java.util.ArrayList;
import java.util.List;

public class ArticleEx {
	static List<Article> articleList;

	public static void main(String[] args) {
		articleList = selectAll();
		for(Article article : articleList) {
			System.out.println(article);
		}
//		System.out.println(select(2));
	}
	
	public static List selectAll() {
		List<Article> articleList = new ArrayList<Article>();
		articleList.add(new Article(1, "홍길동", "제목1", "내용1", 0));
		articleList.add(new Article(2, "홍길동", "제목2", "내용2", 0));
		articleList.add(new Article(3, "홍길동", "제목3", "내용3", 0));
		articleList.add(new Article(4, "홍길동", "제목4", "내용4", 0));
		articleList.add(new Article(5, "홍길동", "제목5", "내용5", 0));
//		for(Article article : articleList) {
//			System.out.println(article);
//		}
		
		return articleList;
	}

	public static Article select(int i) {
		return articleList.get(i);
//		Article article = articleList.get(0);
//		return article;
	}
}
