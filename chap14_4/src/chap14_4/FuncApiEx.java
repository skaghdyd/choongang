package chap14_4;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class 메소드참조테스트 {
	void testMethod1(String a) {
		System.out.println("testMethod1");
	}

	void testMethod2(Integer a) {
		System.out.println("testMethod2");
	}
	
	String testMethod3(String a, String b) {
		return "오퍼레이트테스트";
	}
	
	String testMethod4(String a) {
		return "펑션테스트";
	}
	
	Integer testMethod5(String a) {
		return 99999999;
	}
}

public class FuncApiEx {
	public static void main(String[] args) {
		Consumer<Integer> co = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}

		};
		co.accept(234);

		Consumer<Integer> co2 = System.out::println;
		co2.accept(567);

		BiConsumer<Integer, String> co3 = (t, y) -> System.out.println(t + y);
		co3.accept(234, "test");

		Consumer<Integer> co4 = System.out::println;
		co4.accept(567);

		Supplier<String> sp = () -> "supplier test".toUpperCase();
		System.out.println(sp.get());

//		Supplier<String> sp2 = String::toUpperCase;
		Supplier<Double> sp3 = Math::random;
		System.out.println(sp3.get());
		
		Function<String,Integer> f = x->Integer.parseInt(x);
		System.out.println(f.apply("123123"));
		
		BinaryOperator<String> bo = (x,y)->x.concat(y);
		System.out.println(bo.apply("합", "체"));
		BinaryOperator<String> bo2 = String::concat;
		System.out.println(bo2.apply("합2", "체2"));
		
		
		Predicate<String> pr = s->s.equals("test");
		System.out.println(pr.test("test"));
		Predicate<String> pr2 = String::isBlank;
		System.out.println(pr2.test("a"));
		
		메소드참조테스트 test = new 메소드참조테스트();
		Consumer<String> coo = test::testMethod1;
		Consumer<Integer> coo2 = test::testMethod2;
		coo.accept("a");
		coo2.accept(1);
		BinaryOperator<String> coo3 = test::testMethod3;
		System.out.println(coo3.apply("a", "b"));
		
		Function<String, String> coo4 = test::testMethod4;
		System.out.println(coo4.apply("a"));
		
		Function<String, Integer> coo5 = test::testMethod5;
		System.out.println(coo5.apply("a"));
		
		
	}
}
