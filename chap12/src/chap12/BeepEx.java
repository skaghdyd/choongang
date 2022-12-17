package chap12;

public class BeepEx {

	public static void main(String[] args) {
		System.out.println("이름 >>> " + Thread.currentThread().getName());
		Thread th = new BeepTask();
		th.start();

		Thread th2 = new Thread() {

			@Override
			public void run() {
				System.out.println("이름 >>> " + Thread.currentThread().getName());

				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("th2 Beep!");
				}
			}
		};
		th2.start();

		Runnable th3 = new BeepTask2();
		Thread th4 = new Thread(th3);
		th4.start();

		Thread th5 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("이름 >>> " + Thread.currentThread().getName());

				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("th5 run!");
				}
			}
		});
		th5.start();

		Thread th6 = new Thread(() -> {
			System.out.println("이름 >>> " + Thread.currentThread().getName());

			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("th6 run!");
			}
		});
		th6.start();
	}
}
