package ex09;

import java.util.Arrays;
import java.util.Scanner;
//Q1. 검색에 실패하면 삽입 포인트의 값을 출력하게 작성하시오.

public class BinarySearchTesterEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		System.out.println("--- 오름차순으로 입력해주세요 ---");
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]);
		}
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		if(idx<0) {
			System.out.println("그 값의 요소는 없습니다. 삽입포인트 :"+idx);
			// 1,3,5,7,7,7,7,8,8,9,9 라는 요솟수 11의 배열에서 12를 검색하면, -a.length -1 으로 -12가 나오고
			// 같은 배열에서 4를 검색하면 -3이 나온다. (4보다 큰 요소중 첫번째인 5의 인덱스 2를 -2 -1 하여 -3이 나온다)
			
		}else {
			System.out.println(ky + "는 x["+idx+"]에 있습니다.");
		}
		
	}
}
