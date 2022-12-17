package codingTest;

public class CarDvision {
	public static int getGCD(int num1, int num2) {
		if(num1%num2==0) {
			return num2;
		}
		return getGCD(num2, num1%num2);
	}
	
	public static int solution(int[] arrayA, int[] arrayB) {
		//첫번째 배열의 최대공약수
		int answerA = arrayA[0];		
		for(int i=0; i<arrayA.length-1; i++) {
			answerA = getGCD(answerA, arrayA[i+1]);
		}
		if(answerA!=1) {
			int answerB = answerA;
			for(int i=0; i<arrayB.length-1; i++) {
				answerB = getGCD(answerB, arrayB[i+1]);
			}
			
			if(answerB==1) {
				return answerA;
			}		
		} else {
			int answerB = arrayB[0];		
			for(int i=0; i<arrayB.length-1; i++) {
				answerB = getGCD(answerB, arrayB[i+1]);
				System.out.println(answerB);
			}
			
			if(answerB!=1) {
				answerA = answerB;
			}
		}
		
//		//두번째 배열의 최대공약수
//		int answerB = arrayB[0];		
//		for(int i=0; i<arrayB.length-1; i++) {
//			answerB = getGCD(answerB, arrayB[i+1]);
//			System.out.println(answerB);
//		}
		
        return 0;
	}
	public static void main(String[] args) {
		int[] arrayA = {14, 35, 119};
		int[] arrayB = {18, 30, 102};
		solution(arrayA, arrayB);

	}
}
