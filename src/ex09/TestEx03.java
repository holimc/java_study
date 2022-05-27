package ex09;
// 이진 검색 알고리즘은 검색할 값과 같은 값을 갖는 요소가 하나 이상일 경우 그 요소중에서 맨 앞의 요소를 찾지 못한다.
// 예를 들어 {1,3,5,7,7,7,7,8,8,9,9}의 배열에서 7을 검색하면 중앙에 위치하는 a[5]를 검색하고 끝난다.
// 맨 앞의 요소를 찾는 binSearchX 메서드를 작성하시오.

import java.util.Scanner;

public class TestEx03 {
	static int binSearchX(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		do {
			int pc = (pl+pr)/2;
			if(a[pc]==key) {
				// 이 경우에서 찾은 값에서 더 앞의 요소가 있는지 확인해야하는것 같다.
				do {
					if(a[pc-1]<key) {
						break;
					}
					pc--;
				}while(pc>pl);
				// do~while을 통해서 구현
				// pc가 계속해서 줄어들면서 이전칸을 비교하고, 이전칸보다 작아졌다면 break를 통해 종료한다.
				
				return pc;
			}else if(a[pc]<key) {
				pl = pc+1;
			}else {
				pr = pc-1;
			}
		}while(pl<=pr);
		
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

		int idx = binSearchX(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소는 없습니다.");
		}else {
			System.out.println(ky+"는 x["+idx+"]에 있습니다.");
		}
		
	}
}
