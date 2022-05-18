package ex02;
/*
 * 추상 클래스인 Machine클래스는 두 추상 메소드, turnOn과 turnOff를 가집니다. 
 * Machine 클래스를 상속받는 Car 클래스를 만들고, Car클래스에 turnOn 메소드와 turnOff 메소드를 구현하세요.
 */
abstract class Machine {
    public abstract void turnOn();
    public abstract void turnOff();
}
class RacingCar extends Machine {

	@Override
	public void turnOn(){
		System.out.println("시동이 걸렸습니다");
	};
	@Override
	public void turnOff() {
		System.out.println("시동이 꺼졌습니다");
	};
	
    
}

public class AbstractCheckTest {
	    public static void main(String[] args) {
	        RacingCar car = new RacingCar();
	        if(Machine.class.isInstance(car)){
	            System.out.println("정답입니다. [제출]을 누르세요.");
	        }
	        else{
	            System.out.println("Car가 Machine을 상속받지 않았습니다.");
	        }
	    }
}
