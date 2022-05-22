package ex05;
// Q1. 세 값의 대소 관계 여러 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요
/*
 * Q2. 중앙 값을 구하는 메서드는 다음과 같이 작성할 수 도 있다.
 * 		static int med(int a, int b, int c){
 * 			if((b>=a && c<= a) || (b<=a && c>=a)){
 * 				return a;
 * 			}else if((a>b && c<b) || (a < b && c > b)){
 * 				return b;
 * 			}else{
 * 				return c;
 * 			}
 * 		} 
 * 		그러나 실습에서의 med3 메서드에 비해 효율이 떨어지는 이유는 무엇인가?
 * A : med3 메서드는 else if, else를 활용하여 같은 연산을 반복하지 않으나, 첫번째 if문에서 계산한 경우를 이어지는 else if에서 반복하다 싶이 하므로 계산 식이 두번 반복되어 불편하다
 */

public class MedianEx02 {
	static int med(int x, int y, int z) {
		if(x>y) {
			// 첫번째 수가 두번째 수보다 큰 경우
			if(y>z) {
				// 두번째수 y가 z보다 크면 y가 중간값이된다.
				return y;
			}else if(x <= z) {
				// 세번째 수 z가 x보다 크면, x가 중간값이된다.
				return x;
			}else {
				// y가 z보다 작고, x가 z보다 큰 경우이므로, z가 중간 값이 된다.
				return z;
			}
		}else if(x>z) {
			// 첫 if를 통해 x가 y보다 작은상태이므로, z보다 x가 크면 중간값은 x가 된다. 이하 비슷한 맥락
			return x;
		}else if(y>z) {
			return z;
		}else {
			return y;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("med(3,2,1) : " + med(3,2,1));
		System.out.println("med(3,3,2) : " + med(3,3,2));
		System.out.println("med(1,5,10) : " + med(1,5,10));
		System.out.println("med(1,2,3) : " + med(1,2,3));
		System.out.println("med(3,3,3) : " + med(3,3,3));
		System.out.println("med(2,3,2) : " + med(2,3,2));
		System.out.println("med(2,3,3) : " + med(2,3,3));
	}
	
	
	
	
	
	
	
	
}
