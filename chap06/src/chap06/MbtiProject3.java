package chap06;

import java.util.Scanner;
public class MbtiProject3 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		String[] questions = {
				"당신은 집에만 있으면 지루함을 느끼는 편인가요?",
				"당신은 친구와 함께 파티에서 모르는 사람과 재밌게 즐길 수 있나요?",
				"당신은 남들에게 주목받거나 발표하는 것에 있어서 거부감이 없으신 편인가요?",
				"당신은 요리할 때 정량 계량 단위에 맞춰 레시피대로 1테이블 스푼,1컵 맞춰 요리하는 편인가요?",
				"당신은 미래보다는 현재가 더 중요하다고 생각하는 편인가요?",
				"당신은 노래를 들을 때 가사보다는 멜로디를 더 신경써서 듣는 편인가요?",
				"당신은 문제가 생겼을 때 사실과 근거만으로 문제를 해결하려는 편인가요?",
	            "당신은 원리원칙을 중요하게 생각하는 편인가요?",
	            "당신의 소중한 사람에게 현실적인 조언을 많이 하는 편인가요?",
				"당신은 조직적이고 구조화된 환경을 선호하는 편인가요?",
				"당신은 어떤 일을 할 때 보다 명확한 목적과 방향이 있는 상황을 선호하는 편인가요?",
				"당신은 어떤 일을 할 때 미리 계획을 세우는 것을 선호하는 편인가요?"
		};
		int questionNum = 0; //문제번호
		String answer = "";
		int ePoint = 0; //E성향지수
		int iPoint = 0; //I성향지수
		int sPoint = 0; //S성향지수
		int nPoint = 0; //N성향지수
		int tPoint = 0; //T성향지수
		int fPoint = 0; //F성향지수
		int jPoint = 0; //J성향지수
		int pPoint = 0; //P성향지수
		
		while(run) {
			//문제번호가 문제길이와 같으면 종료
			if(questionNum == questions.length) {
				System.out.println("----------------------------------");
				System.out.println("문제가 모두 종료되었습니다.");
				System.out.println("곧 당신의 답변에 따른 MBTI 성향을 분석하여 알려드리겠습니다.");
				System.out.println("당신의 성실한 답변에 감사인사드립니다.");
				System.out.println("----------------------------------");
				System.out.println("당신의 E지수는 " + ePoint + "입니다.");
				System.out.println("당신의 I지수는 " + iPoint + "입니다.");
				System.out.println("당신의 S지수는 " + sPoint + "입니다.");
				System.out.println("당신의 N지수는 " + nPoint + "입니다.");
				System.out.println("당신의 T지수는 " + tPoint + "입니다.");
				System.out.println("당신의 F지수는 " + fPoint + "입니다.");
				System.out.println("당신의 J지수는 " + jPoint + "입니다.");
				System.out.println("당신의 P지수는 " + pPoint + "입니다.");
				System.out.println("----------------------------------");
				System.out.print("당신의 최종성향은 ");
				String result = "";
				if(ePoint > iPoint) {
					result += "E";					
				} else {
					result += "I";
				}
				
				if(sPoint > nPoint) {
					result += "S";					
				} else {
					result += "N";
				}
				
				if(tPoint > fPoint) {
					result += "T";					
				} else {
					result += "F";
				}
				
				if(jPoint > pPoint) {
					result += "J";					
				} else {
					result += "P";
				}
				System.out.println(result + "입니다.");
				System.out.println("----------------------------------");
				if(result.charAt(0)=='E') {
					System.out.println(">");					
					System.out.println("E 성향은 I성향에 비해 사람들과 있을 때 에너지를 얻는 타입입니다.");
					System.out.println("폭넓은 대인관계 유지에 장점이 있는 E성향의 사람들은,");
					System.out.println("활동성과 생동성을 유지하면서 자신을 발전시켜나가는 데 초점을 두십시오");
				} else {
					System.out.println(">");
					System.out.println("I 성향은 E성향에 비해 비교적 혼자 있을 때 에너지를 충전시키는 타입입니다.");
		            System.out.println("생각하고 사고하며 본연의 내면을 중요시하는 I성향의 사람들은");
		            System.out.println("즉흥보다는 이해와 생각을 통한 자신을 발전시켜나가는 데 초점을 두십시오.");
				}
				
				if(result.charAt(1)=='S') {
					System.out.println(">");
					System.out.println("SSSSSSSSSSSSSSSSSSSSSSSS.");
					System.out.println("SSSSSSSSSSSSSSSSSSSSSSSS.");
					System.out.println("SSSSSSSSSSSSSSSSSSSSSSSS.");
				} else {
					System.out.println(">");
					System.out.println("NNNNNNNNNNNNNNNNNNNNNNNN.");
					System.out.println("NNNNNNNNNNNNNNNNNNNNNNNN.");
					System.out.println("NNNNNNNNNNNNNNNNNNNNNNNN.");
				}
				
				if(result.charAt(2)=='T') {
					System.out.println(">");
					System.out.println("TTTTTTTTTTTTTTTTTTTTTTTT.");
					System.out.println("TTTTTTTTTTTTTTTTTTTTTTTT.");
					System.out.println("TTTTTTTTTTTTTTTTTTTTTTTT.");
				} else {
					System.out.println(">");
					System.out.println("FFFFFFFFFFFFFFFFFFFFFFFF.");
					System.out.println("FFFFFFFFFFFFFFFFFFFFFFFF.");
					System.out.println("FFFFFFFFFFFFFFFFFFFFFFFF.");
				}
				
				if(result.charAt(3)=='J') {
					System.out.println(">");
					System.out.println("JJJJJJJJJJJJJJJJJJJJJJJJ.");
					System.out.println("JJJJJJJJJJJJJJJJJJJJJJJJ.");
					System.out.println("JJJJJJJJJJJJJJJJJJJJJJJJ.");
				} else {
					System.out.println(">");
					System.out.println("PPPPPPPPPPPPPPPPPPPPPPPP.");
					System.out.println("PPPPPPPPPPPPPPPPPPPPPPPP.");
					System.out.println("PPPPPPPPPPPPPPPPPPPPPPPP.");
				}
				break;	
			}
			if(questionNum == 0) {
				System.out.println("----------------------------------");
				System.out.println("*** MBTI TEST by ChoongAngTeam ***");
				System.out.println("*** 당신의 MBTI를 측정해드립니다.   ***");				
				System.out.println("*** 성실한 답변 부탁드리겠습니다.    ***");				
				System.out.println("----------------------------------");				
			}
			System.out.println((questionNum+1) + "번 문제입니다.");
			System.out.println(questions[questionNum]);
			System.out.print("당신의 답변은? YES or NO > ");
			answer = scanner.nextLine();
			System.out.println("----------------------------------");
			
			if(answer.equals("YES") || answer.equals("yes")) {				
				//문제번호 10-12
				if(questionNum>=9) {
					jPoint++;// jPoint++;
				//문제번호 7-9
				} else if(questionNum>=6) {
					tPoint++;
				//문제번호 4-6
				} else if(questionNum>=3) {
					sPoint++;
				//문제번호 1-3
				} else {
					ePoint++;
				}				
				questionNum++; //다음 문제로 넘어감
				
			} else if(answer.equals("NO") || answer.equals("no")){
				//문제번호 10-12
				if(questionNum>=9) {
					pPoint++;
				//문제번호 7-9
				} else if(questionNum>=6) {
					fPoint++;
				//문제번호 4-6
				} else if(questionNum>=3) {
					nPoint++;
				//문제번호 1-3
				} else {
					iPoint++;
				}
				questionNum++; //다음 문제로 넘어감
				
			} else {
				System.out.println("잘못입력하셨습니다. YES 또는 NO로 답변해주십시오.");
			}
		}
	}
}
