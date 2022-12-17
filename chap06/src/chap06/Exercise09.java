package chap06;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if(selectNo==2) {
				if(studentNum==0) {
					System.out.println("학생수를 먼저 입력해주세요.");
				} else {					
					for(int i=0; i<studentNum; i++) {
						System.out.print((i+1) + "번 학생 점수> ");
						scores[i] = scanner.nextInt();
						System.out.println();
					}
				}
			} else if(selectNo==3) {
				for(int i=0; i<studentNum; i++) {
					System.out.println((i+1) + "번 학생 점수> " + scores[i]);
				}
			} else if(selectNo==4) {
				System.out.print("최고 점수> ");
				int maxScore = scores[0];
				for(int i=0; i<studentNum-1; i++) {
					if(maxScore < scores[i+1]) {
						maxScore = scores[i+1];
					}
				}
				System.out.println(maxScore);
				
				System.out.print("평균 점수> ");
				double avgScore = 0;
				for(int i=0; i<studentNum; i++) {
					avgScore += scores[i];
				}
				avgScore /= studentNum;
				System.out.println(avgScore);
			} else if(selectNo==5) {
				run = false;
			}			
		}
		
		System.out.println("프로그램 종료");
	}
}
