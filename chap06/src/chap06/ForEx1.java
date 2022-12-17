package chap06;

public class ForEx1 {

	public static void main(String[] args) {
		//세로 출력
//		for(int m=2; m<=9; m++) {
//			System.out.println("*** " + m + "단 ***");
//			for(int n=1; n<=9; n++) {
//				System.out.println(m + " x " + n + " = " + (m*n));
//			}
//		}
		
		//가로 출력
		for(int n=1; n<=9; n++) {
			for(int m=2; m<=9; m++) {
				System.out.print(m + " x " + n + " = " + (m*n) + "\t");
			}
			System.out.println();
		}
		
		//while문 세로 출력
//		int m = 2;
//		while(m<=9) {
//			System.out.println("*** " + m + "단 ***");
//			
//			int n=1;
//			while(n<=9) {
//				System.out.println(m + " x " + n + " = " + (m*n));
//				n++;
//			}
//			
//			m++;
//		}
	}
}
