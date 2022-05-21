package ex04;

public class SynchronizedEx01 implements Runnable {
	public synchronized void a(String who) {
		try {
			Thread.sleep(200);
		}catch (Exception e) {
			e.printStackTrace();
		}
			System.out.println(who + " : b() 호출");
			b(who);
	}
	
	public synchronized void b(String who) {
		try {
			Thread.sleep(200);
		}catch (Exception e) {
			e.printStackTrace();
		}
			System.out.println(who + " : a() 호출");
			a(who);
		
	}
	
	@Override
	public void run() {
		b(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		SynchronizedEx01 s1 = new SynchronizedEx01();
		Thread t1 = new Thread(s1, "첫번째");
		Thread t2 = new Thread(s1, "두번째");
		t1.start();
		t2.start();
	}
}
