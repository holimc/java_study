package ex02;

public class InterfaceTest03 implements InterfaceTest01, InterfaceTest02 {
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("A회사 메서드는 turnOn");
	}
	
	@Override
	public void lightOn() {
		// TODO Auto-generated method stub
		System.out.println("B회사 메서드는 lightOn");
	}
	
	public static void main(String[] args) {
		InterfaceTest03 it = new InterfaceTest03();
		it.turnOn();
		it.lightOn();
	}
}
