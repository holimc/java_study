package ex16;

public class PartitionEx01 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void partition(int[] a, int n) {
		int pl = 0;
		int pr = n-1;
		int x = a[n/2];
		do {
			while(a[pl]<x) pl++;
			while(a[pr]>x) pr--;
			if(pl<=pr) {
				swap(a,pl++,pr--);
			}
		}while(pl<=pr);
		
		System.out.println("피벗의 값은 " + x + " 입니다.");
		
		System.out.println("피벗 이하의 그룹");
		for(int i=0; i<=pl-1; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		if(pl>pr+1) {
			System.out.println("피벗과 일치하는 그룹");
			for(int i=pr+1; i<=pl-1; i++) {
				System.out.println(a[i]+" ");
			}
			System.out.println();
		}
		System.out.println("피벗 이상의 그룹");
		for(int i= pr+1; i<n; i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,8,7,4,5,2,6,3,9};
		int n = 9;
		
		partition(arr, n);
	}
}
