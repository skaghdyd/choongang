package chap07_2;

class Aaa2{
	void mt() {
		
	}
}
class Bbb2 extends Aaa2 {

	@Override
	void mt() {
		// TODO Auto-generated method stub
		super.mt();
	}
	
	void bMt() {
		
	}
	
}
public class RCEx {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
//		rc = new Audio();
		
		Television tv = new Television();
		tv.tvMethod();
		((Television) rc).tvMethod();
		
		Aaa2 b = new Bbb2();
		((Bbb2) b).bMt();
		
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

}
