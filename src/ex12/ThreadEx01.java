package ex12;

public class ThreadEx01 extends Thread {
	static int share;
	// static으로 선언된 변수가, 멀티 스레드에 의해서 호출된다
	public static void main(String[] args) {
		ThreadEx01 t1 = new ThreadEx01();
		ThreadEx01 t2 = new ThreadEx01();
		
		t1.start();
		t2.start();
		
	}
	@Override
	public void run() {
		for(int count =0; count<10; count++) {
			System.out.println(share++);
			try {
				sleep(1000);
			}catch(InterruptedException e) {
			}
		}
	}
}
/*
 * 위의 코드를 실행하면 share의 값이 계속해서 변동이 오는것을 알 수 있다.
 * 즉, 멀티 스레드 환경에서 여러개의 스레드가 static값을 읽어오다보면 값이 꼬일수 밖에 없고, 이런 상황을 thread safe 하지 않다고 할 수 있다
 * 그렇기 때문에 스레드환경에서 동시에 접근해서는 안되는 공유 리소스를 접근하는 코드를 동기화하거나 해서 락해야한다.
 */
