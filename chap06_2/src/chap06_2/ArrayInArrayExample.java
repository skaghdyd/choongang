package chap06_2;

import java.util.Scanner;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		String[] subject = {"국어", "수학", "영어"};
		
		System.out.print("학생수> ");
		int num = scanner.nextInt(); //학생수
		System.out.println();
		int[][] scores = new int[num][3]; //학생수(num)만큼 행, 과목수(3)만큼 열
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print((i+1) + "번 학생의 " + subject[j] + " 점수> ");
				scores[i][j] = scanner.nextInt();
			}
		}
		System.out.println();
		
		for(int k=0; k<subject.length; k++) {
			System.out.print(subject[k] + " ");
		}
		System.out.println();
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
//		//int[4][3]
//		int[][] abc = {
//				{1,2,3}, //abc[0].length = 3
//				{4,5,6},
//				{7,8,9},
//				{10,11,12}
//		}
	}
}
