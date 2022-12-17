package chap04;

import java.util.Scanner;

public class GugudanEx {

	public static void main(String[] args) {
		//2~9단
//		for(int i=2; i<10; i++) {
//			System.out.println(i + "단 START!");
//			for(int j=1; j<10; j++) {
//				System.out.println(i + " x " + j + " = " + (i*j));
//			}
//		}
//		System.out.println();
//		for(int i=1; i<10; i++) {
//			for(int j=2; j<10; j++) {
//				System.out.print(j + " x " + i  + " = " + (j*i) + "\t");
//			}
//			System.out.println("");
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단을 위한 숫자입력> ");
		int num = scanner.nextInt();
		System.out.println(num + "단 START!");
		for(int i=1; i<=9; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
	}

}
