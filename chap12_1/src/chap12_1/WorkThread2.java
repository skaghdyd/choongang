package chap12_1;

public class WorkThread2 implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("WorkThread2");
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
