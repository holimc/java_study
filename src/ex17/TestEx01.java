package ex17;

import java.util.Scanner;

/*
 * Programmers 1단계
 * 이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다. 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
 * 입력 5 3 
 */

public class TestEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		// 가로
		int b = sc.nextInt();
		// 세로
		
		for(int i=0; i<b;i++) {
			for(int j=0; j<a;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
