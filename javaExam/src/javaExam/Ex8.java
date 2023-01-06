package javaExam;

public class Ex8 {

	public static void main(String[] args) {
		double random = Math.random();
		int num = (int) Math.ceil(random*6);
		System.out.println("1 >>> " + random);
		System.out.println("2 >>> " + random*6);
		System.out.println("3 >>> " + Math.ceil(random*6));
		System.out.println("4 >>> " + (int)Math.ceil(random*6));
		System.out.println("num >>> " + num);

	}

}
