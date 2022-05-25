package ex08;

import java.util.Scanner;


// Q1. 서기 년월일을 필드로 갖는 클래스를 만드세요
// 다음과 같이 생성자와 메서드를 정의해야합니다
// 생성자(주어진날짜로 설정) YMD(int y, int m, int d)
// n일 뒤의 날짜를 반환 YMD after(int n)
// n일 전의 날짜를 반환 YMD before(int n)
public class TestEx04 {
	static class YMD{
		int y;
		int m;
		int d;
		
		static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, 
				{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, 
		};


		static int isLeap(int year) {
			return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
		}
		
		YMD(int y, int m, int d){
			this.y = y;
			this.m = m;
			this.d = d;
		}
		
		YMD after(int n){
			YMD temp = new YMD(this.y, this.m, this.d);
			// 생성자를 통해 입력받은 날자로 새로운 YMD를 만들어 temp에 대입한다.
			if(n<0) {
				return (before(-n));
			}
			// 만약, 음수가 들어왔을 경우 before <-> after의 값을 바꾼다.
			
			temp.d += n;
			// n일 뒤를 계산하기 위해 먼저 더한다.
			
			while(temp.d > mdays[isLeap(temp.y)][temp.m-1]) {
				// 기준일에서 n일이 더해진 값이 해당 달의 일수보다 작아질때까지 반복한다 (크면 while문이 계속 동작) 
				temp.d -= mdays[isLeap(temp.y)][temp.m-1];
				// 해당 달의 일수만큼 뺀다. 80일 뒤고 현재 달의 일수가 30일이면 50이되고, 다시 while의 조건문이 성립하므로 또 진행
				if(++temp.m>12) {
					temp.y++;
					temp.m = 1;
				}
				// 만약, 12월이 초과된다면 년이 바뀌고 1월로 m이 바뀐다.
				// 또한 해당 시점에서 ++temp.m을 통해 날짜가 1개월씩 더해진다.
			}
			
			return temp;
		}
		YMD before(int n) {
			YMD temp = new YMD(this.y, this.m, this.d);
			if(n<0) {
				return(after(-n));
			}
			// 음수가 들어가면 after와 바뀌어 작동.
			
			temp.d -= n;
			// n일 앞을 계산하기 위해 먼저 뺀다.
			
			while(temp.d<1) {
				//1보다 커질때까지 계속해서 반복된다.
				if(--temp.m<1) {
					temp.y--;
					temp.m = 12;
				}
				// 이전 날짜를 계산하기 위해 temp.m을 전위연산해서 1 감소시킨다.
				// 만일, 0이하로 내려간다면 y를 바꾼다.
				temp.d += mdays[isLeap(temp.y)][temp.m -1];
				// 음수값일 temp.d를 1개월치의 일수만큼씩 계속 더한다 (조건문에서 선언한 것 처럼 양수가 될 때까지)
			}
			return temp;
			
		}
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("날짜를 입력하세요.\n");
		System.out.print("년：");
		int y = stdIn.nextInt();
		System.out.print("월：");
		int m = stdIn.nextInt();
		System.out.print("일：");
		int d = stdIn.nextInt();
		YMD date = new YMD(y, m, d);

		System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
		int n = stdIn.nextInt();

		YMD d1 = date.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.y, d1.m, d1.d);

		YMD d2 = date.before(n);
		System.out.printf("%d일 앞의 날짜는 %d년 %d월 %d일입니다.\n", n, d2.y, d2.m, d2.d);
	}
	
}
