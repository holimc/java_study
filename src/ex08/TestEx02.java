package ex08;
// Q1. 배열의 앞쪽에 아랫자리가 아니라 윗자리를 넣어두는 메서드를 작성하세요

import java.util.Scanner;

public class TestEx02 {
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			d[digits++] = dchar.charAt(x%r);
			x /= r;
		}while(x != 0);
		
		// 59를 2진수로 변환시킨다고 치면 현재 배열에는 1 1 0 1 1 1 의 형태로 들어가있고
		// main에서 for문으로 호출할때는 digits 부터 역순으로 내려간다.
		// 이를 배열을 만들고 역순 정렬하거나, 처음부터 배열에 저장하지 않고 다른타입으로 보관했다가 배열에 저장을 하면 될것 같다.
		
		for(int i=0; i<d.length; i++) {
			char temp = d[i];
			d[i] = d[d.length -1 - i];
			d[d.length -1 - i] = temp;
		}
		return digits;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		// 변환하려는 정수
		int cd;
		// 기수
		int dno;
		// 변환후의 자리수
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10진수 기수변환");
		do {
			do {
				System.out.print("변환하려는 양의 정수 : ");
				no = sc.nextInt();
			}while(no<=0);
			do {
				System.out.print("어떤 진수로 변환할가요? (2~36) : ");
				cd = sc.nextInt();
			}while(cd<2 || cd>36);
			dno = cardConvR(no, cd, cno);
			System.out.print(cd + "진수로는 ");
			for(int i=0; i<dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다");
			
			System.out.println("한번더 할까요? 1.예/0.아니오 : ");
			retry = sc.nextInt();
			
		}while(retry == 1);
	}
}
