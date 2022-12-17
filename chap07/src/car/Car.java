package car;

public class Car {
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
//	int run() {
	int[] run() {
		int[] rs = new int[4];
		System.out.println("[자동차가 달립니다.]");
		
		
		if(frontLeftTire.roll()==false) {
			rs[0] = 1;
//			stop(); 
//			return 1;
		}
		
		if(frontRightTire.roll()==false) {
			rs[1] = 2;
//			stop(); 
//			return 2;
		}
		
		if(backLeftTire.roll()==false) {
			rs[2] = 3;
//			stop(); 
//			return 3;
		}
		
		if(backRightTire.roll()==false) {
			rs[3] = 4;
//			stop(); 
//			return 4;
		}
//		return 0;
		if(rs[0]!=0 || rs[1]!=0 || rs[2]!=0 || rs[3]!=0) {
			stop();
		}
		return rs;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
