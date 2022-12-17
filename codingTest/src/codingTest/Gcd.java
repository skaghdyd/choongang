package codingTest;

public class Gcd {
	public static int getGCD(int num1, int num2){
        if(num1%num2==0){
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
	
	public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int gcd = getGCD(num1, num2);
        System.out.println("gcd >>> " + gcd);
        int lcm = num1*num2/gcd;
        System.out.println("lcm >>> " + lcm);
        answer[0] = lcm/num1*denum1 + lcm/num2*denum2;
        answer[1] = lcm;
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        
        gcd = getGCD(answer[0], answer[1]);
        answer[0]/=gcd;
        answer[1]/=gcd;
        
        return answer;
    }
	
	public static void main(String[] args) {
		solution(9,2,1,3);
		// TODO Auto-generated method stub

	}
}