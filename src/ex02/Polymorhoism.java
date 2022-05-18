package ex02;

import java.util.Scanner;

class Animal{
	public void move() {
		System.out.println("동물들아 움직여라!");
	}
}
class Bird extends Animal{
	private String name = "새";
	public void move() {
		System.out.println(name + "야 날아라!");
	}
}
class Fish extends Animal{
	private String name = "물고기";
	public void move() {
		System.out.println(name + "야 헤엄쳐라!");
	}
}
class Cheetah extends Animal{
	private String name = "치타";
	public void move() {
		System.out.println(name + "야 달려라!");
	}
}

public class Polymorhoism {
	static Animal[] animal;
	public static void createAnimal(int num) {
		animal = new Animal[num];
		for(int i=0; i<animal.length; i++) {
			if(i%3==0) {
				animal[i] = new Bird();
			}else if(i%3==1) {
				animal[i] = new Fish();
			}else {
				animal[i] = new Cheetah();
			}
		}
		System.out.println(num + "마리의 동물이 생성되었습니다.");
		
	}
	public static void moveAnimal() {
		System.out.println(animal.length + "마리의 동물이 이동합니다.");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<animal.length;i++) {
			animal[i].move();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 동물의 수를 입력해주세요.");
		int animalNum = sc.nextInt();
		
		createAnimal(animalNum);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		moveAnimal();
		
		
	}
	
}
