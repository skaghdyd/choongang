package chap06_2;

public class Car {
//	int num;
//	String str;
//	
//	Car() {
//		System.out.println("매개변수가 없는 경우의 생성자");
//	}
//	
//	Car(int num) {
//		System.out.println("매개변수가 int 데이터인 경우의 생성자");
//	}
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car() {
	}
	
	Car(String model) {
		this(model, "은색", 250);
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}