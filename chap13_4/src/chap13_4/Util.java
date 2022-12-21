package chap13_4;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);
	}
	public static <T extends String> int compare2(T t1, T t2) {
		return t1.compareTo(t2);
	}
	
	public static void main(String[] args) {
		int a = Util.compare(2.0, 2);
		System.out.println(a);
		
		int b = Util.compare2("b", "b");
		System.out.println(b);
		
	}
}
