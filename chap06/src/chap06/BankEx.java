package chap06;

import java.util.Scanner;

public class BankEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank();
		
		while(bank.run) {
			System.out.println("-------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");
			
			int choose = scanner.nextInt();
			
			switch (choose) {
			case 1:				
				bank.deposit();
				break;
			case 2:
				bank.withdraw();
				break;
			case 3:
				bank.balanceCheck();
				break;
			case 4:
				bank.close();				
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
				break;
			}
		}
	}
}
