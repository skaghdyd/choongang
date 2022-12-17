package chap12_1;

public class WorkThread extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println("1WorkThread");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
