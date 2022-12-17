package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int standardNum = scanner.nextInt();
		
		int[] numArray = new int[count];
		for(int i=0; i<count; i++) {
			numArray[i] = scanner.nextInt();
		}
		
		Arrays.stream(numArray)
			.filter(num->num<standardNum)
			.forEach(num->System.out.println(num));
	}

}
