package notice;

public class PageVO {
	private int startPage; //화면에 보여지는 첫번째 번호
	private int endPage; //화면에 보여지는 마지막 번호
	private int currentPage; //현재 선택한 페이지 번호
	//private int amount = 10; //화면에 보여지는 게시글 수
	private int total; //전체 게시글 수
	
	//public PageVO(int currentPage, int amount, int total) {
	public PageVO(int currentPage, int total) {
		super();
		this.currentPage = currentPage;
		//this.amount = amount;
		this.total = total;
	}
	
	
}
