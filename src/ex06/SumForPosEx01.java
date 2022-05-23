package ex06;

import java.util.Scanner;

// 양수만 입력하게 한다
public class SumForPosEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("1부터 n까지 양수의 합을 구합니다");
		
		do {
			System.out.println("n의 값 : ");
			n = sc.nextInt();
		}while(n<=0);
		
		int sum = 0;
		
		for(int i=1; i<=n;i++)
			sum += i;
		System.out.println("합 = "+sum);
	}
}
