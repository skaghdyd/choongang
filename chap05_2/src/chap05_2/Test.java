package chap05_2;

public class Test {

	public static void main(String[] args) {
		String test1 = "아 정말 모르겠다.";
		String test2 = test1;
		
		System.out.println("str1: " + System.identityHashCode(test1));
		System.out.println("str2: " + System.identityHashCode(test2));
		
		System.out.println("test1 : " + test1);
		System.out.println("test2 : " + test2);
		
		System.out.println("---------------------------------------------");
		test1 = "B";
		test1 = test2;
		System.out.println("test1 : " + test1);
		System.out.println("test2 : " + test2);

		System.out.println("str1: " + System.identityHashCode(test1));
		System.out.println("str2: " + System.identityHashCode(test2));
		
		System.out.println("---------------------------------------------");
		String test3 = changeStr(test1);
		System.out.println("test1 : " + test1);
		System.out.println("test2 : " + test2);
		System.out.println("test3 : " + test3);
		System.out.println("str1: " + System.identityHashCode(test1));
		System.out.println("str2: " + System.identityHashCode(test2));
		System.out.println("str3: " + System.identityHashCode(test3));
		System.out.println("---------------------------------------------");
		String[] test111 = {"1","2","3"};
		System.out.println("test111[0] : " + test111[0]);
		System.out.println("test111[1] : " + test111[1]);
		System.out.println("test111[2] : " + test111[2]);
		System.out.println("---------------------------------------------");
		String[] test222 = test111;
		System.out.println("test222[0] : " + test222[0]);
		System.out.println("test222[1] : " + test222[1]);
		System.out.println("test222[2] : " + test222[2]);
		System.out.println("---------------------------------------------");
		test111[0] = "test111의 0번째 인덱스 값을 바꿔버렸다..";
		test222[1] = "이건 test222의 1번째 인덱스 값을 바꾼거임..";
		System.out.println("test111[0] : " + test111[0]);
		System.out.println("test111[1] : " + test111[1]);
		System.out.println("test111[2] : " + test111[2]);
		System.out.println("---------------------------------------------");
		System.out.println("test222[0] : " + test222[0]);
		System.out.println("test222[1] : " + test222[1]);
		System.out.println("test222[2] : " + test222[2]);
		System.out.println("---------------------------------------------");
	}
	static String changeStr(String str) {
		str = "바꿔버렸다!";
		return str;
	}
}
