package ex13;

import java.util.Scanner;

public class BubbleSortEx02 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void bubbleSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			int exchg = 0; 
			for(int j=n-1; j>i; j--) {
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					exchg++;
				}
				if(exchg ==0) {
					break;
				}
			}
	 	}
	}
	
	static void bubbleSort3(int[] a, int n) {
		int k = 0;
		// 변수 k보다 앞쪽은 정렬이 완료된 상태를 나타낸다.
		while(k<n-1) {
			// 즉, n-1까지 정렬이 완료됐다면 종료한다.
			int last = n-1;
			// last는 마지막으로 교환이 일어난 위치를 알리기 위한 변수이다.
			for(int j=n-1;j>k;j--) {
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					last = j;
				}
			}
			k = last;
			// 하나의 패스가 끝나면, k값을 바꾸어 다음 수행할 범위를 바꾼다.
			// 원래의 방식대로 버블정렬을 하면 모든 요소를 검사하기 때문에, 검사의 범위를 좁힌다.
		}
	}
	
	public static void main(String[] args) {
		int[] x = {6,5,3,0,55,2,43,15};
		
		bubbleSort3(x, 8);
		
		printArr(x);
		
	}
}
