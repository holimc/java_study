package ex16;

public class QuickSortEx01 {
	static void swap (int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	// 정렬을 위한 swap 메서드
	
	static int count = 1;
	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		// 왼쪽의 포인터는 배열의 시작(0)에서 시작한다
		int pr = right;
		// 오른쪽의 포인터는 배열의 마지막(length-1)에서 시작한다.
		int x = a[(pl+pr)/2];
		// 배열의 중간에 있는 값을 구해 피벗 x를 만든다.
		
		do {
			while(a[pl]<x)pl++;
			// 왼쪽 포인터가 가르키는 배열의 값이 피벗의 값보다 클때까지 포인터가 증가한다.
			while(a[pr]>x)pr--;
			// 오른쪽 포인터가 가르키는 배열의 값이 피벗보다 작을때까지 포인터가 감소한다.
			if(pl<=pr) {
				swap(a,pl++,pr--);
			}
			// 두 포인터가 피벗보다 큰값, 작은값을 정렬한 후에 포인터의 위치가 ++ --로 한자리씩 변경
			System.out.println("정렬 횟수 : " + count);
			for(int i=0; i<a.length; i++) {
				System.out.print(a[i]+" ");
			}
			count++;
			System.out.println();
		}while(pl<=pr);
		// 포인터가 피벗의 위치를 지나면 do-while문이 종료된다.
		
		if(left<pr) {
			quickSort(a, left, pr);
		}
		// 이후 재귀로 호출로 왼쪽부터 정렬된다
		if(pl<right) {
			quickSort(a, pl, right);
		}
		// left의 재귀가 끝나면 (처음 반으로 나눠졌을때의 왼쪽 부분이 정렬이 끝나면) 오른쪽부분의 정렬이 시작된다.
		
	}
	public static void main(String[] args) {
		int[] arr = {5,8,4,2,6,1,3,9,7};
		int n = 9;
		quickSort(arr, 0, n-1);
		System.out.println("퀵정렬 끝");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
