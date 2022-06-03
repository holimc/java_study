package ex12;
import java.util.Scanner;
import ex10.IntStackEx01;

// recur의 비 재귀적 표현(stack 형태를 이용한)
public class RecurEx02 {
	static void recur3(int n) {
		IntStackEx01 s = new IntStackEx01(n);
		
		 while(true) {
			 if(n>0) {
				 s.push(n);
				 n = n - 1;
				 continue;
			 }
			 // 1번 if문 : n의 값을 푸쉬해서 넣는다.
			 // recur의 값이 0보다 같거나 작아질때 까지 계속해서 recur 메서드를 n값이 1씩 줄어들며 진행한다. 
			 // 이후, recur가 0보다 같거나 작을때 (한쪽 끝에 갔을 경우) if문의 조건에서 벗어나게 되어 2번 if문이 실행
			 if(s.isEmpty() != true) {
				 n = s.pop();
				 System.out.println(n);
				 n = n-2;
				 continue;
			 }
			 // 2번 if문 : 스택이 비어있지 않다면 저장하고 있던 값을 pop으로 출력.
			 // 1번 if문의 조건에서 벗어나면,pop하며 하나씩 저장후 다시 출력 가능한 recur문이 있을때까지 하게된다. 
			 break;
		 }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int x = sc.nextInt();
		
		recur3(x);
	}
}
