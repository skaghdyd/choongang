package codingTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution4 {
	public int[] solution(int[] numbers) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				int sum = numbers[i] + numbers[j];
				set.add(sum);
			}
		}
		Object[] setArray = set.toArray();
		int[] answer = new int[setArray.length];
		for(int i=0;i<setArray.length;i++) {
			answer[i]=(int) setArray[i];
		}
		Arrays.sort(answer);
		return answer;
	}
}

public class TwoPlus {

	public static void main(String[] args) {
		Solution4 solution = new Solution4();
		System.out.println(solution.solution(new int[] { 5,0,2,7 }));
	}

}
