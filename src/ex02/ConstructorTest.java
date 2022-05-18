package ex02;
/*
Car 클래스에는 문자열과 정수를 입력받아 필드 name와 number를 초기화하는 생성자가 있습니다. 주어진 생성자를 이용해, 나머지 두 생성자를 구현해보세요.
매개변수를 받지 않는 생성자: name은 "이름없음", number는 0으로 초기화 합니다.
매개변수로 String을 받는 생성자: 매개변수로 name을 초기화하고, number는 0으로 초기화 합니다.
 */

public class ConstructorTest {
	public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.name + " " + car1.number);
        Car car2 = new Car("자동차");
        System.out.println(car2.name + " " + car2.number);
        Car car3 = new Car("자동차", 1234);
        System.out.println(car3.name + " " + car3.number);
    }

}

class Car {
    String name;
    int number;
    Car(){
    	this("이름없음", 0);
    }
    Car(String name){
    	this.name = name;
    }

    Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
}