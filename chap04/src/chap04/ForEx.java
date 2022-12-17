package chap04;

public class ForEx {

	public static void main(String[] args) {
		//감소하는 for문
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		int sum1 = 0;
		for(int i=1; i<=10; i++) {
			System.out.println("for문 " + i);
			sum1 += i;
			System.out.println(sum1);			
		}
		System.out.println();
		int sum2 = 0;
		int i=1;
		while(i<=10) {
			System.out.println("while문 " + i);
			sum2 += i;
			System.out.println(sum2);
			i++;
		}

	}

}
