package originalMovieProject;

import java.util.*;

public class MovieTest6 {
	
	// 유저목록 만들기
	private static int usernum = 2;
	private static Person user[] = new Person[10];
	private static int loginUser;

	private static Scanner scanner = new Scanner(System.in);
	private static String inputId, inputPassword, inputName, inputNick, inputMoviename, inputMovieTime;
	private static int inputAge;
	private static String[][][] inputSeat;

	public static void main(String[] args) {
		// 유저1,2(객체) 만들어서 유저목록[배열]에 집어넣기.
		user[0] = new Person("박철수", "park01", "01", "씨네필", 25);
		user[1] = new Person("김영희", "kim02", "02", "고영희", 15);

		for (int i = 2; i < user.length; i++) {
			user[i] = new Person();
		} // NullpointerException방지 배열 초기화

		Res rr = new Res();

		boolean run = true;
		do {
			System.out.println("\n==============================================================\n");
			System.out.println("영화관에 오신 걸 환영합니다.");
			System.out.println("1.회원가입 | 2.로그인 | 3.사용자목록 | 4.종료");
			System.out.print("선택 > ");
			String select = scanner.next();

			if (select.equals("1")) { // 회원가입 페이지
				if (usernum == 10) {
					System.out.println("용량 초과 회원가입 실패");
					break;
				} else {
					createAccount();
				}
				
			} else if (select.equals("2")) { // 로그인 페이지
				loginUser = loginAccount();

				// 로그인 성공시.
				if (user[loginUser].getId() != null) {
					boolean run2 = true;
					while (run2) {
						System.out.println("\n==============================================================\n");
						System.out.println(
								user[loginUser].getName() + "(" + user[loginUser].getNick() + ")" + "님 환영합니다.");
						System.out.println("1.예약 | 2.조회 | 3.취소 | 4.회원정보 |5.로그아웃");
						System.out.print("선택> ");
						String selectNum = scanner.next();

						// 예약 페이지
						if (selectNum.equals("1")) {
							System.out.print(rr.inf);// 영화 목록 호출
							inputMoviename = scanner.next();
							rr.movieTime(inputMoviename);// 영화 선택하여 시간목록 호출

							inputMovieTime = scanner.next();
							rr.movieSeat(inputMovieTime);// 좌석 호출

							int Mname = Integer.parseInt(inputMoviename); // 영화번호
							int Mtime = Integer.parseInt(inputMovieTime); // 시간
							int movieRoom = 0; // 상영관
							if (Mname == 1) { // 1, 2, 3 상영관
								movieRoom = Mname + Mtime - 2;
							} else if (Mname == 2) { // 4, 5, 6 상영관
								movieRoom = Mname + Mtime;
							} else if (Mname == 3) { // 7, 8, 9 상영관
								movieRoom = Mname + Mtime + 2;
							} else if (Mname == 4) { // 10, 11, 12 상영관
								movieRoom = Mname + Mtime + 4;
							}
							inputMoviename = String.valueOf(movieRoom);

							System.out.print("좌석을 선택하여 주세요. 열>");
							String seatWidth = scanner.next();// 열 선택.
							System.out.print("좌석을 선택하여 주세요. 좌석>");
							int seatHeight = scanner.nextInt();// 좌석 선택.
							inputSeat = rr.seatNum(seatWidth, seatHeight);
							user[loginUser].addTheater(inputMoviename, inputMovieTime, inputSeat);
						}
						// 조회 페이지
						else if (selectNum.equals("2")) {
							System.out.println("\n==============================================================\n");
							user[loginUser].showMovieInfo();

						}
						// 취소페이지
						else if (selectNum.equals("3")) {
							System.out.println("\n==============================================================\n");
							System.out.println(
									user[loginUser].getName() + "(" + user[loginUser].getNick() + ")" + "님의 예매정보");
							user[loginUser].removeTheater(inputMoviename);

						}
						// 사용자 정보 확인 페이지
						else if (selectNum.equals("4")) {
							System.out.println("이름>" + user[loginUser].getName());
							System.out.println("닉네임> " + user[loginUser].getNick());
							System.out.println("아이디> " + user[loginUser].getId());
							System.out.println("연령> " + user[loginUser].getAge());

						} else if (selectNum.equals("5")) { // 첫 화면으로 돌아간다.
							loginUser = 99;
							run2 = false;
						} else {
							System.out.println("잘못된 선택입니다.");
						}
					}
				}
			} else if (select.equals("3")) { // 사용자조회
				lookAccount();
			} else if (select.equals("4")) { // 종료 선택
				run = false;
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		} while (run);
		System.out.println("프로그램 종료");

	}

	// -----------------------<회원가입, 로그인, 유저 관련 부분 메소드>-----------------------
	//https://velog.io/@dongvelop/간단한-로그인-프로그램-구현하기 (참조)
	private static void createAccount() { // 회원가입

		System.out.print("아이디를 입력하세요 : ");
		inputId = scanner.next();
		user[usernum].setId(inputId);
		System.out.print("비밀번호를 입력하세요 : ");
		inputPassword = scanner.next();
		user[usernum].setPwd(inputPassword);
		System.out.print("이름을 입력하세요 : ");
		inputName = scanner.next();
		user[usernum].setName(inputName);
		System.out.print("닉네임을 입력하세요 : ");
		inputNick = scanner.next();
		user[usernum].setNick(inputNick);
		user[usernum].setTheaterList(null);
		
		// 연령은 숫자로만 입력시키게 하기.
		while (true) {
			try {
				System.out.print("연령을 입력하세요 : ");
				inputAge = scanner.nextInt();
				user[usernum].setAge(inputAge);
				// 예외가 발생할 가능성이 있는 코드
				break;
			} catch (InputMismatchException e) {
				// 해당 예외 발생 시
				scanner = new Scanner(System.in);
				System.out.println("숫자로 입력해주세요.");
			}
		}

		usernum++;
	}

	private static int loginAccount() { // 로그인 기능 + 로그인 성공시 현재 사용자 정보 얻기

		System.out.print("아이디를 입력하세요 : ");
		inputId = scanner.next();
		System.out.print("비밀번호를 입력하세요 : ");
		inputPassword = scanner.next();

		int loginSuccess = 0;
		for (int i = 0; i < user.length; i++) {
			if (inputId.equals(user[i].getId()) && inputPassword.equals(user[i].getPwd())) {
				System.out.println("로그인 성공!");
				loginUser = i;
				loginSuccess = 1;
				break; // for 반복문 빠져나온다.
			}
		}
		if (loginSuccess == 0)
			System.out.println("로그인 실패!");

		return loginUser;
	}
	// 리턴값 여러 개 받기
	// https://www.techiedelight.com/ko/return-multiple-values-method-java/ (참조)

	private static void lookAccount() { // 사용자목록 조회
		for (Person users : user) {
			if (users.getName() != null)
				System.out.println(users.getName());

		}
	}

}