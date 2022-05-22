package ex05;

import java.util.Scanner;

public class SumForEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=0; i<=n; i++) {
			sum += i;
		}
		System.out.println(n+"까지의 합 : " + sum);
	}
}
