package ex06;
// Q1. 두 변수 a,b에 정수를 입력하고 b - a 를 출력하는 프로그램을 작성하시오. 단, b가 a보다 작으면 b의 값을 다시 입력하게 하세요
// Q2. 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요. 135를 입력하면 그 수는 3자리 입니다 하고 출력.

import java.util.Scanner;

public class TestEx01 {
	static int numSub(int a, int b) {
		int answer = 0;
		if(b>a) {
			answer = (b - a);
		}	
		return answer;
	}
	
	
	static int digitNum(int num) {
		// 자릿수를 구해야함
		// 10으로 나눠서 몫이 존재할때마다 count에 하나씩 더한다
		// 135(count = 1) -> 13(count = 2) -> 1 (count=3) -> 10으로 나눌수 없으므로 3자리수.
		
		// 먼저, main에서 양의 정수를 확인하고 보내므로 최초 카운트는 1(한자릿수) 로 시작한다.
		int count = 1;
		
		do {
			num /= 10;
			count++;
		}while(num>=10);
		
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 두개를 입력받아 b - a 의 값을 구합니다 ");
//		int a,b;
//		System.out.print("숫자 a : ");
//		a = sc.nextInt();
//		System.out.print("숫자 b : ");
//		b = sc.nextInt();
//		while(a>=b) {
//			System.out.println("b의 값을 a보다 큰 값을 입력해주세요.");
//			b = sc.nextInt();
//		}
//		System.out.println("결과 값 : "+numSub(a,b));
		int c = 0;
		do {
			System.out.println("양의 정수를 입력해주세요.");
			System.out.print("입력한 수 : ");
			c = sc.nextInt();
		}while(c<=0);
		
		System.out.println("입력한 숫자는 "+digitNum(c)+"자리 입니다.");
		
		
		
		
	}
}
