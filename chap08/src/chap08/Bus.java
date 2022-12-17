package chap08;

//public class Bus extends Vehicle {
public class Bus implements Vehicle2, Vehicle3 {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("버스가 멈춥니다.");
		
	}

}
