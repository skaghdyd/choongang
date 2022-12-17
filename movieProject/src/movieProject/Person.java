package movieProject;

import java.util.ArrayList;

public class Person {
	private String name; // 사용자 이름
	private String id; // 아이디
	private String pwd; // 비밀번호
	private String nick; // 닉네임
	int age; // 나이
	
	//예약 클래스
	class Reservation{
		int selectMovieNum; //영화번호
		int selectMovieTime; //영화시간
		int colNum; //열번호
		int seatNum; //좌석번호
		
		Reservation(int selectMovieNum, int selectMovieTime, int colNum, int seatNum){
			this.selectMovieNum = selectMovieNum;
			this.selectMovieTime = selectMovieTime;
			this.colNum = colNum;
			this.seatNum = seatNum;
		}

		public int getSelectMovieNum() {
			return selectMovieNum;
		}

		public int getSelectMovieTime() {
			return selectMovieTime;
		}

		public int getColNum() {
			return colNum;
		}

		public int getSeatNum() {
			return seatNum;
		}
	}//예약 클래스
	
	//예약 배열
	private ArrayList<Reservation> reservationList;
	
	//예약 추가 메소드
	void addReservation(int selectMovieNum, int selectMovieTime, int colNum, int seatNum) {
		reservationList.add(new Reservation(selectMovieNum, selectMovieTime, colNum, seatNum));
	}
	
	//예약 취소 메소드
	void cancelReservation(int deleteMovieNum) {
		reservationList.remove(deleteMovieNum-1);
	}
	
	//예약 배열 getter
	ArrayList<Reservation> getReservationList() {
		if(reservationList.size()==0) {
			return null;
		}
		return reservationList;
	}
	
	//기본 생성자
	Person(String name, String id, String pwd, String nick, int age) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
		this.age = age;
		
		//예약 배열 초기화
		reservationList = new ArrayList<Reservation>();
	}
	
	String getName() {
		return name;
	}

	String getId() {
		return id;
	}

	String getPwd() {
		return pwd;
	}

	String getNick() {
		return nick;
	}

	int getAge() {
		return age;
	}
	
	void showReservation(Reservation reservation) {
			int selectMovieNum = reservation.getSelectMovieNum(); //영화 번호
			String movieName = Theater.getMovie(selectMovieNum); //영화 번호 -> 영화 이름
			
			int selectMovieTime = reservation.getSelectMovieTime(); //시간 번호
			String movieTime = Theater.getTime(selectMovieNum, selectMovieTime); //영화 번호, 시간 번호 -> 영화 시간
			
			int colNum = reservation.getColNum(); //열 번호
			int seatNum = reservation.getSeatNum(); //좌석 번호
			
			//예약 정보 출력
			System.out.println(movieName + " - " + movieTime + " - " + colNum
					+ "열 " + seatNum + "좌석입니다.");
	}

}
