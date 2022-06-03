package ex12;

import java.util.Scanner;

public class BubbleSortEx01 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=n-1; j>i; j--) {
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
				}
			}
	 	}
	}
	// Q1. 버블 정렬의 비교, 교환을 앞쪽부터 이뤄지도록 하시오
	static void bubbleSortFront(int[] a, int n) {
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i;j++) {
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] x = {6,5,3,0,55,2,43,15};
		
		bubbleSortFront(x, 8);
		
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
	}
}
