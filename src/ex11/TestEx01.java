package ex11;

// Q1. 재귀 메서드를 사용하지 않고 factorial 메서드를 작성하시오
// Q2. 재귀 메서드를 사용하지 않고 gcd(유클리드 호제법 최대공약수) 메서드를 작성하세요
// Q3. 배열 a의 모든 요소의 최대 공약수를 구하는 다음 메서드를 작성하세요

public class TestEx01 {
	static int factorial(int n){
		int answer = 1;
		while(n>0) {
			answer *= n;
			n--;
		}
		return answer;
	}
	
	static int gcd(int x, int y) {
		while(y==0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
	
	static int gcdArray(int a[], int start, int no) {
		if (no == 1)
			return a[start];
		else if (no == 2)
			return gcd(a[start], a[start + 1]);
		else
			return gcd(a[start], gcdArray(a, start + 1, no - 1));
	}
	
	
	public static void main(String[] args) {
		System.out.println(factorial(10));
		System.out.println(gcd(5,10));
	}
}
