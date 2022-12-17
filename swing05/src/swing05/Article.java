package swing05;

//DTO를 만든것임.
public class Article {
	private int id;
	private String writer;
	private String title;
	private String content;
	private int count;

	public Article(int id, String writer, String title, String content, int count) {
		super();
		this.id = id;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", writer=" + writer + ", title=" + title + ", content=" + content + ", count="
				+ count + "]";
	}
}
