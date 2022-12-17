package sec13.exam03.package1;

public class B {
	A a = new A();
//	a.field2 = 1;
////	a.field3 = 1;
//	a.method1();
//	a.method2();
////	a.method3();
	
	int b = a.field1;
	
	public B() {
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1;
		a.method1();
		a.method2();
//		a.method3();
	}
	
	void test() {
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1;
		a.method1();
		a.method2();
//		a.method3();		
	}
	
	
}
