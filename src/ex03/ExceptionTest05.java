package ex03;

public class ExceptionTest05 {
	public static void main(String[] args) {
		try {
			throw new Exception();
			// 강제발생
		}catch(Exception e) {
			System.out.println("예외 강제발생");
		}
	}
}
