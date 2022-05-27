package ex09;
import java.util.Scanner;
// seqSearchSen 메서드를 for문을 사용하여 작성하시오.

public class TestEx01 {
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		a[n] = key;
		
		for(;i<=n;i++) {
			if(a[i]== key) {
				break;
			}
		}
		// for(i;a[i]!=key;i++){} 의 형식으로도 조건문을 만들 수 있다.
		return i == n ? -1 : i;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수 : ");
		int num = sc.nextInt();
		int[] x = new int[num+1];
		
		for(int i=0; i<num;i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1 ) {
			System.out.println("그 값은 없습니다.");
		}else {
			System.out.println(ky+"는 x["+idx+"]에 있습니다.");
		}
	}
}
