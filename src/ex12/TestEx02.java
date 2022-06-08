package ex12;
// Q3. 버블정렬의 교환식이 눈에 보이도록 작성하시오

import java.util.Scanner;

public class TestEx02 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a, int n) {
		int cp = 0;
		// 비교횟수
		int ec = 0;
		// 교환 횟수
		
		int i = 0;
		int k = 0;
		while(k<n-1) {
			int last = n-1;
			for(int j = n-1; j>k; j--) {
				for(int m = 0; m<n-1; m++) {
					System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				}
				System.out.printf("%3d\n", a[n - 1]);
				cp++;
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					last = j;
					ec++;
				}
			}
			k = last;
		}
		System.out.println("비교를 " + cp + "회 했습니다.");
		System.out.println("교환를 " + ec + "회 했습니다.");
	}	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("*** 버블정렬 ***");
		System.out.print("배열 크기：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		bubbleSort(x, nx); // 배열 x를 단순교환정렬
	}
}
