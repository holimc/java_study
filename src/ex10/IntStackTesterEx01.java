package ex10;

import java.util.Scanner;

public class IntStackTesterEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStackEx01 is = new IntStackEx01(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : " + is.size() + " / " + is.capacity());
			System.out.println("(1) 푸시   (2) 팝   (3) 피크  (4) 덤프   (5) 검색"
					+ " (6) 클리어 (7) 스택의 용량 (8) 쌓여있는 데이터 수  (0) 종료");
			
			int menu = sc.nextInt();
			if(menu==0) break;
			
			int x;
			switch(menu) {
			case 1: 
				System.out.print("데이터 : ");
				x = sc.nextInt();
				try {
					is.push(x);
				}catch(IntStackEx01.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x = is.pop();
					System.out.println("팝 한 데이터는 " + x + " 입니다.");
				}catch(IntStackEx01.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 3:
				try {
					x = is.peek();
					System.out.println("피크 한 데이터는 " + x + " 입니다.");
				}catch(IntStackEx01.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 4:
				is.dump();
				break;
			case 5: 
				System.out.print("검색할 데이터 : ");
				x = sc.nextInt();
				try {
					if(is.indexOf(x)>=0) {
						System.out.println("해당 데이터는 " + is.indexOf(x)+"에 위치해있습니다.");
					}else {
						System.out.println("해당 데이터는 존재하지 않습니다.");
					}
				}catch(IntStackEx01.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
				
			case 6:
				is.clear();
				System.out.println("스택의 데이터가 삭제되었습니다");
				break;
				
			case 7:
				System.out.println("현재 스택의 최대 용량은 "+is.capacity()+"입니다.");
				break;
				
			case 8:
				System.out.println("현재 스택에 차있는 데이터의 양은 "+is.size()+"입니다.");
				break;
			}
		}
		
	}
	
}

