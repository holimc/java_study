package ex03;
// 가변인수

public class WrapperTest01 {
	public static void plus(int x, int y) {
		int sum = x + y;
		System.out.println("sum : " + sum);
	}
	public static void plus(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println("sum : " + sum);
	}
	public static void plus(int[] arr) {
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("sum : " + sum);
	}
	public static void vplus(int...arr) {
		int sum = 0;
		for (int i=0; i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("sum : " + sum);
	}
	// 가변인수를 통해서 매개변수의 갯수를 정하지 않고 유동적으로 받을 수 있다.
	
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		plus(10,20);
		plus(10,20,30);
		// plus(10,20,30,40);
		plus(arr);
		
		vplus(10,20);
		vplus(10,20,30,40);
		vplus(10,20,30,40,50,60,70,80,90);
		
		
	}
	
}
