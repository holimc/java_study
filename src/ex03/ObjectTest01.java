package ex03;

class Point01{
	
}

public class ObjectTest01 {
	public static void main(String[] args) {
		Point01 p = new Point01();
		System.out.println("클래스 이름 : " + p.getClass() );
		System.out.println("해쉬코드 : " + p.hashCode() );
		System.out.println("객체문자열 : " + p.toString() );
		System.out.println("=======================" );
		Point01 p2 = new Point01(); 
		System.out.println("클래스 이름 : " + p2.getClass() );
		System.out.println("해쉬코드 : " + p2.hashCode() );
		System.out.println("객체문자열 : " + p2.toString() );
		// p2로 객체를 또 생성했으므로, p와 p2는 다른 해쉬코드나 문자열을 갖는다.
		System.out.println("=======================" );
		
		if(p.equals(p2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
			System.out.println("p의 해쉬코드 : " + p.hashCode());
			System.out.println("p2의 해쉬코드 : " + p2.hashCode());
		}
		System.out.println("=======================");
		p = p2;
		if(p.equals(p2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
			System.out.println("p의 해쉬코드 : " + p.hashCode());
			System.out.println("p2의 해쉬코드 : " + p2.hashCode());
		}
		
	}
}
