package ex09;

import java.util.Scanner;

public class BinSearchEx01 {
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		// 검색 범위의 시작값
		int pr = n-1;
		// 검색 범위의 끝값
		
		do {
			int pc = (pl+pr)/2;
			// 검색 범위의 중간 값
			if(a[pc]==key) {
				// 중간값이 검색하려는 값과 같은 경우 검색완료이므로 종료
				return pc;
			}else if(a[pc]<key) {
				pl = pc+1;
				// 중간값이 키값보다 작으므로, 검색 범위의 시작값을 pc+1로 바꿔서 범위 축소 후 다시 루프
			}else {
				pr = pc-1;
				// 중간값이 키값보다 크므로, 검색 범위의 끝값을 pc-1로 바꿔서 범위 축소 후 루프
			}
		}while(pl<=pr);
		// 검색이 실패하는 경우, pl과 pr이 범위를 벗어나게되어 pl>pr 이 된다. 즉, 검색할 수가 없는경우 while문을 벗어나게되어 -1을 리턴
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num;i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = sc.nextInt();
			}while(x[i]<x[i-1]);
		}
		
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		int idx = binSearch(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소는 없습니다.");
		}else {
			System.out.println(ky+"는 x["+idx+"]에 있습니다.");
		}
		
	}
}
