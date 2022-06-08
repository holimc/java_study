package ex13;

public class SelectionSortEx01 {
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
	
	static void selectrionSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			// 배열 a의 처음부터 끝까지 진행되는 for문 
			int min = i;
			// 가장 작은 부분의 인덱스를 기록해줄 min 변수를 생성한다. for문이 시작될땐 어느 부분의 인덱스가 가장 작은지 알수없으므로 0에서부터 시작.
			// 이후 i=0이 끝나면 a[0]은 정렬이 된 상태이므로, 다시 a[1]의 값을 선택하여 채워넣는다. 이를 반복하기 때문에 선택정렬이다.
			for(int j=i+1; j<n; j++) {
				if(a[j]<a[min]) {
					min = j;
				}
			}
			// 2중 for문으로 정렬이 안된 부분부터 시작하여 배열을 돌며 가장 작은 값을 찾는다.
			swap(a,i,min);
			// 찾은 min 값(작은 수가 있는곳의 인덱스)를 이용하여, 앞부터(i=0부터) 채워넣는다
		}
	}
	
	public static void main(String[] args) {
		
		int[] x = {6,5,3,0,55,2,43,15};
		
		selectrionSort(x, 8);
		printArr(x);
		
		
	}
}
