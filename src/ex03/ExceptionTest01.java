package ex03;

public class ExceptionTest01 {
	public static void main(String[] args) {
		int a = 22;
		int b = 0;
		try {
			System.out.println("a+b =" + (a+b));
			System.out.println("a-b =" + (a-b));
			System.out.println("a*b =" + (a*b));
			System.out.println("a/b =" + (a/b));
			System.out.println("계산 끝");
		}catch (Exception e) {
			System.err.println("0으로 나눌수 없음");
			System.err.println("예외 메시지 : " + e.getMessage());
		}
	}

}
