package ex06;
// Q1. 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 출력하는 프로그램을 작성하세요.
// Q2. 곱셈이 아니라 덧셈을 출력하는 프로그램을 작성하세요
// Q3. 입력한 수를 한 변으로 하는 정사각형을 *로 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

public class TestEx02 {
	static void multiTable() {
		System.out.print("   | ");
		for(int x=1; x<10; x++) {
			System.out.print(" "+x+" ");
		}
		System.out.println();
		System.out.println("---+----------------------------");
		
		for(int i=1; i<10; i++) {
			System.out.printf("%2d |", i);
			for(int j=1; j<10;j++) {
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
	}
	static void sumTable() {
		System.out.print("   | ");
		for(int x=1; x<10; x++) {
			System.out.print(" "+x+" ");
		}
		System.out.println();
		System.out.println("---+----------------------------");
		
		for(int i=1; i<10; i++) {
			System.out.printf("%2d |", i);
			for(int j=1; j<10;j++) {
				System.out.printf("%3d", i+j);
			}
			System.out.println();
		}
	}
	// Q3. 입력한 수를 한 변으로 하는 정사각형을 *로 출력하는 프로그램을 작성하세요.
	
	static void square() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("양의 정수를 입력해주세요 :");
			num = sc.nextInt();
		}while(num<=0);
		
		
		for(int i=0; i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//multiTable();
		//sumTable();
		square();
	}

}
