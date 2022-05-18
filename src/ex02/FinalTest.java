package ex02;
final class FinalTest01{
	
}
class FinalMethod {
	final void finalMethod() {
		System.out.println("메서드 오버라이딩 불가능");
		System.out.println("객체 생성해서 호출은 가능");
	}
}

//public class FinalTest extends FinalTest01 {
// final이 붙은 클래스는 상속 불가능
public class FinalTest extends FinalMethod {
	public static void main(String[] args) {
		final int seven = 7;
		// seven = 8;
		// 상수기때문에 대입불가능
		
		// FinalMethod fm = new FinalMethod();
		// fm.finalMethod();
		// 객체 생성해서 호출 가능
		
		/*@override
		public void finalMethod() {
			super.finalMethod();
		}
		*/
		// 오버라이딩 불가능
		
		System.out.println(seven);
		
	}	
}
