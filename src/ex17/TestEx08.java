package ex17;

/*
 * 하샤드 수
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 */

public class TestEx08 {
	public static boolean solution(int x) {
		boolean answer = true;
		int sum = 0;
		int num = x;
		while(num!=0) {
			sum += num%10;
			num /= 10;
		}
		
		if(x%sum==0) {
			answer = true;
		}else {
			answer = false;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int num = (int)(Math.random()*100);
		
		System.out.println("숫자 : " + num);
		
		System.out.println(solution(num) ? "하샤드 수입니다." : "하샤드수가 아닙니다." );
	}
}
