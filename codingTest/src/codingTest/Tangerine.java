package codingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tangerine {
	public static int solution(int k, int[] tangerine) {
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		//map에 귤 사이즈별 갯수를 저장함(K:사이즈, V:갯수)
		for (int i = 0; i < tangerine.length; i++) {
//			System.out.println("tangerine[i] >>> " + tangerine[i]);
			map.put(tangerine[i], map.getOrDefault(tangerine[i],0)+1);
//			System.out.println("map.get(tangerine[i]) >>> " + map.get(tangerine[i]));
		}
		//정렬을 위해 map을 list로 변환
		List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
		
		//value를 기준으로 내림차순 정렬
		entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
//		System.out.println("entryList >>> " + entryList);
		
		//값을 하나씩 꺼내서 k에서 빼줌 >>> 상자에 귤을 담음
		for(Map.Entry<Integer, Integer> entry : entryList) {
			//k가 0보다 작아지면 종료 >>> 상자에 귤을 모두 담음
			if(k<=0) break;
			
			k -= entry.getValue();
			
			//사용한 귤 종류 +1
			answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
		
	}
}
