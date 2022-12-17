package backjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputText = scanner.nextLine();
		Set<String> resultSet = new HashSet<String>();
		for (int i = 0; i <= inputText.length(); i++) {
			for (int j = i+1; j <= inputText.length(); j++) {
//				System.out.println("i, j >>> " + i + ", " + j);
				String result = inputText.substring(i,j);
				if(!resultSet.contains(result)) {
					resultSet.add(result);
//					System.out.println(result);
				}
			}
		}
		System.out.println(resultSet.size());
		
	}
}