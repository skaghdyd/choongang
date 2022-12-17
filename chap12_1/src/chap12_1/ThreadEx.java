package chap12_1;

public class ThreadEx {

	public static void main(String[] args) {
		Thread th = new WorkThread();
		th.start();
		
		Thread th2 = new Thread(new WorkThread2());
		th2.start();
		
		Thread th3 = new Thread() {

			@Override
			public void run() {
				while(true) {
					System.out.println("WorkThread3");
					try {
						Thread.sleep(800);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		};
		th3.start();
		
		Thread th4 = new Thread(()->{			
			while(true) {
				System.out.println("WorkThread4");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		th4.start();
	}

}
