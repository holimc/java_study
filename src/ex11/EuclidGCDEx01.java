package ex11;

import java.util.Scanner;

public class EuclidGCDEx01 {
	static int gcd(int x, int y) {
		if(y==0) {
			return x;
		}else {
			return gcd(y , x % y);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수의 최대 공약수를 구합니다.");
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int x = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int y = sc.nextInt();
		
		System.out.println("최대 공약수 : " + gcd(x,y));
	}
}
