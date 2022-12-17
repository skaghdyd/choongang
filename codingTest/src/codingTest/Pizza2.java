package codingTest;

class Solution2 {
    //최대공약수
    public int getGCD(int num1, int num2){
        if(num1%num2==0){
            return num2;
        } else{
            return getGCD(num2, num1%num2);
        }
    }
    public int solution(int n) {
        int answer = 0;
        answer = n/getGCD(n, 6);
        return answer;
    }
}

public class Pizza2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 solution2 = new Solution2();
		System.out.println(solution2.solution(10));

	}

}
