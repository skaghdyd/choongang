package backjoon;

public class Main {

	public static void main(String[] args) {
		// 1~10000 생성자 계산
		for (int start = 1; start <= 10000; start++) {
			boolean result = selfNumChk(start);
			if(result) {
				System.out.println(start);
			}
		}
	}
	
	static boolean selfNumChk(int num) {
		for (int i = 1; i <= num; i++) {
			int length = (int) (Math.log10(i));
			int sum = i;
			int digit = i;
			for (int j = 0; j <= length; j++) {
				sum += digit % 10;
				digit /= 10;
			}
			if(sum==num) {
				return false;
			}
		}
		return true;
	}
}