package ex07;

public class CloneArrayEx01 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();
		// b는 a를 복제해 길이가 5이고 요소 1,2,3,4,5를 포함한 배열이 된다.
		
		b[3] = 0;
		
		
		System.out.print("a : ");
		for(int i=0; i< a.length;i++) {
			System.out.print(" "+ a[i]);
		}
		System.out.println();
		System.out.print("b : ");
		for(int i=0; i< b.length;i++) {
			System.out.print(" "+ b[i]);
		}
	}
}
