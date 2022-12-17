package chap06_2;

public class CalEx {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		int result1 = myCalc.plus(1, 2);
		System.out.println("result1 : " + result1);
		double result2 = myCalc.divide(1, 2);
		System.out.println("result2 : " + result2);
		myCalc.powerOff();

	}

}
