package chap06_2;

public class Car3 {
	private int gas;

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean gasChecking() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		} else {
			System.out.println("gas가 없습니다.");
			return true;
		}			
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량 : " + gas + ")");
				break;
			}
		}
	}
	
	void gasUp() {
		while(true) {
			if(gas<100) {
				System.out.println("주유중입니다.(gas잔량 : " + gas + ")");
				gas += 1;				
			} else {
				System.out.println("주유가 완료되었습니다.(gas잔량 : " + gas + ")");
				break;
			}
		}
	}
}
