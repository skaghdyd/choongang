package codingTest;

import java.util.HashMap;
import java.util.Map;

public class RollCake {
	public int solution(int[] topping) {
        int answer = 0;
        int method = topping.length-1;
        System.out.println("method >>> " + method);
        System.out.println("---");
        
        for(int i=0; i<method; i++) {
        	System.out.println((i+1) + "번째 방법");
        	int startIdx = i+1;
        	int endIdx = method;
        	int[] firstPiece = new int[startIdx];
        	int[] secondPiece = new int[endIdx-i];
        	System.out.println("firstPiece.length >>> " + firstPiece.length);
        	System.out.println("secondPiece.length >>> " + secondPiece.length);
        	System.out.println("---");
        	
        	Map<Integer, Integer> firstMap = new HashMap<Integer, Integer>();
        	for(int j=0; j<firstPiece.length; j++) {
        		firstPiece[j] = topping[j];
        		System.out.println("firstPiece[" + j + "] >>> " + firstPiece[j]);
        		firstMap.put(firstPiece[j], firstMap.getOrDefault(firstPiece[j], 0)+1);
        	}
        	System.out.println("---");
        	System.out.println(firstMap);
        	System.out.println("---");
        	Map<Integer, Integer> secondMap = new HashMap<Integer, Integer>();
        	for(int j=0; j<secondPiece.length; j++) {
        		secondPiece[j] = topping[firstPiece.length + j];        		
        		System.out.println("secondPiece[" + j + "] >>> " + secondPiece[j]);
        		secondMap.put(secondPiece[j], secondMap.getOrDefault(secondPiece[j], 0)+1);
        	}
        	System.out.println("---");
        	System.out.println(secondMap);
        	System.out.println("---");
        	
        	if(firstMap.size() == secondMap.size()) {
        		answer++;
        	}
        	
        }
        System.out.println("answer >>> " + answer);
        return answer;
    }
	public static void main(String[] args) {
		RollCake rollcake = new RollCake();
		rollcake.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2});
	}

}
