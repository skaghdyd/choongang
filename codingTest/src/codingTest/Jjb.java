package codingTest;

import java.util.ArrayList;
import java.util.List;

public class Jjb {
	public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];
        List<Integer> kList = new ArrayList<Integer>();
        kList.add(k);
        
        while(k!=1) {
        	if(k%2==0) {
        		//1-1. 입력된 수가 짝수라면 2로 나눕니다.
        		k/=2;
        	} else {
        		//1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
        		k=(k*3)+1;
        	}
        	kList.add(k);
        }
        
        List<Double> areaList = new ArrayList<Double>();
        for(int i=0; i<kList.size()-1; i++) {
        	int upperSide = kList.get(i);
        	int lowerSide = kList.get(i+1);
        	double area = (double)(upperSide+lowerSide)/2; //사다리꼴 넓이 > (윗변+아랫변)*높이/2 > 여기서 높이는 무조건 1이라 생략.
        	System.out.println("[" + i + ", " + (i+1) + "] 구간의 넓이 >>> " + area);
        	areaList.add(area);
        }
        System.out.println("areaListSize >>> " + areaList.size());
        
        for(int i=0; i<ranges.length; i++) {
        	double areaSum = 0;
        	
        	//유효하지 않은 구간인 경우 -1
        	if(ranges[i][0]>areaList.size()+ranges[i][1]) {
        		areaSum = -1;
        	
        	//유효한 경우 넓이 sum
        	} else {
        		for(int j=ranges[i][0]; j<areaList.size()+ranges[i][1]; j++) {
        			areaSum += areaList.get(j);
        		}        		
        	}
        	System.out.println("areaSum >>> " + areaSum);
        	answer[i] = areaSum;
        }
        return answer;
    }
	public static void main(String[] args) {
		Jjb jjb = new Jjb();
		jjb.solution(5, new int[][]{{0,0},{0,-1},{2,-3},{3,-3}});

	}

}
