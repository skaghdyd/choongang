package javaExam;

public class Ex1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("*****************");
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("*****************");
		int sum=0;
		for(int i=0; i<=10; i++) {
			sum+=i;
		}
		System.out.println("sum = " + sum);
	}

}
