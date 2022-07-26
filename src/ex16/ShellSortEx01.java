package ex16;

import java.util.Scanner;

public class ShellSortEx01 {
	
	static void shellSort(int[] a, int n) {
		for(int h=n/2; h>0; h/=2) {
			// h는 증분값으로, 배열의 길이(요솟수)n에 맞춰서 나눈다.
			// 해당 경우 요소수가 8이므로 4개로 쪼개고, for문을 다 끝마치고 4개의 그룹이 정렬이 되었다면 h는 2가 되어 배열을 2개의 그룹으로 나눕니다.
			// 그후 마지막에 h가 1이되면서 전체를 정렬하고 for문이 종료
			
			// 그러나 이런 방식으로 진행할 경우, h의 값이 서로 배수가 되지 않아야 효율적인 정렬을 기대할 수 있다.
			// 그러므로 h의 값을 효율적으로 사용할 수 있는 방안을 찾아야 한다.
			for(int i=h; i<n; i++) {
				int j;
				int temp = a[i];
				for(j=i-h; j>=0 && a[j]>temp; j-=h) { 
					a[j+h] = a[j];
				}
				a[j+h] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int n = 8;
		int[] arr = {7,1,3,2,8,6,4,5};
		
		shellSort(arr,n);
		
		
	}
}
