package movieProject;

import java.util.ArrayList;
import java.util.Scanner;

import movieProject.Person.Reservation;

public class MovieTest6 {

	private static ArrayList<Person> userArray = new ArrayList<Person>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		//영화관 인스턴스 생성
		Theater theater = new Theater();
		boolean run = true;
		do {
			System.out.println("\n==============================================================\n");
			System.out.println("영화관에 오신 걸 환영합니다.");
			System.out.println("1.회원가입 | 2.로그인 | 3.사용자목록 | 4.종료");
			System.out.print("선택 > ");
			int select = scanner.nextInt();
			
			//1번 - 회원가입
			if (select == 1) {
				//회원가입 성공여부 체크
				if (createAccount() == false) {
					continue;
				}
				
			//2번 - 로그인
			} else if (select == 2) {
				//로그인 메소드 호출 -> 성공시 loginAccount에 Person 인스턴스가 담김
				Person loginAccount = login();
				if (loginAccount == null) {
					System.out.println("로그인 실패!");
					continue;
				}
				
				//로그인 성공시 run2 실행됨.
				boolean run2 = true;
				while (run2) {
					System.out.println("\n==============================================================\n");
					System.out.println(loginAccount.getName() + "(" + loginAccount.getNick() + ")" + "님 환영합니다.");
					System.out.println("1.예약 | 2.조회 | 3.취소 | 4.회원정보 |5.로그아웃");
					System.out.print("선택> ");
					int selectNum = scanner.nextInt();
					
					//1번 - 예약
					if (selectNum == 1) {

						//영화 리스트 출력
						theater.showMovieList();
						
						System.out.println("영화를 선택해주세요.");
						System.out.print("선택> ");
						int selectMovieNum = scanner.nextInt();

						//영화 시간 출력
						theater.showMovieTime(selectMovieNum);
						
						System.out.println("시간을 선택해 주세요.");
						System.out.print("선택> ");
						int selectMovieTime = scanner.nextInt();

						//좌석 출력
						String[][] seat = theater.showSeat(selectMovieNum, selectMovieTime);
						
						System.out.println("좌석을 선택해 주세요.");
						System.out.println("열> ");
						int colNum = scanner.nextInt();
						System.out.println("좌석> ");
						int seatNum = scanner.nextInt();
						
						//예약
						boolean selectSeat = theater.selectSeat(selectMovieNum, selectMovieTime, colNum, seatNum, seat);
						if (selectSeat == false) {
							System.out.println("예약에 실패하였습니다.");
							continue;
							
						} else {
							System.out.println("예약에 성공하였습니다.");
							
							//유저 인스턴스에 예약 정보를 입력해줌
							loginAccount.addReservation(selectMovieNum, selectMovieTime, colNum, seatNum);
						}
						
					//2번 - 조회
					} else if (selectNum == 2) {
						//유저 인스턴스의 전체 예약 정보를 가져옴
						ArrayList reservationList = loginAccount.getReservationList();
						
						if (reservationList == null) {
							System.out.println("예매정보가 없습니다.");
						} else {
							for (int i = 0; i < reservationList.size(); i++) {
								//예약 정보 배열에서 값을 하나씩 꺼내서 예약 변수에 담아줌
								Reservation reservation = (Reservation) reservationList.get(i);
								System.out.print((i + 1) + ". ");
								loginAccount.showReservation(reservation);
							}
						}
						
					//3번 - 취소
					} else if (selectNum == 3) {
						Reservation reservation;
						
						ArrayList reservationList = loginAccount.getReservationList();

						if (reservationList == null) {
							System.out.println("예매정보가 없습니다.");
						} else {
							//조회 기능과 동일하게 콘솔 창에 전체 예약 정보를 표시해줌.
							for (int i = 0; i < reservationList.size(); i++) {
								reservation = (Reservation) reservationList.get(i);
								System.out.print((i + 1) + ". ");
								loginAccount.showReservation(reservation);
							}
							
							//삭제할 예약 번호 입력
							System.out.print("취소할 예약을 선택하세요.> ");
							int deleteMovieNum = scanner.nextInt();
							
							//선택한 번호가 예약 배열의 크기를 벗어나면 오류메세지 출력.
							if (deleteMovieNum > reservationList.size()) {
								System.out.println("잘못입력하셨습니다. 다시 시도해주세요.");
								continue;
							}
							scanner.nextLine();
							
							//삭제하기 위해 선택한 예약 정보 출력
							reservation = (Reservation) reservationList.get(deleteMovieNum - 1);
							System.out.print("선택하신 예약은 ");
							loginAccount.showReservation(reservation);

							System.out.println("정말 예약을 취소하시겠습니까?");
							System.out.print("1.예 / 2.아니오> ");
							String answer = scanner.nextLine();
							
							//삭제
							if (answer.equals("1") || answer.equals("예")) {
								//유저 인스턴스에서 예약정보 삭제
								loginAccount.cancelReservation(deleteMovieNum);
								
								//영화관 인스턴스에서 좌석 수정
								theater.cancelSeat(reservation);
								System.out.println("선택하신 예약을 취소하였습니다.");
								
							//취소
							} else if (answer.equals("2") || answer.equals("아니오")) {
								System.out.println("취소하였습니다.");
								
							//잘못입력한경우
							} else {
								System.out.println("잘못입력하셨습니다. 다시 시도해주세요.");
							}
						}
					
					//4번 - 회원정보
					} else if (selectNum == 4) {
						System.out.println("이름> " + loginAccount.getName());
						System.out.println("닉네임> " + loginAccount.getNick());
						System.out.println("아이디> " + loginAccount.getId());
						System.out.println("연령> " + loginAccount.getAge());
					
					//5번 - 로그아웃
					} else if (selectNum == 5) {
						run2 = false;
						
					//잘못입력한경우.
					} else {
						System.out.println("잘못입력하셨습니다. 다시 시도해주세요.");
					}
				}
			
			//3번 - 사용자목록
			} else if (select == 3) {
				System.out.println("-------------------------------------");
				if (userArray.size() == 0) {
					System.out.println("가입한 회원이 없습니다.");
				} else {
					//유저Array에서 하나씩 값을 꺼내서 출력해줌.
					for (int i = 0; i < userArray.size(); i++) {
						System.out.println((i + 1) + ". " + userArray.get(i).getName());
					}
				}
				System.out.println("-------------------------------------");
				
			//4번 - 프로그램 종료
			} else if (select == 4) {
				run = false;
				System.out.println("프로그램 종료");
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		} while (run);
	}
	
	//회원가입 메소드
	private static boolean createAccount() {
		//Person 인스턴스 생성
		System.out.print("아이디를 입력하세요 : ");
		String userId = scanner.next();
		
		//아이디 중복 체크
		for (int i = 0; i < userArray.size(); i++) {
			if (userArray.get(i).getId().equals(userId)) {
				System.out.println("입력한 아이디는 이미 사용중입니다.");
				return false;
			}
		}
		
		System.out.print("비밀번호를 입력하세요 : ");
		String userPwd = scanner.next();

		System.out.print("이름을 입력하세요 : ");
		String userName = scanner.next();

		System.out.print("닉네임을 입력하세요 : ");
		String userNick = scanner.next();

		System.out.print("연령을 입력하세요 : ");
		int userAge = scanner.nextInt();
		
		//유저Array에 추가해줌
		userArray.add(new Person(userId, userPwd, userName, userNick, userAge));

		return true;
	}
	
	//로그인 메소드
	private static Person login() {

		System.out.print("아이디를 입력하세요 : ");
		String inputId = scanner.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String inputPassword = scanner.next();
		
		//userArray에서 값을 하나씩 꺼낸 후 아이디 비밀번호를 비교
		for (int i = 0; i < userArray.size(); i++) {
			if (userArray.get(i).getId().equals(inputId) && userArray.get(i).getPwd().equals(inputPassword)) {
				System.out.println("로그인 성공!");
				
				//유저 인스턴스를 리턴해줌
				return userArray.get(i);
			}
		}
		
		//실패시 null 리턴
		return null;
	}
}