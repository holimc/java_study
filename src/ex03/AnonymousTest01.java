package ex03;

interface MyInter{
	void prn();
}

public class AnonymousTest01 {
	public static void main(String[] args) {
		new MyInter() {
		// new를 통해서 객체 생성을 한다.
			@Override
			public void prn() {
				System.out.println("객체 선언 및 생성을 하고 메서드를 실행합니다.");
			}
		}.prn();
		// 오버라이딩 후, prn 메서드를 사용하여 호출
	}

}
