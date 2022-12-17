package package2;

import package1.A;

public class D extends A {
	public D() {
		super();
		super.field = "value";
		super.method();
	}
}
