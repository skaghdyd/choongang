package chap14_3;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncApiEx {

	public static void main(String[] args) {
		Consumer zz = (t) -> {
			System.out.println(t);
		};
		zz.accept(100);
		
		Consumer<String> co = (t) -> {
			System.out.println(t);
		};
		co.accept("test");
		
		Consumer<Integer> co2 = (t) -> {
			System.out.println(t);
		};
		co2.accept(100);
		
		System.out.println("******************************");
		Supplier sup = ()->{
			return 100;
		};
		System.out.println(sup.get());
		
		Supplier<String> sup2 = ()->"test";
		System.out.println(sup2.get());

		Supplier<Integer> sup3 = ()->100;
		System.out.println(sup3.get());
		System.out.println("******************************");
		
		Function<String, Integer> f = x->Integer.parseInt(x);
		System.out.println(f.apply("1"));
		
		Function<String, String> f2 = x->x;
		System.out.println(f2.apply("test"));
		System.out.println("******************************");
		
		BinaryOperator<String> bo = (x,y)->x+y;
		System.out.println(bo.apply("a", "b"));
		
		IntBinaryOperator bo2 = (x,y)->x+y*200;
		System.out.println(bo2.applyAsInt(1, 2));
		System.out.println("******************************");
		
		Predicate<String> pr = s->s.equals("test");
		System.out.println(pr.test("test"));
	}

}
