package chap12;

public class BeepTask2 implements Runnable {

	@Override
	public void run() {
		System.out.println("이름 >>> " + Thread.currentThread().getName());
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("th2 run implements Runnable!");
		}
		
	}
}
