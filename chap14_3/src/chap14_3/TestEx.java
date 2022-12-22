package chap14_3;

public class TestEx {

	public static void main(String[] args) {
		Test t;
		t = ()->{
			System.out.println("zzz");
		};
		t.m();
		
		Test t2 = new Test() {

			@Override
			public void m() {
				System.out.println("m()");
				m2("A");
			}
			
			public void m2(String a) {
				System.out.println("m2()");
			}
			
		};
		t2.m();
	}

}
