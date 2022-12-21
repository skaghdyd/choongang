package chap12_2;

public class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
	}
	
	@Override
	public void run() {
//		for(int i=0; i<2; i++) {
		while(true) {
			if(Thread.interrupted()) {
				break;
			}
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
