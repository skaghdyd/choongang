package chap09_2;

public class Outer {
	public void method(int arg) {
		int localVariable = 1;
//		arg = 100;
//		localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
