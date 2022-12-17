package chap06;

public class DoWhileEx {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		do {
			sum += i;
			System.out.println(sum);
			i++;
		} while(i<=10);
	}
}
