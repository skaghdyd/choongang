package chap06;

class Car {
	String name = "마티즈";
	int price = 50000;
}

public class StudentEx {
	public static void main(String[] args) {
//		String name = "홍길동";
//		System.out.println(name);
//		
//		Student s1 = new Student();
//		System.out.println(s1.name);
//		s1.name = "김사랑";
//		System.out.println(s1.name);
//		s1.print();
//		
//		Student s2 = new Student();
//		System.out.println(s2.name);
		Car FristCar = new Car();
		System.out.println(FristCar.name);
		FristCar.name = "람보르기니";
		System.out.println(FristCar.name);
		
		Car SecondCar = new Car();
		System.out.println(SecondCar.name);
		SecondCar.name = "볼보";
		System.out.println(SecondCar.name);
		
	}
}
