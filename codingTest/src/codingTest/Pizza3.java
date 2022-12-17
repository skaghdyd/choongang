package codingTest;

import java.util.Scanner;

public class Pizza3 {
	static Scanner scanner = new Scanner(System.in);
	public int solution(int slice, int n) {
        int answer = 0;
        if(n%slice==0) {
        	answer=n/slice;
        } else {
        	answer=n/slice+1;
        }
        System.out.println(answer);
        return answer;
    }
	public static void main(String[] args) {
		Pizza3 pizza = new Pizza3();
		pizza.solution(7, 10);

	}

}
