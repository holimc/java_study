package ex05;
/*
 * Q1. n이 7이면 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28 로 출력하는 프로그램을 작성하시오
 * Q2. 1부터 10까지의 합은 (1+10) * 5 (가우스의 덧셈) 의 방식으로 구할수 있다. 이런 식으로 정수합을 구하는 프로그램을 작성하시오
 * Q3. 정수 a,b를 입력받아 그 사이의 모든 정수 합을 구하여 반환하는 메서드를 작성하시오.
 */

import java.util.Scanner;

public class SumForEx02 {
	static String sumStr(int num) {
		String answer = "";
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
			if(answer=="") {
				answer += i;
			}else {
				answer += " + " + i;
			} 
		}
		answer += " = " + sum;
		return answer;
	}
	
	static int gausSum(int num) {
		int sum = 0;
		if(num%2 == 0) {
			sum = (num + 1) * (num / 2);
		}else if(num%2 == 1) {
			sum = ((num)* ((num-1)/2)) +num ;
		}
		// (num+1) / 2 * num 으로 했을때 결과 값이 이상하게 나왔다.
		// (num+1)/2는 정수형태가 아니므로 int에 들어갈때 소숫점이 짤린다. 그러므로 이상한 값이 나오게 되는 것이다.
		// 그러므로 num/2로 표현해서 정수형이 나오게 한다.
		
		return sum;
	}
	static int gapSum(int a, int b) {
		int sum = 0;
		for(int i=a; i<=b;i++) {
			sum += i;
		}
		
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// System.out.print("정수 n을 입력해주세요 : ");
		// int num = sc.nextInt();
		// System.out.println(sumStr(num));
		// System.out.println(gausSum(num));
		
		System.out.println("정수 a와 b의 사이 값 계산");
		System.out.print("정수 a : ");
		int a = sc.nextInt();
		System.out.print("정수 b : ");
		int b = sc.nextInt();
		System.out.println(gapSum(a,b));

		
		
		
		
		
	}
}
