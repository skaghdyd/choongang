package chap13_3;

public class BoxEx {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		System.out.println(box1.get());
		
		Box<String> box2 = Util.<String>boxing("test");
		System.out.println(box2.get());
		
		Box box3 = Util.boxing("zzz");
		System.out.println(box3.get());
		
		Box box4 = Util.boxing(123);
		System.out.println(box4.get());

	}

}
