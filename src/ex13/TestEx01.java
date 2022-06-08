package ex13;
/*
 * 다음의 배열 {9,1,3,4,6,7,8} 이 있다고 가정하자.
 * 이 배열은 두번째 요소부터는 정렬되어 있지만 BubbleSortEx02의 bubbleSort3(개선한 버블정렬)을 사용하더라도 빠른 시간안에 정렬을 마칠 수 없다
 * (맨앞의 요소가 가장 크기때문에, for문이 돌아가도 한칸씩 옮겨지기 때문)
 * 그래서 홀수 번째의 패스는 가장 작은 요소를 맨앞으로 옮기고 짝수번째 패스는 가장 큰 요소를 맨 뒤로 옮기는 방식으로 사용하면 더 적은 횟수로 정렬을 마칠 수 있다.
 * bubbleSort3을 개선하여 양방향 버블 정렬(칵테일, 셰이커 정렬) 을 수행하는 프로그램을 만드시오.
 */

public class TestEx01 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void shakerSort(int[] a, int n) {
		int left = 0;
		// 정렬 범위를 지정할 왼쪽 값
		int right = n-1;
		// 정렬의 범위를 지정할 오른쪽 값 
		int last = right;
		// 마지막으로 교환이 일어난 위치
		
		while(left<right) {
			// left의 값이 right보다 커지면, 양방향에서 하나씩 좁혀가며 진행하다가 정렬이 종료됐다는 뜻이다.
			for(int j = right; j>left; j--) {
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
					last = j;
				}
			}
			// 오른쪽 방향에서 왼쪽 방향으로 정렬이 시작된다. 마지막으로 정렬된 위치를 last로 받는다 
			left = last;
			// 위의 for문에서 가장 마지막까지 정렬된 위치인 last를 받아서 left에 대입했다. 
			// last의 바깥 부분(위의 경우 왼쪽부분)은 정렬이 완료 되었으므로, 새로운 탐색 범위를 지정할때 범위를 좁힌다. 
			
			for(int j=left; j<right; j++) {
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
					last = j;
				}
			}
			// 이번에는 왼쪽 방향에서 정렬을 시작한다. left의 범위가 0에서 last로 갱신되어 범위가 줄어든 상태이다.
			right = last;
			// 위의 left = last와 마찬가지로, 오른쪽부분에서 가장 마지막에 정렬된 위치를 갱신해준다
		}
		// 해당 while문을 통해 양쪽 끝단에서 버블정렬이 이루어진다.
	}
	
	public static void main(String[] args) {
		int[] x = {2,3,5,7,77,99,22,10,1,4,20,17,255};
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		
		shakerSort(x, x.length);
		
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}

}
