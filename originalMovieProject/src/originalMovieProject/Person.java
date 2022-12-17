package originalMovieProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	private String name; // 사용자 이름
	private String id; // 아이디
	private String pwd; // 비밀번호
	private String nick; // 닉네임
	int age; // 나이

	private ArrayList<Theater> theaterList; // 예매한 영화
	private Res rr = new Res();
	private Theater th = new Theater();
	Scanner scan = new Scanner(System.in);

	Person() {
	}// 기본 생성자.
	
	Person(String name, String id, String pwd, String nick, int age) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
		this.age = age;
		theaterList = new ArrayList<Theater>();
	}

	Person(String name, String id, String pwd, String nick, int age, ArrayList theaterList) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
		this.age = age;
		this.theaterList = new ArrayList<Theater>();
	}

	public void addTheater(String movieName, String movieTime, String[][][] arr) {
		Theater theater = new Theater();
		theater.setmovieName(movieName);
		theater.setmovieTime(movieTime);
		theater.setarr(arr);

		theaterList.add(theater);
	}

	public void showMovieInfo() {
		System.out.println("< " + name + "(" + nick + ") 님의 예매정보 >");
		System.out.println("------------------------");
		if (theaterList.size() == 0) {
			System.out.println("예매정보가 없습니다. ");
			System.out.println("------------------------");
		} else {
			for (int i = 0; i < theaterList.size(); i++) {
				th = theaterList.get(i);
				int inputMoviename = Integer.valueOf(th.getmovieName());
				System.out.print((i + 1) + ". ");
				System.out.println(th.getarr()[inputMoviename][0][0]);
				for (int k = 1; k < 4; k++) {
					for (int j = 0; j < 9; j++) {
						System.out.print(th.getarr()[inputMoviename][k][j]);
					}
					System.out.println();
				}
				System.out.println("------------------------");
			}
		}
	}

	public void removeTheater(String inputMoviename) {
		if (theaterList.size() != 0) {
			showMovieInfo();
			System.out.print("몇 번 영화를 취소하시겠습니까? >");
			int inputMovieNum = scan.nextInt();
			System.out.println();
			System.out.println(inputMovieNum + "." + th.getarr()[Integer.parseInt(inputMoviename)][0][0]);
			System.out.println("해당 영화를 취소하시겠습니까?");
			System.out.println("1. 예  | 2. 아니오 > ");
			int erase = scan.nextInt();
			if (erase == 1) {
				rr.seatNumErase(inputMoviename);
				theaterList.remove(inputMovieNum - 1);
			}
		}

	}

	// 각 필드에 대한 set 함수
	void setName(String name) {
		this.name = name;
	}

	void setId(String id) {
		this.id = id;
	}

	void setPwd(String pwd) {
		this.pwd = pwd;
	}

	void setNick(String nick) {
		this.nick = nick;
	}

	void setAge(int age) {
		this.age = age;
	}

	void setTheaterList (ArrayList theaterList) {
		this.theaterList = new ArrayList<Theater>();
	}
	
	// 각 필드에 대한 get 함수
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
	
	ArrayList getTheaterList () {
		return theaterList;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", pwd=" + pwd + ", nick=" + nick + ", age=" + age + "]";
	}

} // 회원가입 고객 클래스
