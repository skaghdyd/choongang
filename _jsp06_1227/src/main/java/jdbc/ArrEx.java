package jdbc;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrEx {
	public static void main(String[] args) {
		String[] strArr = {"가","나","다"};
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(e->System.out.println(e));
	}
}
