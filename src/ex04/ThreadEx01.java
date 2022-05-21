package ex04;

class MyThread extends Thread{
	String name;
	public MyThread(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(20);
				System.out.println("(" + name + ") : " + i);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx01 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("첫번째");
		MyThread t2 = new MyThread("두번째");
		// 생성자를 통해 구분될 매개변수 값 입력
		
		t1.start();
		t2.start();
		//start는 run()을 실행하기전 환경 설정의 기능도 수행하므로 run()을 통해 직접 실행하지 않고 start로 실행
		
	}
}
