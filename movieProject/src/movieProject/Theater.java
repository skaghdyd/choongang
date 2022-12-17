package movieProject;

import movieProject.Person.Reservation;

public class Theater {
	static String[] movieList = { "올빼미", "블랙팬서", "동감", "데시벨" };
	static String[] movieTimes = { 
			"1관 - 09시",
			"2관 - 12시",
			"3관 - 15시",
			"4관 - 09시",
			"5관 - 12시",
			"6관 - 15시",
			"7관 - 09시",
			"8관 - 12시",
			"9관 - 15시",
			"10관 - 09시",
			"11관 - 12시",
			"12관 - 15시" };
	Seat[] seats = new Seat[12];

	class Seat {
		String[][] seat = { 
				{ "1열", "□", "□", "□", "□", "□", "□", "□", "□" },
				{ "2열", "□", "□", "□", "□", "□", "□", "□", "□" },
				{ "3열", "□", "□", "□", "□", "□", "□", "□", "□" } };

		public String[][] getSeat() {
			return seat;
		}
	}

	Theater() {
		for (int i = 0; i < seats.length; i++) {
			seats[i] = new Seat();
		}
	}
	
	//영화 리스트 출력 메소드
	void showMovieList() {
		System.out.println("-------------------------------------");
		for (int i = 0; i < movieList.length; i++) {
			System.out.println((i + 1) + ". " + movieList[i]);
		}
		System.out.println("-------------------------------------");
	}
	
	//영화 시간 출력 메소드
	void showMovieTime(int selectMovieNum) {
		System.out.println("-------------------------------------");
		System.out.println("선택하신 영화는 \"" + movieList[selectMovieNum - 1] + "\" 입니다.");
		System.out.println("1. " + movieTimes[(selectMovieNum - 1) * 3]);
		System.out.println("2. " + movieTimes[(selectMovieNum - 1) * 3 + 1]);
		System.out.println("3. " + movieTimes[(selectMovieNum - 1) * 3 + 2]);
		System.out.println("-------------------------------------");
	}
	
	//좌석 출력 메소드
	String[][] showSeat(int selectMovieNum, int selectMovieTime) {
		System.out.println("-------------------------------------");
		System.out.println("선택하신 영화는 \"" + movieList[selectMovieNum - 1] + "\" 입니다.");
		System.out.println("선택하신 시간은 \"" + movieTimes[(selectMovieNum - 1) * 3 + (selectMovieTime - 1)] + "\" 입니다.");
		String[][] seat = seats[(selectMovieNum - 1) * 3 + (selectMovieTime - 1)].getSeat();
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");

		return seat;
	}
	
	//좌석 선택(예약) 메소드
	boolean selectSeat(int selectMovieNum, int selectMovieTime, int colNum, int seatNum, String[][] seat) {
		System.out.println("-------------------------------------");
		if (seat[colNum - 1][seatNum] == "■") {
			System.out.println("해당 좌석은 이미 예약되었습니다. 다른 좌석을 선택해주세요.");
			return false;
		} else {
			System.out.println("선택하신 영화는 \"" + movieList[selectMovieNum - 1] + "\" 입니다.");
			System.out
					.println("선택하신 시간은 \"" + movieTimes[(selectMovieNum - 1) * 3 + (selectMovieTime - 1)] + "\" 입니다.");
			System.out.println("선택하신 좌석은 \"" + colNum + "열 " + seatNum + "번째 좌석\" 입니다.");
			seat[colNum - 1][seatNum] = "■";
			for (int i = 0; i < seat.length; i++) {
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j]);
				}
				System.out.println();
			}
		}
		System.out.println("-------------------------------------");
		return true;
	}
	
	//예약 취소 메소드
	void cancelSeat(Reservation reservation) {
		int selectMovieNum = reservation.getSelectMovieNum();
		String movieName = Theater.getMovie(selectMovieNum);

		int selectMovieTime = reservation.getSelectMovieTime();
		String movieTime = Theater.getTime(selectMovieNum, selectMovieTime);

		int colNum = reservation.getColNum();
		int seatNum = reservation.getSeatNum();
		
		String[][] seat = seats[(selectMovieNum - 1) * 3 + (selectMovieTime - 1)].getSeat();
		seat[colNum - 1][seatNum] = "□";
	}
	
	static String getMovie(int selectMovieNum) {
		return movieList[selectMovieNum - 1];
	}

	static String getTime(int selectMovieNum, int selectMovieTime) {
		return movieTimes[(selectMovieNum - 1) * 3 + (selectMovieTime - 1)];
	}
}
