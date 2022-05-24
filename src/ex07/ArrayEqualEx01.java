package ex07;

import java.util.Scanner;

// 두 배열의 모든 요소의 값이 같은지 판단하는 메서드를 구현

public class ArrayEqualEx01 {
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		// 첫번째로 두 배열의 길이를 비교하여 다르면 false를 반환
		
		for(int i=0; i<a.length;i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		// for문을 통해서 각각의 요소가 같은지 확인, 다르면 false를 반환
		return true;
		// 위의 if문, for문에서 빠져나왔으면 문제가 없는(같은) 배열이므로 true 반환 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 a의 요솟수(길이) : ");
		int length1 = sc.nextInt();
		int[] arr1 = new int[length1];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print("arr1["+i+"] :");
			arr1[i] = sc.nextInt();
		}
		System.out.print("배열 b의 요솟수(길이) : ");
		int length2 = sc.nextInt();
		int[] arr2 = new int[length2];
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print("arr2["+i+"] :");
			arr2[i] = sc.nextInt();
		}
		System.out.println("배열 1과 2는 " + (equals(arr1,arr2) ? "같다" : "같지않다"));
		
	}
}
