package ex04;

public class ThreadEx03 implements Runnable {
	String name;
	public ThreadEx03(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(20);
				System.out.println("("+name+") :" + i);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadEx03 r1 = new ThreadEx03("첫번째");
		ThreadEx03 r2 = new ThreadEx03("두번째");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println("익명스레드");
			}
		}).start();
		// 익명 스레드를 사용하여 바로 구현하는 방법
		
	}
}
