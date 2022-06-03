package ex12;

import java.util.Scanner;

// 하노이의 탑
// 하노이의 탑은 원반을 그룹으로 끊어서 생각한다면, 원반 4개를 옮기는 과정은
// 원반4 + (원반1,2,3) 을 옮기는 과정이며
// 원반(1,2,3)은 원반 3 + 원반(1,2) 를 옮기는 과정이고
// 마지막으로 원반(1,2)는 원반 2 + 원반 1을 옮기는 과정이다
// 즉, ①시작기둥에서 그룹을 중간기둥으로 옮기고 ②맨 아래 원반을 목표 기둥으로 옮기고 ③그룹을 목표기둥으로
// 하는 과정을 반복하여 알고리즘을 만들 수 있다.

public class HanoiEx01 {
	static void move(int no, int x, int y) {
		if(no>1) {
			move(no-1,x,6-x-y);
		}
		System.out.println("원반["+no+"]를 "+ x+"기둥에서 " + y + "기둥으로 옮김");
		if(no>1) {
			move(no-1,6-x-y,y);
		}
		// 기둥 번호의 합은 1+2+3으로 6이므로, 어느 상황이던 중간 기둥의 역할을 할 수 있는 기둥은 6-x-y로 구해질 수 있다.ㅋ 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("** 하노이의 탑 **");
		System.out.print("원반의 갯수 : ");
		int n = sc.nextInt();
		
		move(n,1,3);
		// 1번기둥에서 시작하는 n개의 원반을 3번 기둥으로 옮긴다.
	}
}
