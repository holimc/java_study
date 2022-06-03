package ex12;

import java.util.Scanner;

public class TestEx01 {
	static void recur2(int n) {
		if(n>0) {
			recur2(n-2);
			System.out.println(n);
			recur2(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
		recur2(x);
	}
}
// Q1. 위의 메서드를 상향식, 하향식으로 분석하시오

/*
 *	하향식 : 
 *								recur(2)			4				recur(3)
 *								   ↓ 								   ↓
 *		    			recur(0)   2   recur(1)		  		   recur(1)       3       recur(2)
 *		   	    						 ↓					      ↓				         ↓		
 *						   	   recur(-1) 1 recur(0)     recur(-1) 1 recur(0)    recur(0) 2 recur(1)
 *																				              ↓
 *																				    recur(-1) 1 recur(0)
 *  -> 2 , 1, 4, 1, 3, 2, 1 순으로 실행된다.
 *  
 *   
 *  상향식 : 
 *  recur(1) -> recur(-1), 1, recur(0) 이므로 1만 출력
 *  recur(2) -> recur(0), 2, recur(1) 이므로 2와 recur(1) 출력
 *  recur(3) -> recur(1), 3, recur(2) 이므로 recur(1), 3, recur(2) 출력
 *  recur(4) -> recur(2), 4, recur(3) 이므로 recur(2), 4, recur(2) 출력
 *  
 *  ->  
 */
