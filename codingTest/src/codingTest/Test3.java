package codingTest;
public class Test3 {
	
	public static long solution(int k, int d) {
        double distance = 0;
        long answer = 0;
        
        for(int x=0; x<=d; x+=k){
            for(int y=0; y<=d; y+=k) {
                distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
                System.out.println("x >>> " + x);
                System.out.println("y >>> " + y);
            	System.out.println("distance : " + distance + " ////  d : " + d);
                if(distance <= d) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		solution(2,4);
//		System.out.println(solution(2,4));

	}

}
