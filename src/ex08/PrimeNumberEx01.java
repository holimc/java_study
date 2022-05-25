package ex08;

public class PrimeNumberEx01 {
	public static void main(String[] args) {
		int counter = 0;
		for(int n=0; n<= 1000; n++) {
			int i;
			for(i=2; i<n;i++) {
				counter++;
				if(n%i == 0) {
					break;
				}
			}
			if(n==i) {
				System.out.println(n);
			}
		}
		System.out.println("나눗셈을 수행한 횟수 : " +counter);
	}
}
// 해당 방법은 불필요한 나눗셈까지 전부 다 수행하기에, 1부터 1000까지의 소수를 찾기 위해 78022회를 실행한다. 
