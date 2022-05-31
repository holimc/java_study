package ex11;

import java.util.Scanner;

public class FactorialEx01 {
	static int factorial(int n) {
		if(n>0) {
			return n * factorial(n-1);
		}else {
			return 1;
		}
	}
	// 재귀 메서드 factorial이다. 
	// n이 1보다 크면 계속 값을 1 줄여가면서 무한히 호출하여 반복된다
	// 3을 입력했다고 치면, 3을 전달받았기때문에 3*factorial(2)를 전달 -> factorial 2를 호출했으므로 메서드 동작 -> 다시 2 * factorial(1)을 전달 
	// 이러한 메서드 호출 방식을 재귀 호출이라 한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int x = sc.nextInt();
		
		System.out.println(x+"의 팩토리얼은 "+factorial(x)+"입니다.");
	}
}
