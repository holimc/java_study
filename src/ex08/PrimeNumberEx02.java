package ex08;

public class PrimeNumberEx02 {
	public static void main(String[] args) {
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];
		// 소수를 저장할 배열
		
		prime[ptr++] = 2;
		// 2는 짝수중에서 소수이므로, 배열의 첫 칸에 넣는다.
		
		for(int n=3; n<=1000; n+=2) {
			// 2를 제외한 소수는 전부 홀수이므로,n은 3에서 시작해서 2씩 더해서 홀수만을 for문에 실행한다. 
			int i=0;
			for(i=1; i<ptr;i++) {
				counter++;
				if(n%prime[i]==0) {
					break;
				}
			}
			// Ex01에선 for문을 n까지 i++로 수행하여 나눗셈을 수없이 반복했지만, 여기선 이미 찾은 소수로 나눌수 있으면 소수가 아니기 때문에, 찾은 소수로만 나눠본다.
			//나눠지면 for문을 다 안돌리고 중간에 break하여 연산 횟수를 줄인다.
			if(ptr==i) {
				prime[ptr++] = n;
			}
			// n이 나눠지지 않은채로 연산이 끝나면 소수이므로 배열에 저장후 ptr의 수치를 올리고 다시 for문이 반복된다.
		}
		
		for(int i=0; i<ptr;i++) {
			System.out.println(prime[i]);
		}
		System.out.println("나눗셈을 실행한 횟수 : " + counter);
	}
}
//해당 방법은 Ex01에서 한것에서 몇가지의 방식을 더해서 14622회로 연산 횟수가 감소했다.
