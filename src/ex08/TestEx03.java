package ex08;
import java.util.Scanner;

// Q1. 메서드 dayOfYear를 i와 days없이 while문으로 구현하시오
// Q2. 그해의 남은 일수를 구하는 메서드 leftDayOfYear를 구현하시오.

public class TestEx03 {
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31}
	};
	
	static int isLeap(int year) {
		return (year%4 == 0 && year%100 !=0 || year % 400 == 0) ? 1 : 0;
	}
	// 윤년 판별 메서드
	
	static int dayOfYear(int y, int m, int d) {
		// 기존 for문에서는 days로 현재 일수를 입력받은뒤, for문에서 현재 달보다 이전달들의 날짜를 합쳐서 일수를 구했다.
		while(--m!=0) {
			d += mdays[isLeap(y)][m-1];
		}
		return d;
	}
	static int leftDayOfYear(int y, int m,int d) {
		// 입력된 달 m의 일수에서 입력된 일 d를 빼고, m 뒤의 남은 달의 일수를 더해서 만든다.
		int days = mdays[isLeap(y)][m-1] - d;
		for(int i=m; i<mdays[isLeap(y)].length;i++) {
			days += mdays[isLeap(y)][i];
		}
		return days;
		
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			System.out.print("년 : ");
			int year = sc.nextInt();
			System.out.print("월 : ");
			int month = sc.nextInt();
			System.out.print("일 : ");
			int day = sc.nextInt();
			
			System.out.printf("그해 %d일째 입니다 \n", dayOfYear(year, month, day));
			System.out.printf("그해의 남은 날짜는 %d일 입니다 \n", leftDayOfYear(year, month, day));
			System.out.print("한번 더 할까요? 1.예 / 0. 아니오 : ");
			retry = sc.nextInt();
			
		}while(retry == 1);
		
		
	}
}