package ex06;

import java.util.Scanner;

public class TriangleLBEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다");
		do {
			System.out.print("몇단 삼각형을 만드실 건가요? : ");
			n = sc.nextInt();
		}while(n<=0);
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
