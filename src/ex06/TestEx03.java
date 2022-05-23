package ex06;

import java.util.Scanner;

// Q1. 직각 이등변 삼각형을 출력하는 부분을 아래 형식의 메서드로 구현하시오 static void triangleLB(int n);
// 또, 왼쪽위, 오른쪽위, 오른쪽 아래가 직각인 메서드도 각각 구현하시오
// Q2. n단의 피라미드를 출력하는 메서드를 작성하세요 static void spira(int n)
// Q3. 숫자 피라미드를 출력하는 메서드를 작성하세요 static void npira(int n)

public class TestEx03 {
	

	static void triangleLB(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 왼쪽 위가 직각임, 첫 for문에선 최대한 찍히고, 갈수록 줄어드는 방향
	static void triangleLU(int n) {
		for(int i=n; i>0;i--) {
			// 위부터 최대한 찍혀야 하기때문에, 입력받은 n부터 for문이 시작하여 줄어드는 형태로 간다
			for(int j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 오른쪽 아래에 직각이 있는 형태, 공백을 출력하여 맞춰야 한다.
	static void triangleRB(int n) {
		for(int i=n; i>0;i--) {
			for(int j=1; j<=n;j++) {
				if(j>=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		// 오른쪽 위에 직각이 있는 형태. 5-x4-xx3-xxx2-xxxx1 순으로 출력되어야한다
		for(int i=0; i<n;i++) {
			for(int j=n-1; j>=0;j--) {
				if(j<n-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	// Q2. n단의 피라미드를 출력하는 메서드를 작성하세요 static void spira(int n)
	
	static void spira(int n) {
		// for 문을 통해 n단이 쌓아지도록, 입력받은 횟수만큼 출력되게 한다.
		int x = (n*2)+1;
		
		for(int i=n; i>0; i--) {
			// 안의 for문을 통해 *과 공백을 조정한다.
			for(int j=0; j<=x;j++) {
				if(j>=i && x-i>j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void npira(int n) {
		// for 문을 통해 n단이 쌓아지도록 하는건 같으나, 각 단을 *이 아닌 숫자가 출력되게한다
		int x = (n*2)+1;
		
		for(int i=n; i>0; i--) {
			
			for(int j=0; j<=x;j++) {
				if(j>=i && x-i>j) {
					System.out.print(n+1-i);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		}while(num<=0);
		
		// triangleRU(num);
		
		//spira(num);
		
		npira(num);
		
		
	}
}
