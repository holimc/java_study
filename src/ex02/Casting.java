package ex02;

class Vehicle{
	void move() {
		System.out.println("움직입니다");
	}
}
class Airplane extends Vehicle{
	void fly() {
		System.out.println("날다");
	}
}
class Bus extends Vehicle{
	void drive() {
		System.out.println("달리다");
	}
}

public class Casting {
	public static void main(String[] args) {
		moveVehicle(new Airplane());
		moveVehicle(new Bus());
		// 객체를 생성하고, 자동으로 업캐스팅되어 전달된다
	}
	static void moveVehicle(Vehicle vehicle) {
		if(vehicle instanceof Airplane) {
			Airplane ap = (Airplane) vehicle;
			ap.fly();
		}else if(vehicle instanceof Bus) {
			Bus bs = (Bus) vehicle;
			bs.drive();
		}
		// Vehicle 타입을 다운캐스팅하여 사용
		// instanceof는 객체의 타입을 비교하기 위해 사용한다. 같은 타입이면 true, 다르면 false를 반환
	}
}
