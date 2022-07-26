package ex16;

public class ShellSortEx02 {
	static void ShellSort(int[] a, int n) {
		int h;
		for(h=1; h<n/9;h=h*3+1);
		// Ex01 에서 h를 요솟수의 절반에서 시작했던것과 달리, 1부터 시작하여 값에 3배+1을 하며 n/9를 넘지 않는 가장 큰 값을 찾아 h의 초기값으로 지정한다
				
		for(;h>0;h/=3) {
		// 증분값을 3으로 나눠 1이 될때까지 반복
			
			// ↓ 의 부분부터는 삽입 정렬이다. 
			for(int i=h; i<n; i++) {
				// 간격(증분값)에 맞춰 정렬을 시작할 부분을 지정
				int j;
				// 변수 j를 선언, for문 밖에서도 사용을 하기 위해 밖에서 선언해준다.
				int temp = a[i];
				// temp는 정렬 되지 않은 부분의 첫번째 요소의 값(정렬을 시행할 값)을 지정해준다 
				for(j=i-h;j>=0&&a[j]>temp; j-=h) {
					a[j+h] = a[j];
				}
				a[j+h] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {22,5,11,32,120,68,70};
		int n = 7;
		
		ShellSort(arr, n);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
	}
}
