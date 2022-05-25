package ex08;
// 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하시오
// 배열 b의 모든 요소를 배열 a에 역순으로 복하나늠 메서드 copy를 작성하시오.

public class TestEx01 {
	static void copyArr(int[] arr1, int[] arr2) {
		// a, b의 길이를 비교해서, 길이에 맞춰서 복사해넣는다.
		// a가 클 경우, b의 크기만큼만 복제하고, a가 작을경우 a에 담기는 만큼만 복제한다
		int num = 0;
		if(arr2.length>=arr1.length) {
			num = arr1.length;
		}else if(arr2.length<arr1.length) {
			num = arr2.length;
		}
		
		for(int i=0; i<num;i++) {
			arr1[i] = arr2[i];
		}
	}
	
	static void reverseCopyArr(int[] arr1, int[] arr2) {
		int num = 0;
		if(arr2.length>=arr1.length) {
			num = arr1.length;
		}else if(arr2.length<arr1.length) {
			num = arr2.length;
		}
		for(int i=0; i<num;i++) {
			arr1[i] = arr2[(arr2.length-1-i)];
		}
	}
	
	static void printArr(int[] arr1, int[] arr2) {
		System.out.print("배열1의 요소 :");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(" "+ arr1[i]);
		}
		System.out.println();
		System.out.print("배열2의 요소 :");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(" "+ arr2[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,5,8,10,13,15,20};
		int[] b = {2,2,3,5,8,13,21,34,55,89,144,233};
		int[] c = {9,8,5,3,2};
		
		printArr(a,c);
		
		//copyArr(a,b);
		reverseCopyArr(a,c);
		
		printArr(a,c);
		
	}
}
