package ex13;

public class InsertionSortEx01 {
	
	static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void insertionSort(int[] a, int n) {
		// 삽입 정렬은 
		for(int i=1; i<n;i++) {
			// 배열의 첫 요소 (a[0])는 정렬이 된 상태라고 치므로, 1부터 시작한다.
			int j;
			// 변수 j를 선언, for문 밖에서도 사용을 하기 위해 밖에서 선언해준다.
			int tmp = a[i];
			// tmp는 정렬 되지 않은 부분의 첫번째 요소의 값(정렬을 시행할 값)이다. 
			for(j=i; j>0&&a[j-1]>tmp;j--) {
				a[j] = a[j-1];
			}
			// 정렬된 부분을 for문으로 체크하며 tmp의 값을 올바른 위치에 넣기 위한 정렬이다.
			// j=i (정렬되지 않은 부분부터)
			// j>0 && a[j-1]>tmp (j가 배열 범위 내이면서, 해당 요소값이 정렬된 요소중 하나의 값보다 작을때까지)
			// a[j] = a[j-1] 을 통해, tmp가 들어갈 공간을 만들기 위해 하나씩 요소의 값이 뒤로 간다고 생각할 수 있다.
			// {3,4,5,4,0} 에서 4를 정렬한다고 치면, 해당 for문을 다 진행한 상태는 {3,5,5,6,0} 이다.
			a[j] = tmp;
			// for문을 다 진행하여 tmp가 들어 가야될 위치를 제외하고 다 한칸씩 밀린 상태다.
			// tmp값이 현재 정렬된 부분중에 가장 작다면, j=0까지 for문이 진행되므로 정렬된 부분이 다 한칸씩 밀리고 첫자리 a[0]에 들어간다
			// 그 외의 경우는, for문의 두번째 조건 a[j-1]>tmp 에서 멈추게 되어, 현재의 요소보다 작은값을 찾았다는 뜻이므로 j-1의 뒷자리는 j이므로 a[j] = tmp를 통해 중간 자리를 찾는다.
		}
	}
	
	public static void main(String[] args) {
		int[] x = {6,5,3,0,55,2,43,15};
		insertionSort(x, 8);
		printArr(x);
	}

}
