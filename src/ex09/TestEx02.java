package ex09;

import java.util.Scanner;

// 	요소수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx에 맨앞부터 순서대로 저장하고
// 일치한 요솟수를 반환하는 메서드를 작성하세요
// 예를들어 a의 요소가 {1,9,2,9,4,6,7,9}이고 key가 9면 배열idx에 {1,3,7}을 저장하고, 3을 반환합니다.
public class TestEx02 {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;
		for(int i=0; i<n;i++) {
			if(a[i] == key) {
				idx[count++] = i;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수：");
		int num = sc.nextInt();
		int[] x = new int[num];
		int[] idx = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = sc.nextInt();
		}
		System.out.print("찾는 값："); // 키 값을 입력 받음
		int ky = sc.nextInt();

		int count = searchIdx(x, num, ky, idx);

		if (count == 0) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			for (int i = 0; i < count; i++) {
				System.out.println("그 값은  x[" + idx[i] + "]에 있습니다.");
			}
		
		}
	}
}
