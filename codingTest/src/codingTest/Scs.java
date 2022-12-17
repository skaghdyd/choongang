package codingTest;
class Solution3 {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                for(int k=j+1; k<number.length; k++) {
                	int sum=number[i]+number[j]+number[k];
                	if(sum==0) {
                		answer+=1;
                	}
                }
            }
        }
        return answer;
    }
}
public class Scs {

	public static void main(String[] args) {
		Solution3 solution = new Solution3();
		System.out.println(solution.solution(new int[] {-2, 3, 0, 2, -5}));
	}

}
