package ex09;

import java.util.Scanner;

public class SeqSearchEx01 {
	static int seqSearch(int[] a, int n, int key) {
		int i =0;
		while(true) {
			if(i==n) {
				return -1;
			}
			if(a[i] == key) {
				return i;
			}
			i++;
		}
	}
	//검색 메서드
	// while문을 통해 배열 a를 전부 검색하여 n(배열의 길이)까지 찾는 값이 없으면 -1을 리턴, 있다면 i(해당 값이 있는 인덱스) 를 리턴해준다.
	
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
