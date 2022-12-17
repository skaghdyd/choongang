package chap16;

import java.util.stream.IntStream;

public class IntStreamEx {
	static int sum;
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10)
			.forEach(a->sum+=a);
		System.out.println(sum);
	}
}
