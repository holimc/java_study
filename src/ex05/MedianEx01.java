package ex05;
// 3개의 정수값을 입력하고 그 중 중앙값을 구한다음 출력한다

import java.util.Scanner;

public class MedianEx01 {
	static int med3(int a, int b, int c) {
		if(a >=b) {
			if(b>=c) {
				return b;
			}else if(a<=c) {
				return a;
			}else {
				return c;
			}
		}else if(a>c) {
			return a;
		}else if(b>c) {
			return c;
		}else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수의 중앙 값을 구합니다.");
		System.out.print("첫번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int b = sc.nextInt();
		System.out.print("세번째 정수 : ");
		int c = sc.nextInt();
		
		System.out.println("중앙값은 "+med3(a,b,c));
	}

}
