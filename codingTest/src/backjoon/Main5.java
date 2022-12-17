package backjoon;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int answer = 0;
		String word = scanner.nextLine();
		char[] alphabet = word.toCharArray();
		
		for(char a : alphabet) {
			answer+=call(a);
		}
		System.out.println(answer);
	}

	private static int call(char a) {
		char[][] buttonArray = new char[][] {
			{' '},				//1
			{'A','B','C'},		//2
			{'D','E','F'},		//3
			{'G','H','I'},		//4
			{'J','K','L'},		//5
			{'M','N','O'},		//6
			{'P','Q','R','S'},	//7
			{'T','U','V'},		//8			
			{'W','X','Y','Z'},	//9
			{' '}				//0
		};
		
		for(int i=0; i<buttonArray.length; i++) {
			for(int j=0; j<buttonArray[i].length; j++) {
				if(buttonArray[i][j]==a) {
					return i+2;
				}
			}
		}
		return 0;
	}
}
