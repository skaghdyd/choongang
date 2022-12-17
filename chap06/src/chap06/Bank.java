package chap06;

import java.util.Scanner;

public class Bank {
	boolean run = true;
	int balance = 0;
	Scanner scanner = new Scanner(System.in);
	
	void deposit() {
		System.out.print("예금액> ");
		this.balance += scanner.nextInt();
		System.out.println();
	}
	void withdraw() {
		System.out.print("출금액> ");
		this.balance -= scanner.nextInt();
		System.out.println();
	}
	void balanceCheck() {
		System.out.print("잔고> ");
		System.out.println(this.balance);
		System.out.println();		
	}
	void close() {
		this.run = false;
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
