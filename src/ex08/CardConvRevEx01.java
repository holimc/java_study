package ex08;

import java.util.Scanner;

public class CardConvRevEx01 {
	static int cardConvR(int x, int r, char[] d) {
		// x = 입력한 10진수, r = 변환하고싶은 진법
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// 2~36 진수를 입력할때 쓸 문자열
		
		do {
			d[digits++] = dchar.charAt(x%r);
			x /= r;
		}while(x != 0);
		
		
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
			for(int i= dno-1; i>=0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다");
			
			System.out.println("한번더 할까요? 1.예/0.아니오 : ");
			retry = sc.nextInt();
			
		}while(retry == 1);
	}
}
