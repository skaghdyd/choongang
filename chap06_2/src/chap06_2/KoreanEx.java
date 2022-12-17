package chap06_2;

public class KoreanEx {

	public static void main(String[] args) {
		Korean k2 = new Korean("홍길동", "123-456", "미국");
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		
		System.out.println();
		
		Korean k1 = new Korean("가나다", "123-12#");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
	}

}
