package chap01;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");
			int choose = scanner.nextInt();
			switch (choose) {
			case 1:
				System.out.print("예금액> ");
				balance += scanner.nextInt();
				System.out.println();
				break;
			case 2:
				System.out.print("출금액> ");
				balance -= scanner.nextInt();
				System.out.println();
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				System.out.println();
				break;
			case 4:
				run = false;
				System.out.println();
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
				break;
			}
		}
	}
}
