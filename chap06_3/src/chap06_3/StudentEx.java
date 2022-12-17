package chap06_3;

public class StudentEx {

	public static void main(String[] args) {
		Student st = new Student("홍길동", "2020", "서울 마포구", 80, 90, 100);
		int result = st.sum();
		System.out.println(result);
	}
}
