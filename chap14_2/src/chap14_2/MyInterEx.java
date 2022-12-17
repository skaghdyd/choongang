package chap14_2;

public class MyInterEx {

	public static void main(String[] args) {
		MyInter mi;
		mi = new MyInter() {

			@Override
			public int method(int x, int y) {
				return x + y;
			}

		};

		MyInter mi2 = (x, y) -> {
			return x + y;
		};
		System.out.println(mi2.method(1, 2));
		
		MyInter mi3 = (x, y) -> x + y;
		
	}

}
