package chap09_2;

public class Outer2 {
	String field = "Outer-field";
	void method() {
		System.out.println("Outer-method");
	}
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outer2.this.field);
			Outer2.this.method();
		}
	}
	
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
//		outer.method();
		Outer2.Nested nested = outer.new Nested();
//		nested.method();
		nested.print();
	}
}
