package chap06_2;

public class Car3Ex {

	public static void main(String[] args) {
		Car3 myCar = new Car3();
		myCar.setGas(5);
		boolean gasState = myCar.gasChecking();
		if(gasState) {
			System.out.println("출발");
			myCar.run();
		} else {
			System.out.println("주유");
			myCar.gasUp();			
		}
	}
}
