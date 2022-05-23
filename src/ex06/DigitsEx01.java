package ex06;

import java.util.Scanner;

public class DigitsEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("두자리의 정수를 입력하세요.");
		
		do {
			System.out.print("정수 입력 : ");
			n = sc.nextInt();
		}while(n<10 || n>99);
		//do-while 문을 쓰는건 같으나, while문 안의 조건문을 논리연산자를 이용한 조건을 사용해보았다
		//
		System.out.println("변수 n의 값은 " +n+"입니다.");
	}
}
