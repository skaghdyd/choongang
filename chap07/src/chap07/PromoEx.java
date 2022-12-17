package chap07;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class PromoEx {

	public static void main(String[] args) {
//		B b = new B();
//		C c = new C();
//		D d = new D();
//		E e = new E();
		
//		A a1 = b;
//		A a2 = c;
//		A a3 = d;
//		A a4 = e;
		
		A a1 = new B();
		A a2 = new C();
		A a3 = new D();
		A a4 = new E();
		

	}

}
