package chap06;

import java.util.Scanner;

class Question {
	Scanner scanner = new Scanner(System.in);

	private String[] questions = { "당신은 집에만 있으면 지루함을 느끼는 편인가요?", "당신은 친구와 함께 파티에서 모르는 사람과 재밌게 즐길 수 있나요?",
			"당신은 남들에게 주목받거나 발표하는 것에 있어서 거부감이 없으신 편인가요?", "당신은 요리할 때 정량 계량 단위에 맞춰 레시피대로 1테이블 스푼,1컵 맞춰 요리하는 편인가요?",
			"당신은 미래보다는 현재가 더 중요하다고 생각하는 편인가요?", "당신은 노래를 들을 때 가사보다는 멜로디를 더 신경써서 듣는 편인가요?",
			"당신은 문제가 생겼을 때 사실과 근거만으로 문제를 해결하려는 편인가요?", "당신은 원리원칙을 중요하게 생각하는 편인가요?", "당신의 소중한 사람에게 현실적인 조언을 많이 하는 편인가요?",
			"당신은 조직적이고 구조화된 환경을 선호하는 편인가요?", "당신은 어떤 일을 할 때 보다 명확한 목적과 방향이 있는 상황을 선호하는 편인가요?",
			"당신은 어떤 일을 할 때 미리 계획을 세우는 것을 선호하는 편인가요?" };
	private String answer = ""; // 답변
	private int ePoint = 0; // E성향지수
	private int iPoint = 0; // I성향지수
	private int sPoint = 0; // S성향지수
	private int nPoint = 0; // N성향지수
	private int fPoint = 0; // F성향지수
	private int tPoint = 0; // T성향지수
	private int jPoint = 0; // J성향지수
	private int pPoint = 0; // P성향지수
	private int questionCnt = 0;// 문제번호

	// 생성자
	Question() {
		System.out.println("----------------------------------");
		System.out.println("*** MBTI TEST by ChoongAngTeam ***");
		System.out.println("*** 당신의 MBTI를 측정해드립니다.   ***");
		System.out.println("*** 성실한 답변 부탁드리겠습니다.    ***");
		System.out.println("----------------------------------");
	}

	// 문제 출력
	public String getQuestion(int questionCnt) {
		return questions[questionCnt];
	}

	// 문제갯수 출력
	public int getQuestionsLength() {
		return questions.length;
	}

	// 대답 출력
	public String getAnswer() {
		return answer;
	}

	// 대답 입력
	public void setAnswer() {
		this.answer = scanner.nextLine();
	}

	// E점수 출력
	public int getE() {
		return ePoint;
	}

	// I점수 출력
	public int getI() {
		return iPoint;
	}

	// S점수 출력
	public int getS() {
		return sPoint;
	}

	// N점수 출력
	public int getN() {
		return nPoint;
	}

	// T점수 출력
	public int getT() {
		return tPoint;
	}

	// F점수 출력
	public int getF() {
		return fPoint;
	}

	// J점수 출력
	public int getJ() {
		return jPoint;
	}

	// P점수 출력
	public int getP() {
		return pPoint;
	}

	// 문제번호 출력
	public int getQuestionCnt() {
		return questionCnt;
	}

	// E점수 증가
	void addE() {
		ePoint++;
	}

	// I점수 증가
	void addI() {
		iPoint++;
	}

	// S점수 증가
	void addS() {
		sPoint++;
	}

	// N점수 증가
	void addN() {
		nPoint++;
	}

	// T점수 증가
	void addT() {
		tPoint++;
	}

	// F점수 증가
	void addF() {
		fPoint++;
	}

	// J점수 증가
	void addJ() {
		jPoint++;
	}

	// P점수 증가
	void addP() {
		pPoint++;
	}

	// 문제번호 증가 >> 다음 문제로 이동하기 위해 사용
	void addQuestionCnt() {
		questionCnt++;
	}

	// 문제 출력용 메소드
	void output(int questionCnt) {
		System.out.println((questionCnt + 1) + "번 문제입니다.");
		System.out.println(getQuestion(questionCnt));
		System.out.print("당신의 답변은? YES or NO > ");
		setAnswer();
		System.out.println("----------------------------------");
	}

	// 종료멘트 출력용 메소드
	void ending() {
		System.out.println("----------------------------------");
		System.out.println("문제가 모두 종료되었습니다.");
		System.out.println("곧 당신의 답변에 따른 MBTI 성향을 분석하여 알려드리겠습니다.");
		System.out.println("당신의 성실한 답변에 감사인사드립니다.");
		System.out.println("----------------------------------");
		System.out.println("당신의 E지수는 " + getE() + "입니다.");
		System.out.println("당신의 I지수는 " + getI() + "입니다.");
		System.out.println("당신의 S지수는 " + getS() + "입니다.");
		System.out.println("당신의 N지수는 " + getN() + "입니다.");
		System.out.println("당신의 T지수는 " + getT() + "입니다.");
		System.out.println("당신의 F지수는 " + getF() + "입니다.");
		System.out.println("당신의 J지수는 " + getJ() + "입니다.");
		System.out.println("당신의 P지수는 " + getP() + "입니다.");
		System.out.println("----------------------------------");
		System.out.print("당신의 최종성향은 ");

		String result = "";
		if (ePoint > iPoint) {
			result += "E";
		} else {
			result += "I";
		}

		if (sPoint > nPoint) {
			result += "S";
		} else {
			result += "N";
		}

		if (tPoint > fPoint) {
			result += "T";
		} else {
			result += "F";
		}

		if (jPoint > pPoint) {
			result += "J";
		} else {
			result += "P";
		}

		System.out.println(result + "입니다.");
		System.out.println("----------------------------------");
	}
}

public class MbtiProject2 {

	public static void main(String[] args) {
		boolean run = true;
		Question question = new Question();

		while (run) {
			if (question.getQuestionCnt() == question.getQuestionsLength()) {
				// 문제번호와 문제갯수가 같아지면 종료 >> 마지막 인덱스+1 = 배열길이
				question.ending();
				break;

			} else {
				// 문제 출력
				question.output(question.getQuestionCnt());

				// 대답 분기점
				if (question.getAnswer().equals("YES") || question.getAnswer().equals("yes")
						|| question.getAnswer().equals("Y") || question.getAnswer().equals("y")) {
					// 문제번호 10-12
					if (question.getQuestionCnt() >= 9) {
						question.addJ();
						// 문제번호 7-9
					} else if (question.getQuestionCnt() >= 6) {
						question.addT();
						// 문제번호 4-6
					} else if (question.getQuestionCnt() >= 3) {
						question.addS();
						// 문제번호 1-3
					} else {
						question.addE();
					}
					question.addQuestionCnt(); // 다음 문제로 넘어감

				} else if (question.getAnswer().equals("NO") || question.getAnswer().equals("no")
						|| question.getAnswer().equals("No") || question.getAnswer().equals("nO")
						|| question.getAnswer().equals("N") || question.getAnswer().equals("n")) {
					// 문제번호 10-12
					if (question.getQuestionCnt() >= 9) {
						question.addP();
						// 문제번호 7-9
					} else if (question.getQuestionCnt() >= 6) {
						question.addF();
						// 문제번호 4-6
					} else if (question.getQuestionCnt() >= 3) {
						question.addN();
						// 문제번호 1-3
					} else {
						question.addI();
					}
					question.addQuestionCnt(); // 다음 문제로 넘어감

				} else {
					System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
				}
			}
		}
	}
}