package ex09;

import java.util.Scanner;

public class SeqSearchSenEx01 {
	
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;
		// 보초값을 넣는다.
		
		while(true) {
			if(a[i] == key) {
				break;
			}
			i++;
		}
		// 보초값을 찾을때까지 while문이 돌아간다. 
		
		
		return i == n ? -1 : i;
		// while문이 종료된 시점에서, 연산을 통해 확인한다. i==n이 성립하면 보초값까지 갔다는 소리이므로 찾는 값이 없으므로 -1을 리턴
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수 : ");
		int num = sc.nextInt();
		int[] x = new int[num+1];
		
		for(int i=0; i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1 ) {
			System.out.println("그 값은 없습니다.");
		}else {
			System.out.println(ky+"는 x["+idx+"]에 있습니다.");
		}
	}
	
}
