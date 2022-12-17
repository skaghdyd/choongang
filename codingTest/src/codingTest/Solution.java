package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	public static int solution(int[] array) {
		
		String strArray = Arrays.toString(array);
		System.out.println("strArray : " + strArray.toString());
        char[] chaArray = strArray.toCharArray();
        System.out.println(chaArray);
        
        int answer = 0;
        for(char i : chaArray) {
        	System.out.println(i);
            if(i == '7') {
               answer++;
            }
        }        
        return answer;
	        
//		int count = 0;
//		String strArray = Array
//        for(int i=0; i<array.length; i++){
//            String test = String.valueOf(array[i]);
//            char[] testChar = test.toCharArray();
//            for(int j=0; j<testChar.length; j++) {
//            	if(testChar[j]=='7') {
//            		count++;
//            	}
//            }
//        }
//        return count;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[]{7, 77, 17}));
		
//		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//		//1. 두 정수 A, B 입력
//		//2. A+B 출력
//		int a;
//		int b;
//		Scanner sc =new Scanner(System.in);
//		
//		System.out.print("입력");
//		a=sc.nextInt();
//		
//		System.out.print("입력");
//		b=sc.nextInt();
//		
//		System.out.println(a+b);
	}
}
