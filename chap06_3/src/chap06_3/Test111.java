package chap06_3;

import java.util.Scanner;

public class Test111 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int i = 0;
		int e = 0;
		int nums = 0;
		String answer = "";
		String[] qusetion = {
				"1번 문제입니다 \n" + "당신은 집에만 있는 것이 너무나도 지겹습니까? \n" + "\nyes. 사람들도 좀 만나고 하는게 좋아요 \n" + "no. 집에만 평생 있어도 좋아요",
				"흥미롭네요. 2번 문제입니다 \n" + "당신은 친구와 함께 사람많은 곳에서 파티를 하기로 했습니다 \n" + "친구와 함께 파티에서 모르는 사람과 재밌게 즐길 수 있나요? \n"
						+ "\nyes. 모르는 사람들과도 재밌게 노는것도 나름 즐거워요 \n" + "no. 낯을 가려서 답답하고, 쭈구리가 돼요...",
				"흥미롭네요. 3번 문제입니다 \n" + "남들에게 주목받거나 발표하는 것에 있어서 거부감이 없으신가요? \n"
						+ "\nyes. 발표에 약간 자신이 있고, 주목받는 것도 짜릿합니다!\n" + "no. 남들 앞에서 발표하는 거 진짜 무서워요. 시키지 말아주세요... ",
				"흥미롭네요. 4번 문제입니다 \n" + "당신의 대인관계는 여러 사람을 두루 사귀는 것을 선호하시나요? \n"
						+ "아니면 많지는 않아도 내 사람이라고 생각 되는 사람들과 깊은 관계를 맺는 것을 선호하시나요? \n"
						+ "\nyes. 저는 다양한 사람들을 경험하고, 그들의 생각과 많은 것을 공유하는 것을 중요시 해요. \n"
						+ "no. 저는 같은 사상을 공유하고 있는 사람들과 추억을 즐기는 것을 선호합니다.",
				"자 다 왔습니다! 마지막 5번 문제입니다 \n" + "당신은 친구들 사이에서 주로 이야기를 하는쪽이신가요? 아니면 듣는 쪽이신가요? \n"
						+ "\nyes. 저는 친구들 사이에서 토크를 중심적으로 이끌어가는 역할을 하고 있어요. \n"
						+ "no. 저는 친구들이 하는 얘기를 듣거나 리액션을 담당하고 있어요." };
		while (run) {
			if (nums == 5) {
				System.out.println("");
				System.out.println("mbti문제를 끝냈습니다");
				System.out.println("푸시는 동안 고생많으셨습니다");
				System.out.println("=================");
				System.out.println("당신의 성향은?");
				if (i < e) {
					System.out.println("당신의 E점수는 " + e + "점 I점수는 " + i + "점 나왔습니다.");
					System.out.println("축하합니다. 비교적 당신은 E성향에 가깝습니다.");
					System.out.println("E 성향은 I성향에 비해 사람들과 있을 때 에너지를 얻는 타입입니다.");
					System.out.println("폭넓은 대인관계 유지에 장점이 있는 E성향의 사람들은");
					System.out.println("활동성과 생동성을 유지하면서 자신을 발전시켜나가는 데 초점을 두십시오.");
				} else if (i > e) {
					System.out.println("당신의 E점수는 " + e + "점 I점수는 " + i + "점 나왔습니다.");
					System.out.println("축하합니다. 비교적 당신은 I성향에 가깝습니다.");
					System.out.println("I 성향은 E성향에 비해 비교적 혼자 있을 때 에너지를 충전시키는 타입입니다.");
					System.out.println("생각하고 사고하며 본연의 내면을 중요시하는 I성향의 사람들은");
					System.out.println("즉흥보다는 이해와 생각을 통한 자신을 발전시켜나가는 데 초점을 두십시오.");
				}
				System.out.println("=================");
				break;
			}
			System.out.println("=================");
			System.out.println("mbti문제 풀기");
			System.out.println("=================");
			System.out.println(qusetion[nums]);
			System.out.println("");
			System.out.println("당신의 답변은?");
			System.out.print("선택(yes or no) >");
			System.out.println("");
			answer = scanner.nextLine();
			if (answer.equals("yes")) {
				e++;
				nums++;
			} else if (answer.equals("no")) {
				i++;
				nums++;
			} else {
				System.out.println("");
				System.out.println("다시 풀어주세요(소문자로만 입력 가능해요 ㅠㅠ)");
				System.out.println("");
			}
		}

	}

}
