package chap08;

class A{}

public class B extends A{
	void method(B b) {}
	
	public static void main(String[] arg) {
		B b = (B) new A();
//		B b = new B();
		b.method(b);
	}
}
