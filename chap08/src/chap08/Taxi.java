package chap08;

//public class Taxi extends Vehicle {
public class Taxi implements Vehicle2 {

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

}
