package ex02;

public class StaticTest {
	static int num;
	int count;
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.count = 1;
		num = 1;
		
		for(int i=0;i<5;i++) {
			num++;
			st.count++;
			System.out.println(num + " / " + st.count);
		}
		System.out.println("for문 종료");
		// for문을 반복하는동안 count와 num이 증가한다.
		use();
		// static으로 선언된 변수인 num은 use를 통해 재호출해도 for문으로 증가한 값인 6이지만, count는 0으로 리셋된다.
	}
	
	static void use() {
		StaticTest st = new StaticTest();
		System.out.println(num + " / " + st.count);
	}
}

