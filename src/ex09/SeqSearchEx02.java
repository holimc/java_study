package ex09;

import java.util.Scanner;

public class SeqSearchEx02 {
	static int seqSearch(int[] a, int n, int key) {
		for(int i=0; i<n; i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
	// Ex01의 메서드를 for문으로 구현.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1 ) {
			System.out.println("그 값은 없습니다.");
		}else {
			System.out.println(ky+"는 x["+idx+"]에 있습니다.");
		}
		
		
	}
}
