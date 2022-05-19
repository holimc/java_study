package ex03;

import java.util.Scanner;

public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			int a,b;
			sc = new Scanner(System.in);
			System.out.println("입력 받은 두 수를 나눕니다");
			System.out.print("첫번째 숫자 :");
			a = sc.nextInt();
			System.out.print("두번째 숫자 :");
			b = sc.nextInt();
			System.out.println(a + " / " + b + " = " + (a/b));
			
			
		}catch (ArithmeticException e) {
			System.out.println("계산 예외");
			System.err.println(e.getMessage());
		}catch(Exception e){
			System.out.println("포맷 에러");
		}finally {
			System.out.println("실행 종료");
			sc.close();
		}
	}
}
