package chap14_2;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> cos = t-> System.out.println(t+"rrr");
		cos.accept("zzz");
		System.out.println();
		
		Consumer<Double> cos2 = t-> System.out.println(t+"rrr");
		cos2.accept(1.0);
		System.out.println();
		
		DoubleConsumer cos3 = t-> System.out.println(t+"rrr");
		cos3.accept(1.0);
		cos3.accept(3);
		System.out.println();

	}

}
