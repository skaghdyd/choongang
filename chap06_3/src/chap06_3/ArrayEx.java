package chap06_3;

import java.util.Scanner;

class Student2 {
	int studentNum;//학생수
	int subjectNum;//과목수
	int[][] scores;//학생별 각 과목점수
	Scanner scanner = new Scanner(System.in);
	
	Student2() {
		System.out.println("프로그램 START");
		System.out.print("학생수>");
		this.studentNum = scanner.nextInt();
		System.out.print("과목수>");
		this.subjectNum = scanner.nextInt();
		scores = new int[studentNum][subjectNum];
	}
	
	void inputData() {
		for(int i=0; i<this.studentNum; i++) {
			System.out.println((i+1) + "번째 학생> ");
			for(int j=0; j<this.subjectNum; j++) {
				System.out.print((j+1) + "번째 과목 점수> ");
				this.scores[i][j] = scanner.nextInt();
			}
			System.out.println();
		}
	}
	
	void outputData() {
		for(int i=0; i<this.studentNum; i++) {
			System.out.println((i+1) + "번째 학생> ");
			for(int j=0; j<this.subjectNum; j++) {
				System.out.print((j+1) + "번째 과목 점수>" + this.scores[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

public class ArrayEx {

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			Student2 student = new Student2();
			student.inputData();
			student.outputData();
			break;
		}
	}
}
