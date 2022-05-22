package ex05;

import java.util.Scanner;

public class SumWhileEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 숫자를 합칩니다.");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		while (i<=n) {
			sum += i;
			i++;
		}
		System.out.println("1부터 n까지의 합은 : " + sum);
		System.out.println("마지막 i의 값은 : " + i);
		// i가 11일때 마지막으로 sum에 가산되고, i는 이후 증가한다음 while문의 조건식에 걸리기 때문에 i의 값은 11이 아닌 +1된 12이다.
	}
	
}
