package ex04;

class NoThread{
	String name;
	public NoThread(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(20);
				System.out.println("("+name+") : " + i);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void start() {
		run();
	}
}

public class ThreadEx02 {
	public static void main(String[] args) {
		NoThread nt1 = new NoThread("1st");
		NoThread nt2 = new NoThread("2nd");
		
		nt1.start();
		nt2.start();
		// 스레드를 상속받지 않고 형태만 비슷하게 갖춰서 만든 경우이다.
		// ThreadEx01 과 다르게 1st와 2nd가 번갈아 가면서 동작하는게 아니라, nt1이 먼저 다 실행되고 nt2가 실행되는걸 볼 수 있다.
	}
}
