package backjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		List numList = new ArrayList();
		for(int i=0; i<num; i++) {
			numList.add(scanner.nextInt());
		}
        
		Collections.sort(numList);
			
		for(int i=0; i<numList.size();i++) {
			System.out.println(numList.get(i));
		}
	}
}