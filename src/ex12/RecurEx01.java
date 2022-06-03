package ex12;

import java.util.Scanner;

public class RecurEx01 {
	static void recur(int n) {
		if(n>0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	/*
	 * recur에 4를 입력하면
	 * 							recur(3);			4					recur(2);
	 * 			   					↓								   		↓
	 * 					recur(2)	3	recur(1) 	   		   recur(1);	2	recur(0)
	 * 					   ↓			   ↓			      	  ↓			
	 * 		recur(1) 2 recur(0)	  recur(0) 1 recur(-1)	 recur(0) 1 recur(-1)
	 * 		   ↓
	 * 	recur(0) 1 recur(-1)
	 * 
	 * recur(0), recur(-1)은 실행이 안되므로 왼쪽 아래부터 1 - 2 - 3 - 1 - 4 -1 - 2 이 출력된다.
	 * 이처럼 가장 위쪽의 메서드 호출부터 시작해 계단식으로 조사하는것이 하향식 분석이다. 
	 */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
		recur(x);
		
	}
}
