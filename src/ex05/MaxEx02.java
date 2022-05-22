package ex05;

// Q1. 네개의 최대 값을 구하는 max4 메서드를 작성하세요
// Q2. 세 값의 최솟값을 구하는 min3 메서드를 작성하세요
// Q3. 네 값의 최솟값을 구하는 min4 메서드를 작성하세요.

public class MaxEx02 {
	static int max4(int a, int b, int c, int d) {
		int max = 0;
		max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		
		return max;
		
	}
	static int min3(int a, int b, int c) {
		int min = 0;
		min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		
		return min;
	}

	static int min4(int a, int b, int c, int d) {
		int min = 0;
		min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		if(d < min) {
			min = d;		
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("max4(1,2,10,20) : " + max4(1,2,10,20));
		System.out.println("min3(1,2,10) : " + min3(1,2,10));
		System.out.println("min4(1,2,10,20) : " + min4(1,2,10,20));
	}
}
