package codingTest;

import java.util.Scanner;

public class BunsuFind {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count=0;
		int index=0;
		int numerator=0; //분자
		int denominator=1; //분모
		while(true) {
			count++;
			for (int i = 0; i < count; i++) {
				index++;
				if(i==0) {
					if(count%2==0) {
						System.out.println("**짝수**");
						//count 홀수 -> 짝수 : 분모+1
						denominator += 1; //분모
					}else {
						System.out.println("**홀수**");
						//count 짝수 -> 홀수 : 분자+1
						numerator += 1; //분자
					}
					
				} else {
					if(count%2==0) {
						//짝수 : 분모-1 분자+1
						numerator += 1; //분자
						denominator -= 1; //분모
					} else {
						//홀수 : 분모+1 분자-1
						numerator -= 1; //분자
						denominator += 1; //분모
					}
				}
//				System.out.println("count >>> " + count);
//				System.out.println("index >>> " + index);		
//				System.out.println("분자 >>> " + numerator);
//				System.out.println("분모 >>> " + denominator);
//				System.out.println("----------------------------");
				if(index==num) {
					System.out.println(numerator+"/"+denominator);
					return;
				}
			}
		}
	}
}