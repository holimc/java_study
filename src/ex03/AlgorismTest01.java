package ex03;
// 자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

import java.util.ArrayList;
import java.util.Scanner;

public class AlgorismTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int answer;
		AlgorismTest01 ts = new AlgorismTest01();
		try {
			System.out.println("입력 받은 자연수의 약수를 모두 더한 값을 리턴하는 프로그램입니다.");
			System.out.print("입력한 자연수 : ");
			a = sc.nextInt();
			
			if(a<=0) {
				throw new Exception("자연수를 입력해주세요");
			}else {
				answer = ts.measure(a);
				System.out.println("합계는 " + answer + "입니다.");
			}
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
	}
	public int measure(int num) {
		int sum = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		// 약수를 담을 arr 생성
		for(int i=1; i<=(int)Math.sqrt(num); i++) {
			// 큰 숫자가 들어오면 처리 속도가 느려지므로 Math의 sqrt를 사용하여 제곱근을 구하고, 제곱근만큼 반복한다.
			if(num%i == 0) {
				arr.add(i);
				// num의 제곱근 까지의 약수를 구한다 (작은 약수)
				
				if(num/i != i) {
					arr.add(num/i);
					// 약수끼리의 곱으로도 다른 약수를 구할수 있는것 처럼,약수로 나누어서 다른 약수(큰약수) 를 구한다.
				}
			}
		}
		// 약수 구하기 끝
		for(int i=0; i<arr.size(); i++) {
			sum += arr.get(i);
		}
		System.out.println(arr);
		
		return sum;
	}

}
