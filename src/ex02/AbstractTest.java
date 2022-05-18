package ex02;

abstract class AbAnimal{
	abstract void speak();
	void listen() {
		System.out.println("듣다");
	}
}

public class AbstractTest extends AbAnimal {
	
	@Override
	void speak(){
		System.out.println("말하다");
	}
	
	public static void main(String[] args) {
		AbstractTest at = new AbstractTest();
		at.speak();
		at.listen();
		
	}
	

}
