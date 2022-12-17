package chap09;

public class A {
	static int test = 1;
	A() {
		System.out.println("A 객체생성");
	}

	class B {
		int field1 = 1;
//		static int field2 = 2;

		B() {
		}

		void method1() {}
//		static void method2() {}
	}
	
	static class C{
		int field1 = 1;
		static int field2 = 2;
		
		C(){
			System.out.println("C실행");
		}
		
		void method1() {}
		static void method2() {}
	}
	void method() {
		class D{
			int field1;
//			static int field2;
			D(){
				System.out.println("D실행");
			}
			void method1() {}
//			static void method2() {}			
		}		
	}

	public static void main(String[] args) {
		A a = new A();
		A.B b1 = a.new B();
		A.B b2 = new A().new B();
		b1.field1 = 3;
		b1.method1();
		
		A.C c1 = new A.C();
		A.C c2 = new A.C();
		int test = new A().test;
		int test2 = A.test;
		int test3 = A.C.field2;
		int test4 = new A().new B().field1;
	}
}