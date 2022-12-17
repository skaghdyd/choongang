package chap04;

class Test {
	private int num = 10;
	
	void printNum() {
		System.out.println(num);
	}
	
	void setNum(int num) {
		if(num>0) {
			this.num = num;			
		} else {
			System.out.println("0보다 큰 수를 입력해주세요.");
		}
	}
}

public class ClassEx {
	public static void main(String[] args) {
		Test t1 = null;
		t1 = new Test();
//		t1.num = 20;
//		System.out.println(t1.num);
		t1.printNum();
		t1.setNum(0);
		t1.printNum();
		
		
		Test t2 = new Test();
//		t2.num = 40;
//		System.out.println(t2.num);
		t2.printNum();
		t2.setNum(100);
		t2.printNum();
	}
}
