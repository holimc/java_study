package ex08;

public class PrimeNumberEx03 {
	public static void main(String[] args) {
		int counter = 0;
		int ptr = 0;
		int[] prime = new int [500];
		
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		// 이 방법은, 약수를 구하는 방식과 흡사하다.
		// n의 제곱근 이하의 어떤 소수로도 나눠지지 않는다면 해당 수는 소수라고 판단할 수 있다 라는 근거를 기반하여 실행한다.
		// 이 과정에서 2,3은 처음에 제외한뒤 for문을 실행한다.
		
		
		for(int n=5; n<= 1000; n+=2) {
			boolean flag = false;
			for(int i=1; prime[i]*prime[i]<=n; i++) {
				counter+=2;
				// 제곱근을 활용하는 방식으로, 현재 구해진 소수의 제곱을 이용해 찾는다.
				if(n%prime[i] == 0) {
					flag = true;
					break;
				}
				// 나누어지면 소수가 아니므로 반복 불필요.
			}
			if(!flag) {
				prime[ptr++] = n;
				counter++;
			}
			// flag가 false상태로 반환 = 반복문 끝까지 나누어 떨어지지 않음 = 소수이므로 배열에 저장.
		}
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("곱셈과 나눗셈을 실행한 횟수 : " + counter);
	}

}
// PrimeNumber Ex01,02,03을 보면 같은 소수를 구하는 방식이여도, 방법에 따라 연산 횟수를 줄이고 동작속도를 올릴 수 있다는 것을 알 수 있다.
