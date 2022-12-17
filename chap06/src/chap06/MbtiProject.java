package chap06;

import java.util.Scanner;

public class MbtiProject {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		String[] questions = {
				"당신은 조직적이고 구조화된 환경을 선호하는 편인가요?",
				"당신은 어떤 일을 할 때 보다 명확한 목적과 방향이 있는 상황을 선호하는 편인가요?",
				"당신은 어떤 일을 할 때 미리 계획을 세우는 것을 선호하나요?",
				"당신은 문제를 처리할 때 미리 준비해서 마감보다 일찍 끝내는 편인가요?",
				"5번 문제의 내용........",
				"6번 문제의 내용........",
				"7번 문제의 내용........",
				"8번 문제의 내용........",
				"9번 문제의 내용........",
				"10번 문제의 내용........",
				"11번 문제의 내용........",
				"12번 문제의 내용........",
				"13번 문제의 내용........",
				"14번 문제의 내용........",
				"15번 문제의 내용........",
				"16번 문제의 내용........",
				"17번 문제의 내용........",
				"18번 문제의 내용........",
				"19번 문제의 내용........",
				"20번 문제의 내용........",
		}; //20문제
		int questionCnt = 0; //문제 순서
		String answer = "";
		int jPoint = 0; //J성향지수
		int pPoint = 0; //P성향지수
		
		while(run) {
			///////0 -> 1
			switch (questionCnt) {
			case 0:
				System.out.println("----------------------------------");
				System.out.println("*** MBTI TEST by ChoongAngTeam ***");
				System.out.println("*** 당신의 MBTI를 측정해드립니다.   ***");				
				System.out.println("*** 성실한 답변 부탁드리겠습니다.    ***");				
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]); //"당신은 조직적이고 구조화된 환경을 선호하는 편인가요?",
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 1:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 2:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 3:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 4:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 5:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 6:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 7:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 8:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 9:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 10:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 11:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 12:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 13:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 14:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 15:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 16:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 17:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 18:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			case 19:
				System.out.println("----------------------------------");
				System.out.println((questionCnt+1) + "번 문제입니다.");
				System.out.println(questions[questionCnt]);
				System.out.print("당신의 답변은? YES or NO > ");
				answer = scanner.nextLine();
				System.out.println("----------------------------------");
				//1번 문제의 답변에 긍정적이면 J지수 증가
				//1번 문제의 답변에 부정적이면 P지수 증가
				if(answer.equals("YES")) {
					jPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else if(answer.equals("NO")){
					pPoint++;
					questionCnt++; //다음 문제로 넘어감
				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
				break;
			default :
				System.out.println("----------------------------------");
				System.out.println("문제가 모두 종료되었습니다.");
				System.out.println("곧 당신의 답변에 따른 MBTI 성향을 분석하여 알려드리겠습니다.");
				System.out.println("당신의 성실한 답변에 감사인사드립니다.");
				System.out.println("----------------------------------");
				System.out.println("당신의 J지수는 " + jPoint + "입니다.");
				System.out.println("당신의 P지수는 " + pPoint + "입니다.");
				System.out.println("----------------------------------");
				System.out.print("당신의 최종성향은 ");
				
				if(jPoint > pPoint) {
					System.out.println("J입니다.");					
				} else {
					System.out.println("P입니다.");
				}
				System.out.println("----------------------------------");
				run = false;
				break;
			}			
		}
		
	}

}
